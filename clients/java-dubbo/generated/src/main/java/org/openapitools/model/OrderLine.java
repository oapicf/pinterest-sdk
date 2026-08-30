package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OrderLinePaidType;
import org.openapitools.model.OrderLineStatus;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrderLine implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Ad account ID.
   */
  @JsonProperty("ad_account_id")
  private String adAccountId;

  /**
   * Order line budget in micro currency.
   */
  @JsonProperty("budget")
  private BigDecimal budget;

  /**
   * Associated List of campaign IDs.
   */
  @JsonProperty("campaign_ids")
  private List<String> campaignIds = new ArrayList<>();

  /**
   * End time. Unix timestamp.
   */
  @JsonProperty("end_time")
  private BigDecimal endTime;

  /**
   * Order line ID.
   */
  @JsonProperty("id")
  private String id;

  /**
   * Order line name.
   */
  @JsonProperty("name")
  private String name;

  /**
   * Order line paid budget in micro currency.
   */
  @JsonProperty("paid_budget")
  private BigDecimal paidBudget;

  /**
   * Order line paid type.
   */
  @JsonProperty("paid_type")
  private OrderLinePaidType paidType;

  /**
   * Purchase order ID.
   */
  @JsonProperty("purchase_order_id")
  private String purchaseOrderId;

  /**
   * Start time. Unix timestamp.
   */
  @JsonProperty("start_time")
  private BigDecimal startTime;

  /**
   * Order line status.
   */
  @JsonProperty("status")
  private OrderLineStatus status;

  /**
   * Always \&quot;orderline\&quot;.
   */
  @JsonProperty("type")
  private String type;

  /**
   * Ad account ID.
   * @return adAccountId
   */
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Order line budget in micro currency.
   * @return budget
   */
  public BigDecimal getBudget() {
    return budget;
  }

  public void setBudget(BigDecimal budget) {
    this.budget = budget;
  }

  /**
   * Associated List of campaign IDs.
   * @return campaignIds
   */
  public List<String> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
  }

  /**
   * End time. Unix timestamp.
   * @return endTime
   */
  public BigDecimal getEndTime() {
    return endTime;
  }

  public void setEndTime(BigDecimal endTime) {
    this.endTime = endTime;
  }

  /**
   * Order line ID.
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Order line name.
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Order line paid budget in micro currency.
   * @return paidBudget
   */
  public BigDecimal getPaidBudget() {
    return paidBudget;
  }

  public void setPaidBudget(BigDecimal paidBudget) {
    this.paidBudget = paidBudget;
  }

  /**
   * Order line paid type.
   * @return paidType
   */
  public OrderLinePaidType getPaidType() {
    return paidType;
  }

  public void setPaidType(OrderLinePaidType paidType) {
    this.paidType = paidType;
  }

  /**
   * Purchase order ID.
   * @return purchaseOrderId
   */
  public String getPurchaseOrderId() {
    return purchaseOrderId;
  }

  public void setPurchaseOrderId(String purchaseOrderId) {
    this.purchaseOrderId = purchaseOrderId;
  }

  /**
   * Start time. Unix timestamp.
   * @return startTime
   */
  public BigDecimal getStartTime() {
    return startTime;
  }

  public void setStartTime(BigDecimal startTime) {
    this.startTime = startTime;
  }

  /**
   * Order line status.
   * @return status
   */
  public OrderLineStatus getStatus() {
    return status;
  }

  public void setStatus(OrderLineStatus status) {
    this.status = status;
  }

  /**
   * Always \&quot;orderline\&quot;.
   * @return type
   */
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
    return Objects.equals(this.adAccountId, orderLine.adAccountId) &&
        Objects.equals(this.budget, orderLine.budget) &&
        Objects.equals(this.campaignIds, orderLine.campaignIds) &&
        Objects.equals(this.endTime, orderLine.endTime) &&
        Objects.equals(this.id, orderLine.id) &&
        Objects.equals(this.name, orderLine.name) &&
        Objects.equals(this.paidBudget, orderLine.paidBudget) &&
        Objects.equals(this.paidType, orderLine.paidType) &&
        Objects.equals(this.purchaseOrderId, orderLine.purchaseOrderId) &&
        Objects.equals(this.startTime, orderLine.startTime) &&
        Objects.equals(this.status, orderLine.status) &&
        Objects.equals(this.type, orderLine.type);
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
