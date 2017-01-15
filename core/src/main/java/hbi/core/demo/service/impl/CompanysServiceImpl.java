package hbi.core.demo.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import hbi.core.demo.dto.Companys;
import hbi.core.demo.mapper.CompanysMapper;
import hbi.core.demo.service.ICompanysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhiyuan on 2017/1/11.
 */
@Service
public class CompanysServiceImpl extends BaseServiceImpl<Companys> implements ICompanysService {
    @Autowired
    private CompanysMapper companysMapper;
}
