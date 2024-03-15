package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.joda.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.Currency;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class SSIOOrderLine   {
  
  private String salesforceOrderLineId;

  private String adsManagerOrderLineId;

  private String pinOrderId;

  private String lastModifiedDateTime;

  private LocalDate startDate;

  private LocalDate endDate;

  private String billToCompanyName;

  private String billingContactFirstname;

  private String billingContactLastname;

  private String billingContactEmail;

  private String mediaContactEmail;

  private String mediaContactFirstname;

  private String mediaContactLastname;

  private Currency currencyInfo;

  private String agencyLink;

  private String poNumber;

  private String orderName;

  private String pmpName;

  private String acceptedTermsId;

  private String acceptedTermsTime;

  private BigDecimal budgetAmount;

  private BigDecimal estimatedMonthlySpend;

  /**
   * OrderLineId in SFDC
   **/
  public SSIOOrderLine salesforceOrderLineId(String salesforceOrderLineId) {
    this.salesforceOrderLineId = salesforceOrderLineId;
    return this;
  }

  
  @ApiModelProperty(value = "OrderLineId in SFDC")
  @JsonProperty("salesforce_order_line_id")
  public String getSalesforceOrderLineId() {
    return salesforceOrderLineId;
  }
  public void setSalesforceOrderLineId(String salesforceOrderLineId) {
    this.salesforceOrderLineId = salesforceOrderLineId;
  }


  /**
   * Ads manager OrderLineId
   **/
  public SSIOOrderLine adsManagerOrderLineId(String adsManagerOrderLineId) {
    this.adsManagerOrderLineId = adsManagerOrderLineId;
    return this;
  }

  
  @ApiModelProperty(value = "Ads manager OrderLineId")
  @JsonProperty("ads_manager_order_line_id")
  public String getAdsManagerOrderLineId() {
    return adsManagerOrderLineId;
  }
  public void setAdsManagerOrderLineId(String adsManagerOrderLineId) {
    this.adsManagerOrderLineId = adsManagerOrderLineId;
  }


  /**
   * The pin order id associated with the order line in SFDC
   **/
  public SSIOOrderLine pinOrderId(String pinOrderId) {
    this.pinOrderId = pinOrderId;
    return this;
  }

  
  @ApiModelProperty(value = "The pin order id associated with the order line in SFDC")
  @JsonProperty("pin_order_id")
  public String getPinOrderId() {
    return pinOrderId;
  }
  public void setPinOrderId(String pinOrderId) {
    this.pinOrderId = pinOrderId;
  }


  /**
   * Last modified date.
   **/
  public SSIOOrderLine lastModifiedDateTime(String lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
    return this;
  }

  
  @ApiModelProperty(example = "2020-10-06T13:07:04.000Z", value = "Last modified date.")
  @JsonProperty("last_modified_date_time")
 @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})T(\\d{2}):(\\d{2}):(\\d{2}).(\\d{3})Z$")  public String getLastModifiedDateTime() {
    return lastModifiedDateTime;
  }
  public void setLastModifiedDateTime(String lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
  }


  /**
   * Start date of the order line.
   **/
  public SSIOOrderLine startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  
  @ApiModelProperty(example = "Thu Mar 01 00:00:00 UTC 2018", value = "Start date of the order line.")
  @JsonProperty("start_date")
  public LocalDate getStartDate() {
    return startDate;
  }
  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  /**
   * End date of the order line.
   **/
  public SSIOOrderLine endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  
  @ApiModelProperty(example = "Mon Oct 05 00:00:00 UTC 2020", value = "End date of the order line.")
  @JsonProperty("end_date")
  public LocalDate getEndDate() {
    return endDate;
  }
  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  /**
   * Bill To Company name
   **/
  public SSIOOrderLine billToCompanyName(String billToCompanyName) {
    this.billToCompanyName = billToCompanyName;
    return this;
  }

  
  @ApiModelProperty(example = "Home Depot Inc.", value = "Bill To Company name")
  @JsonProperty("bill_to_company_name")
  public String getBillToCompanyName() {
    return billToCompanyName;
  }
  public void setBillToCompanyName(String billToCompanyName) {
    this.billToCompanyName = billToCompanyName;
  }


  /**
   * Billing contact first name
   **/
  public SSIOOrderLine billingContactFirstname(String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
    return this;
  }

  
  @ApiModelProperty(example = "Mary", value = "Billing contact first name")
  @JsonProperty("billing_contact_firstname")
  public String getBillingContactFirstname() {
    return billingContactFirstname;
  }
  public void setBillingContactFirstname(String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
  }


  /**
   * Billing contact last name
   **/
  public SSIOOrderLine billingContactLastname(String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
    return this;
  }

  
  @ApiModelProperty(example = "Smith", value = "Billing contact last name")
  @JsonProperty("billing_contact_lastname")
  public String getBillingContactLastname() {
    return billingContactLastname;
  }
  public void setBillingContactLastname(String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
  }


  /**
   * Billing contact email
   **/
  public SSIOOrderLine billingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
    return this;
  }

  
  @ApiModelProperty(example = "mail@test.com", value = "Billing contact email")
  @JsonProperty("billing_contact_email")
  public String getBillingContactEmail() {
    return billingContactEmail;
  }
  public void setBillingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
  }


  /**
   * Billing media email
   **/
  public SSIOOrderLine mediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
    return this;
  }

  
  @ApiModelProperty(example = "mail@test.com", value = "Billing media email")
  @JsonProperty("media_contact_email")
  public String getMediaContactEmail() {
    return mediaContactEmail;
  }
  public void setMediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
  }


  /**
   * Billing contact first name
   **/
  public SSIOOrderLine mediaContactFirstname(String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
    return this;
  }

  
  @ApiModelProperty(example = "John", value = "Billing contact first name")
  @JsonProperty("media_contact_firstname")
  public String getMediaContactFirstname() {
    return mediaContactFirstname;
  }
  public void setMediaContactFirstname(String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
  }


  /**
   * Billing contact first name
   **/
  public SSIOOrderLine mediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
    return this;
  }

  
  @ApiModelProperty(example = "Doe", value = "Billing contact first name")
  @JsonProperty("media_contact_lastname")
  public String getMediaContactLastname() {
    return mediaContactLastname;
  }
  public void setMediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
  }


  /**
   **/
  public SSIOOrderLine currencyInfo(Currency currencyInfo) {
    this.currencyInfo = currencyInfo;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("currency_info")
  public Currency getCurrencyInfo() {
    return currencyInfo;
  }
  public void setCurrencyInfo(Currency currencyInfo) {
    this.currencyInfo = currencyInfo;
  }


  /**
   * Agency link
   **/
  public SSIOOrderLine agencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
    return this;
  }

  
  @ApiModelProperty(example = "", value = "Agency link")
  @JsonProperty("agency_link")
  public String getAgencyLink() {
    return agencyLink;
  }
  public void setAgencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
  }


  /**
   * The po number
   **/
  public SSIOOrderLine poNumber(String poNumber) {
    this.poNumber = poNumber;
    return this;
  }

  
  @ApiModelProperty(value = "The po number")
  @JsonProperty("po_number")
  public String getPoNumber() {
    return poNumber;
  }
  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }


  /**
   * The order name
   **/
  public SSIOOrderLine orderName(String orderName) {
    this.orderName = orderName;
    return this;
  }

  
  @ApiModelProperty(value = "The order name")
  @JsonProperty("order_name")
  public String getOrderName() {
    return orderName;
  }
  public void setOrderName(String orderName) {
    this.orderName = orderName;
  }


  /**
   * The Pinterest marketing partner name
   **/
  public SSIOOrderLine pmpName(String pmpName) {
    this.pmpName = pmpName;
    return this;
  }

  
  @ApiModelProperty(value = "The Pinterest marketing partner name")
  @JsonProperty("pmp_name")
  public String getPmpName() {
    return pmpName;
  }
  public void setPmpName(String pmpName) {
    this.pmpName = pmpName;
  }


  /**
   * The SFDC id for the terms
   **/
  public SSIOOrderLine acceptedTermsId(String acceptedTermsId) {
    this.acceptedTermsId = acceptedTermsId;
    return this;
  }

  
  @ApiModelProperty(value = "The SFDC id for the terms")
  @JsonProperty("accepted_terms_id")
  public String getAcceptedTermsId() {
    return acceptedTermsId;
  }
  public void setAcceptedTermsId(String acceptedTermsId) {
    this.acceptedTermsId = acceptedTermsId;
  }


  /**
   * The UTC timestamp (to the nearest sec) of when terms were accepted
   **/
  public SSIOOrderLine acceptedTermsTime(String acceptedTermsTime) {
    this.acceptedTermsTime = acceptedTermsTime;
    return this;
  }

  
  @ApiModelProperty(example = "2020-10-06T13:07:04.000Z", value = "The UTC timestamp (to the nearest sec) of when terms were accepted")
  @JsonProperty("accepted_terms_time")
 @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})T(\\d{2}):(\\d{2}):(\\d{2}).(\\d{3})Z$")  public String getAcceptedTermsTime() {
    return acceptedTermsTime;
  }
  public void setAcceptedTermsTime(String acceptedTermsTime) {
    this.acceptedTermsTime = acceptedTermsTime;
  }


  /**
   * If Budget order line, the budget amount.
   **/
  public SSIOOrderLine budgetAmount(BigDecimal budgetAmount) {
    this.budgetAmount = budgetAmount;
    return this;
  }

  
  @ApiModelProperty(example = "5000000", value = "If Budget order line, the budget amount.")
  @JsonProperty("budget_amount")
  public BigDecimal getBudgetAmount() {
    return budgetAmount;
  }
  public void setBudgetAmount(BigDecimal budgetAmount) {
    this.budgetAmount = budgetAmount;
  }


  /**
   * If Ongoing (perpetual) order line, the estimated monthly spend
   **/
  public SSIOOrderLine estimatedMonthlySpend(BigDecimal estimatedMonthlySpend) {
    this.estimatedMonthlySpend = estimatedMonthlySpend;
    return this;
  }

  
  @ApiModelProperty(value = "If Ongoing (perpetual) order line, the estimated monthly spend")
  @JsonProperty("estimated_monthly_spend")
  public BigDecimal getEstimatedMonthlySpend() {
    return estimatedMonthlySpend;
  }
  public void setEstimatedMonthlySpend(BigDecimal estimatedMonthlySpend) {
    this.estimatedMonthlySpend = estimatedMonthlySpend;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

