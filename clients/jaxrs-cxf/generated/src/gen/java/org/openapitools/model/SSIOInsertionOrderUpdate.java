package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource create or update operation model.
 */
@ApiModel(description="Resource create or update operation model.")

public class SSIOInsertionOrderUpdate  {
  
 /**
  * Ads manager OrderLineId
  */
  @ApiModelProperty(value = "Ads manager OrderLineId")

  private String adsManagerOrderLineId;

 /**
  * URL link for agency
  */
  @ApiModelProperty(value = "URL link for agency")

  private String agencyLink;

 /**
  * The billing contact email
  */
  @ApiModelProperty(value = "The billing contact email")

  private String billingContactEmail;

 /**
  * The billing contact first name
  */
  @ApiModelProperty(value = "The billing contact first name")

  private String billingContactFirstname;

 /**
  * The billing contact last name
  */
  @ApiModelProperty(value = "The billing contact last name")

  private String billingContactLastname;

 /**
  * If Budget order line, the budget amount.
  */
  @ApiModelProperty(value = "If Budget order line, the budget amount.")

  private Double budgetAmount;

 /**
  * End date of time period. Format: YYYY-MM-DD
  */
  @ApiModelProperty(value = "End date of time period. Format: YYYY-MM-DD")

  private String endDate;

 /**
  * The media contact email
  */
  @ApiModelProperty(value = "The media contact email")

  private String mediaContactEmail;

 /**
  * The media contact first name
  */
  @ApiModelProperty(value = "The media contact first name")

  private String mediaContactFirstname;

 /**
  * The media contact last name
  */
  @ApiModelProperty(value = "The media contact last name")

  private String mediaContactLastname;

 /**
  * LineId in the Oracle DB
  */
  @ApiModelProperty(value = "LineId in the Oracle DB")

  private String oracleLineId;

 /**
  * The po number
  */
  @ApiModelProperty(value = "The po number")

  private String poNumber;

 /**
  * OrderId in SFDC
  */
  @ApiModelProperty(value = "OrderId in SFDC")

  private String salesforceOrderId;

 /**
  * OrderLineId in SFDC
  */
  @ApiModelProperty(value = "OrderLineId in SFDC")

  private String salesforceOrderLineId;

 /**
  * Starting date of time period. Format: YYYY-MM-DD
  */
  @ApiModelProperty(value = "Starting date of time period. Format: YYYY-MM-DD")

  private String startDate;

 /**
  * The email of user submitting the insertion order
  */
  @ApiModelProperty(value = "The email of user submitting the insertion order")

  private String userEmail;
 /**
   * Ads manager OrderLineId
   * @return adsManagerOrderLineId
  **/
  @JsonProperty("ads_manager_order_line_id")
  public String getAdsManagerOrderLineId() {
    return adsManagerOrderLineId;
  }

  public void setAdsManagerOrderLineId(String adsManagerOrderLineId) {
    this.adsManagerOrderLineId = adsManagerOrderLineId;
  }

  public SSIOInsertionOrderUpdate adsManagerOrderLineId(String adsManagerOrderLineId) {
    this.adsManagerOrderLineId = adsManagerOrderLineId;
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

  public SSIOInsertionOrderUpdate agencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
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

  public SSIOInsertionOrderUpdate billingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
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

  public SSIOInsertionOrderUpdate billingContactFirstname(String billingContactFirstname) {
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

  public SSIOInsertionOrderUpdate billingContactLastname(String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
    return this;
  }

 /**
   * If Budget order line, the budget amount.
   * @return budgetAmount
  **/
  @JsonProperty("budget_amount")
  public Double getBudgetAmount() {
    return budgetAmount;
  }

  public void setBudgetAmount(Double budgetAmount) {
    this.budgetAmount = budgetAmount;
  }

  public SSIOInsertionOrderUpdate budgetAmount(Double budgetAmount) {
    this.budgetAmount = budgetAmount;
    return this;
  }

 /**
   * End date of time period. Format: YYYY-MM-DD
   * @return endDate
  **/
  @JsonProperty("end_date")
 @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public SSIOInsertionOrderUpdate endDate(String endDate) {
    this.endDate = endDate;
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

  public SSIOInsertionOrderUpdate mediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
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

  public SSIOInsertionOrderUpdate mediaContactFirstname(String mediaContactFirstname) {
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

  public SSIOInsertionOrderUpdate mediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
    return this;
  }

 /**
   * LineId in the Oracle DB
   * @return oracleLineId
  **/
  @JsonProperty("oracle_line_id")
  public String getOracleLineId() {
    return oracleLineId;
  }

  public void setOracleLineId(String oracleLineId) {
    this.oracleLineId = oracleLineId;
  }

  public SSIOInsertionOrderUpdate oracleLineId(String oracleLineId) {
    this.oracleLineId = oracleLineId;
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

  public SSIOInsertionOrderUpdate poNumber(String poNumber) {
    this.poNumber = poNumber;
    return this;
  }

 /**
   * OrderId in SFDC
   * @return salesforceOrderId
  **/
  @JsonProperty("salesforce_order_id")
  public String getSalesforceOrderId() {
    return salesforceOrderId;
  }

  public void setSalesforceOrderId(String salesforceOrderId) {
    this.salesforceOrderId = salesforceOrderId;
  }

  public SSIOInsertionOrderUpdate salesforceOrderId(String salesforceOrderId) {
    this.salesforceOrderId = salesforceOrderId;
    return this;
  }

 /**
   * OrderLineId in SFDC
   * @return salesforceOrderLineId
  **/
  @JsonProperty("salesforce_order_line_id")
  public String getSalesforceOrderLineId() {
    return salesforceOrderLineId;
  }

  public void setSalesforceOrderLineId(String salesforceOrderLineId) {
    this.salesforceOrderLineId = salesforceOrderLineId;
  }

  public SSIOInsertionOrderUpdate salesforceOrderLineId(String salesforceOrderLineId) {
    this.salesforceOrderLineId = salesforceOrderLineId;
    return this;
  }

 /**
   * Starting date of time period. Format: YYYY-MM-DD
   * @return startDate
  **/
  @JsonProperty("start_date")
 @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public SSIOInsertionOrderUpdate startDate(String startDate) {
    this.startDate = startDate;
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

  public SSIOInsertionOrderUpdate userEmail(String userEmail) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

