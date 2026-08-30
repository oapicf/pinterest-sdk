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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * OrderLine
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

  public OrderLine adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * Ad account ID.
   * @return adAccountId
   */
  @ApiModelProperty(required = true, value = "Ad account ID.")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public OrderLine budget(BigDecimal budget) {
    this.budget = budget;
    return this;
  }

  /**
   * Order line budget in micro currency.
   * @return budget
   */
  @ApiModelProperty(value = "Order line budget in micro currency.")
  public BigDecimal getBudget() {
    return budget;
  }

  public void setBudget(BigDecimal budget) {
    this.budget = budget;
  }

  public OrderLine campaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public OrderLine addCampaignIdsItem(String campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

  /**
   * Associated List of campaign IDs.
   * @return campaignIds
   */
  @ApiModelProperty(example = "[\"626735565838\"]", required = true, value = "Associated List of campaign IDs.")
  public List<String> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public OrderLine endTime(BigDecimal endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * End time. Unix timestamp.
   * @return endTime
   */
  @ApiModelProperty(value = "End time. Unix timestamp.")
  public BigDecimal getEndTime() {
    return endTime;
  }

  public void setEndTime(BigDecimal endTime) {
    this.endTime = endTime;
  }

  public OrderLine id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Order line ID.
   * @return id
   */
  @ApiModelProperty(required = true, value = "Order line ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OrderLine name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Order line name.
   * @return name
   */
  @ApiModelProperty(value = "Order line name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrderLine paidBudget(BigDecimal paidBudget) {
    this.paidBudget = paidBudget;
    return this;
  }

  /**
   * Order line paid budget in micro currency.
   * @return paidBudget
   */
  @ApiModelProperty(value = "Order line paid budget in micro currency.")
  public BigDecimal getPaidBudget() {
    return paidBudget;
  }

  public void setPaidBudget(BigDecimal paidBudget) {
    this.paidBudget = paidBudget;
  }

  public OrderLine paidType(OrderLinePaidType paidType) {
    this.paidType = paidType;
    return this;
  }

  /**
   * Order line paid type.
   * @return paidType
   */
  @ApiModelProperty(value = "Order line paid type.")
  public OrderLinePaidType getPaidType() {
    return paidType;
  }

  public void setPaidType(OrderLinePaidType paidType) {
    this.paidType = paidType;
  }

  public OrderLine purchaseOrderId(String purchaseOrderId) {
    this.purchaseOrderId = purchaseOrderId;
    return this;
  }

  /**
   * Purchase order ID.
   * @return purchaseOrderId
   */
  @ApiModelProperty(value = "Purchase order ID.")
  public String getPurchaseOrderId() {
    return purchaseOrderId;
  }

  public void setPurchaseOrderId(String purchaseOrderId) {
    this.purchaseOrderId = purchaseOrderId;
  }

  public OrderLine startTime(BigDecimal startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Start time. Unix timestamp.
   * @return startTime
   */
  @ApiModelProperty(value = "Start time. Unix timestamp.")
  public BigDecimal getStartTime() {
    return startTime;
  }

  public void setStartTime(BigDecimal startTime) {
    this.startTime = startTime;
  }

  public OrderLine status(OrderLineStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Order line status.
   * @return status
   */
  @ApiModelProperty(required = true, value = "Order line status.")
  public OrderLineStatus getStatus() {
    return status;
  }

  public void setStatus(OrderLineStatus status) {
    this.status = status;
  }

  public OrderLine type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Always \"orderline\".
   * @return type
   */
  @ApiModelProperty(required = true, value = "Always \"orderline\".")
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

