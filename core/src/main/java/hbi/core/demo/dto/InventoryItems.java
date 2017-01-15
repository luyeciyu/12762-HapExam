package hbi.core.demo.dto;

import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hap.system.dto.BaseDTO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by zhiyuan on 2017/1/11.
 */

@Table(name = "hap_inv_inventory_items")
@ExtensionAttribute(disable = true)
public class InventoryItems extends BaseDTO {
    @Id
    @GeneratedValue(generator = "IDENTITY")
    private Long inventoryItemId;
    @Column
   // @Condition(operator = LIKE)
    private String itemCode;
    @Column
    private String itemUom;
    @Column
    //@Condition(operator = LIKE)
    private String itemDescription;
    @Column
    private String orderFlag;
    @Column
    private Date startActiveDate;
    @Column
    private Date endActiveDate;
    @Column
    private String enabledFlag;


    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public InventoryItems setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
        return this;
    }

    public String getItemCode() {
        return itemCode;
    }

    public InventoryItems setItemCode(String itemCode) {
        this.itemCode = itemCode;
        return this;
    }

    public String getItemUom() {
        return itemUom;
    }

    public InventoryItems setItemUom(String itemUom) {
        this.itemUom = itemUom;
        return this;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public InventoryItems setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
        return this;
    }

    public String getOrderFlag() {
        return orderFlag;
    }

    public InventoryItems setOrderFlag(String orderFlag) {
        this.orderFlag = orderFlag;
        return this;
    }

    public Date getStartActiveDate() {
        return startActiveDate;
    }

    public InventoryItems setStartActiveDate(Date startActiveDate) {
        this.startActiveDate = startActiveDate;
        return this;
    }

    public Date getEndActiveDate() {
        return endActiveDate;
    }

    public InventoryItems setEndActiveDate(Date endActiveDate) {
        this.endActiveDate = endActiveDate;
        return this;
    }

    public String getEnabledFlag() {
        return enabledFlag;
    }

    public InventoryItems setEnabledFlag(String enabledFlag) {
        this.enabledFlag = enabledFlag;
        return this;
    }
}
