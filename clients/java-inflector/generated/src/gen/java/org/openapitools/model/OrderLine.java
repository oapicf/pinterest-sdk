package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OrderLinePaidType;
import org.openapitools.model.OrderLineStatus;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrderLine   {
  @JsonProperty("ad_account_id")
  private String adAccountId;

  @JsonProperty("budget")
  private BigDecimal budget;

  @JsonProperty("campaign_ids")
  private List<String> campaignIds = new ArrayList<>();

  @JsonProperty("end_time")
  private BigDecimal endTime;

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("paid_budget")
  private BigDecimal paidBudget;

  @JsonProperty("paid_type")
  private OrderLinePaidType paidType;

  @JsonProperty("purchase_order_id")
  private String purchaseOrderId;

  @JsonProperty("start_time")
  private BigDecimal startTime;

  @JsonProperty("status")
  private OrderLineStatus status;

  @JsonProperty("type")
  private String type;

  /**
   * Ad account ID.
   **/
  public OrderLine adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Ad account ID.")
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Order line budget in micro currency.
   **/
  public OrderLine budget(BigDecimal budget) {
    this.budget = budget;
    return this;
  }

  
  @ApiModelProperty(value = "Order line budget in micro currency.")
  @JsonProperty("budget")
  public BigDecimal getBudget() {
    return budget;
  }
  public void setBudget(BigDecimal budget) {
    this.budget = budget;
  }

  /**
   * Associated List of campaign IDs.
   **/
  public OrderLine campaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  
  @ApiModelProperty(example = "[\"626735565838\"]", required = true, value = "Associated List of campaign IDs.")
  @JsonProperty("campaign_ids")
  public List<String> getCampaignIds() {
    return campaignIds;
  }
  public void setCampaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
  }

  /**
   * End time. Unix timestamp.
   **/
  public OrderLine endTime(BigDecimal endTime) {
    this.endTime = endTime;
    return this;
  }

  
  @ApiModelProperty(value = "End time. Unix timestamp.")
  @JsonProperty("end_time")
  public BigDecimal getEndTime() {
    return endTime;
  }
  public void setEndTime(BigDecimal endTime) {
    this.endTime = endTime;
  }

  /**
   * Order line ID.
   **/
  public OrderLine id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Order line ID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Order line name.
   **/
  public OrderLine name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Order line name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Order line paid budget in micro currency.
   **/
  public OrderLine paidBudget(BigDecimal paidBudget) {
    this.paidBudget = paidBudget;
    return this;
  }

  
  @ApiModelProperty(value = "Order line paid budget in micro currency.")
  @JsonProperty("paid_budget")
  public BigDecimal getPaidBudget() {
    return paidBudget;
  }
  public void setPaidBudget(BigDecimal paidBudget) {
    this.paidBudget = paidBudget;
  }

  /**
   * Order line paid type.
   **/
  public OrderLine paidType(OrderLinePaidType paidType) {
    this.paidType = paidType;
    return this;
  }

  
  @ApiModelProperty(value = "Order line paid type.")
  @JsonProperty("paid_type")
  public OrderLinePaidType getPaidType() {
    return paidType;
  }
  public void setPaidType(OrderLinePaidType paidType) {
    this.paidType = paidType;
  }

  /**
   * Purchase order ID.
   **/
  public OrderLine purchaseOrderId(String purchaseOrderId) {
    this.purchaseOrderId = purchaseOrderId;
    return this;
  }

  
  @ApiModelProperty(value = "Purchase order ID.")
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
  public OrderLine startTime(BigDecimal startTime) {
    this.startTime = startTime;
    return this;
  }

  
  @ApiModelProperty(value = "Start time. Unix timestamp.")
  @JsonProperty("start_time")
  public BigDecimal getStartTime() {
    return startTime;
  }
  public void setStartTime(BigDecimal startTime) {
    this.startTime = startTime;
  }

  /**
   * Order line status.
   **/
  public OrderLine status(OrderLineStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Order line status.")
  @JsonProperty("status")
  public OrderLineStatus getStatus() {
    return status;
  }
  public void setStatus(OrderLineStatus status) {
    this.status = status;
  }

  /**
   * Always \"orderline\".
   **/
  public OrderLine type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Always \"orderline\".")
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

