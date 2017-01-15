package hbi.core.demo.controllers;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import hbi.core.demo.dto.OrderHeaders;
import hbi.core.demo.service.IOrderHeadersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhiyuan on 2017/1/12.
 */
@Controller
public class OrderHeadersController extends BaseController {

    @Autowired
    private IOrderHeadersService orderHeadersService;

    @RequestMapping("/order/query")
    @ResponseBody
    public ResponseData query(OrderHeaders orderHeaders,
                              @RequestParam(defaultValue = "1") int page,
                              @RequestParam(defaultValue = "10") int pageSize,
                              HttpServletRequest request){
        IRequest resuestContext = this.createRequestContext(request);
        List<OrderHeaders> headersList = this.orderHeadersService.queryPage(resuestContext,orderHeaders,page,pageSize);
        return new ResponseData(headersList);
    }


    @RequestMapping("/order/insertOrupdate")
    @ResponseBody
    public ResponseData insert(OrderHeaders orderHeaders, BindingResult result, HttpServletRequest request){
        this.getValidator().validate(orderHeaders, result);

        if(result.hasErrors()){
            ResponseData requestCtx1 = new ResponseData(false);
            requestCtx1.setMessage(this.getErrorMessage(result, request));
            return requestCtx1;
        }else{
            IRequest requestContext = this.createRequestContext(request);
            OrderHeaders header;
            if(orderHeaders.getHeaderId() != null && orderHeaders.getHeaderId() > 0){
                header = this.orderHeadersService.updateByPrimaryKeySelective(requestContext, orderHeaders);
            }else{
                orderHeaders.setHeaderId(null);
                header = this.orderHeadersService.insertSelective(requestContext, orderHeaders);
            }
//            if(orderHeaders.getHeaderId() == -1){
//                orderHeaders.setHeaderId(null);
//                header = this.orderHeadersService.insertSelective(requestContext, orderHeaders);
//            }else{
//                header = this.orderHeadersService.updateByPrimaryKeySelective(requestContext, orderHeaders);
//            }

//            responseData.setMessage(String.format("Primary Key: %d",demo.getId()));
            List<OrderHeaders> orderHeadersList = new ArrayList<>();
            orderHeadersList.add(header);
            ResponseData requestCtx1 = new ResponseData(orderHeadersList);
            //equestCtx1.setMessage("插入成功");
            return requestCtx1;
        }
    }


    @RequestMapping("/order/get")
    @ResponseBody
    public ResponseData getById(OrderHeaders orderHeaders, HttpServletRequest request){
        List<OrderHeaders> orderHeadersList = new ArrayList<>();
        if( orderHeaders.getHeaderId() != null && !"null".equals(orderHeaders.getHeaderId())){
            IRequest requestContext = this.createRequestContext(request);
            OrderHeaders orderHeaders1 = this.orderHeadersService.getById(requestContext, orderHeaders);
            if(orderHeaders1 != null){
                orderHeadersList.add(orderHeaders1);
            }
            //return new ResponseData(orderHeadersList);
        }
        return new ResponseData(orderHeadersList);
    }


    @RequestMapping(value = "/order/submit",method= RequestMethod.POST)
    @ResponseBody
    public ResponseData insertOrUpdate(@RequestBody List<OrderHeaders> orderHeadersList, BindingResult result, HttpServletRequest request){

        this.getValidator().validate(orderHeadersList, result);


        if(result.hasErrors()){
            ResponseData requestCtx1 = new ResponseData(false);
            requestCtx1.setMessage(this.getErrorMessage(result, request));
            return requestCtx1;
        }else{
            IRequest requestContext = this.createRequestContext(request);
            List<OrderHeaders> orderHeadersList1 = this.orderHeadersService.batchUpdate(requestContext, orderHeadersList);

            return new ResponseData(orderHeadersList1);
        }
    }
}
