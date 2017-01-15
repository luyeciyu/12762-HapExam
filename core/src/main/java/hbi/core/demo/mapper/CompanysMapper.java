package hbi.core.demo.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.core.demo.dto.Companys;

import java.util.List;

/**
 * Created by zhiyuan on 2017/1/11.
 */
public interface CompanysMapper extends Mapper<Companys> {
    List<Companys> quesyPage(Companys companys);
}
