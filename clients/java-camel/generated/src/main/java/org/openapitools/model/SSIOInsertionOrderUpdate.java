package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SSIOInsertionOrderUpdate {

  private String adsManagerOrderLineId;

  private String agencyLink;

  private String billingContactEmail;

  private String billingContactFirstname;

  private String billingContactLastname;

  private Double budgetAmount;

  private String endDate;

  private String mediaContactEmail;

  private String mediaContactFirstname;

  private String mediaContactLastname;

  private String oracleLineId;

  private String poNumber;

  private String salesforceOrderId;

  private String salesforceOrderLineId;

  private String startDate;

  private String userEmail;

  public SSIOInsertionOrderUpdate adsManagerOrderLineId(String adsManagerOrderLineId) {
    this.adsManagerOrderLineId = adsManagerOrderLineId;
    return this;
  }

  /**
   * Ads manager OrderLineId
   * @return adsManagerOrderLineId
   */
  
  @Schema(name = "ads_manager_order_line_id", description = "Ads manager OrderLineId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ads_manager_order_line_id")
  public String getAdsManagerOrderLineId() {
    return adsManagerOrderLineId;
  }

  public void setAdsManagerOrderLineId(String adsManagerOrderLineId) {
    this.adsManagerOrderLineId = adsManagerOrderLineId;
  }

  public SSIOInsertionOrderUpdate agencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
    return this;
  }

  /**
   * URL link for agency
   * @return agencyLink
   */
  
  @Schema(name = "agency_link", description = "URL link for agency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("agency_link")
  public String getAgencyLink() {
    return agencyLink;
  }

  public void setAgencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
  }

  public SSIOInsertionOrderUpdate billingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
    return this;
  }

  /**
   * The billing contact email
   * @return billingContactEmail
   */
  
  @Schema(name = "billing_contact_email", description = "The billing contact email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billing_contact_email")
  public String getBillingContactEmail() {
    return billingContactEmail;
  }

  public void setBillingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
  }

  public SSIOInsertionOrderUpdate billingContactFirstname(String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
    return this;
  }

  /**
   * The billing contact first name
   * @return billingContactFirstname
   */
  
  @Schema(name = "billing_contact_firstname", description = "The billing contact first name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billing_contact_firstname")
  public String getBillingContactFirstname() {
    return billingContactFirstname;
  }

  public void setBillingContactFirstname(String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
  }

  public SSIOInsertionOrderUpdate billingContactLastname(String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
    return this;
  }

  /**
   * The billing contact last name
   * @return billingContactLastname
   */
  
  @Schema(name = "billing_contact_lastname", description = "The billing contact last name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billing_contact_lastname")
  public String getBillingContactLastname() {
    return billingContactLastname;
  }

  public void setBillingContactLastname(String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
  }

  public SSIOInsertionOrderUpdate budgetAmount(Double budgetAmount) {
    this.budgetAmount = budgetAmount;
    return this;
  }

  /**
   * If Budget order line, the budget amount.
   * @return budgetAmount
   */
  
  @Schema(name = "budget_amount", description = "If Budget order line, the budget amount.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("budget_amount")
  public Double getBudgetAmount() {
    return budgetAmount;
  }

  public void setBudgetAmount(Double budgetAmount) {
    this.budgetAmount = budgetAmount;
  }

  public SSIOInsertionOrderUpdate endDate(String endDate) {
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
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public SSIOInsertionOrderUpdate mediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
    return this;
  }

  /**
   * The media contact email
   * @return mediaContactEmail
   */
  
  @Schema(name = "media_contact_email", description = "The media contact email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("media_contact_email")
  public String getMediaContactEmail() {
    return mediaContactEmail;
  }

  public void setMediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
  }

  public SSIOInsertionOrderUpdate mediaContactFirstname(String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
    return this;
  }

  /**
   * The media contact first name
   * @return mediaContactFirstname
   */
  
  @Schema(name = "media_contact_firstname", description = "The media contact first name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("media_contact_firstname")
  public String getMediaContactFirstname() {
    return mediaContactFirstname;
  }

  public void setMediaContactFirstname(String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
  }

  public SSIOInsertionOrderUpdate mediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
    return this;
  }

  /**
   * The media contact last name
   * @return mediaContactLastname
   */
  
  @Schema(name = "media_contact_lastname", description = "The media contact last name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("media_contact_lastname")
  public String getMediaContactLastname() {
    return mediaContactLastname;
  }

  public void setMediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
  }

  public SSIOInsertionOrderUpdate oracleLineId(String oracleLineId) {
    this.oracleLineId = oracleLineId;
    return this;
  }

  /**
   * LineId in the Oracle DB
   * @return oracleLineId
   */
  
  @Schema(name = "oracle_line_id", description = "LineId in the Oracle DB", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oracle_line_id")
  public String getOracleLineId() {
    return oracleLineId;
  }

  public void setOracleLineId(String oracleLineId) {
    this.oracleLineId = oracleLineId;
  }

  public SSIOInsertionOrderUpdate poNumber(String poNumber) {
    this.poNumber = poNumber;
    return this;
  }

  /**
   * The po number
   * @return poNumber
   */
  
  @Schema(name = "po_number", description = "The po number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("po_number")
  public String getPoNumber() {
    return poNumber;
  }

  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }

  public SSIOInsertionOrderUpdate salesforceOrderId(String salesforceOrderId) {
    this.salesforceOrderId = salesforceOrderId;
    return this;
  }

  /**
   * OrderId in SFDC
   * @return salesforceOrderId
   */
  
  @Schema(name = "salesforce_order_id", description = "OrderId in SFDC", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("salesforce_order_id")
  public String getSalesforceOrderId() {
    return salesforceOrderId;
  }

  public void setSalesforceOrderId(String salesforceOrderId) {
    this.salesforceOrderId = salesforceOrderId;
  }

  public SSIOInsertionOrderUpdate salesforceOrderLineId(String salesforceOrderLineId) {
    this.salesforceOrderLineId = salesforceOrderLineId;
    return this;
  }

  /**
   * OrderLineId in SFDC
   * @return salesforceOrderLineId
   */
  
  @Schema(name = "salesforce_order_line_id", description = "OrderLineId in SFDC", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("salesforce_order_line_id")
  public String getSalesforceOrderLineId() {
    return salesforceOrderLineId;
  }

  public void setSalesforceOrderLineId(String salesforceOrderLineId) {
    this.salesforceOrderLineId = salesforceOrderLineId;
  }

  public SSIOInsertionOrderUpdate startDate(String startDate) {
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
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public SSIOInsertionOrderUpdate userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  /**
   * The email of user submitting the insertion order
   * @return userEmail
   */
  
  @Schema(name = "user_email", description = "The email of user submitting the insertion order", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_email")
  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

