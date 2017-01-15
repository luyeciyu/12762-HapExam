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
@Table(name = "hap_org_companys")
@ExtensionAttribute(disable = true)
public class Companys extends BaseDTO {

    @Id
    @GeneratedValue(generator = "IDENTITY")
    private Long companyId;
    @Column(name = "COMPANY_NUMBER")
    //@Condition(operator = "LIKE")
    private String companyNumber;
    @Column(name = "COMPANY_NAME")
   //@Condition(operator = "LIKE")
    private String companyName;
    @Column(name = "ENABLED_FLAG")
    private String enabledFlag;

    public Long getCompanyId() {
        return companyId;
    }

    public Companys setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public Companys setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
        return this;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Companys setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public String getEnabledFlag() {
        return enabledFlag;
    }

    public Companys setEnabledFlag(String enabledFlag) {
        this.enabledFlag = enabledFlag;
        return this;
    }
}
