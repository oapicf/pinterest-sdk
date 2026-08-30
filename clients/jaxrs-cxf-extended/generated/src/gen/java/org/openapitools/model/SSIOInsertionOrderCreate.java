package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.Currency;
import org.openapitools.model.SSIOOrderLineType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Resource create operation model.
 */
@ApiModel(description="Resource create operation model.")

public class SSIOInsertionOrderCreate  {
  
 /**
  * The SFDC id for the terms
  */
  @ApiModelProperty(required = true, value = "The SFDC id for the terms")
  private String acceptedTermsId;

 /**
  * The UTC timestamp (to the nearest sec) of when terms were accepted
  */
  @ApiModelProperty(value = "The UTC timestamp (to the nearest sec) of when terms were accepted")
  private Integer acceptedTermsTime;

 /**
  * URL link for agency
  */
  @ApiModelProperty(value = "URL link for agency")
  private String agencyLink;

 /**
  * The billing contact email
  */
  @ApiModelProperty(required = true, value = "The billing contact email")
  private String billingContactEmail;

 /**
  * The billing contact first name
  */
  @ApiModelProperty(required = true, value = "The billing contact first name")
  private String billingContactFirstname;

 /**
  * The billing contact last name
  */
  @ApiModelProperty(required = true, value = "The billing contact last name")
  private String billingContactLastname;

 /**
  * The bill-to billing address id
  */
  @ApiModelProperty(required = true, value = "The bill-to billing address id")
  private String billtoBillingAddressId;

 /**
  * The bill-to business address id
  */
  @ApiModelProperty(required = true, value = "The bill-to business address id")
  private String billtoBusinessAddressId;

 /**
  * The bill-to company id
  */
  @ApiModelProperty(required = true, value = "The bill-to company id")
  private String billtoCompanyId;

 /**
  * If Budget order line, the budget amount.
  */
  @ApiModelProperty(value = "If Budget order line, the budget amount.")
  private Double budgetAmount;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private Currency currencyInfo;

 /**
  * End date of time period. Format: YYYY-MM-DD
  */
  @ApiModelProperty(value = "End date of time period. Format: YYYY-MM-DD")
  private String endDate;

 /**
  * If Ongoing (perpetual) order line, the estimated monthly spend
  */
  @ApiModelProperty(value = "If Ongoing (perpetual) order line, the estimated monthly spend")
  private Double estimatedMonthlySpend;

 /**
  * The media contact email
  */
  @ApiModelProperty(required = true, value = "The media contact email")
  private String mediaContactEmail;

 /**
  * The media contact first name
  */
  @ApiModelProperty(required = true, value = "The media contact first name")
  private String mediaContactFirstname;

 /**
  * The media contact last name
  */
  @ApiModelProperty(required = true, value = "The media contact last name")
  private String mediaContactLastname;

 /**
  * Type can be Budget or Perpetual
  */
  @ApiModelProperty(required = true, value = "Type can be Budget or Perpetual")
  @Valid
  private SSIOOrderLineType orderLineType;

 /**
  * The order name
  */
  @ApiModelProperty(required = true, value = "The order name")
  private String orderName;

 /**
  * The pmp id
  */
  @ApiModelProperty(required = true, value = "The pmp id")
  private String pmpId;

 /**
  * The po number
  */
  @ApiModelProperty(required = true, value = "The po number")
  private String poNumber;

 /**
  * Starting date of time period. Format: YYYY-MM-DD
  */
  @ApiModelProperty(required = true, value = "Starting date of time period. Format: YYYY-MM-DD")
  private String startDate;

 /**
  * The email of user submitting the insertion order
  */
  @ApiModelProperty(value = "The email of user submitting the insertion order")
  private String userEmail;
 /**
  * The SFDC id for the terms
  * @return acceptedTermsId
  */
  @JsonProperty("accepted_terms_id")
  @NotNull
  public String getAcceptedTermsId() {
    return acceptedTermsId;
  }

  /**
   * Sets the <code>acceptedTermsId</code> property.
   */
 public void setAcceptedTermsId(String acceptedTermsId) {
    this.acceptedTermsId = acceptedTermsId;
  }

