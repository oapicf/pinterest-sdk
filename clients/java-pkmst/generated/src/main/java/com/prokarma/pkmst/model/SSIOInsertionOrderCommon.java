package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * SSIOInsertionOrderCommon
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class SSIOInsertionOrderCommon   {
  @JsonProperty("start_date")
  private String startDate;

  @JsonProperty("end_date")
  private String endDate;

  @JsonProperty("po_number")
  private String poNumber;

  @JsonProperty("budget_amount")
  private BigDecimal budgetAmount;

  @JsonProperty("billing_contact_firstname")
  private String billingContactFirstname;

  @JsonProperty("billing_contact_lastname")
  private String billingContactLastname;

  @JsonProperty("billing_contact_email")
  private String billingContactEmail;

  @JsonProperty("media_contact_firstname")
  private String mediaContactFirstname;

  @JsonProperty("media_contact_lastname")
  private String mediaContactLastname;

  @JsonProperty("media_contact_email")
  private String mediaContactEmail;

  @JsonProperty("agency_link")
  private String agencyLink;

  @JsonProperty("user_email")
  private String userEmail;

  public SSIOInsertionOrderCommon startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Starting date of time period. Format: YYYY-MM-DD
   * @return startDate
  **/
  @ApiModelProperty(example = "2020-12-20", value = "Starting date of time period. Format: YYYY-MM-DD")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public SSIOInsertionOrderCommon endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * End date of time period. Format: YYYY-MM-DD
   * @return endDate
  **/
  @ApiModelProperty(example = "2020-12-20", value = "End date of time period. Format: YYYY-MM-DD")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public SSIOInsertionOrderCommon poNumber(String poNumber) {
    this.poNumber = poNumber;
    return this;
  }

   /**
   * The po number
   * @return poNumber
  **/
  @ApiModelProperty(value = "The po number")
  public String getPoNumber() {
    return poNumber;
  }

  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }

  public SSIOInsertionOrderCommon budgetAmount(BigDecimal budgetAmount) {
    this.budgetAmount = budgetAmount;
    return this;
  }

   /**
   * If Budget order line, the budget amount.
   * @return budgetAmount
  **/
  @ApiModelProperty(example = "5000000", value = "If Budget order line, the budget amount.")
  public BigDecimal getBudgetAmount() {
    return budgetAmount;
  }

  public void setBudgetAmount(BigDecimal budgetAmount) {
    this.budgetAmount = budgetAmount;
  }

  public SSIOInsertionOrderCommon billingContactFirstname(String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
    return this;
  }

   /**
   * The billing contact first name
   * @return billingContactFirstname
  **/
  @ApiModelProperty(value = "The billing contact first name")
  public String getBillingContactFirstname() {
    return billingContactFirstname;
  }

  public void setBillingContactFirstname(String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
  }

  public SSIOInsertionOrderCommon billingContactLastname(String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
    return this;
  }

   /**
   * The billing contact last name
   * @return billingContactLastname
  **/
  @ApiModelProperty(value = "The billing contact last name")
  public String getBillingContactLastname() {
    return billingContactLastname;
  }

  public void setBillingContactLastname(String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
  }

  public SSIOInsertionOrderCommon billingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
    return this;
  }

   /**
   * The billing contact email
   * @return billingContactEmail
  **/
  @ApiModelProperty(example = "test@example", value = "The billing contact email")
  public String getBillingContactEmail() {
    return billingContactEmail;
  }

  public void setBillingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
  }

  public SSIOInsertionOrderCommon mediaContactFirstname(String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
    return this;
  }

   /**
   * The media contact first name
   * @return mediaContactFirstname
  **/
  @ApiModelProperty(value = "The media contact first name")
  public String getMediaContactFirstname() {
    return mediaContactFirstname;
  }

  public void setMediaContactFirstname(String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
  }

  public SSIOInsertionOrderCommon mediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
    return this;
  }

   /**
   * The media contact last name
   * @return mediaContactLastname
  **/
  @ApiModelProperty(value = "The media contact last name")
  public String getMediaContactLastname() {
    return mediaContactLastname;
  }

  public void setMediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
  }

  public SSIOInsertionOrderCommon mediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
    return this;
  }

   /**
   * The media contact email
   * @return mediaContactEmail
  **/
  @ApiModelProperty(example = "test@example", value = "The media contact email")
  public String getMediaContactEmail() {
    return mediaContactEmail;
  }

  public void setMediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
  }

  public SSIOInsertionOrderCommon agencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
    return this;
  }

   /**
   * URL link for agency
   * @return agencyLink
  **/
  @ApiModelProperty(value = "URL link for agency")
  public String getAgencyLink() {
    return agencyLink;
  }

  public void setAgencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
  }

  public SSIOInsertionOrderCommon userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

   /**
   * The email of user submitting the insertion order
   * @return userEmail
  **/
  @ApiModelProperty(example = "test@example", value = "The email of user submitting the insertion order")
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

