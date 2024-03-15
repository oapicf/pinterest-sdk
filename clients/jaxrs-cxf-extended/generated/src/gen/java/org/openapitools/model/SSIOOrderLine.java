package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.joda.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.Currency;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SSIOOrderLine  {
  
 /**
  * OrderLineId in SFDC
  */
  @ApiModelProperty(value = "OrderLineId in SFDC")
  private String salesforceOrderLineId;

 /**
  * Ads manager OrderLineId
  */
  @ApiModelProperty(value = "Ads manager OrderLineId")
  private String adsManagerOrderLineId;

 /**
  * The pin order id associated with the order line in SFDC
  */
  @ApiModelProperty(value = "The pin order id associated with the order line in SFDC")
  private String pinOrderId;

 /**
  * Last modified date.
  */
  @ApiModelProperty(example = "2020-10-06T13:07:04.000Z", value = "Last modified date.")
  private String lastModifiedDateTime;

 /**
  * Start date of the order line.
  */
  @ApiModelProperty(example = "Thu Mar 01 00:00:00 UTC 2018", value = "Start date of the order line.")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate startDate;

 /**
  * End date of the order line.
  */
  @ApiModelProperty(example = "Mon Oct 05 00:00:00 UTC 2020", value = "End date of the order line.")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate endDate;

 /**
  * Bill To Company name
  */
  @ApiModelProperty(example = "Home Depot Inc.", value = "Bill To Company name")
  private String billToCompanyName;

 /**
  * Billing contact first name
  */
  @ApiModelProperty(example = "Mary", value = "Billing contact first name")
  private String billingContactFirstname;

 /**
  * Billing contact last name
  */
  @ApiModelProperty(example = "Smith", value = "Billing contact last name")
  private String billingContactLastname;

 /**
  * Billing contact email
  */
  @ApiModelProperty(example = "mail@test.com", value = "Billing contact email")
  private String billingContactEmail;

 /**
  * Billing media email
  */
  @ApiModelProperty(example = "mail@test.com", value = "Billing media email")
  private String mediaContactEmail;

 /**
  * Billing contact first name
  */
  @ApiModelProperty(example = "John", value = "Billing contact first name")
  private String mediaContactFirstname;

 /**
  * Billing contact first name
  */
  @ApiModelProperty(example = "Doe", value = "Billing contact first name")
  private String mediaContactLastname;

  @ApiModelProperty(value = "")
  @Valid
  private Currency currencyInfo;

 /**
  * Agency link
  */
  @ApiModelProperty(example = "", value = "Agency link")
  private String agencyLink;

 /**
  * The po number
  */
  @ApiModelProperty(value = "The po number")
  private String poNumber;

 /**
  * The order name
  */
  @ApiModelProperty(value = "The order name")
  private String orderName;

 /**
  * The Pinterest marketing partner name
  */
  @ApiModelProperty(value = "The Pinterest marketing partner name")
  private String pmpName;

 /**
  * The SFDC id for the terms
  */
  @ApiModelProperty(value = "The SFDC id for the terms")
  private String acceptedTermsId;

 /**
  * The UTC timestamp (to the nearest sec) of when terms were accepted
  */
  @ApiModelProperty(example = "2020-10-06T13:07:04.000Z", value = "The UTC timestamp (to the nearest sec) of when terms were accepted")
  private String acceptedTermsTime;

 /**
  * If Budget order line, the budget amount.
  */
  @ApiModelProperty(example = "5000000", value = "If Budget order line, the budget amount.")
  @Valid
  private BigDecimal budgetAmount;

 /**
  * If Ongoing (perpetual) order line, the estimated monthly spend
  */
  @ApiModelProperty(value = "If Ongoing (perpetual) order line, the estimated monthly spend")
  @Valid
  private BigDecimal estimatedMonthlySpend;
 /**
  * OrderLineId in SFDC
  * @return salesforceOrderLineId
  */
  @JsonProperty("salesforce_order_line_id")
  public String getSalesforceOrderLineId() {
    return salesforceOrderLineId;
  }

  /**
   * Sets the <code>salesforceOrderLineId</code> property.
   */
 public void setSalesforceOrderLineId(String salesforceOrderLineId) {
    this.salesforceOrderLineId = salesforceOrderLineId;
  }

  /**
   * Sets the <code>salesforceOrderLineId</code> property.
   */
  public SSIOOrderLine salesforceOrderLineId(String salesforceOrderLineId) {
    this.salesforceOrderLineId = salesforceOrderLineId;
    return this;
  }

 /**
  * Ads manager OrderLineId
  * @return adsManagerOrderLineId
  */
  @JsonProperty("ads_manager_order_line_id")
  public String getAdsManagerOrderLineId() {
    return adsManagerOrderLineId;
  }

  /**
   * Sets the <code>adsManagerOrderLineId</code> property.
   */
 public void setAdsManagerOrderLineId(String adsManagerOrderLineId) {
    this.adsManagerOrderLineId = adsManagerOrderLineId;
  }

  /**
   * Sets the <code>adsManagerOrderLineId</code> property.
   */
  public SSIOOrderLine adsManagerOrderLineId(String adsManagerOrderLineId) {
    this.adsManagerOrderLineId = adsManagerOrderLineId;
    return this;
  }

 /**
  * The pin order id associated with the order line in SFDC
  * @return pinOrderId
  */
  @JsonProperty("pin_order_id")
  public String getPinOrderId() {
    return pinOrderId;
  }

  /**
   * Sets the <code>pinOrderId</code> property.
   */
 public void setPinOrderId(String pinOrderId) {
    this.pinOrderId = pinOrderId;
  }

  /**
   * Sets the <code>pinOrderId</code> property.
   */
  public SSIOOrderLine pinOrderId(String pinOrderId) {
    this.pinOrderId = pinOrderId;
    return this;
  }

 /**
  * Last modified date.
  * @return lastModifiedDateTime
  */
  @JsonProperty("last_modified_date_time")
 @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})T(\\d{2}):(\\d{2}):(\\d{2}).(\\d{3})Z$")  public String getLastModifiedDateTime() {
    return lastModifiedDateTime;
  }

  /**
   * Sets the <code>lastModifiedDateTime</code> property.
   */
 public void setLastModifiedDateTime(String lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
  }

  /**
   * Sets the <code>lastModifiedDateTime</code> property.
   */
  public SSIOOrderLine lastModifiedDateTime(String lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
    return this;
  }

 /**
  * Start date of the order line.
  * @return startDate
  */
  @JsonProperty("start_date")
  public LocalDate getStartDate() {
    return startDate;
  }

  /**
   * Sets the <code>startDate</code> property.
   */
 public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  /**
   * Sets the <code>startDate</code> property.
   */
  public SSIOOrderLine startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

 /**
  * End date of the order line.
  * @return endDate
  */
  @JsonProperty("end_date")
  public LocalDate getEndDate() {
    return endDate;
  }

  /**
   * Sets the <code>endDate</code> property.
   */
 public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  /**
   * Sets the <code>endDate</code> property.
   */
  public SSIOOrderLine endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

 /**
  * Bill To Company name
  * @return billToCompanyName
  */
  @JsonProperty("bill_to_company_name")
  public String getBillToCompanyName() {
    return billToCompanyName;
  }

  /**
   * Sets the <code>billToCompanyName</code> property.
   */
 public void setBillToCompanyName(String billToCompanyName) {
    this.billToCompanyName = billToCompanyName;
  }

  /**
   * Sets the <code>billToCompanyName</code> property.
   */
  public SSIOOrderLine billToCompanyName(String billToCompanyName) {
    this.billToCompanyName = billToCompanyName;
    return this;
  }

 /**
  * Billing contact first name
  * @return billingContactFirstname
  */
  @JsonProperty("billing_contact_firstname")
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
  public SSIOOrderLine billingContactFirstname(String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
    return this;
  }

 /**
  * Billing contact last name
  * @return billingContactLastname
  */
  @JsonProperty("billing_contact_lastname")
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
  public SSIOOrderLine billingContactLastname(String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
    return this;
  }

 /**
  * Billing contact email
  * @return billingContactEmail
  */
  @JsonProperty("billing_contact_email")
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
  public SSIOOrderLine billingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
    return this;
  }

 /**
  * Billing media email
  * @return mediaContactEmail
  */
  @JsonProperty("media_contact_email")
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
  public SSIOOrderLine mediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
    return this;
  }

 /**
  * Billing contact first name
  * @return mediaContactFirstname
  */
  @JsonProperty("media_contact_firstname")
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
  public SSIOOrderLine mediaContactFirstname(String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
    return this;
  }

 /**
  * Billing contact first name
  * @return mediaContactLastname
  */
  @JsonProperty("media_contact_lastname")
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
  public SSIOOrderLine mediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
    return this;
  }

 /**
  * Get currencyInfo
  * @return currencyInfo
  */
  @JsonProperty("currency_info")
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
  public SSIOOrderLine currencyInfo(Currency currencyInfo) {
    this.currencyInfo = currencyInfo;
    return this;
  }

 /**
  * Agency link
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
  public SSIOOrderLine agencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
    return this;
  }

 /**
  * The po number
  * @return poNumber
  */
  @JsonProperty("po_number")
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
  public SSIOOrderLine poNumber(String poNumber) {
    this.poNumber = poNumber;
    return this;
  }

 /**
  * The order name
  * @return orderName
  */
  @JsonProperty("order_name")
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
  public SSIOOrderLine orderName(String orderName) {
    this.orderName = orderName;
    return this;
  }

 /**
  * The Pinterest marketing partner name
  * @return pmpName
  */
  @JsonProperty("pmp_name")
  public String getPmpName() {
    return pmpName;
  }

  /**
   * Sets the <code>pmpName</code> property.
   */
 public void setPmpName(String pmpName) {
    this.pmpName = pmpName;
  }

  /**
   * Sets the <code>pmpName</code> property.
   */
  public SSIOOrderLine pmpName(String pmpName) {
    this.pmpName = pmpName;
    return this;
  }

 /**
  * The SFDC id for the terms
  * @return acceptedTermsId
  */
  @JsonProperty("accepted_terms_id")
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
  public SSIOOrderLine acceptedTermsId(String acceptedTermsId) {
    this.acceptedTermsId = acceptedTermsId;
    return this;
  }

 /**
  * The UTC timestamp (to the nearest sec) of when terms were accepted
  * @return acceptedTermsTime
  */
  @JsonProperty("accepted_terms_time")
 @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})T(\\d{2}):(\\d{2}):(\\d{2}).(\\d{3})Z$")  public String getAcceptedTermsTime() {
    return acceptedTermsTime;
  }

  /**
   * Sets the <code>acceptedTermsTime</code> property.
   */
 public void setAcceptedTermsTime(String acceptedTermsTime) {
    this.acceptedTermsTime = acceptedTermsTime;
  }

  /**
   * Sets the <code>acceptedTermsTime</code> property.
   */
  public SSIOOrderLine acceptedTermsTime(String acceptedTermsTime) {
    this.acceptedTermsTime = acceptedTermsTime;
    return this;
  }

 /**
  * If Budget order line, the budget amount.
  * @return budgetAmount
  */
  @JsonProperty("budget_amount")
  public BigDecimal getBudgetAmount() {
    return budgetAmount;
  }

  /**
   * Sets the <code>budgetAmount</code> property.
   */
 public void setBudgetAmount(BigDecimal budgetAmount) {
    this.budgetAmount = budgetAmount;
  }

  /**
   * Sets the <code>budgetAmount</code> property.
   */
  public SSIOOrderLine budgetAmount(BigDecimal budgetAmount) {
    this.budgetAmount = budgetAmount;
    return this;
  }

 /**
  * If Ongoing (perpetual) order line, the estimated monthly spend
  * @return estimatedMonthlySpend
  */
  @JsonProperty("estimated_monthly_spend")
  public BigDecimal getEstimatedMonthlySpend() {
    return estimatedMonthlySpend;
  }

  /**
   * Sets the <code>estimatedMonthlySpend</code> property.
   */
 public void setEstimatedMonthlySpend(BigDecimal estimatedMonthlySpend) {
    this.estimatedMonthlySpend = estimatedMonthlySpend;
  }

  /**
   * Sets the <code>estimatedMonthlySpend</code> property.
   */
  public SSIOOrderLine estimatedMonthlySpend(BigDecimal estimatedMonthlySpend) {
    this.estimatedMonthlySpend = estimatedMonthlySpend;
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
    SSIOOrderLine ssIOOrderLine = (SSIOOrderLine) o;
    return Objects.equals(this.salesforceOrderLineId, ssIOOrderLine.salesforceOrderLineId) &&
        Objects.equals(this.adsManagerOrderLineId, ssIOOrderLine.adsManagerOrderLineId) &&
        Objects.equals(this.pinOrderId, ssIOOrderLine.pinOrderId) &&
        Objects.equals(this.lastModifiedDateTime, ssIOOrderLine.lastModifiedDateTime) &&
        Objects.equals(this.startDate, ssIOOrderLine.startDate) &&
        Objects.equals(this.endDate, ssIOOrderLine.endDate) &&
        Objects.equals(this.billToCompanyName, ssIOOrderLine.billToCompanyName) &&
        Objects.equals(this.billingContactFirstname, ssIOOrderLine.billingContactFirstname) &&
        Objects.equals(this.billingContactLastname, ssIOOrderLine.billingContactLastname) &&
        Objects.equals(this.billingContactEmail, ssIOOrderLine.billingContactEmail) &&
        Objects.equals(this.mediaContactEmail, ssIOOrderLine.mediaContactEmail) &&
        Objects.equals(this.mediaContactFirstname, ssIOOrderLine.mediaContactFirstname) &&
        Objects.equals(this.mediaContactLastname, ssIOOrderLine.mediaContactLastname) &&
        Objects.equals(this.currencyInfo, ssIOOrderLine.currencyInfo) &&
        Objects.equals(this.agencyLink, ssIOOrderLine.agencyLink) &&
        Objects.equals(this.poNumber, ssIOOrderLine.poNumber) &&
        Objects.equals(this.orderName, ssIOOrderLine.orderName) &&
        Objects.equals(this.pmpName, ssIOOrderLine.pmpName) &&
        Objects.equals(this.acceptedTermsId, ssIOOrderLine.acceptedTermsId) &&
        Objects.equals(this.acceptedTermsTime, ssIOOrderLine.acceptedTermsTime) &&
        Objects.equals(this.budgetAmount, ssIOOrderLine.budgetAmount) &&
        Objects.equals(this.estimatedMonthlySpend, ssIOOrderLine.estimatedMonthlySpend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(salesforceOrderLineId, adsManagerOrderLineId, pinOrderId, lastModifiedDateTime, startDate, endDate, billToCompanyName, billingContactFirstname, billingContactLastname, billingContactEmail, mediaContactEmail, mediaContactFirstname, mediaContactLastname, currencyInfo, agencyLink, poNumber, orderName, pmpName, acceptedTermsId, acceptedTermsTime, budgetAmount, estimatedMonthlySpend);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSIOOrderLine {\n");
    
    sb.append("    salesforceOrderLineId: ").append(toIndentedString(salesforceOrderLineId)).append("\n");
    sb.append("    adsManagerOrderLineId: ").append(toIndentedString(adsManagerOrderLineId)).append("\n");
    sb.append("    pinOrderId: ").append(toIndentedString(pinOrderId)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    billToCompanyName: ").append(toIndentedString(billToCompanyName)).append("\n");
    sb.append("    billingContactFirstname: ").append(toIndentedString(billingContactFirstname)).append("\n");
    sb.append("    billingContactLastname: ").append(toIndentedString(billingContactLastname)).append("\n");
    sb.append("    billingContactEmail: ").append(toIndentedString(billingContactEmail)).append("\n");
    sb.append("    mediaContactEmail: ").append(toIndentedString(mediaContactEmail)).append("\n");
    sb.append("    mediaContactFirstname: ").append(toIndentedString(mediaContactFirstname)).append("\n");
    sb.append("    mediaContactLastname: ").append(toIndentedString(mediaContactLastname)).append("\n");
    sb.append("    currencyInfo: ").append(toIndentedString(currencyInfo)).append("\n");
    sb.append("    agencyLink: ").append(toIndentedString(agencyLink)).append("\n");
    sb.append("    poNumber: ").append(toIndentedString(poNumber)).append("\n");
    sb.append("    orderName: ").append(toIndentedString(orderName)).append("\n");
    sb.append("    pmpName: ").append(toIndentedString(pmpName)).append("\n");
    sb.append("    acceptedTermsId: ").append(toIndentedString(acceptedTermsId)).append("\n");
    sb.append("    acceptedTermsTime: ").append(toIndentedString(acceptedTermsTime)).append("\n");
    sb.append("    budgetAmount: ").append(toIndentedString(budgetAmount)).append("\n");
    sb.append("    estimatedMonthlySpend: ").append(toIndentedString(estimatedMonthlySpend)).append("\n");
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

