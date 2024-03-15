package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OrderLinePaidType;
import org.openapitools.model.OrderLineStatus;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OrderLine
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class OrderLine {

  private String id;

  private String type;

  private String adAccountId;

  private JsonNullable<String> purchaseOrderId = JsonNullable.<String>undefined();

  private BigDecimal startTime;

  private JsonNullable<BigDecimal> endTime = JsonNullable.<BigDecimal>undefined();

  private JsonNullable<BigDecimal> budget = JsonNullable.<BigDecimal>undefined();

  private JsonNullable<BigDecimal> paidBudget = JsonNullable.<BigDecimal>undefined();

  private OrderLineStatus status;

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<OrderLinePaidType> paidType = JsonNullable.<OrderLinePaidType>undefined();

  @Valid
  private List<String> campaignIds = new ArrayList<>();

  public OrderLine() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OrderLine(List<String> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public OrderLine id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Order line ID.
   * @return id
  */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", example = "2680059592705", description = "Order line ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
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
  */
  
  @Schema(name = "type", example = "orderline", description = "Always \"orderline\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
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
  */
  
  @Schema(name = "ad_account_id", example = "549755885175", description = "Ad account ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public OrderLine purchaseOrderId(String purchaseOrderId) {
    this.purchaseOrderId = JsonNullable.of(purchaseOrderId);
    return this;
  }

  /**
   * Purchase order ID.
   * @return purchaseOrderId
  */
  
  @Schema(name = "purchase_order_id", example = "PO12345", description = "Purchase order ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("purchase_order_id")
  public JsonNullable<String> getPurchaseOrderId() {
    return purchaseOrderId;
  }

  public void setPurchaseOrderId(JsonNullable<String> purchaseOrderId) {
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
  @Valid 
  @Schema(name = "start_time", example = "1452208622", description = "Start time. Unix timestamp.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_time")
  public BigDecimal getStartTime() {
    return startTime;
  }

  public void setStartTime(BigDecimal startTime) {
    this.startTime = startTime;
  }

  public OrderLine endTime(BigDecimal endTime) {
    this.endTime = JsonNullable.of(endTime);
    return this;
  }

  /**
   * End time. Unix timestamp.
   * @return endTime
  */
  @Valid 
  @Schema(name = "end_time", example = "1461269616", description = "End time. Unix timestamp.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_time")
  public JsonNullable<BigDecimal> getEndTime() {
    return endTime;
  }

  public void setEndTime(JsonNullable<BigDecimal> endTime) {
    this.endTime = endTime;
  }

  public OrderLine budget(BigDecimal budget) {
    this.budget = JsonNullable.of(budget);
    return this;
  }

  /**
   * Order line budget in micro currency.
   * @return budget
  */
  @Valid 
  @Schema(name = "budget", example = "5000000", description = "Order line budget in micro currency.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("budget")
  public JsonNullable<BigDecimal> getBudget() {
    return budget;
  }

  public void setBudget(JsonNullable<BigDecimal> budget) {
    this.budget = budget;
  }

  public OrderLine paidBudget(BigDecimal paidBudget) {
    this.paidBudget = JsonNullable.of(paidBudget);
    return this;
  }

  /**
   * Order line paid budget in micro currency.
   * @return paidBudget
  */
  @Valid 
  @Schema(name = "paid_budget", example = "5000000", description = "Order line paid budget in micro currency.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paid_budget")
  public JsonNullable<BigDecimal> getPaidBudget() {
    return paidBudget;
  }

  public void setPaidBudget(JsonNullable<BigDecimal> paidBudget) {
    this.paidBudget = paidBudget;
  }

  public OrderLine status(OrderLineStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Order line status.
   * @return status
  */
  @Valid 
  @Schema(name = "status", description = "Order line status.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public OrderLineStatus getStatus() {
    return status;
  }

  public void setStatus(OrderLineStatus status) {
    this.status = status;
  }

  public OrderLine name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Order line name.
   * @return name
  */
  
  @Schema(name = "name", example = "Order Line Name 1", description = "Order line name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public OrderLine paidType(OrderLinePaidType paidType) {
    this.paidType = JsonNullable.of(paidType);
    return this;
  }

  /**
   * Order line paid type.
   * @return paidType
  */
  @Valid 
  @Schema(name = "paid_type", description = "Order line paid type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paid_type")
  public JsonNullable<OrderLinePaidType> getPaidType() {
    return paidType;
  }

  public void setPaidType(JsonNullable<OrderLinePaidType> paidType) {
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
  */
  @NotNull 
  @Schema(name = "campaign_ids", example = "[\"626735565838\"]", description = "Associated List of campaign IDs.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("campaign_ids")
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
    return Objects.equals(this.id, orderLine.id) &&
        Objects.equals(this.type, orderLine.type) &&
        Objects.equals(this.adAccountId, orderLine.adAccountId) &&
        equalsNullable(this.purchaseOrderId, orderLine.purchaseOrderId) &&
        Objects.equals(this.startTime, orderLine.startTime) &&
        equalsNullable(this.endTime, orderLine.endTime) &&
        equalsNullable(this.budget, orderLine.budget) &&
        equalsNullable(this.paidBudget, orderLine.paidBudget) &&
        Objects.equals(this.status, orderLine.status) &&
        equalsNullable(this.name, orderLine.name) &&
        equalsNullable(this.paidType, orderLine.paidType) &&
        Objects.equals(this.campaignIds, orderLine.campaignIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, adAccountId, hashCodeNullable(purchaseOrderId), startTime, hashCodeNullable(endTime), hashCodeNullable(budget), hashCodeNullable(paidBudget), status, hashCodeNullable(name), hashCodeNullable(paidType), campaignIds);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

