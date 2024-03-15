package org.openapitools.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OrderLinePaidType;
import org.openapitools.model.OrderLineStatus;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrderLine  {
  
  @ApiModelProperty(example = "2680059592705", value = "Order line ID.")
 /**
   * Order line ID.
  **/
  private String id;

  @ApiModelProperty(example = "orderline", value = "Always \"orderline\".")
 /**
   * Always \"orderline\".
  **/
  private String type;

  @ApiModelProperty(example = "549755885175", value = "Ad account ID.")
 /**
   * Ad account ID.
  **/
  private String adAccountId;

  @ApiModelProperty(example = "PO12345", value = "Purchase order ID.")
 /**
   * Purchase order ID.
  **/
  private String purchaseOrderId;

  @ApiModelProperty(example = "1452208622", value = "Start time. Unix timestamp.")
 /**
   * Start time. Unix timestamp.
  **/
  private BigDecimal startTime;

  @ApiModelProperty(example = "1461269616", value = "End time. Unix timestamp.")
 /**
   * End time. Unix timestamp.
  **/
  private BigDecimal endTime;

  @ApiModelProperty(example = "5000000", value = "Order line budget in micro currency.")
 /**
   * Order line budget in micro currency.
  **/
  private BigDecimal budget;

  @ApiModelProperty(example = "5000000", value = "Order line paid budget in micro currency.")
 /**
   * Order line paid budget in micro currency.
  **/
  private BigDecimal paidBudget;

  @ApiModelProperty(value = "Order line status.")
 /**
   * Order line status.
  **/
  private OrderLineStatus status;

  @ApiModelProperty(example = "Order Line Name 1", value = "Order line name.")
 /**
   * Order line name.
  **/
  private String name;

  @ApiModelProperty(value = "Order line paid type.")
 /**
   * Order line paid type.
  **/
  private OrderLinePaidType paidType;

  @ApiModelProperty(example = "[\"626735565838\"]", required = true, value = "Associated List of campaign IDs.")
 /**
   * Associated List of campaign IDs.
  **/
  private List<String> campaignIds = new ArrayList<>();
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

  public OrderLine id(String id) {
    this.id = id;
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

  public OrderLine type(String type) {
    this.type = type;
    return this;
  }

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

  public OrderLine adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
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

  public OrderLine purchaseOrderId(String purchaseOrderId) {
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

  public OrderLine startTime(BigDecimal startTime) {
    this.startTime = startTime;
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

  public OrderLine endTime(BigDecimal endTime) {
    this.endTime = endTime;
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

  public OrderLine budget(BigDecimal budget) {
    this.budget = budget;
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

  public OrderLine paidBudget(BigDecimal paidBudget) {
    this.paidBudget = paidBudget;
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

  public OrderLine status(OrderLineStatus status) {
    this.status = status;
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

  public OrderLine name(String name) {
    this.name = name;
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

  public OrderLine paidType(OrderLinePaidType paidType) {
    this.paidType = paidType;
    return this;
  }

 /**
   * Associated List of campaign IDs.
   * @return campaignIds
  **/
  @JsonProperty("campaign_ids")
  public List<String> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public OrderLine campaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public OrderLine addCampaignIdsItem(String campaignIdsItem) {
    this.campaignIds.add(campaignIdsItem);
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
    OrderLine orderLine = (OrderLine) o;
    return Objects.equals(this.id, orderLine.id) &&
        Objects.equals(this.type, orderLine.type) &&
        Objects.equals(this.adAccountId, orderLine.adAccountId) &&
        Objects.equals(this.purchaseOrderId, orderLine.purchaseOrderId) &&
        Objects.equals(this.startTime, orderLine.startTime) &&
        Objects.equals(this.endTime, orderLine.endTime) &&
        Objects.equals(this.budget, orderLine.budget) &&
        Objects.equals(this.paidBudget, orderLine.paidBudget) &&
        Objects.equals(this.status, orderLine.status) &&
        Objects.equals(this.name, orderLine.name) &&
        Objects.equals(this.paidType, orderLine.paidType) &&
        Objects.equals(this.campaignIds, orderLine.campaignIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, adAccountId, purchaseOrderId, startTime, endTime, budget, paidBudget, status, name, paidType, campaignIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLine {\n");
    
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
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
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

