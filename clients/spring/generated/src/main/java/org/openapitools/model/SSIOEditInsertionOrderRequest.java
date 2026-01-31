package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SSIOEditInsertionOrderRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-26T05:48:22.520185154Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class SSIOEditInsertionOrderRequest {

  private @Nullable String startDate;

  private @Nullable String endDate;

  private @Nullable String poNumber;

  private @Nullable BigDecimal budgetAmount;

  private @Nullable String billingContactFirstname;

  private @Nullable String billingContactLastname;

  private @Nullable String billingContactEmail;

  private @Nullable String mediaContactFirstname;

  private @Nullable String mediaContactLastname;

  private @Nullable String mediaContactEmail;

  private @Nullable String agencyLink;

  private @Nullable String userEmail;

  private @Nullable String oracleLineId;

  private @Nullable String salesforceOrderId;

  private @Nullable String salesforceOrderLineId;

  private @Nullable String adsManagerOrderLineId;

  public SSIOEditInsertionOrderRequest startDate(@Nullable String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Starting date of time period. Format: YYYY-MM-DD
   * @return startDate
   */
  @Pattern(regexp = "^(\\d{4})-(\\d{2})-(\\d{2})$") 
  @Schema(name = "start_date", example = "2020-12-20", description = "Starting date of time period. Format: YYYY-MM-DD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_date")
  public @Nullable String getStartDate() {
    return startDate;
  }

  public void setStartDate(@Nullable String startDate) {
    this.startDate = startDate;
  }

  public SSIOEditInsertionOrderRequest endDate(@Nullable String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * End date of time period. Format: YYYY-MM-DD
   * @return endDate
   */
  @Pattern(regexp = "^(\\d{4})-(\\d{2})-(\\d{2})$") 
  @Schema(name = "end_date", example = "2020-12-20", description = "End date of time period. Format: YYYY-MM-DD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_date")
  public @Nullable String getEndDate() {
    return endDate;
  }

  public void setEndDate(@Nullable String endDate) {
    this.endDate = endDate;
  }

  public SSIOEditInsertionOrderRequest poNumber(@Nullable String poNumber) {
    this.poNumber = poNumber;
    return this;
  }

  /**
   * The po number
   * @return poNumber
   */
  
  @Schema(name = "po_number", description = "The po number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("po_number")
  public @Nullable String getPoNumber() {
    return poNumber;
  }

  public void setPoNumber(@Nullable String poNumber) {
    this.poNumber = poNumber;
  }

  public SSIOEditInsertionOrderRequest budgetAmount(@Nullable BigDecimal budgetAmount) {
    this.budgetAmount = budgetAmount;
    return this;
  }

  /**
   * If Budget order line, the budget amount.
   * @return budgetAmount
   */
  @Valid 
  @Schema(name = "budget_amount", example = "5000000", description = "If Budget order line, the budget amount.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("budget_amount")
  public @Nullable BigDecimal getBudgetAmount() {
    return budgetAmount;
  }

  public void setBudgetAmount(@Nullable BigDecimal budgetAmount) {
    this.budgetAmount = budgetAmount;
  }

  public SSIOEditInsertionOrderRequest billingContactFirstname(@Nullable String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
    return this;
  }

  /**
   * The billing contact first name
   * @return billingContactFirstname
   */
  
  @Schema(name = "billing_contact_firstname", description = "The billing contact first name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billing_contact_firstname")
  public @Nullable String getBillingContactFirstname() {
    return billingContactFirstname;
  }

  public void setBillingContactFirstname(@Nullable String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
  }

  public SSIOEditInsertionOrderRequest billingContactLastname(@Nullable String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
    return this;
  }

  /**
   * The billing contact last name
   * @return billingContactLastname
   */
  
  @Schema(name = "billing_contact_lastname", description = "The billing contact last name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billing_contact_lastname")
  public @Nullable String getBillingContactLastname() {
    return billingContactLastname;
  }

  public void setBillingContactLastname(@Nullable String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
  }

  public SSIOEditInsertionOrderRequest billingContactEmail(@Nullable String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
    return this;
  }

  /**
   * The billing contact email
   * @return billingContactEmail
   */
  
  @Schema(name = "billing_contact_email", example = "test@example", description = "The billing contact email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billing_contact_email")
  public @Nullable String getBillingContactEmail() {
    return billingContactEmail;
  }

  public void setBillingContactEmail(@Nullable String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
  }

  public SSIOEditInsertionOrderRequest mediaContactFirstname(@Nullable String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
    return this;
  }

  /**
   * The media contact first name
   * @return mediaContactFirstname
   */
  
  @Schema(name = "media_contact_firstname", description = "The media contact first name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("media_contact_firstname")
  public @Nullable String getMediaContactFirstname() {
    return mediaContactFirstname;
  }

  public void setMediaContactFirstname(@Nullable String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
  }

  public SSIOEditInsertionOrderRequest mediaContactLastname(@Nullable String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
    return this;
  }

  /**
   * The media contact last name
   * @return mediaContactLastname
   */
  
  @Schema(name = "media_contact_lastname", description = "The media contact last name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("media_contact_lastname")
  public @Nullable String getMediaContactLastname() {
    return mediaContactLastname;
  }

  public void setMediaContactLastname(@Nullable String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
  }

  public SSIOEditInsertionOrderRequest mediaContactEmail(@Nullable String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
    return this;
  }

  /**
   * The media contact email
   * @return mediaContactEmail
   */
  
  @Schema(name = "media_contact_email", example = "test@example", description = "The media contact email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("media_contact_email")
  public @Nullable String getMediaContactEmail() {
    return mediaContactEmail;
  }

  public void setMediaContactEmail(@Nullable String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
  }

  public SSIOEditInsertionOrderRequest agencyLink(@Nullable String agencyLink) {
    this.agencyLink = agencyLink;
    return this;
  }

  /**
   * URL link for agency
   * @return agencyLink
   */
  
  @Schema(name = "agency_link", description = "URL link for agency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("agency_link")
  public @Nullable String getAgencyLink() {
    return agencyLink;
  }

  public void setAgencyLink(@Nullable String agencyLink) {
    this.agencyLink = agencyLink;
  }

  public SSIOEditInsertionOrderRequest userEmail(@Nullable String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  /**
   * The email of user submitting the insertion order
   * @return userEmail
   */
  
  @Schema(name = "user_email", example = "test@example", description = "The email of user submitting the insertion order", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_email")
  public @Nullable String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(@Nullable String userEmail) {
    this.userEmail = userEmail;
  }

  public SSIOEditInsertionOrderRequest oracleLineId(@Nullable String oracleLineId) {
    this.oracleLineId = oracleLineId;
    return this;
  }

  /**
   * LineId in the Oracle DB
   * @return oracleLineId
   */
  
  @Schema(name = "oracle_line_id", description = "LineId in the Oracle DB", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oracle_line_id")
  public @Nullable String getOracleLineId() {
    return oracleLineId;
  }

  public void setOracleLineId(@Nullable String oracleLineId) {
    this.oracleLineId = oracleLineId;
  }

  public SSIOEditInsertionOrderRequest salesforceOrderId(@Nullable String salesforceOrderId) {
    this.salesforceOrderId = salesforceOrderId;
    return this;
  }

  /**
   * OrderId in SFDC
   * @return salesforceOrderId
   */
  
  @Schema(name = "salesforce_order_id", description = "OrderId in SFDC", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("salesforce_order_id")
  public @Nullable String getSalesforceOrderId() {
    return salesforceOrderId;
  }

  public void setSalesforceOrderId(@Nullable String salesforceOrderId) {
    this.salesforceOrderId = salesforceOrderId;
  }

  public SSIOEditInsertionOrderRequest salesforceOrderLineId(@Nullable String salesforceOrderLineId) {
    this.salesforceOrderLineId = salesforceOrderLineId;
    return this;
  }

  /**
   * OrderLineId in SFDC
   * @return salesforceOrderLineId
   */
  
  @Schema(name = "salesforce_order_line_id", description = "OrderLineId in SFDC", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("salesforce_order_line_id")
  public @Nullable String getSalesforceOrderLineId() {
    return salesforceOrderLineId;
  }

  public void setSalesforceOrderLineId(@Nullable String salesforceOrderLineId) {
    this.salesforceOrderLineId = salesforceOrderLineId;
  }

  public SSIOEditInsertionOrderRequest adsManagerOrderLineId(@Nullable String adsManagerOrderLineId) {
    this.adsManagerOrderLineId = adsManagerOrderLineId;
    return this;
  }

  /**
   * Ads manager OrderLineId
   * @return adsManagerOrderLineId
   */
  
  @Schema(name = "ads_manager_order_line_id", description = "Ads manager OrderLineId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ads_manager_order_line_id")
  public @Nullable String getAdsManagerOrderLineId() {
    return adsManagerOrderLineId;
  }

  public void setAdsManagerOrderLineId(@Nullable String adsManagerOrderLineId) {
    this.adsManagerOrderLineId = adsManagerOrderLineId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest = (SSIOEditInsertionOrderRequest) o;
    return Objects.equals(this.startDate, ssIOEditInsertionOrderRequest.startDate) &&
        Objects.equals(this.endDate, ssIOEditInsertionOrderRequest.endDate) &&
        Objects.equals(this.poNumber, ssIOEditInsertionOrderRequest.poNumber) &&
        Objects.equals(this.budgetAmount, ssIOEditInsertionOrderRequest.budgetAmount) &&
        Objects.equals(this.billingContactFirstname, ssIOEditInsertionOrderRequest.billingContactFirstname) &&
        Objects.equals(this.billingContactLastname, ssIOEditInsertionOrderRequest.billingContactLastname) &&
        Objects.equals(this.billingContactEmail, ssIOEditInsertionOrderRequest.billingContactEmail) &&
        Objects.equals(this.mediaContactFirstname, ssIOEditInsertionOrderRequest.mediaContactFirstname) &&
        Objects.equals(this.mediaContactLastname, ssIOEditInsertionOrderRequest.mediaContactLastname) &&
        Objects.equals(this.mediaContactEmail, ssIOEditInsertionOrderRequest.mediaContactEmail) &&
        Objects.equals(this.agencyLink, ssIOEditInsertionOrderRequest.agencyLink) &&
        Objects.equals(this.userEmail, ssIOEditInsertionOrderRequest.userEmail) &&
        Objects.equals(this.oracleLineId, ssIOEditInsertionOrderRequest.oracleLineId) &&
        Objects.equals(this.salesforceOrderId, ssIOEditInsertionOrderRequest.salesforceOrderId) &&
        Objects.equals(this.salesforceOrderLineId, ssIOEditInsertionOrderRequest.salesforceOrderLineId) &&
        Objects.equals(this.adsManagerOrderLineId, ssIOEditInsertionOrderRequest.adsManagerOrderLineId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, poNumber, budgetAmount, billingContactFirstname, billingContactLastname, billingContactEmail, mediaContactFirstname, mediaContactLastname, mediaContactEmail, agencyLink, userEmail, oracleLineId, salesforceOrderId, salesforceOrderLineId, adsManagerOrderLineId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSIOEditInsertionOrderRequest {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    poNumber: ").append(toIndentedString(poNumber)).append("\n");
    sb.append("    budgetAmount: ").append(toIndentedString(budgetAmount)).append("\n");
    sb.append("    billingContactFirstname: ").append(toIndentedString(billingContactFirstname)).append("\n");
    sb.append("    billingContactLastname: ").append(toIndentedString(billingContactLastname)).append("\n");
    sb.append("    billingContactEmail: ").append(toIndentedString(billingContactEmail)).append("\n");
    sb.append("    mediaContactFirstname: ").append(toIndentedString(mediaContactFirstname)).append("\n");
    sb.append("    mediaContactLastname: ").append(toIndentedString(mediaContactLastname)).append("\n");
    sb.append("    mediaContactEmail: ").append(toIndentedString(mediaContactEmail)).append("\n");
    sb.append("    agencyLink: ").append(toIndentedString(agencyLink)).append("\n");
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
    sb.append("    oracleLineId: ").append(toIndentedString(oracleLineId)).append("\n");
    sb.append("    salesforceOrderId: ").append(toIndentedString(salesforceOrderId)).append("\n");
    sb.append("    salesforceOrderLineId: ").append(toIndentedString(salesforceOrderLineId)).append("\n");
    sb.append("    adsManagerOrderLineId: ").append(toIndentedString(adsManagerOrderLineId)).append("\n");
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

