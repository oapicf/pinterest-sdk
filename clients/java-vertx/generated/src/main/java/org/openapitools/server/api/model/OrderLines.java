package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.OrderLinePaidType;
import org.openapitools.server.api.model.OrderLineStatus;

/**
 * Order Line
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public OrderLines () {

  }

  public OrderLines (String id, String type, String adAccountId, String purchaseOrderId, BigDecimal startTime, BigDecimal endTime, BigDecimal budget, BigDecimal paidBudget, OrderLineStatus status, String name, OrderLinePaidType paidType) {
    this.id = id;
    this.type = type;
    this.adAccountId = adAccountId;
    this.purchaseOrderId = purchaseOrderId;
    this.startTime = startTime;
    this.endTime = endTime;
    this.budget = budget;
    this.paidBudget = paidBudget;
    this.status = status;
    this.name = name;
    this.paidType = paidType;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

    
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

    
  @JsonProperty("purchase_order_id")
  public String getPurchaseOrderId() {
    return purchaseOrderId;
  }
  public void setPurchaseOrderId(String purchaseOrderId) {
    this.purchaseOrderId = purchaseOrderId;
  }

    
  @JsonProperty("start_time")
  public BigDecimal getStartTime() {
    return startTime;
  }
  public void setStartTime(BigDecimal startTime) {
    this.startTime = startTime;
  }

    
  @JsonProperty("end_time")
  public BigDecimal getEndTime() {
    return endTime;
  }
  public void setEndTime(BigDecimal endTime) {
    this.endTime = endTime;
  }

    
  @JsonProperty("budget")
  public BigDecimal getBudget() {
    return budget;
  }
  public void setBudget(BigDecimal budget) {
    this.budget = budget;
  }

    
  @JsonProperty("paid_budget")
  public BigDecimal getPaidBudget() {
    return paidBudget;
  }
  public void setPaidBudget(BigDecimal paidBudget) {
    this.paidBudget = paidBudget;
  }

    
  @JsonProperty("status")
  public OrderLineStatus getStatus() {
    return status;
  }
  public void setStatus(OrderLineStatus status) {
    this.status = status;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
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
    return Objects.equals(id, orderLines.id) &&
        Objects.equals(type, orderLines.type) &&
        Objects.equals(adAccountId, orderLines.adAccountId) &&
        Objects.equals(purchaseOrderId, orderLines.purchaseOrderId) &&
        Objects.equals(startTime, orderLines.startTime) &&
        Objects.equals(endTime, orderLines.endTime) &&
        Objects.equals(budget, orderLines.budget) &&
        Objects.equals(paidBudget, orderLines.paidBudget) &&
        Objects.equals(status, orderLines.status) &&
        Objects.equals(name, orderLines.name) &&
        Objects.equals(paidType, orderLines.paidType);
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
