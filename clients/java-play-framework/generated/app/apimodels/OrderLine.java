package apimodels;

import apimodels.OrderLinePaidType;
import apimodels.OrderLineStatus;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrderLine
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrderLine   {
  @JsonProperty("id")
  @Pattern(regexp="^\\d+$")

  private String id;

  @JsonProperty("type")
  
  private String type;

  @JsonProperty("ad_account_id")
  
  private String adAccountId;

  @JsonProperty("purchase_order_id")
  
  private String purchaseOrderId;

  @JsonProperty("start_time")
  @Valid

  private BigDecimal startTime;

  @JsonProperty("end_time")
  @Valid

  private BigDecimal endTime;

  @JsonProperty("budget")
  @Valid

  private BigDecimal budget;

  @JsonProperty("paid_budget")
  @Valid

  private BigDecimal paidBudget;

  @JsonProperty("status")
  @Valid

  private OrderLineStatus status;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("paid_type")
  @Valid

  private OrderLinePaidType paidType;

  @JsonProperty("campaign_ids")
  @NotNull

  private List<String> campaignIds = new ArrayList<>();

  public OrderLine id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Order line ID.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OrderLine type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Always \"orderline\".
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OrderLine adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

   /**
   * Ad account ID.
   * @return adAccountId
  **/
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public OrderLine purchaseOrderId(String purchaseOrderId) {
    this.purchaseOrderId = purchaseOrderId;
    return this;
  }

   /**
   * Purchase order ID.
   * @return purchaseOrderId
  **/
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
  **/
  public BigDecimal getStartTime() {
    return startTime;
  }

  public void setStartTime(BigDecimal startTime) {
    this.startTime = startTime;
  }

  public OrderLine endTime(BigDecimal endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * End time. Unix timestamp.
   * @return endTime
  **/
  public BigDecimal getEndTime() {
    return endTime;
  }

  public void setEndTime(BigDecimal endTime) {
    this.endTime = endTime;
  }

  public OrderLine budget(BigDecimal budget) {
    this.budget = budget;
    return this;
  }

   /**
   * Order line budget in micro currency.
   * @return budget
  **/
  public BigDecimal getBudget() {
    return budget;
  }

  public void setBudget(BigDecimal budget) {
    this.budget = budget;
  }

  public OrderLine paidBudget(BigDecimal paidBudget) {
    this.paidBudget = paidBudget;
    return this;
  }

   /**
   * Order line paid budget in micro currency.
   * @return paidBudget
  **/
  public BigDecimal getPaidBudget() {
    return paidBudget;
  }

  public void setPaidBudget(BigDecimal paidBudget) {
    this.paidBudget = paidBudget;
  }

  public OrderLine status(OrderLineStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Order line status.
   * @return status
  **/
  public OrderLineStatus getStatus() {
    return status;
  }

  public void setStatus(OrderLineStatus status) {
    this.status = status;
  }

  public OrderLine name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Order line name.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrderLine paidType(OrderLinePaidType paidType) {
    this.paidType = paidType;
    return this;
  }

   /**
   * Order line paid type.
   * @return paidType
  **/
  public OrderLinePaidType getPaidType() {
    return paidType;
  }

  public void setPaidType(OrderLinePaidType paidType) {
    this.paidType = paidType;
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
  **/
  public List<String> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
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
    return Objects.equals(id, orderLine.id) &&
        Objects.equals(type, orderLine.type) &&
        Objects.equals(adAccountId, orderLine.adAccountId) &&
        Objects.equals(purchaseOrderId, orderLine.purchaseOrderId) &&
        Objects.equals(startTime, orderLine.startTime) &&
        Objects.equals(endTime, orderLine.endTime) &&
        Objects.equals(budget, orderLine.budget) &&
        Objects.equals(paidBudget, orderLine.paidBudget) &&
        Objects.equals(status, orderLine.status) &&
        Objects.equals(name, orderLine.name) &&
        Objects.equals(paidType, orderLine.paidType) &&
        Objects.equals(campaignIds, orderLine.campaignIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, adAccountId, purchaseOrderId, startTime, endTime, budget, paidBudget, status, name, paidType, campaignIds);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

