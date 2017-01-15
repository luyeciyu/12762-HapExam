package hbi.core.demo.controllers;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import hbi.core.demo.dto.OrderLines;
import hbi.core.demo.service.IOrderLinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhiyuan on 2017/1/12.
 */
@Controller
public class OrderLinesController extends BaseController {

    @Autowired
    private IOrderLinesService orderLinesService;

    @RequestMapping("/lines/query")
    @ResponseBody
    public ResponseData query(OrderLines orderLines,
                              @RequestParam(defaultValue = "1") int page,
                              @RequestParam(defaultValue = "10") int pageSize,
                              HttpServletRequest request){

        IRequest resuestContext = this.createRequestContext(request);
        List<OrderLines> orderLinesList = this.orderLinesService.queryPage(resuestContext,orderLines,page,pageSize);

        return new ResponseData(orderLinesList);
    }

    @RequestMapping("/lines/submit")
    @ResponseBody
    public ResponseData insert(@RequestBody List<OrderLines> orderLinesList, BindingResult result, HttpServletRequest request){
        this.getValidator().validate(orderLinesList, result);


        if(result.hasErrors()) {
            ResponseData requestCtx1 = new ResponseData(false);
            requestCtx1.setMessage(this.getErrorMessage(result, request));
            return requestCtx1;
        } else {
            IRequest requestCtx = this.createRequestContext(request);
            return new ResponseData(this.orderLinesService.batchUpdate(requestCtx, orderLinesList));
        }
    }

    @RequestMapping("/lines/getMaxLineNumber")
    @ResponseBody
    public Map<String, Integer> getMaxLineNumber(OrderLines orderLines, HttpServletRequest request){
        int maxLineNumber = this.orderLinesService.getLineNumberByHeaderId(orderLines);
        Map<String, Integer> map = new HashMap<>();
        map.put("maxLineNumber", maxLineNumber);
        return map;
    }

    @RequestMapping("/lines/remove")
    @ResponseBody
    public ResponseData delete(@RequestBody List<OrderLines> orderLinesList, HttpServletRequest request){
        this.orderLinesService.batchDelete(orderLinesList);
        return new ResponseData(true);
    }

}
