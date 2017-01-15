package hbi.core.demo.service;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.IBaseService;
import hbi.core.demo.dto.OrderLines;

import java.util.List;

/**
 * Created by zhiyuan on 2017/1/11.
 */
public interface IOrderLinesService extends IBaseService<OrderLines> {
    List<OrderLines> queryPage(IRequest resuestContent, OrderLines orderLines, int page, int pageSize);
    int getLineNumberByHeaderId(OrderLines orderLines);
}
