/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class SSIOInsertionOrderCommon {
  
  @SerializedName("start_date")
  private String startDate = null;
  @SerializedName("end_date")
  private String endDate = null;
  @SerializedName("po_number")
  private String poNumber = null;
  @SerializedName("budget_amount")
  private BigDecimal budgetAmount = null;
  @SerializedName("billing_contact_firstname")
  private String billingContactFirstname = null;
  @SerializedName("billing_contact_lastname")
  private String billingContactLastname = null;
  @SerializedName("billing_contact_email")
  private String billingContactEmail = null;
  @SerializedName("media_contact_firstname")
  private String mediaContactFirstname = null;
  @SerializedName("media_contact_lastname")
  private String mediaContactLastname = null;
  @SerializedName("media_contact_email")
  private String mediaContactEmail = null;
  @SerializedName("agency_link")
  private String agencyLink = null;
  @SerializedName("user_email")
  private String userEmail = null;

  /**
   * Starting date of time period. Format: YYYY-MM-DD
   **/
  @ApiModelProperty(value = "Starting date of time period. Format: YYYY-MM-DD")
  public String getStartDate() {
    return startDate;
  }
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * End date of time period. Format: YYYY-MM-DD
   **/
  @ApiModelProperty(value = "End date of time period. Format: YYYY-MM-DD")
  public String getEndDate() {
    return endDate;
  }
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   * The po number
   **/
  @ApiModelProperty(value = "The po number")
  public String getPoNumber() {
    return poNumber;
  }
  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }

  /**
   * If Budget order line, the budget amount.
   **/
  @ApiModelProperty(value = "If Budget order line, the budget amount.")
  public BigDecimal getBudgetAmount() {
    return budgetAmount;
  }
  public void setBudgetAmount(BigDecimal budgetAmount) {
    this.budgetAmount = budgetAmount;
  }

  /**
   * The billing contact first name
   **/
  @ApiModelProperty(value = "The billing contact first name")
  public String getBillingContactFirstname() {
    return billingContactFirstname;
  }
  public void setBillingContactFirstname(String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
  }

  /**
   * The billing contact last name
   **/
  @ApiModelProperty(value = "The billing contact last name")
  public String getBillingContactLastname() {
    return billingContactLastname;
  }
  public void setBillingContactLastname(String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
  }

  /**
   * The billing contact email
   **/
  @ApiModelProperty(value = "The billing contact email")
  public String getBillingContactEmail() {
    return billingContactEmail;
  }
  public void setBillingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
  }

  /**
   * The media contact first name
   **/
  @ApiModelProperty(value = "The media contact first name")
  public String getMediaContactFirstname() {
    return mediaContactFirstname;
  }
  public void setMediaContactFirstname(String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
  }

  /**
   * The media contact last name
   **/
  @ApiModelProperty(value = "The media contact last name")
  public String getMediaContactLastname() {
    return mediaContactLastname;
  }
  public void setMediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
  }

  /**
   * The media contact email
   **/
  @ApiModelProperty(value = "The media contact email")
  public String getMediaContactEmail() {
    return mediaContactEmail;
  }
  public void setMediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
  }

  /**
   * URL link for agency
   **/
  @ApiModelProperty(value = "URL link for agency")
  public String getAgencyLink() {
    return agencyLink;
  }
  public void setAgencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
  }

  /**
   * The email of user submitting the insertion order
   **/
  @ApiModelProperty(value = "The email of user submitting the insertion order")
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
    SSIOInsertionOrderCommon sSIOInsertionOrderCommon = (SSIOInsertionOrderCommon) o;
    return (this.startDate == null ? sSIOInsertionOrderCommon.startDate == null : this.startDate.equals(sSIOInsertionOrderCommon.startDate)) &&
        (this.endDate == null ? sSIOInsertionOrderCommon.endDate == null : this.endDate.equals(sSIOInsertionOrderCommon.endDate)) &&
        (this.poNumber == null ? sSIOInsertionOrderCommon.poNumber == null : this.poNumber.equals(sSIOInsertionOrderCommon.poNumber)) &&
        (this.budgetAmount == null ? sSIOInsertionOrderCommon.budgetAmount == null : this.budgetAmount.equals(sSIOInsertionOrderCommon.budgetAmount)) &&
        (this.billingContactFirstname == null ? sSIOInsertionOrderCommon.billingContactFirstname == null : this.billingContactFirstname.equals(sSIOInsertionOrderCommon.billingContactFirstname)) &&
        (this.billingContactLastname == null ? sSIOInsertionOrderCommon.billingContactLastname == null : this.billingContactLastname.equals(sSIOInsertionOrderCommon.billingContactLastname)) &&
        (this.billingContactEmail == null ? sSIOInsertionOrderCommon.billingContactEmail == null : this.billingContactEmail.equals(sSIOInsertionOrderCommon.billingContactEmail)) &&
        (this.mediaContactFirstname == null ? sSIOInsertionOrderCommon.mediaContactFirstname == null : this.mediaContactFirstname.equals(sSIOInsertionOrderCommon.mediaContactFirstname)) &&
        (this.mediaContactLastname == null ? sSIOInsertionOrderCommon.mediaContactLastname == null : this.mediaContactLastname.equals(sSIOInsertionOrderCommon.mediaContactLastname)) &&
        (this.mediaContactEmail == null ? sSIOInsertionOrderCommon.mediaContactEmail == null : this.mediaContactEmail.equals(sSIOInsertionOrderCommon.mediaContactEmail)) &&
        (this.agencyLink == null ? sSIOInsertionOrderCommon.agencyLink == null : this.agencyLink.equals(sSIOInsertionOrderCommon.agencyLink)) &&
        (this.userEmail == null ? sSIOInsertionOrderCommon.userEmail == null : this.userEmail.equals(sSIOInsertionOrderCommon.userEmail));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.startDate == null ? 0: this.startDate.hashCode());
    result = 31 * result + (this.endDate == null ? 0: this.endDate.hashCode());
    result = 31 * result + (this.poNumber == null ? 0: this.poNumber.hashCode());
    result = 31 * result + (this.budgetAmount == null ? 0: this.budgetAmount.hashCode());
    result = 31 * result + (this.billingContactFirstname == null ? 0: this.billingContactFirstname.hashCode());
    result = 31 * result + (this.billingContactLastname == null ? 0: this.billingContactLastname.hashCode());
    result = 31 * result + (this.billingContactEmail == null ? 0: this.billingContactEmail.hashCode());
    result = 31 * result + (this.mediaContactFirstname == null ? 0: this.mediaContactFirstname.hashCode());
    result = 31 * result + (this.mediaContactLastname == null ? 0: this.mediaContactLastname.hashCode());
    result = 31 * result + (this.mediaContactEmail == null ? 0: this.mediaContactEmail.hashCode());
    result = 31 * result + (this.agencyLink == null ? 0: this.agencyLink.hashCode());
    result = 31 * result + (this.userEmail == null ? 0: this.userEmail.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSIOInsertionOrderCommon {\n");
    
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("  poNumber: ").append(poNumber).append("\n");
    sb.append("  budgetAmount: ").append(budgetAmount).append("\n");
    sb.append("  billingContactFirstname: ").append(billingContactFirstname).append("\n");
    sb.append("  billingContactLastname: ").append(billingContactLastname).append("\n");
    sb.append("  billingContactEmail: ").append(billingContactEmail).append("\n");
    sb.append("  mediaContactFirstname: ").append(mediaContactFirstname).append("\n");
    sb.append("  mediaContactLastname: ").append(mediaContactLastname).append("\n");
    sb.append("  mediaContactEmail: ").append(mediaContactEmail).append("\n");
    sb.append("  agencyLink: ").append(agencyLink).append("\n");
    sb.append("  userEmail: ").append(userEmail).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
