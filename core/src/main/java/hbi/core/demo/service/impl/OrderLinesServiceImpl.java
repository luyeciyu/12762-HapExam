package hbi.core.demo.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import hbi.core.demo.dto.OrderLines;
import hbi.core.demo.mapper.OrderLinesMapper;
import hbi.core.demo.service.IOrderLinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhiyuan on 2017/1/11.
 */
@Service
public class OrderLinesServiceImpl extends BaseServiceImpl<OrderLines> implements IOrderLinesService {

    @Autowired
    private OrderLinesMapper orderLinesMapper;

    @Override
    public List<OrderLines> queryPage(IRequest resuestContent, OrderLines orderLines, int page, int pageSize) {
        PageHelper.startPage(page, pageSize);
        return this.orderLinesMapper.queryPage(orderLines);
    }

    @Override
    public int getLineNumberByHeaderId(OrderLines orderLines) {
        return this.orderLinesMapper.getLineNumberByHeaderId(orderLines);
    }
}
