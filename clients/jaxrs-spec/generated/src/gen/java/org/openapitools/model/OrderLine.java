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
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("OrderLine")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrderLine   {
  private String adAccountId;
  private BigDecimal budget;
  private @Valid List<String> campaignIds = new ArrayList<>();
  private BigDecimal endTime;
  private String id;
  private String name;
  private BigDecimal paidBudget;
  private OrderLinePaidType paidType;
  private String purchaseOrderId;
  private BigDecimal startTime;
  private OrderLineStatus status;
  private String type;

  public OrderLine() {
  }

  @JsonCreator
  public OrderLine(
    @JsonProperty(required = true, value = "ad_account_id") String adAccountId,
    @JsonProperty(required = true, value = "campaign_ids") List<String> campaignIds,
    @JsonProperty(required = true, value = "id") String id,
    @JsonProperty(required = true, value = "status") OrderLineStatus status,
    @JsonProperty(required = true, value = "type") String type
  ) {
    this.adAccountId = adAccountId;
    this.campaignIds = campaignIds;
    this.id = id;
    this.status = status;
    this.type = type;
  }

  /**
   * Ad account ID.
   **/
  public OrderLine adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Ad account ID.")
  @JsonProperty(required = true, value = "ad_account_id")
  @NotNull public String getAdAccountId() {
    return adAccountId;
  }

  @JsonProperty(required = true, value = "ad_account_id")
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
  @Valid public BigDecimal getBudget() {
    return budget;
  }

  @JsonProperty("budget")
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
  @JsonProperty(required = true, value = "campaign_ids")
  @NotNull public List<String> getCampaignIds() {
    return campaignIds;
  }

  @JsonProperty(required = true, value = "campaign_ids")
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
  /**
   * End time. Unix timestamp.
   **/
  public OrderLine endTime(BigDecimal endTime) {
    this.endTime = endTime;
    return this;
  }

  
  @ApiModelProperty(value = "End time. Unix timestamp.")
  @JsonProperty("end_time")
  @Valid public BigDecimal getEndTime() {
    return endTime;
  }

  @JsonProperty("end_time")
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
  @JsonProperty(required = true, value = "id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
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

  @JsonProperty("name")
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
  @Valid public BigDecimal getPaidBudget() {
    return paidBudget;
  }

  @JsonProperty("paid_budget")
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

  @JsonProperty("paid_type")
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

  
  @ApiModelProperty(value = "Start time. Unix timestamp.")
  @JsonProperty("start_time")
  @Valid public BigDecimal getStartTime() {
    return startTime;
  }

  @JsonProperty("start_time")
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
  @JsonProperty(required = true, value = "status")
  @NotNull public OrderLineStatus getStatus() {
    return status;
  }

  @JsonProperty(required = true, value = "status")
  public void setStatus(OrderLineStatus status) {
    this.status = status;
  }

  /**
   * Always \&quot;orderline\&quot;.
   **/
  public OrderLine type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Always \"orderline\".")
  @JsonProperty(required = true, value = "type")
  @NotNull public String getType() {
    return type;
  }

  @JsonProperty(required = true, value = "type")
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
