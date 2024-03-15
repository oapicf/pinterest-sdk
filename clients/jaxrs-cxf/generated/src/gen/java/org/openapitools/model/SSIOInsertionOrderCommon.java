package org.openapitools.model;

import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SSIOInsertionOrderCommon  {
  
  @ApiModelProperty(example = "2020-12-20", value = "Starting date of time period. Format: YYYY-MM-DD")
 /**
   * Starting date of time period. Format: YYYY-MM-DD
  **/
  private String startDate;

  @ApiModelProperty(example = "2020-12-20", value = "End date of time period. Format: YYYY-MM-DD")
 /**
   * End date of time period. Format: YYYY-MM-DD
  **/
  private String endDate;

  @ApiModelProperty(value = "The po number")
 /**
   * The po number
  **/
  private String poNumber;

  @ApiModelProperty(example = "5000000", value = "If Budget order line, the budget amount.")
  @Valid
 /**
   * If Budget order line, the budget amount.
  **/
  private BigDecimal budgetAmount;

  @ApiModelProperty(value = "The billing contact first name")
 /**
   * The billing contact first name
  **/
  private String billingContactFirstname;

  @ApiModelProperty(value = "The billing contact last name")
 /**
   * The billing contact last name
  **/
  private String billingContactLastname;

  @ApiModelProperty(example = "test@example", value = "The billing contact email")
 /**
   * The billing contact email
  **/
  private String billingContactEmail;

  @ApiModelProperty(value = "The media contact first name")
 /**
   * The media contact first name
  **/
  private String mediaContactFirstname;

  @ApiModelProperty(value = "The media contact last name")
 /**
   * The media contact last name
  **/
  private String mediaContactLastname;

  @ApiModelProperty(example = "test@example", value = "The media contact email")
 /**
   * The media contact email
  **/
  private String mediaContactEmail;

  @ApiModelProperty(value = "URL link for agency")
 /**
   * URL link for agency
  **/
  private String agencyLink;

  @ApiModelProperty(example = "test@example", value = "The email of user submitting the insertion order")
 /**
   * The email of user submitting the insertion order
  **/
  private String userEmail;
 /**
   * Starting date of time period. Format: YYYY-MM-DD
   * @return startDate
  **/
  @JsonProperty("start_date")
 @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public SSIOInsertionOrderCommon startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

 /**
   * End date of time period. Format: YYYY-MM-DD
   * @return endDate
  **/
  @JsonProperty("end_date")
 @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public SSIOInsertionOrderCommon endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

 /**
   * The po number
   * @return poNumber
  **/
  @JsonProperty("po_number")
  public String getPoNumber() {
    return poNumber;
  }

  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }

  public SSIOInsertionOrderCommon poNumber(String poNumber) {
    this.poNumber = poNumber;
    return this;
  }

 /**
   * If Budget order line, the budget amount.
   * @return budgetAmount
  **/
  @JsonProperty("budget_amount")
  public BigDecimal getBudgetAmount() {
    return budgetAmount;
  }

  public void setBudgetAmount(BigDecimal budgetAmount) {
    this.budgetAmount = budgetAmount;
  }

  public SSIOInsertionOrderCommon budgetAmount(BigDecimal budgetAmount) {
    this.budgetAmount = budgetAmount;
    return this;
  }

 /**
   * The billing contact first name
   * @return billingContactFirstname
  **/
  @JsonProperty("billing_contact_firstname")
  public String getBillingContactFirstname() {
    return billingContactFirstname;
  }

  public void setBillingContactFirstname(String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
  }

  public SSIOInsertionOrderCommon billingContactFirstname(String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
    return this;
  }

 /**
   * The billing contact last name
   * @return billingContactLastname
  **/
  @JsonProperty("billing_contact_lastname")
  public String getBillingContactLastname() {
    return billingContactLastname;
  }

  public void setBillingContactLastname(String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
  }

  public SSIOInsertionOrderCommon billingContactLastname(String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
    return this;
  }

 /**
   * The billing contact email
   * @return billingContactEmail
  **/
  @JsonProperty("billing_contact_email")
  public String getBillingContactEmail() {
    return billingContactEmail;
  }

  public void setBillingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
  }

  public SSIOInsertionOrderCommon billingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
    return this;
  }

 /**
   * The media contact first name
   * @return mediaContactFirstname
  **/
  @JsonProperty("media_contact_firstname")
  public String getMediaContactFirstname() {
    return mediaContactFirstname;
  }

  public void setMediaContactFirstname(String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
  }

  public SSIOInsertionOrderCommon mediaContactFirstname(String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
    return this;
  }

 /**
   * The media contact last name
   * @return mediaContactLastname
  **/
  @JsonProperty("media_contact_lastname")
  public String getMediaContactLastname() {
    return mediaContactLastname;
  }

  public void setMediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
  }

  public SSIOInsertionOrderCommon mediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
    return this;
  }

 /**
   * The media contact email
   * @return mediaContactEmail
  **/
  @JsonProperty("media_contact_email")
  public String getMediaContactEmail() {
    return mediaContactEmail;
  }

  public void setMediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
  }

  public SSIOInsertionOrderCommon mediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
    return this;
  }

 /**
   * URL link for agency
   * @return agencyLink
  **/
  @JsonProperty("agency_link")
  public String getAgencyLink() {
    return agencyLink;
  }

  public void setAgencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
  }

  public SSIOInsertionOrderCommon agencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
    return this;
  }

 /**
   * The email of user submitting the insertion order
   * @return userEmail
  **/
  @JsonProperty("user_email")
  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public SSIOInsertionOrderCommon userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

