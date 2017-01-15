package hbi.core.demo.service;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.IBaseService;
import hbi.core.demo.dto.OrderHeaders;

import java.util.List;

/**
 * Created by zhiyuan on 2017/1/11.
 */
public interface IOrderHeadersService extends IBaseService<OrderHeaders> {
    List<OrderHeaders> queryPage(IRequest resuestContent, OrderHeaders orderHeaders, int page, int pageSize);
    OrderHeaders getById(IRequest resuestContent, OrderHeaders orderHeaders);
}
