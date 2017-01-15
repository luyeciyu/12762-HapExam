package hbi.core.demo.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import hbi.core.demo.dto.OrderHeaders;
import hbi.core.demo.mapper.OrderHeadersMapper;
import hbi.core.demo.service.IOrderHeadersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhiyuan on 2017/1/11.
 */
@Service
public class OrderHeadersServiceImpl extends BaseServiceImpl<OrderHeaders> implements IOrderHeadersService {

    @Autowired
    private OrderHeadersMapper orderHeadersMapper;
    @Override
    public List<OrderHeaders> queryPage(IRequest resuestContent, OrderHeaders orderHeaders, int page, int pageSize) {
        PageHelper.startPage(page, pageSize);
        return this.orderHeadersMapper.queryPage(orderHeaders);
    }

    @Override
    public OrderHeaders getById(IRequest resuestContent, OrderHeaders orderHeaders) {

        return this.orderHeadersMapper.getById(orderHeaders);
    }
}
