package hbi.core.demo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hand.hap.system.dto.BaseDTO;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by zhiyuan on 2017/1/11.
 */
@Table(name = "hap_om_order_headers")
public class OrderHeaders extends BaseDTO {
    @Id
    @GeneratedValue(generator = "IDENTITY")
    private Long headerId;
    @NotEmpty
    @Column
    private String orderNumber;
    @NotNull
    @Column
    private Long companyId;
    @NotNull
    @Column
    //@DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(
            pattern = "yyyy-MM-dd"
    )
    private Date orderDate;
    @NotEmpty
    @Column
    private String orderStatus;
    @NotNull
    @Column
    private Long customerId;

    @Transient
    private String companyName;
    @Transient
    private String customerName;
    @Transient
    private String orderStatusText;
    @Transient
    private Long orderAmount;
    @Transient
    private Long inventoryItemId;

    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public OrderHeaders setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
        return this;
    }

    public String getOrderStatusText() {
        return orderStatusText;
    }

    public OrderHeaders setOrderStatusText(String orderStatusText) {
        this.orderStatusText = orderStatusText;
        return this;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Long getOrderAmount() {
        return orderAmount;
    }

    public OrderHeaders setOrderAmount(Long orderAmount) {
        this.orderAmount = orderAmount;
        return this;
    }

    public OrderHeaders setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public String getCustomerName() {
        return customerName;
    }

    public OrderHeaders setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public Long getHeaderId() {
        return headerId;
    }

    public OrderHeaders setHeaderId(Long headerId) {
        this.headerId = headerId;
        return this;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public OrderHeaders setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public OrderHeaders setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public OrderHeaders setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
        return this;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public OrderHeaders setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public OrderHeaders setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }

    @Override
    public String toString() {
        return "OrderHeaders{" +
                "headerId=" + headerId +
                ", orderNumber='" + orderNumber + '\'' +
                ", companyId=" + companyId +
                ", orderDate=" + orderDate +
                ", orderStatus='" + orderStatus + '\'' +
                ", customerId=" + customerId +
                ", companyName='" + companyName + '\'' +
                ", customerName='" + customerName + '\'' +
                ", orderAmount=" + orderAmount +
                '}';
    }
}
