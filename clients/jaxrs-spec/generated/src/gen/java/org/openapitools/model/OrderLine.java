package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OrderLinePaidType;
import org.openapitools.model.OrderLineStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("OrderLine")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class OrderLine   {
  private @Valid String id;
  private @Valid String type;
  private @Valid String adAccountId;
  private @Valid String purchaseOrderId;
  private @Valid BigDecimal startTime;
  private @Valid BigDecimal endTime;
  private @Valid BigDecimal budget;
  private @Valid BigDecimal paidBudget;
  private @Valid OrderLineStatus status;
  private @Valid String name;
  private @Valid OrderLinePaidType paidType;
  private @Valid List<String> campaignIds = new ArrayList<>();

  /**
   * Order line ID.
   **/
  public OrderLine id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "2680059592705", value = "Order line ID.")
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Always \&quot;orderline\&quot;.
   **/
  public OrderLine type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "orderline", value = "Always \"orderline\".")
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Ad account ID.
   **/
  public OrderLine adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  
  @ApiModelProperty(example = "549755885175", value = "Ad account ID.")
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }

  @JsonProperty("ad_account_id")
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Purchase order ID.
   **/
  public OrderLine purchaseOrderId(String purchaseOrderId) {
    this.purchaseOrderId = purchaseOrderId;
    return this;
  }

  
  @ApiModelProperty(example = "PO12345", value = "Purchase order ID.")
  @JsonProperty("purchase_order_id")
  public String getPurchaseOrderId() {
    return purchaseOrderId;
  }

  @JsonProperty("purchase_order_id")
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

  
  @ApiModelProperty(example = "1452208622", value = "Start time. Unix timestamp.")
  @JsonProperty("start_time")
  public BigDecimal getStartTime() {
    return startTime;
  }

  @JsonProperty("start_time")
  public void setStartTime(BigDecimal startTime) {
    this.startTime = startTime;
  }

  /**
   * End time. Unix timestamp.
   **/
  public OrderLine endTime(BigDecimal endTime) {
    this.endTime = endTime;
    return this;
  }

  
  @ApiModelProperty(example = "1461269616", value = "End time. Unix timestamp.")
  @JsonProperty("end_time")
  public BigDecimal getEndTime() {
    return endTime;
  }

  @JsonProperty("end_time")
  public void setEndTime(BigDecimal endTime) {
    this.endTime = endTime;
  }

  /**
   * Order line budget in micro currency.
   **/
  public OrderLine budget(BigDecimal budget) {
    this.budget = budget;
    return this;
  }

  
  @ApiModelProperty(example = "5000000", value = "Order line budget in micro currency.")
  @JsonProperty("budget")
  public BigDecimal getBudget() {
    return budget;
  }

  @JsonProperty("budget")
  public void setBudget(BigDecimal budget) {
    this.budget = budget;
  }

  /**
   * Order line paid budget in micro currency.
   **/
  public OrderLine paidBudget(BigDecimal paidBudget) {
    this.paidBudget = paidBudget;
    return this;
  }

  
  @ApiModelProperty(example = "5000000", value = "Order line paid budget in micro currency.")
  @JsonProperty("paid_budget")
  public BigDecimal getPaidBudget() {
    return paidBudget;
  }

  @JsonProperty("paid_budget")
  public void setPaidBudget(BigDecimal paidBudget) {
    this.paidBudget = paidBudget;
  }

  /**
   * Order line status.
   **/
  public OrderLine status(OrderLineStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "Order line status.")
  @JsonProperty("status")
  public OrderLineStatus getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(OrderLineStatus status) {
    this.status = status;
  }

  /**
   * Order line name.
   **/
  public OrderLine name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Order Line Name 1", value = "Order line name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
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

  @JsonProperty("paid_type")
  public void setPaidType(OrderLinePaidType paidType) {
    this.paidType = paidType;
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
  @NotNull
  public List<String> getCampaignIds() {
    return campaignIds;
  }

  @JsonProperty("campaign_ids")
  public void setCampaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public OrderLine addCampaignIdsItem(String campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }

    this.campaignIds.add(campaignIdsItem);
    return this;
  }

  public OrderLine removeCampaignIdsItem(String campaignIdsItem) {
    if (campaignIdsItem != null && this.campaignIds != null) {
      this.campaignIds.remove(campaignIdsItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

