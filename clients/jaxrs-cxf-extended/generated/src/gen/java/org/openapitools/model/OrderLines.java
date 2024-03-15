package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OrderLinePaidType;
import org.openapitools.model.OrderLineStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Order Line
 */
@ApiModel(description="Order Line")

public class OrderLines  {
  
 /**
  * Order line ID.
  */
  @ApiModelProperty(example = "2680059592705", value = "Order line ID.")
  private String id;

 /**
  * Always \"orderline\".
  */
  @ApiModelProperty(example = "orderline", value = "Always \"orderline\".")
  private String type;

 /**
  * Ad account ID.
  */
  @ApiModelProperty(example = "549755885175", value = "Ad account ID.")
  private String adAccountId;

 /**
  * Purchase order ID.
  */
  @ApiModelProperty(example = "PO12345", value = "Purchase order ID.")
  private String purchaseOrderId;

 /**
  * Start time. Unix timestamp.
  */
  @ApiModelProperty(example = "1452208622", value = "Start time. Unix timestamp.")
  @Valid
  private BigDecimal startTime;

 /**
  * End time. Unix timestamp.
  */
  @ApiModelProperty(example = "1461269616", value = "End time. Unix timestamp.")
  @Valid
  private BigDecimal endTime;

 /**
  * Order line budget in micro currency.
  */
  @ApiModelProperty(example = "5000000", value = "Order line budget in micro currency.")
  @Valid
  private BigDecimal budget;

 /**
  * Order line paid budget in micro currency.
  */
  @ApiModelProperty(example = "5000000", value = "Order line paid budget in micro currency.")
  @Valid
  private BigDecimal paidBudget;

 /**
  * Order line status.
  */
  @ApiModelProperty(value = "Order line status.")
  @Valid
  private OrderLineStatus status;

 /**
  * Order line name.
  */
  @ApiModelProperty(example = "Order Line Name 1", value = "Order line name.")
  private String name;

 /**
  * Order line paid type.
  */
  @ApiModelProperty(value = "Order line paid type.")
  @Valid
  private OrderLinePaidType paidType;
 /**
  * Order line ID.
  * @return id
  */
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public OrderLines id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Always \&quot;orderline\&quot;.
  * @return type
  */
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(String type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public OrderLines type(String type) {
    this.type = type;
    return this;
  }

 /**
  * Ad account ID.
  * @return adAccountId
  */
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   */
 public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   */
  public OrderLines adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

 /**
  * Purchase order ID.
  * @return purchaseOrderId
  */
  @JsonProperty("purchase_order_id")
  public String getPurchaseOrderId() {
    return purchaseOrderId;
  }

  /**
   * Sets the <code>purchaseOrderId</code> property.
   */
 public void setPurchaseOrderId(String purchaseOrderId) {
    this.purchaseOrderId = purchaseOrderId;
  }

  /**
   * Sets the <code>purchaseOrderId</code> property.
   */
  public OrderLines purchaseOrderId(String purchaseOrderId) {
    this.purchaseOrderId = purchaseOrderId;
    return this;
  }

 /**
  * Start time. Unix timestamp.
  * @return startTime
  */
  @JsonProperty("start_time")
  public BigDecimal getStartTime() {
    return startTime;
  }

  /**
   * Sets the <code>startTime</code> property.
   */
 public void setStartTime(BigDecimal startTime) {
    this.startTime = startTime;
  }

  /**
   * Sets the <code>startTime</code> property.
   */
  public OrderLines startTime(BigDecimal startTime) {
    this.startTime = startTime;
    return this;
  }

 /**
  * End time. Unix timestamp.
  * @return endTime
  */
  @JsonProperty("end_time")
  public BigDecimal getEndTime() {
    return endTime;
  }

  /**
   * Sets the <code>endTime</code> property.
   */
 public void setEndTime(BigDecimal endTime) {
    this.endTime = endTime;
  }

  /**
   * Sets the <code>endTime</code> property.
   */
  public OrderLines endTime(BigDecimal endTime) {
    this.endTime = endTime;
    return this;
  }

 /**
  * Order line budget in micro currency.
  * @return budget
  */
  @JsonProperty("budget")
  public BigDecimal getBudget() {
    return budget;
  }

  /**
   * Sets the <code>budget</code> property.
   */
 public void setBudget(BigDecimal budget) {
    this.budget = budget;
  }

  /**
   * Sets the <code>budget</code> property.
   */
  public OrderLines budget(BigDecimal budget) {
    this.budget = budget;
    return this;
  }

 /**
  * Order line paid budget in micro currency.
  * @return paidBudget
  */
  @JsonProperty("paid_budget")
  public BigDecimal getPaidBudget() {
    return paidBudget;
  }

  /**
   * Sets the <code>paidBudget</code> property.
   */
 public void setPaidBudget(BigDecimal paidBudget) {
    this.paidBudget = paidBudget;
  }

  /**
   * Sets the <code>paidBudget</code> property.
   */
  public OrderLines paidBudget(BigDecimal paidBudget) {
    this.paidBudget = paidBudget;
    return this;
  }

 /**
  * Order line status.
  * @return status
  */
  @JsonProperty("status")
  public OrderLineStatus getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(OrderLineStatus status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public OrderLines status(OrderLineStatus status) {
    this.status = status;
    return this;
  }

 /**
  * Order line name.
  * @return name
  */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public OrderLines name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Order line paid type.
  * @return paidType
  */
  @JsonProperty("paid_type")
  public OrderLinePaidType getPaidType() {
    return paidType;
  }

  /**
   * Sets the <code>paidType</code> property.
   */
 public void setPaidType(OrderLinePaidType paidType) {
    this.paidType = paidType;
  }

  /**
   * Sets the <code>paidType</code> property.
   */
  public OrderLines paidType(OrderLinePaidType paidType) {
    this.paidType = paidType;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderLines orderLines = (OrderLines) o;
    return Objects.equals(this.id, orderLines.id) &&
        Objects.equals(this.type, orderLines.type) &&
        Objects.equals(this.adAccountId, orderLines.adAccountId) &&
        Objects.equals(this.purchaseOrderId, orderLines.purchaseOrderId) &&
        Objects.equals(this.startTime, orderLines.startTime) &&
        Objects.equals(this.endTime, orderLines.endTime) &&
        Objects.equals(this.budget, orderLines.budget) &&
        Objects.equals(this.paidBudget, orderLines.paidBudget) &&
        Objects.equals(this.status, orderLines.status) &&
        Objects.equals(this.name, orderLines.name) &&
        Objects.equals(this.paidType, orderLines.paidType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, adAccountId, purchaseOrderId, startTime, endTime, budget, paidBudget, status, name, paidType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLines {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    purchaseOrderId: ").append(toIndentedString(purchaseOrderId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    paidBudget: ").append(toIndentedString(paidBudget)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    paidType: ").append(toIndentedString(paidType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

