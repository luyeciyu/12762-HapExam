package hbi.core.demo.dto;

import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hap.system.dto.BaseDTO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by zhiyuan on 2017/1/11.
 */


@Table(name = "hap_ar_customers")
@ExtensionAttribute(disable = true)
public class ArCustomers extends BaseDTO{
    @Id
    @GeneratedValue(generator = "IDENTITY")
    private Long customerId;
    @Column
    //@Condition(operator = "LIKE")
    private String customerNumber;
    @Column
    //@Condition(operator = "LIKE")
    private String customerName;
    @Column
    private Long companyId;
    @Column
    private String enabledFlag;

    public Long getCustomerId() {
        return customerId;
    }

    public ArCustomers setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public ArCustomers setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArCustomers setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public ArCustomers setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }

    public String getEnabledFlag() {
        return enabledFlag;
    }

    public ArCustomers setEnabledFlag(String enabledFlag) {
        this.enabledFlag = enabledFlag;
        return this;
    }
}
