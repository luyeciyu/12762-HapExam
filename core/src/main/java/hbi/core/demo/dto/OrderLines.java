package hbi.core.demo.dto;

import com.hand.hap.system.dto.BaseDTO;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by zhiyuan on 2017/1/11.
 */
@Table(name = "hap_om_order_lines")
public class OrderLines extends BaseDTO {
    @Id
    @GeneratedValue(generator = "IDENTITY")
    private Long lineId;
    @NotNull
    @Column
    private Long headerId;
    @NotNull
    @Column
    private Long lineNumber;
    @NotNull
    @Column
    private Long inventoryItemId;
    @NotNull
    @Column
    private Long orderdQuantity;
    @NotEmpty
    @Column
    private String orderQuantityUom;
    @NotNull
    @Column
    private Long unitSellingPrice;
    @Column
    private String description;
    @NotNull
    @Column
    private Long companyId;
    @Column
    private String addition1;
    @Column
    private String addition2;
    @Column
    private String addition3;
    @Column
    private String addition4;
    @Column
    private String addition5;

    @Transient
    private String itemCode;
    @Transient
    private String itemDescription;
    @Transient
    private Long orderQuantityAmount;

    public Long getOrderQuantityAmount() {
        return orderQuantityAmount;
    }

    public OrderLines setOrderQuantityAmount(Long orderQuantityAmount) {
        this.orderQuantityAmount = orderQuantityAmount;
        return this;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public OrderLines setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
        return this;
    }

    public String getItemCode() {
        return itemCode;
    }

    public OrderLines setItemCode(String itemCode) {
        this.itemCode = itemCode;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public OrderLines setDescription(String description) {
        this.description = description;
        return this;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public OrderLines setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }

    public Long getLineId() {
        return lineId;
    }

    public OrderLines setLineId(Long lineId) {
        this.lineId = lineId;
        return this;
    }

    public Long getHeaderId() {
        return headerId;
    }

    public OrderLines setHeaderId(Long headerId) {
        this.headerId = headerId;
        return this;
    }

    public Long getLineNumber() {
        return lineNumber;
    }

    public OrderLines setLineNumber(Long lineNumber) {
        this.lineNumber = lineNumber;
        return this;
    }

    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public OrderLines setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
        return this;
    }

    public Long getOrderdQuantity() {
        return orderdQuantity;
    }

    public OrderLines setOrderdQuantity(Long orderdQuantity) {
        this.orderdQuantity = orderdQuantity;
        return this;
    }

    public String getOrderQuantityUom() {
        return orderQuantityUom;
    }

    public OrderLines setOrderQuantityUom(String orderQuantityUom) {
        this.orderQuantityUom = orderQuantityUom;
        return this;
    }

    public Long getUnitSellingPrice() {
        return unitSellingPrice;
    }

    public OrderLines setUnitSellingPrice(Long unitSellingPrice) {
        this.unitSellingPrice = unitSellingPrice;
        return this;
    }

    public String getAddition1() {
        return addition1;
    }

    public OrderLines setAddition1(String addition1) {
        this.addition1 = addition1;
        return this;
    }

    public String getAddition2() {
        return addition2;
    }

    public OrderLines setAddition2(String addition2) {
        this.addition2 = addition2;
        return this;
    }

    public String getAddition3() {
        return addition3;
    }

    public OrderLines setAddition3(String addition3) {
        this.addition3 = addition3;
        return this;
    }

    public String getAddition4() {
        return addition4;
    }

    public OrderLines setAddition4(String addition4) {
        this.addition4 = addition4;
        return this;
    }

    public String getAddition5() {
        return addition5;
    }

    public OrderLines setAddition5(String addition5) {
        this.addition5 = addition5;
        return this;
    }

    @Override
    public String toString() {
        return "OrderLines{" +
                "lineId=" + lineId +
                ", headerId=" + headerId +
                ", LineNumber=" + lineNumber +
                ", inventoryItemId=" + inventoryItemId +
                ", orderQuantity=" + orderdQuantity +
                ", orderQuantityUom='" + orderQuantityUom + '\'' +
                ", unitSellingPrice=" + unitSellingPrice +
                ", description='" + description + '\'' +
                ", companyId=" + companyId +
                ", addition1='" + addition1 + '\'' +
                ", addition2='" + addition2 + '\'' +
                ", addition3='" + addition3 + '\'' +
                ", addition4='" + addition4 + '\'' +
                ", addition5='" + addition5 + '\'' +
                ", itemCode='" + itemCode + '\'' +
                ", itemDescription='" + itemDescription + '\'' +
                '}';
    }
}
