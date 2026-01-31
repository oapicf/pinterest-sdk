package apimodels;

import apimodels.OrderLinePaidType;
import apimodels.OrderLineStatus;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Order Line
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrderLines   {
  @JsonProperty("ad_account_id")
  
  private String adAccountId;

  @JsonProperty("budget")
  @Valid

  private BigDecimal budget;

  @JsonProperty("end_time")
  @Valid

  private BigDecimal endTime;

  @JsonProperty("id")
  @Pattern(regexp="^\\d+$")

  private String id;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("paid_budget")
  @Valid

  private BigDecimal paidBudget;

  @JsonProperty("paid_type")
  @Valid

  private OrderLinePaidType paidType;

  @JsonProperty("purchase_order_id")
  
  private String purchaseOrderId;

  @JsonProperty("start_time")
  @Valid

  private BigDecimal startTime;

  @JsonProperty("status")
  @Valid

  private OrderLineStatus status;

  @JsonProperty("type")
  
  private String type;

  public OrderLines adAccountId(String adAccountId) {
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

  public OrderLines budget(BigDecimal budget) {
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

  public OrderLines endTime(BigDecimal endTime) {
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

  public OrderLines id(String id) {
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

  public OrderLines name(String name) {
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

  public OrderLines paidBudget(BigDecimal paidBudget) {
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

  public OrderLines paidType(OrderLinePaidType paidType) {
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

  public OrderLines purchaseOrderId(String purchaseOrderId) {
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

  public OrderLines startTime(BigDecimal startTime) {
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

  public OrderLines status(OrderLineStatus status) {
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

  public OrderLines type(String type) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderLines orderLines = (OrderLines) o;
    return Objects.equals(adAccountId, orderLines.adAccountId) &&
        Objects.equals(budget, orderLines.budget) &&
        Objects.equals(endTime, orderLines.endTime) &&
        Objects.equals(id, orderLines.id) &&
        Objects.equals(name, orderLines.name) &&
        Objects.equals(paidBudget, orderLines.paidBudget) &&
        Objects.equals(paidType, orderLines.paidType) &&
        Objects.equals(purchaseOrderId, orderLines.purchaseOrderId) &&
        Objects.equals(startTime, orderLines.startTime) &&
        Objects.equals(status, orderLines.status) &&
        Objects.equals(type, orderLines.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, budget, endTime, id, name, paidBudget, paidType, purchaseOrderId, startTime, status, type);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLines {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

