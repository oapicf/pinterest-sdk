package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.OrderLinePaidType;
import org.openapitools.vertxweb.server.model.OrderLineStatus;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderLine   {
  
  private String adAccountId;
  private BigDecimal budget;
  private List<String> campaignIds = new ArrayList<>();
  private BigDecimal endTime;
  private String id;
  private String name;
  private BigDecimal paidBudget;
  private OrderLinePaidType paidType;
  private String purchaseOrderId;
  private BigDecimal startTime;
  private OrderLineStatus status;
  private String type;

  public OrderLine () {

  }

  public OrderLine (String adAccountId, BigDecimal budget, List<String> campaignIds, BigDecimal endTime, String id, String name, BigDecimal paidBudget, OrderLinePaidType paidType, String purchaseOrderId, BigDecimal startTime, OrderLineStatus status, String type) {
    this.adAccountId = adAccountId;
    this.budget = budget;
    this.campaignIds = campaignIds;
    this.endTime = endTime;
    this.id = id;
    this.name = name;
    this.paidBudget = paidBudget;
    this.paidType = paidType;
    this.purchaseOrderId = purchaseOrderId;
    this.startTime = startTime;
    this.status = status;
    this.type = type;
  }

    
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

    
  @JsonProperty("budget")
  public BigDecimal getBudget() {
    return budget;
  }
  public void setBudget(BigDecimal budget) {
    this.budget = budget;
  }

    
  @JsonProperty("campaign_ids")
  public List<String> getCampaignIds() {
    return campaignIds;
  }
  public void setCampaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
  }

    
  @JsonProperty("end_time")
  public BigDecimal getEndTime() {
    return endTime;
  }
  public void setEndTime(BigDecimal endTime) {
    this.endTime = endTime;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("paid_budget")
  public BigDecimal getPaidBudget() {
    return paidBudget;
  }
  public void setPaidBudget(BigDecimal paidBudget) {
    this.paidBudget = paidBudget;
  }

    
  @JsonProperty("paid_type")
  public OrderLinePaidType getPaidType() {
    return paidType;
  }
  public void setPaidType(OrderLinePaidType paidType) {
    this.paidType = paidType;
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

    
  @JsonProperty("status")
  public OrderLineStatus getStatus() {
    return status;
  }
  public void setStatus(OrderLineStatus status) {
    this.status = status;
  }

    
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderLine orderLine = (OrderLine) o;
    return Objects.equals(adAccountId, orderLine.adAccountId) &&
        Objects.equals(budget, orderLine.budget) &&
        Objects.equals(campaignIds, orderLine.campaignIds) &&
        Objects.equals(endTime, orderLine.endTime) &&
        Objects.equals(id, orderLine.id) &&
        Objects.equals(name, orderLine.name) &&
        Objects.equals(paidBudget, orderLine.paidBudget) &&
        Objects.equals(paidType, orderLine.paidType) &&
        Objects.equals(purchaseOrderId, orderLine.purchaseOrderId) &&
        Objects.equals(startTime, orderLine.startTime) &&
        Objects.equals(status, orderLine.status) &&
        Objects.equals(type, orderLine.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, budget, campaignIds, endTime, id, name, paidBudget, paidType, purchaseOrderId, startTime, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLine {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
