package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
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
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

  /**
   * Ad account ID.
   **/
  
  @ApiModelProperty(required = true, value = "Ad account ID.")
  @JsonProperty("ad_account_id")
  @NotNull
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Order line budget in micro currency.
   **/
  
  @ApiModelProperty(value = "Order line budget in micro currency.")
  @JsonProperty("budget")
  @Valid
  public BigDecimal getBudget() {
    return budget;
  }
  public void setBudget(BigDecimal budget) {
    this.budget = budget;
  }

  /**
   * Associated List of campaign IDs.
   **/
  
  @ApiModelProperty(example = "[\"626735565838\"]", required = true, value = "Associated List of campaign IDs.")
  @JsonProperty("campaign_ids")
  @NotNull
  public List<String> getCampaignIds() {
    return campaignIds;
  }
  public void setCampaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
  }

  /**
   * End time. Unix timestamp.
   **/
  
  @ApiModelProperty(value = "End time. Unix timestamp.")
  @JsonProperty("end_time")
  @Valid
  public BigDecimal getEndTime() {
    return endTime;
  }
  public void setEndTime(BigDecimal endTime) {
    this.endTime = endTime;
  }

  /**
   * Order line ID.
   **/
  
  @ApiModelProperty(required = true, value = "Order line ID.")
  @JsonProperty("id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Order line name.
   **/
  
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
  
  @ApiModelProperty(value = "Order line paid budget in micro currency.")
  @JsonProperty("paid_budget")
  @Valid
  public BigDecimal getPaidBudget() {
    return paidBudget;
  }
  public void setPaidBudget(BigDecimal paidBudget) {
    this.paidBudget = paidBudget;
  }

  /**
   * Order line paid type.
   **/
  
  @ApiModelProperty(value = "Order line paid type.")
  @JsonProperty("paid_type")
  @Valid
  public OrderLinePaidType getPaidType() {
    return paidType;
  }
  public void setPaidType(OrderLinePaidType paidType) {
    this.paidType = paidType;
  }

  /**
   * Purchase order ID.
   **/
  
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
  
  @ApiModelProperty(value = "Start time. Unix timestamp.")
  @JsonProperty("start_time")
  @Valid
  public BigDecimal getStartTime() {
    return startTime;
  }
  public void setStartTime(BigDecimal startTime) {
    this.startTime = startTime;
  }

  /**
   * Order line status.
   **/
  
  @ApiModelProperty(required = true, value = "Order line status.")
  @JsonProperty("status")
  @NotNull
  @Valid
  public OrderLineStatus getStatus() {
    return status;
  }
  public void setStatus(OrderLineStatus status) {
    this.status = status;
  }

  /**
   * Always \&quot;orderline\&quot;.
   **/
  
  @ApiModelProperty(required = true, value = "Always \"orderline\".")
  @JsonProperty("type")
  @NotNull
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

