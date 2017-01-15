package hbi.core.demo.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import hbi.core.demo.dto.ArCustomers;
import hbi.core.demo.mapper.ArCustomersMapper;
import hbi.core.demo.service.IArCustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhiyuan on 2017/1/11.
 */
@Service
public class ArCustomersServiceImpl extends BaseServiceImpl<ArCustomers> implements IArCustomersService {
    @Autowired
    private ArCustomersMapper arCustomersMapper;
}
