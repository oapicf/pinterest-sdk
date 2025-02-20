/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.OrderLinePaidType;
import org.openapitools.model.OrderLineStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Order Line
 */
@ApiModel(description = "Order Line")
@JsonPropertyOrder({
  OrderLines.JSON_PROPERTY_ID,
  OrderLines.JSON_PROPERTY_TYPE,
  OrderLines.JSON_PROPERTY_AD_ACCOUNT_ID,
  OrderLines.JSON_PROPERTY_PURCHASE_ORDER_ID,
  OrderLines.JSON_PROPERTY_START_TIME,
  OrderLines.JSON_PROPERTY_END_TIME,
  OrderLines.JSON_PROPERTY_BUDGET,
  OrderLines.JSON_PROPERTY_PAID_BUDGET,
  OrderLines.JSON_PROPERTY_STATUS,
  OrderLines.JSON_PROPERTY_NAME,
  OrderLines.JSON_PROPERTY_PAID_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-05T02:20:07.425136412Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class OrderLines   {
  public static final String JSON_PROPERTY_ID = "id";
  @JsonProperty(JSON_PROPERTY_ID)
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  @JsonProperty(JSON_PROPERTY_TYPE)
  private String type;

  public static final String JSON_PROPERTY_AD_ACCOUNT_ID = "ad_account_id";
  @JsonProperty(JSON_PROPERTY_AD_ACCOUNT_ID)
  private String adAccountId;

  public static final String JSON_PROPERTY_PURCHASE_ORDER_ID = "purchase_order_id";
  @JsonProperty(JSON_PROPERTY_PURCHASE_ORDER_ID)
  private String purchaseOrderId;

  public static final String JSON_PROPERTY_START_TIME = "start_time";
  @JsonProperty(JSON_PROPERTY_START_TIME)
  private BigDecimal startTime;

  public static final String JSON_PROPERTY_END_TIME = "end_time";
  @JsonProperty(JSON_PROPERTY_END_TIME)
  private BigDecimal endTime;

  public static final String JSON_PROPERTY_BUDGET = "budget";
  @JsonProperty(JSON_PROPERTY_BUDGET)
  private BigDecimal budget;

  public static final String JSON_PROPERTY_PAID_BUDGET = "paid_budget";
  @JsonProperty(JSON_PROPERTY_PAID_BUDGET)
  private BigDecimal paidBudget;

  public static final String JSON_PROPERTY_STATUS = "status";
  @JsonProperty(JSON_PROPERTY_STATUS)
  private OrderLineStatus status;

  public static final String JSON_PROPERTY_NAME = "name";
  @JsonProperty(JSON_PROPERTY_NAME)
  private String name;

  public static final String JSON_PROPERTY_PAID_TYPE = "paid_type";
  @JsonProperty(JSON_PROPERTY_PAID_TYPE)
  private OrderLinePaidType paidType;

  public OrderLines id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Order line ID.
   * @return id
   **/
  @JsonProperty(value = "id")
  @ApiModelProperty(example = "2680059592705", value = "Order line ID.")
   @Pattern(regexp="^\\d+$")
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
   * Always \&quot;orderline\&quot;.
   * @return type
   **/
  @JsonProperty(value = "type")
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
  @JsonProperty(value = "ad_account_id")
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
  @JsonProperty(value = "purchase_order_id")
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
  @JsonProperty(value = "start_time")
  @ApiModelProperty(example = "1452208622", value = "Start time. Unix timestamp.")
  @Valid 
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
  @JsonProperty(value = "end_time")
  @ApiModelProperty(example = "1461269616", value = "End time. Unix timestamp.")
  @Valid 
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
  @JsonProperty(value = "budget")
  @ApiModelProperty(example = "5000000", value = "Order line budget in micro currency.")
  @Valid 
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
  @JsonProperty(value = "paid_budget")
  @ApiModelProperty(example = "5000000", value = "Order line paid budget in micro currency.")
  @Valid 
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
  @JsonProperty(value = "status")
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
  @JsonProperty(value = "name")
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
  @JsonProperty(value = "paid_type")
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

