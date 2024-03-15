package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OrderLinePaidType;
import org.openapitools.model.OrderLineStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Order Line")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-03-14T23:04:54.712028318Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class OrderLines   {
  
  private String id;
  private String type;
  private String adAccountId;
  private String purchaseOrderId;
  private BigDecimal startTime;
  private BigDecimal endTime;
  private BigDecimal budget;
  private BigDecimal paidBudget;
  private OrderLineStatus status;
  private String name;
  private OrderLinePaidType paidType;

  /**
   * Order line ID.
   **/
  
  @ApiModelProperty(example = "2680059592705", value = "Order line ID.")
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Always \&quot;orderline\&quot;.
   **/
  
  @ApiModelProperty(example = "orderline", value = "Always \"orderline\".")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Ad account ID.
   **/
  
  @ApiModelProperty(example = "549755885175", value = "Ad account ID.")
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Purchase order ID.
   **/
  
  @ApiModelProperty(example = "PO12345", value = "Purchase order ID.")
  @JsonProperty("purchase_order_id")
  public String getPurchaseOrderId() {
    return purchaseOrderId;
  }
  public void setPurchaseOrderId(String purchaseOrderId) {
    this.purchaseOrderId = purchaseOrderId;
  }

  /**
   * Start time. Unix timestamp.
   **/
  
  @ApiModelProperty(example = "1452208622", value = "Start time. Unix timestamp.")
  @JsonProperty("start_time")
  public BigDecimal getStartTime() {
    return startTime;
  }
  public void setStartTime(BigDecimal startTime) {
    this.startTime = startTime;
  }

  /**
   * End time. Unix timestamp.
   **/
  
  @ApiModelProperty(example = "1461269616", value = "End time. Unix timestamp.")
  @JsonProperty("end_time")
  public BigDecimal getEndTime() {
    return endTime;
  }
  public void setEndTime(BigDecimal endTime) {
    this.endTime = endTime;
  }

  /**
   * Order line budget in micro currency.
   **/
  
  @ApiModelProperty(example = "5000000", value = "Order line budget in micro currency.")
  @JsonProperty("budget")
  public BigDecimal getBudget() {
    return budget;
  }
  public void setBudget(BigDecimal budget) {
    this.budget = budget;
  }

  /**
   * Order line paid budget in micro currency.
   **/
  
  @ApiModelProperty(example = "5000000", value = "Order line paid budget in micro currency.")
  @JsonProperty("paid_budget")
  public BigDecimal getPaidBudget() {
    return paidBudget;
  }
  public void setPaidBudget(BigDecimal paidBudget) {
    this.paidBudget = paidBudget;
  }

  /**
   * Order line status.
   **/
  
  @ApiModelProperty(value = "Order line status.")
  @JsonProperty("status")
  public OrderLineStatus getStatus() {
    return status;
  }
  public void setStatus(OrderLineStatus status) {
    this.status = status;
  }

  /**
   * Order line name.
   **/
  
  @ApiModelProperty(example = "Order Line Name 1", value = "Order line name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Order line paid type.
   **/
  
  @ApiModelProperty(value = "Order line paid type.")
  @JsonProperty("paid_type")
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

