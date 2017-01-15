package hbi.core.demo.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.core.demo.dto.OrderLines;

import java.util.List;

/**
 * Created by zhiyuan on 2017/1/11.
 */
public interface OrderLinesMapper extends Mapper<OrderLines> {
    List<OrderLines> queryPage(OrderLines orderLines);
    int getLineNumberByHeaderId(OrderLines orderLines);
}
