package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("SSIOInsertionOrderCommon")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class SSIOInsertionOrderCommon   {
  private String startDate;
  private String endDate;
  private String poNumber;
  private BigDecimal budgetAmount;
  private String billingContactFirstname;
  private String billingContactLastname;
  private String billingContactEmail;
  private String mediaContactFirstname;
  private String mediaContactLastname;
  private String mediaContactEmail;
  private String agencyLink;
  private String userEmail;

  /**
   * Starting date of time period. Format: YYYY-MM-DD
   **/
  public SSIOInsertionOrderCommon startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  
  @ApiModelProperty(example = "2020-12-20", value = "Starting date of time period. Format: YYYY-MM-DD")
  @JsonProperty("start_date")
   @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")public String getStartDate() {
    return startDate;
  }

  @JsonProperty("start_date")
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * End date of time period. Format: YYYY-MM-DD
   **/
  public SSIOInsertionOrderCommon endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  
  @ApiModelProperty(example = "2020-12-20", value = "End date of time period. Format: YYYY-MM-DD")
  @JsonProperty("end_date")
   @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")public String getEndDate() {
    return endDate;
  }

  @JsonProperty("end_date")
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   * The po number
   **/
  public SSIOInsertionOrderCommon poNumber(String poNumber) {
    this.poNumber = poNumber;
    return this;
  }

  
  @ApiModelProperty(value = "The po number")
  @JsonProperty("po_number")
  public String getPoNumber() {
    return poNumber;
  }

  @JsonProperty("po_number")
  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }

  /**
   * If Budget order line, the budget amount.
   **/
  public SSIOInsertionOrderCommon budgetAmount(BigDecimal budgetAmount) {
    this.budgetAmount = budgetAmount;
    return this;
  }

  
  @ApiModelProperty(example = "5000000", value = "If Budget order line, the budget amount.")
  @JsonProperty("budget_amount")
  @Valid public BigDecimal getBudgetAmount() {
    return budgetAmount;
  }

  @JsonProperty("budget_amount")
  public void setBudgetAmount(BigDecimal budgetAmount) {
    this.budgetAmount = budgetAmount;
  }

  /**
   * The billing contact first name
   **/
  public SSIOInsertionOrderCommon billingContactFirstname(String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
    return this;
  }

  
  @ApiModelProperty(value = "The billing contact first name")
  @JsonProperty("billing_contact_firstname")
  public String getBillingContactFirstname() {
    return billingContactFirstname;
  }

  @JsonProperty("billing_contact_firstname")
  public void setBillingContactFirstname(String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
  }

  /**
   * The billing contact last name
   **/
  public SSIOInsertionOrderCommon billingContactLastname(String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
    return this;
  }

  
  @ApiModelProperty(value = "The billing contact last name")
  @JsonProperty("billing_contact_lastname")
  public String getBillingContactLastname() {
    return billingContactLastname;
  }

  @JsonProperty("billing_contact_lastname")
  public void setBillingContactLastname(String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
  }

  /**
   * The billing contact email
   **/
  public SSIOInsertionOrderCommon billingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
    return this;
  }

  
  @ApiModelProperty(example = "test@example", value = "The billing contact email")
  @JsonProperty("billing_contact_email")
  public String getBillingContactEmail() {
    return billingContactEmail;
  }

  @JsonProperty("billing_contact_email")
  public void setBillingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
  }

  /**
   * The media contact first name
   **/
  public SSIOInsertionOrderCommon mediaContactFirstname(String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
    return this;
  }

  
  @ApiModelProperty(value = "The media contact first name")
  @JsonProperty("media_contact_firstname")
  public String getMediaContactFirstname() {
    return mediaContactFirstname;
  }

  @JsonProperty("media_contact_firstname")
  public void setMediaContactFirstname(String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
  }

  /**
   * The media contact last name
   **/
  public SSIOInsertionOrderCommon mediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
    return this;
  }

  
  @ApiModelProperty(value = "The media contact last name")
  @JsonProperty("media_contact_lastname")
  public String getMediaContactLastname() {
    return mediaContactLastname;
  }

  @JsonProperty("media_contact_lastname")
  public void setMediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
  }

  /**
   * The media contact email
   **/
  public SSIOInsertionOrderCommon mediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
    return this;
  }

  
  @ApiModelProperty(example = "test@example", value = "The media contact email")
  @JsonProperty("media_contact_email")
  public String getMediaContactEmail() {
    return mediaContactEmail;
  }

  @JsonProperty("media_contact_email")
  public void setMediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
  }

  /**
   * URL link for agency
   **/
  public SSIOInsertionOrderCommon agencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
    return this;
  }

  
  @ApiModelProperty(value = "URL link for agency")
  @JsonProperty("agency_link")
  public String getAgencyLink() {
    return agencyLink;
  }

  @JsonProperty("agency_link")
  public void setAgencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
  }

  /**
   * The email of user submitting the insertion order
   **/
  public SSIOInsertionOrderCommon userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  
  @ApiModelProperty(example = "test@example", value = "The email of user submitting the insertion order")
  @JsonProperty("user_email")
  public String getUserEmail() {
    return userEmail;
  }

  @JsonProperty("user_email")
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

