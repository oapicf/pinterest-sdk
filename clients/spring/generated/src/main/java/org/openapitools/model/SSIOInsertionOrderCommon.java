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
 * SSIOInsertionOrderCommon
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-26T05:48:22.520185154Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class SSIOInsertionOrderCommon {

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

  public SSIOInsertionOrderCommon startDate(@Nullable String startDate) {
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

  public SSIOInsertionOrderCommon endDate(@Nullable String endDate) {
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

  public SSIOInsertionOrderCommon poNumber(@Nullable String poNumber) {
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

  public SSIOInsertionOrderCommon budgetAmount(@Nullable BigDecimal budgetAmount) {
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

  public SSIOInsertionOrderCommon billingContactFirstname(@Nullable String billingContactFirstname) {
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

  public SSIOInsertionOrderCommon billingContactLastname(@Nullable String billingContactLastname) {
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

  public SSIOInsertionOrderCommon billingContactEmail(@Nullable String billingContactEmail) {
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

  public SSIOInsertionOrderCommon mediaContactFirstname(@Nullable String mediaContactFirstname) {
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

  public SSIOInsertionOrderCommon mediaContactLastname(@Nullable String mediaContactLastname) {
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

  public SSIOInsertionOrderCommon mediaContactEmail(@Nullable String mediaContactEmail) {
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

  public SSIOInsertionOrderCommon agencyLink(@Nullable String agencyLink) {
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

  public SSIOInsertionOrderCommon userEmail(@Nullable String userEmail) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSIOInsertionOrderCommon ssIOInsertionOrderCommon = (SSIOInsertionOrderCommon) o;
    return Objects.equals(this.startDate, ssIOInsertionOrderCommon.startDate) &&
        Objects.equals(this.endDate, ssIOInsertionOrderCommon.endDate) &&
        Objects.equals(this.poNumber, ssIOInsertionOrderCommon.poNumber) &&
        Objects.equals(this.budgetAmount, ssIOInsertionOrderCommon.budgetAmount) &&
        Objects.equals(this.billingContactFirstname, ssIOInsertionOrderCommon.billingContactFirstname) &&
        Objects.equals(this.billingContactLastname, ssIOInsertionOrderCommon.billingContactLastname) &&
        Objects.equals(this.billingContactEmail, ssIOInsertionOrderCommon.billingContactEmail) &&
        Objects.equals(this.mediaContactFirstname, ssIOInsertionOrderCommon.mediaContactFirstname) &&
        Objects.equals(this.mediaContactLastname, ssIOInsertionOrderCommon.mediaContactLastname) &&
        Objects.equals(this.mediaContactEmail, ssIOInsertionOrderCommon.mediaContactEmail) &&
        Objects.equals(this.agencyLink, ssIOInsertionOrderCommon.agencyLink) &&
        Objects.equals(this.userEmail, ssIOInsertionOrderCommon.userEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, poNumber, budgetAmount, billingContactFirstname, billingContactLastname, billingContactEmail, mediaContactFirstname, mediaContactLastname, mediaContactEmail, agencyLink, userEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSIOInsertionOrderCommon {\n");
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

