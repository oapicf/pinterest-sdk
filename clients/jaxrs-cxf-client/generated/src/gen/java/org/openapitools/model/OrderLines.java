package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OrderLinePaidType;
import org.openapitools.model.OrderLineStatus;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Order Line
 */
@ApiModel(description="Order Line")

public class OrderLines  {
  
 /**
  * Ad account ID.
  */
  @ApiModelProperty(example = "549755885175", value = "Ad account ID.")

  private String adAccountId;

 /**
  * Order line budget in micro currency.
  */
  @ApiModelProperty(example = "5000000", value = "Order line budget in micro currency.")

  private BigDecimal budget;

 /**
  * End time. Unix timestamp.
  */
  @ApiModelProperty(example = "1461269616", value = "End time. Unix timestamp.")

  private BigDecimal endTime;

 /**
  * Order line ID.
  */
  @ApiModelProperty(example = "2680059592705", value = "Order line ID.")

  private String id;

 /**
  * Order line name.
  */
  @ApiModelProperty(example = "Order Line Name 1", value = "Order line name.")

  private String name;

 /**
  * Order line paid budget in micro currency.
  */
  @ApiModelProperty(example = "5000000", value = "Order line paid budget in micro currency.")

  private BigDecimal paidBudget;

 /**
  * Order line paid type.
  */
  @ApiModelProperty(value = "Order line paid type.")

  private OrderLinePaidType paidType;

 /**
  * Purchase order ID.
  */
  @ApiModelProperty(example = "PO12345", value = "Purchase order ID.")

  private String purchaseOrderId;

 /**
  * Start time. Unix timestamp.
  */
  @ApiModelProperty(example = "1452208622", value = "Start time. Unix timestamp.")

  private BigDecimal startTime;

 /**
  * Order line status.
  */
  @ApiModelProperty(value = "Order line status.")

  private OrderLineStatus status;

 /**
  * Always \"orderline\".
  */
  @ApiModelProperty(example = "orderline", value = "Always \"orderline\".")

  private String type;
 /**
   * Ad account ID.
   * @return adAccountId
  **/
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public OrderLines adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

 /**
   * Order line budget in micro currency.
   * @return budget
  **/
  @JsonProperty("budget")
  public BigDecimal getBudget() {
    return budget;
  }

  public void setBudget(BigDecimal budget) {
    this.budget = budget;
  }

  public OrderLines budget(BigDecimal budget) {
    this.budget = budget;
    return this;
  }

 /**
   * End time. Unix timestamp.
   * @return endTime
  **/
  @JsonProperty("end_time")
  public BigDecimal getEndTime() {
    return endTime;
  }

  public void setEndTime(BigDecimal endTime) {
    this.endTime = endTime;
  }

  public OrderLines endTime(BigDecimal endTime) {
    this.endTime = endTime;
    return this;
  }

 /**
   * Order line ID.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OrderLines id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Order line name.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrderLines name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Order line paid budget in micro currency.
   * @return paidBudget
  **/
  @JsonProperty("paid_budget")
  public BigDecimal getPaidBudget() {
    return paidBudget;
  }

  public void setPaidBudget(BigDecimal paidBudget) {
    this.paidBudget = paidBudget;
  }

  public OrderLines paidBudget(BigDecimal paidBudget) {
    this.paidBudget = paidBudget;
    return this;
  }

 /**
   * Order line paid type.
   * @return paidType
  **/
  @JsonProperty("paid_type")
  public OrderLinePaidType getPaidType() {
    return paidType;
  }

  public void setPaidType(OrderLinePaidType paidType) {
    this.paidType = paidType;
  }

  public OrderLines paidType(OrderLinePaidType paidType) {
    this.paidType = paidType;
    return this;
  }

 /**
   * Purchase order ID.
   * @return purchaseOrderId
  **/
  @JsonProperty("purchase_order_id")
  public String getPurchaseOrderId() {
    return purchaseOrderId;
  }

  public void setPurchaseOrderId(String purchaseOrderId) {
    this.purchaseOrderId = purchaseOrderId;
  }

  public OrderLines purchaseOrderId(String purchaseOrderId) {
    this.purchaseOrderId = purchaseOrderId;
    return this;
  }

 /**
   * Start time. Unix timestamp.
   * @return startTime
  **/
  @JsonProperty("start_time")
  public BigDecimal getStartTime() {
    return startTime;
  }

  public void setStartTime(BigDecimal startTime) {
    this.startTime = startTime;
  }

  public OrderLines startTime(BigDecimal startTime) {
    this.startTime = startTime;
    return this;
  }

 /**
   * Order line status.
   * @return status
  **/
  @JsonProperty("status")
  public OrderLineStatus getStatus() {
    return status;
  }

  public void setStatus(OrderLineStatus status) {
    this.status = status;
  }

  public OrderLines status(OrderLineStatus status) {
    this.status = status;
    return this;
  }

 /**
   * Always \&quot;orderline\&quot;.
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OrderLines type(String type) {
    this.type = type;
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
    return Objects.equals(this.adAccountId, orderLines.adAccountId) &&
        Objects.equals(this.budget, orderLines.budget) &&
        Objects.equals(this.endTime, orderLines.endTime) &&
        Objects.equals(this.id, orderLines.id) &&
        Objects.equals(this.name, orderLines.name) &&
        Objects.equals(this.paidBudget, orderLines.paidBudget) &&
        Objects.equals(this.paidType, orderLines.paidType) &&
        Objects.equals(this.purchaseOrderId, orderLines.purchaseOrderId) &&
        Objects.equals(this.startTime, orderLines.startTime) &&
        Objects.equals(this.status, orderLines.status) &&
        Objects.equals(this.type, orderLines.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, budget, endTime, id, name, paidBudget, paidType, purchaseOrderId, startTime, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLines {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    paidBudget: ").append(toIndentedString(paidBudget)).append("\n");
    sb.append("    paidType: ").append(toIndentedString(paidType)).append("\n");
    sb.append("    purchaseOrderId: ").append(toIndentedString(purchaseOrderId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