  /**
   * Sets the <code>acceptedTermsId</code> property.
   */
  public SSIOInsertionOrderCreate acceptedTermsId(String acceptedTermsId) {
    this.acceptedTermsId = acceptedTermsId;
    return this;
  }

 /**
  * The UTC timestamp (to the nearest sec) of when terms were accepted
  * @return acceptedTermsTime
  */
  @JsonProperty("accepted_terms_time")
  public Integer getAcceptedTermsTime() {
    return acceptedTermsTime;
  }

  /**
   * Sets the <code>acceptedTermsTime</code> property.
   */
 public void setAcceptedTermsTime(Integer acceptedTermsTime) {
    this.acceptedTermsTime = acceptedTermsTime;
  }

  /**
   * Sets the <code>acceptedTermsTime</code> property.
   */
  public SSIOInsertionOrderCreate acceptedTermsTime(Integer acceptedTermsTime) {
    this.acceptedTermsTime = acceptedTermsTime;
    return this;
  }

 /**
  * URL link for agency
  * @return agencyLink
  */
  @JsonProperty("agency_link")
  public String getAgencyLink() {
    return agencyLink;
  }

  /**
   * Sets the <code>agencyLink</code> property.
   */
 public void setAgencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
  }

  /**
   * Sets the <code>agencyLink</code> property.
   */
  public SSIOInsertionOrderCreate agencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
    return this;
  }

 /**
  * The billing contact email
  * @return billingContactEmail
  */
  @JsonProperty("billing_contact_email")
  @NotNull
  public String getBillingContactEmail() {
    return billingContactEmail;
  }

  /**
   * Sets the <code>billingContactEmail</code> property.
   */
 public void setBillingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
  }

  /**
   * Sets the <code>billingContactEmail</code> property.
   */
  public SSIOInsertionOrderCreate billingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
    return this;
  }

 /**
  * The billing contact first name
  * @return billingContactFirstname
  */
  @JsonProperty("billing_contact_firstname")
  @NotNull
  public String getBillingContactFirstname() {
    return billingContactFirstname;
  }

  /**
   * Sets the <code>billingContactFirstname</code> property.
   */
 public void setBillingContactFirstname(String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
  }

  /**
   * Sets the <code>billingContactFirstname</code> property.
   */
  public SSIOInsertionOrderCreate billingContactFirstname(String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
    return this;
  }

 /**
  * The billing contact last name
  * @return billingContactLastname
  */
  @JsonProperty("billing_contact_lastname")
  @NotNull
  public String getBillingContactLastname() {
    return billingContactLastname;
  }

  /**
   * Sets the <code>billingContactLastname</code> property.
   */
 public void setBillingContactLastname(String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
  }

  /**
   * Sets the <code>billingContactLastname</code> property.
   */
  public SSIOInsertionOrderCreate billingContactLastname(String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
    return this;
  }

 /**
  * The bill-to billing address id
  * @return billtoBillingAddressId
  */
  @JsonProperty("billto_billing_address_id")
  @NotNull
  public String getBilltoBillingAddressId() {
    return billtoBillingAddressId;
  }

  /**
   * Sets the <code>billtoBillingAddressId</code> property.
   */
 public void setBilltoBillingAddressId(String billtoBillingAddressId) {
    this.billtoBillingAddressId = billtoBillingAddressId;
  }

  /**
   * Sets the <code>billtoBillingAddressId</code> property.
   */
  public SSIOInsertionOrderCreate billtoBillingAddressId(String billtoBillingAddressId) {
    this.billtoBillingAddressId = billtoBillingAddressId;
    return this;
  }

 /**
  * The bill-to business address id
  * @return billtoBusinessAddressId
  */
  @JsonProperty("billto_business_address_id")
  @NotNull
  public String getBilltoBusinessAddressId() {
    return billtoBusinessAddressId;
  }

  /**
   * Sets the <code>billtoBusinessAddressId</code> property.
   */
 public void setBilltoBusinessAddressId(String billtoBusinessAddressId) {
    this.billtoBusinessAddressId = billtoBusinessAddressId;
  }

  /**
   * Sets the <code>billtoBusinessAddressId</code> property.
   */
  public SSIOInsertionOrderCreate billtoBusinessAddressId(String billtoBusinessAddressId) {
    this.billtoBusinessAddressId = billtoBusinessAddressId;
    return this;
  }

 /**
  * The bill-to company id
  * @return billtoCompanyId
  */
  @JsonProperty("billto_company_id")
  @NotNull
  public String getBilltoCompanyId() {
    return billtoCompanyId;
  }

  /**
   * Sets the <code>billtoCompanyId</code> property.
   */
 public void setBilltoCompanyId(String billtoCompanyId) {
    this.billtoCompanyId = billtoCompanyId;
  }

  /**
   * Sets the <code>billtoCompanyId</code> property.
   */
  public SSIOInsertionOrderCreate billtoCompanyId(String billtoCompanyId) {
    this.billtoCompanyId = billtoCompanyId;
    return this;
  }

 /**
  * If Budget order line, the budget amount.
  * @return budgetAmount
  */
  @JsonProperty("budget_amount")
  public Double getBudgetAmount() {
    return budgetAmount;
  }

  /**
   * Sets the <code>budgetAmount</code> property.
   */
 public void setBudgetAmount(Double budgetAmount) {
    this.budgetAmount = budgetAmount;
  }

  /**
   * Sets the <code>budgetAmount</code> property.
   */
  public SSIOInsertionOrderCreate budgetAmount(Double budgetAmount) {
    this.budgetAmount = budgetAmount;
    return this;
  }

 /**
  * Get currencyInfo
  * @return currencyInfo
  */
  @JsonProperty("currency_info")
  @NotNull
  public Currency getCurrencyInfo() {
    return currencyInfo;
  }

  /**
   * Sets the <code>currencyInfo</code> property.
   */
 public void setCurrencyInfo(Currency currencyInfo) {
    this.currencyInfo = currencyInfo;
  }

  /**
   * Sets the <code>currencyInfo</code> property.
   */
  public SSIOInsertionOrderCreate currencyInfo(Currency currencyInfo) {
    this.currencyInfo = currencyInfo;
    return this;
  }

 /**
  * End date of time period. Format: YYYY-MM-DD
  * @return endDate
  */
  @JsonProperty("end_date")
 @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")  public String getEndDate() {
    return endDate;
  }

  /**
   * Sets the <code>endDate</code> property.
   */
 public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   * Sets the <code>endDate</code> property.
   */
  public SSIOInsertionOrderCreate endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

 /**
  * If Ongoing (perpetual) order line, the estimated monthly spend
  * @return estimatedMonthlySpend
  */
  @JsonProperty("estimated_monthly_spend")
  public Double getEstimatedMonthlySpend() {
    return estimatedMonthlySpend;
  }

  /**
   * Sets the <code>estimatedMonthlySpend</code> property.
   */
 public void setEstimatedMonthlySpend(Double estimatedMonthlySpend) {
    this.estimatedMonthlySpend = estimatedMonthlySpend;
  }

  /**
   * Sets the <code>estimatedMonthlySpend</code> property.
   */
  public SSIOInsertionOrderCreate estimatedMonthlySpend(Double estimatedMonthlySpend) {
    this.estimatedMonthlySpend = estimatedMonthlySpend;
    return this;
  }

 /**
  * The media contact email
  * @return mediaContactEmail
  */
  @JsonProperty("media_contact_email")
  @NotNull
  public String getMediaContactEmail() {
    return mediaContactEmail;
  }

  /**
   * Sets the <code>mediaContactEmail</code> property.
   */
 public void setMediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
  }

  /**
   * Sets the <code>mediaContactEmail</code> property.
   */
  public SSIOInsertionOrderCreate mediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
    return this;
  }

 /**
  * The media contact first name
  * @return mediaContactFirstname
  */
  @JsonProperty("media_contact_firstname")
  @NotNull
  public String getMediaContactFirstname() {
    return mediaContactFirstname;
  }

  /**
   * Sets the <code>mediaContactFirstname</code> property.
   */
 public void setMediaContactFirstname(String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
  }

  /**
   * Sets the <code>mediaContactFirstname</code> property.
   */
  public SSIOInsertionOrderCreate mediaContactFirstname(String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
    return this;
  }

 /**
  * The media contact last name
  * @return mediaContactLastname
  */
  @JsonProperty("media_contact_lastname")
  @NotNull
  public String getMediaContactLastname() {
    return mediaContactLastname;
  }

  /**
   * Sets the <code>mediaContactLastname</code> property.
   */
 public void setMediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
  }

  /**
   * Sets the <code>mediaContactLastname</code> property.
   */
  public SSIOInsertionOrderCreate mediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
    return this;
  }

 /**
  * Type can be Budget or Perpetual
  * @return orderLineType
  */
  @JsonProperty("order_line_type")
  @NotNull
  public SSIOOrderLineType getOrderLineType() {
    return orderLineType;
  }

  /**
   * Sets the <code>orderLineType</code> property.
   */
 public void setOrderLineType(SSIOOrderLineType orderLineType) {
    this.orderLineType = orderLineType;
  }

  /**
   * Sets the <code>orderLineType</code> property.
   */
  public SSIOInsertionOrderCreate orderLineType(SSIOOrderLineType orderLineType) {
    this.orderLineType = orderLineType;
    return this;
  }

 /**
  * The order name
  * @return orderName
  */
  @JsonProperty("order_name")
  @NotNull
  public String getOrderName() {
    return orderName;
  }

  /**
   * Sets the <code>orderName</code> property.
   */
 public void setOrderName(String orderName) {
    this.orderName = orderName;
  }

  /**
   * Sets the <code>orderName</code> property.
   */
  public SSIOInsertionOrderCreate orderName(String orderName) {
    this.orderName = orderName;
    return this;
  }

 /**
  * The pmp id
  * @return pmpId
  */
  @JsonProperty("pmp_id")
  @NotNull
  public String getPmpId() {
    return pmpId;
  }

  /**
   * Sets the <code>pmpId</code> property.
   */
 public void setPmpId(String pmpId) {
    this.pmpId = pmpId;
  }

  /**
   * Sets the <code>pmpId</code> property.
   */
  public SSIOInsertionOrderCreate pmpId(String pmpId) {
    this.pmpId = pmpId;
    return this;
  }

 /**
  * The po number
  * @return poNumber
  */
  @JsonProperty("po_number")
  @NotNull
  public String getPoNumber() {
    return poNumber;
  }

  /**
   * Sets the <code>poNumber</code> property.
   */
 public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }

  /**
   * Sets the <code>poNumber</code> property.
   */
  public SSIOInsertionOrderCreate poNumber(String poNumber) {
    this.poNumber = poNumber;
    return this;
  }

 /**
  * Starting date of time period. Format: YYYY-MM-DD
  * @return startDate
  */
  @JsonProperty("start_date")
  @NotNull
 @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")  public String getStartDate() {
    return startDate;
  }

  /**
   * Sets the <code>startDate</code> property.
   */
 public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * Sets the <code>startDate</code> property.
   */
  public SSIOInsertionOrderCreate startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

 /**
  * The email of user submitting the insertion order
  * @return userEmail
  */
  @JsonProperty("user_email")
  public String getUserEmail() {
    return userEmail;
  }

  /**
   * Sets the <code>userEmail</code> property.
   */
 public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  /**
   * Sets the <code>userEmail</code> property.
   */
  public SSIOInsertionOrderCreate userEmail(String userEmail) {
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
    SSIOInsertionOrderCreate ssIOInsertionOrderCreate = (SSIOInsertionOrderCreate) o;
    return Objects.equals(this.acceptedTermsId, ssIOInsertionOrderCreate.acceptedTermsId) &&
        Objects.equals(this.acceptedTermsTime, ssIOInsertionOrderCreate.acceptedTermsTime) &&
        Objects.equals(this.agencyLink, ssIOInsertionOrderCreate.agencyLink) &&
        Objects.equals(this.billingContactEmail, ssIOInsertionOrderCreate.billingContactEmail) &&
        Objects.equals(this.billingContactFirstname, ssIOInsertionOrderCreate.billingContactFirstname) &&
        Objects.equals(this.billingContactLastname, ssIOInsertionOrderCreate.billingContactLastname) &&
        Objects.equals(this.billtoBillingAddressId, ssIOInsertionOrderCreate.billtoBillingAddressId) &&
        Objects.equals(this.billtoBusinessAddressId, ssIOInsertionOrderCreate.billtoBusinessAddressId) &&
        Objects.equals(this.billtoCompanyId, ssIOInsertionOrderCreate.billtoCompanyId) &&
        Objects.equals(this.budgetAmount, ssIOInsertionOrderCreate.budgetAmount) &&
        Objects.equals(this.currencyInfo, ssIOInsertionOrderCreate.currencyInfo) &&
        Objects.equals(this.endDate, ssIOInsertionOrderCreate.endDate) &&
        Objects.equals(this.estimatedMonthlySpend, ssIOInsertionOrderCreate.estimatedMonthlySpend) &&
        Objects.equals(this.mediaContactEmail, ssIOInsertionOrderCreate.mediaContactEmail) &&
        Objects.equals(this.mediaContactFirstname, ssIOInsertionOrderCreate.mediaContactFirstname) &&
        Objects.equals(this.mediaContactLastname, ssIOInsertionOrderCreate.mediaContactLastname) &&
        Objects.equals(this.orderLineType, ssIOInsertionOrderCreate.orderLineType) &&
        Objects.equals(this.orderName, ssIOInsertionOrderCreate.orderName) &&
        Objects.equals(this.pmpId, ssIOInsertionOrderCreate.pmpId) &&
        Objects.equals(this.poNumber, ssIOInsertionOrderCreate.poNumber) &&
        Objects.equals(this.startDate, ssIOInsertionOrderCreate.startDate) &&
        Objects.equals(this.userEmail, ssIOInsertionOrderCreate.userEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptedTermsId, acceptedTermsTime, agencyLink, billingContactEmail, billingContactFirstname, billingContactLastname, billtoBillingAddressId, billtoBusinessAddressId, billtoCompanyId, budgetAmount, currencyInfo, endDate, estimatedMonthlySpend, mediaContactEmail, mediaContactFirstname, mediaContactLastname, orderLineType, orderName, pmpId, poNumber, startDate, userEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSIOInsertionOrderCreate {\n");
    
    sb.append("    acceptedTermsId: ").append(toIndentedString(acceptedTermsId)).append("\n");
    sb.append("    acceptedTermsTime: ").append(toIndentedString(acceptedTermsTime)).append("\n");
    sb.append("    agencyLink: ").append(toIndentedString(agencyLink)).append("\n");
    sb.append("    billingContactEmail: ").append(toIndentedString(billingContactEmail)).append("\n");
    sb.append("    billingContactFirstname: ").append(toIndentedString(billingContactFirstname)).append("\n");
    sb.append("    billingContactLastname: ").append(toIndentedString(billingContactLastname)).append("\n");
    sb.append("    billtoBillingAddressId: ").append(toIndentedString(billtoBillingAddressId)).append("\n");
    sb.append("    billtoBusinessAddressId: ").append(toIndentedString(billtoBusinessAddressId)).append("\n");
    sb.append("    billtoCompanyId: ").append(toIndentedString(billtoCompanyId)).append("\n");
    sb.append("    budgetAmount: ").append(toIndentedString(budgetAmount)).append("\n");
    sb.append("    currencyInfo: ").append(toIndentedString(currencyInfo)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    estimatedMonthlySpend: ").append(toIndentedString(estimatedMonthlySpend)).append("\n");
    sb.append("    mediaContactEmail: ").append(toIndentedString(mediaContactEmail)).append("\n");
    sb.append("    mediaContactFirstname: ").append(toIndentedString(mediaContactFirstname)).append("\n");
    sb.append("    mediaContactLastname: ").append(toIndentedString(mediaContactLastname)).append("\n");
    sb.append("    orderLineType: ").append(toIndentedString(orderLineType)).append("\n");
    sb.append("    orderName: ").append(toIndentedString(orderName)).append("\n");
    sb.append("    pmpId: ").append(toIndentedString(pmpId)).append("\n");
    sb.append("    poNumber: ").append(toIndentedString(poNumber)).append("\n");
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

