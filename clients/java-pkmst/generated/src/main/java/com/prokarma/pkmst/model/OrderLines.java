package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.OrderLinePaidType;
import com.prokarma.pkmst.model.OrderLineStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Order Line
 */
@ApiModel(description = "Order Line")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class OrderLines   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("type")
  private String type;

  @JsonProperty("ad_account_id")
  private String adAccountId;

  @JsonProperty("purchase_order_id")
  private String purchaseOrderId;

  @JsonProperty("start_time")
  private BigDecimal startTime;

  @JsonProperty("end_time")
  private BigDecimal endTime;

  @JsonProperty("budget")
  private BigDecimal budget;

  @JsonProperty("paid_budget")
  private BigDecimal paidBudget;

  @JsonProperty("status")
  private OrderLineStatus status;

  @JsonProperty("name")
  private String name;

  @JsonProperty("paid_type")
  private OrderLinePaidType paidType;

  public OrderLines id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Order line ID.
   * @return id
  **/
  @ApiModelProperty(example = "2680059592705", value = "Order line ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OrderLines type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Always \"orderline\".
   * @return type
  **/
  @ApiModelProperty(example = "orderline", value = "Always \"orderline\".")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OrderLines adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

   /**
   * Ad account ID.
   * @return adAccountId
  **/
  @ApiModelProperty(example = "549755885175", value = "Ad account ID.")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public OrderLines purchaseOrderId(String purchaseOrderId) {
    this.purchaseOrderId = purchaseOrderId;
    return this;
  }

   /**
   * Purchase order ID.
   * @return purchaseOrderId
  **/
  @ApiModelProperty(example = "PO12345", value = "Purchase order ID.")
  public String getPurchaseOrderId() {
    return purchaseOrderId;
  }

  public void setPurchaseOrderId(String purchaseOrderId) {
    this.purchaseOrderId = purchaseOrderId;
  }

  public OrderLines startTime(BigDecimal startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Start time. Unix timestamp.
   * @return startTime
  **/
  @ApiModelProperty(example = "1452208622", value = "Start time. Unix timestamp.")
  public BigDecimal getStartTime() {
    return startTime;
  }

  public void setStartTime(BigDecimal startTime) {
    this.startTime = startTime;
  }

  public OrderLines endTime(BigDecimal endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * End time. Unix timestamp.
   * @return endTime
  **/
  @ApiModelProperty(example = "1461269616", value = "End time. Unix timestamp.")
  public BigDecimal getEndTime() {
    return endTime;
  }

  public void setEndTime(BigDecimal endTime) {
    this.endTime = endTime;
  }

  public OrderLines budget(BigDecimal budget) {
    this.budget = budget;
    return this;
  }

   /**
   * Order line budget in micro currency.
   * @return budget
  **/
  @ApiModelProperty(example = "5000000", value = "Order line budget in micro currency.")
  public BigDecimal getBudget() {
    return budget;
  }

  public void setBudget(BigDecimal budget) {
    this.budget = budget;
  }

  public OrderLines paidBudget(BigDecimal paidBudget) {
    this.paidBudget = paidBudget;
    return this;
  }

   /**
   * Order line paid budget in micro currency.
   * @return paidBudget
  **/
  @ApiModelProperty(example = "5000000", value = "Order line paid budget in micro currency.")
  public BigDecimal getPaidBudget() {
    return paidBudget;
  }

  public void setPaidBudget(BigDecimal paidBudget) {
    this.paidBudget = paidBudget;
  }

  public OrderLines status(OrderLineStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Order line status.
   * @return status
  **/
  @ApiModelProperty(value = "Order line status.")
  public OrderLineStatus getStatus() {
    return status;
  }

  public void setStatus(OrderLineStatus status) {
    this.status = status;
  }

  public OrderLines name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Order line name.
   * @return name
  **/
  @ApiModelProperty(example = "Order Line Name 1", value = "Order line name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrderLines paidType(OrderLinePaidType paidType) {
    this.paidType = paidType;
    return this;
  }

   /**
   * Order line paid type.
   * @return paidType
  **/
  @ApiModelProperty(value = "Order line paid type.")
  public OrderLinePaidType getPaidType() {
    return paidType;
  }

  public void setPaidType(OrderLinePaidType paidType) {
    this.paidType = paidType;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

