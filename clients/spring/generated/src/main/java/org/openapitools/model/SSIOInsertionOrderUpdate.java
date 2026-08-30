package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Resource create or update operation model.
 */

@Schema(name = "SSIOInsertionOrderUpdate", description = "Resource create or update operation model.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SSIOInsertionOrderUpdate {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String adsManagerOrderLineId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String agencyLink;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String billingContactEmail;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String billingContactFirstname;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String billingContactLastname;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Double budgetAmount;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String endDate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String mediaContactEmail;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String mediaContactFirstname;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String mediaContactLastname;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String oracleLineId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String poNumber;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String salesforceOrderId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String salesforceOrderLineId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String startDate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String userEmail;

  public SSIOInsertionOrderUpdate adsManagerOrderLineId(@Nullable String adsManagerOrderLineId) {
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

  @JsonProperty("ads_manager_order_line_id")
  public void setAdsManagerOrderLineId(@Nullable String adsManagerOrderLineId) {
    this.adsManagerOrderLineId = adsManagerOrderLineId;
  }

  public SSIOInsertionOrderUpdate agencyLink(@Nullable String agencyLink) {
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

  @JsonProperty("agency_link")
  public void setAgencyLink(@Nullable String agencyLink) {
    this.agencyLink = agencyLink;
  }

  public SSIOInsertionOrderUpdate billingContactEmail(@Nullable String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
    return this;
  }

  /**
   * The billing contact email
   * @return billingContactEmail
   */
  
  @Schema(name = "billing_contact_email", description = "The billing contact email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billing_contact_email")
  public @Nullable String getBillingContactEmail() {
    return billingContactEmail;
  }

  @JsonProperty("billing_contact_email")
  public void setBillingContactEmail(@Nullable String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
  }

  public SSIOInsertionOrderUpdate billingContactFirstname(@Nullable String billingContactFirstname) {
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

  @JsonProperty("billing_contact_firstname")
  public void setBillingContactFirstname(@Nullable String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
  }

  public SSIOInsertionOrderUpdate billingContactLastname(@Nullable String billingContactLastname) {
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

  @JsonProperty("billing_contact_lastname")
  public void setBillingContactLastname(@Nullable String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
  }

  public SSIOInsertionOrderUpdate budgetAmount(@Nullable Double budgetAmount) {
    this.budgetAmount = budgetAmount;
    return this;
  }

  /**
   * If Budget order line, the budget amount.
   * @return budgetAmount
   */
  
  @Schema(name = "budget_amount", description = "If Budget order line, the budget amount.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("budget_amount")
  public @Nullable Double getBudgetAmount() {
    return budgetAmount;
  }

  @JsonProperty("budget_amount")
  public void setBudgetAmount(@Nullable Double budgetAmount) {
    this.budgetAmount = budgetAmount;
  }

  public SSIOInsertionOrderUpdate endDate(@Nullable String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * End date of time period. Format: YYYY-MM-DD
   * @return endDate
   */
  @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$") 
  @Schema(name = "end_date", description = "End date of time period. Format: YYYY-MM-DD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_date")
  public @Nullable String getEndDate() {
    return endDate;
  }

  @JsonProperty("end_date")
  public void setEndDate(@Nullable String endDate) {
    this.endDate = endDate;
  }

  public SSIOInsertionOrderUpdate mediaContactEmail(@Nullable String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
    return this;
  }

  /**
   * The media contact email
   * @return mediaContactEmail
   */
  
  @Schema(name = "media_contact_email", description = "The media contact email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("media_contact_email")
  public @Nullable String getMediaContactEmail() {
    return mediaContactEmail;
  }

  @JsonProperty("media_contact_email")
  public void setMediaContactEmail(@Nullable String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
  }

  public SSIOInsertionOrderUpdate mediaContactFirstname(@Nullable String mediaContactFirstname) {
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

  @JsonProperty("media_contact_firstname")
  public void setMediaContactFirstname(@Nullable String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
  }

  public SSIOInsertionOrderUpdate mediaContactLastname(@Nullable String mediaContactLastname) {
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

  @JsonProperty("media_contact_lastname")
  public void setMediaContactLastname(@Nullable String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
  }

  public SSIOInsertionOrderUpdate oracleLineId(@Nullable String oracleLineId) {
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

  @JsonProperty("oracle_line_id")
  public void setOracleLineId(@Nullable String oracleLineId) {
    this.oracleLineId = oracleLineId;
  }

  public SSIOInsertionOrderUpdate poNumber(@Nullable String poNumber) {
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

  @JsonProperty("po_number")
  public void setPoNumber(@Nullable String poNumber) {
    this.poNumber = poNumber;
  }

  public SSIOInsertionOrderUpdate salesforceOrderId(@Nullable String salesforceOrderId) {
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

  @JsonProperty("salesforce_order_id")
  public void setSalesforceOrderId(@Nullable String salesforceOrderId) {
    this.salesforceOrderId = salesforceOrderId;
  }

  public SSIOInsertionOrderUpdate salesforceOrderLineId(@Nullable String salesforceOrderLineId) {
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

  @JsonProperty("salesforce_order_line_id")
  public void setSalesforceOrderLineId(@Nullable String salesforceOrderLineId) {
    this.salesforceOrderLineId = salesforceOrderLineId;
  }

  public SSIOInsertionOrderUpdate startDate(@Nullable String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Starting date of time period. Format: YYYY-MM-DD
   * @return startDate
   */
  @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$") 
  @Schema(name = "start_date", description = "Starting date of time period. Format: YYYY-MM-DD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_date")
  public @Nullable String getStartDate() {
    return startDate;
  }

  @JsonProperty("start_date")
  public void setStartDate(@Nullable String startDate) {
    this.startDate = startDate;
  }

  public SSIOInsertionOrderUpdate userEmail(@Nullable String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  /**
   * The email of user submitting the insertion order
   * @return userEmail
   */
  
  @Schema(name = "user_email", description = "The email of user submitting the insertion order", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_email")
  public @Nullable String getUserEmail() {
    return userEmail;
  }

  @JsonProperty("user_email")
  public void setUserEmail(@Nullable String userEmail) {
    this.userEmail = userEmail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSIOInsertionOrderUpdate ssIOInsertionOrderUpdate = (SSIOInsertionOrderUpdate) o;
    return Objects.equals(this.adsManagerOrderLineId, ssIOInsertionOrderUpdate.adsManagerOrderLineId) &&
        Objects.equals(this.agencyLink, ssIOInsertionOrderUpdate.agencyLink) &&
        Objects.equals(this.billingContactEmail, ssIOInsertionOrderUpdate.billingContactEmail) &&
        Objects.equals(this.billingContactFirstname, ssIOInsertionOrderUpdate.billingContactFirstname) &&
        Objects.equals(this.billingContactLastname, ssIOInsertionOrderUpdate.billingContactLastname) &&
        Objects.equals(this.budgetAmount, ssIOInsertionOrderUpdate.budgetAmount) &&
        Objects.equals(this.endDate, ssIOInsertionOrderUpdate.endDate) &&
        Objects.equals(this.mediaContactEmail, ssIOInsertionOrderUpdate.mediaContactEmail) &&
        Objects.equals(this.mediaContactFirstname, ssIOInsertionOrderUpdate.mediaContactFirstname) &&
        Objects.equals(this.mediaContactLastname, ssIOInsertionOrderUpdate.mediaContactLastname) &&
        Objects.equals(this.oracleLineId, ssIOInsertionOrderUpdate.oracleLineId) &&
        Objects.equals(this.poNumber, ssIOInsertionOrderUpdate.poNumber) &&
        Objects.equals(this.salesforceOrderId, ssIOInsertionOrderUpdate.salesforceOrderId) &&
        Objects.equals(this.salesforceOrderLineId, ssIOInsertionOrderUpdate.salesforceOrderLineId) &&
        Objects.equals(this.startDate, ssIOInsertionOrderUpdate.startDate) &&
        Objects.equals(this.userEmail, ssIOInsertionOrderUpdate.userEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adsManagerOrderLineId, agencyLink, billingContactEmail, billingContactFirstname, billingContactLastname, budgetAmount, endDate, mediaContactEmail, mediaContactFirstname, mediaContactLastname, oracleLineId, poNumber, salesforceOrderId, salesforceOrderLineId, startDate, userEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSIOInsertionOrderUpdate {\n");
    sb.append("    adsManagerOrderLineId: ").append(toIndentedString(adsManagerOrderLineId)).append("\n");
    sb.append("    agencyLink: ").append(toIndentedString(agencyLink)).append("\n");
    sb.append("    billingContactEmail: ").append(toIndentedString(billingContactEmail)).append("\n");
    sb.append("    billingContactFirstname: ").append(toIndentedString(billingContactFirstname)).append("\n");
    sb.append("    billingContactLastname: ").append(toIndentedString(billingContactLastname)).append("\n");
    sb.append("    budgetAmount: ").append(toIndentedString(budgetAmount)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    mediaContactEmail: ").append(toIndentedString(mediaContactEmail)).append("\n");
    sb.append("    mediaContactFirstname: ").append(toIndentedString(mediaContactFirstname)).append("\n");
    sb.append("    mediaContactLastname: ").append(toIndentedString(mediaContactLastname)).append("\n");
    sb.append("    oracleLineId: ").append(toIndentedString(oracleLineId)).append("\n");
    sb.append("    poNumber: ").append(toIndentedString(poNumber)).append("\n");
    sb.append("    salesforceOrderId: ").append(toIndentedString(salesforceOrderId)).append("\n");
    sb.append("    salesforceOrderLineId: ").append(toIndentedString(salesforceOrderLineId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

