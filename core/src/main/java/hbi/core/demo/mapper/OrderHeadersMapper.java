package hbi.core.demo.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.core.demo.dto.OrderHeaders;

import java.util.List;

/**
 * Created by zhiyuan on 2017/1/11.
 */
public interface OrderHeadersMapper extends Mapper<OrderHeaders> {
    List<OrderHeaders> queryPage(OrderHeaders orderHeaders);
    OrderHeaders getById(OrderHeaders orderHeaders);
}
