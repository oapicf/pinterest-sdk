package org.openapitools.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.Currency;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * A Salesforce SSIO order line.
 */
public class SSIOOrderLine implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The SFDC id for the terms
   */
  @JsonProperty("accepted_terms_id")
  private String acceptedTermsId;

  /**
   * The UTC timestamp (to the nearest second) when terms were accepted.
   */
  @JsonProperty("accepted_terms_time")
  private String acceptedTermsTime;

  /**
   * Ads manager order line id
   */
  @JsonProperty("ads_manager_order_line_id")
  private String adsManagerOrderLineId;

  /**
   * Agency link
   */
  @JsonProperty("agency_link")
  private String agencyLink;

  /**
   * Bill-to company name
   */
  @JsonProperty("bill_to_company_name")
  private String billToCompanyName;

  /**
   * Billing contact email
   */
  @JsonProperty("billing_contact_email")
  private String billingContactEmail;

  /**
   * Billing contact first name
   */
  @JsonProperty("billing_contact_firstname")
  private String billingContactFirstname;

  /**
   * Billing contact last name
   */
  @JsonProperty("billing_contact_lastname")
  private String billingContactLastname;

  /**
   * If budget order line, the budget amount.
   */
  @JsonProperty("budget_amount")
  private BigDecimal budgetAmount;

  @JsonProperty("currency_info")
  private Currency currencyInfo;

  /**
   * End date of the order line.
   */
  @JsonProperty("end_date")
  private LocalDate endDate;

  /**
   * If ongoing (perpetual) order line, the estimated monthly spend.
   */
  @JsonProperty("estimated_monthly_spend")
  private BigDecimal estimatedMonthlySpend;

  /**
   * Last modified date.
   */
  @JsonProperty("last_modified_date_time")
  private String lastModifiedDateTime;

  /**
   * Billing media email
   */
  @JsonProperty("media_contact_email")
  private String mediaContactEmail;

  /**
   * Billing media contact first name
   */
  @JsonProperty("media_contact_firstname")
  private String mediaContactFirstname;

  /**
   * Billing media contact last name
   */
  @JsonProperty("media_contact_lastname")
  private String mediaContactLastname;

  /**
   * The order name
   */
  @JsonProperty("order_name")
  private String orderName;

  /**
   * The pin order id associated with the order line in SFDC
   */
  @JsonProperty("pin_order_id")
  private String pinOrderId;

  /**
   * The Pinterest marketing partner name
   */
  @JsonProperty("pmp_name")
  private String pmpName;

  /**
   * The PO number
   */
  @JsonProperty("po_number")
  private String poNumber;

  /**
   * Order line id in SFDC
   */
  @JsonProperty("salesforce_order_line_id")
  private String salesforceOrderLineId;

  /**
   * Start date of the order line.
   */
  @JsonProperty("start_date")
  private LocalDate startDate;

  /**
   * The SFDC id for the terms
   * @return acceptedTermsId
   */
  public String getAcceptedTermsId() {
    return acceptedTermsId;
  }

  public void setAcceptedTermsId(String acceptedTermsId) {
    this.acceptedTermsId = acceptedTermsId;
  }

  /**
   * The UTC timestamp (to the nearest second) when terms were accepted.
   * @return acceptedTermsTime
   */
  public String getAcceptedTermsTime() {
    return acceptedTermsTime;
  }

  public void setAcceptedTermsTime(String acceptedTermsTime) {
    this.acceptedTermsTime = acceptedTermsTime;
  }

  /**
   * Ads manager order line id
   * @return adsManagerOrderLineId
   */
  public String getAdsManagerOrderLineId() {
    return adsManagerOrderLineId;
  }

  public void setAdsManagerOrderLineId(String adsManagerOrderLineId) {
    this.adsManagerOrderLineId = adsManagerOrderLineId;
  }

  /**
   * Agency link
   * @return agencyLink
   */
  public String getAgencyLink() {
    return agencyLink;
  }

  public void setAgencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
  }

  /**
   * Bill-to company name
   * @return billToCompanyName
   */
  public String getBillToCompanyName() {
    return billToCompanyName;
  }

  public void setBillToCompanyName(String billToCompanyName) {
    this.billToCompanyName = billToCompanyName;
  }

  /**
   * Billing contact email
   * @return billingContactEmail
   */
  public String getBillingContactEmail() {
    return billingContactEmail;
  }

  public void setBillingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
  }

  /**
   * Billing contact first name
   * @return billingContactFirstname
   */
  public String getBillingContactFirstname() {
    return billingContactFirstname;
  }

  public void setBillingContactFirstname(String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
  }

  /**
   * Billing contact last name
   * @return billingContactLastname
   */
  public String getBillingContactLastname() {
    return billingContactLastname;
  }

  public void setBillingContactLastname(String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
  }

  /**
   * If budget order line, the budget amount.
   * @return budgetAmount
   */
  public BigDecimal getBudgetAmount() {
    return budgetAmount;
  }

  public void setBudgetAmount(BigDecimal budgetAmount) {
    this.budgetAmount = budgetAmount;
  }

  /**
   * 
   * @return currencyInfo
   */
  public Currency getCurrencyInfo() {
    return currencyInfo;
  }

  public void setCurrencyInfo(Currency currencyInfo) {
    this.currencyInfo = currencyInfo;
  }

  /**
   * End date of the order line.
   * @return endDate
   */
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  /**
   * If ongoing (perpetual) order line, the estimated monthly spend.
   * @return estimatedMonthlySpend
   */
  public BigDecimal getEstimatedMonthlySpend() {
    return estimatedMonthlySpend;
  }

  public void setEstimatedMonthlySpend(BigDecimal estimatedMonthlySpend) {
    this.estimatedMonthlySpend = estimatedMonthlySpend;
  }

  /**
   * Last modified date.
   * @return lastModifiedDateTime
   */
  public String getLastModifiedDateTime() {
    return lastModifiedDateTime;
  }

  public void setLastModifiedDateTime(String lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
  }

  /**
   * Billing media email
   * @return mediaContactEmail
   */
  public String getMediaContactEmail() {
    return mediaContactEmail;
  }

  public void setMediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
  }

  /**
   * Billing media contact first name
   * @return mediaContactFirstname
   */
  public String getMediaContactFirstname() {
    return mediaContactFirstname;
  }

  public void setMediaContactFirstname(String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
  }

  /**
   * Billing media contact last name
   * @return mediaContactLastname
   */
  public String getMediaContactLastname() {
    return mediaContactLastname;
  }

  public void setMediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
  }

  /**
   * The order name
   * @return orderName
   */
  public String getOrderName() {
    return orderName;
  }

  public void setOrderName(String orderName) {
    this.orderName = orderName;
  }

  /**
   * The pin order id associated with the order line in SFDC
   * @return pinOrderId
   */
  public String getPinOrderId() {
    return pinOrderId;
  }

  public void setPinOrderId(String pinOrderId) {
    this.pinOrderId = pinOrderId;
  }

  /**
   * The Pinterest marketing partner name
   * @return pmpName
   */
  public String getPmpName() {
    return pmpName;
  }

  public void setPmpName(String pmpName) {
    this.pmpName = pmpName;
  }

  /**
   * The PO number
   * @return poNumber
   */
  public String getPoNumber() {
    return poNumber;
  }

  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }

  /**
   * Order line id in SFDC
   * @return salesforceOrderLineId
   */
  public String getSalesforceOrderLineId() {
    return salesforceOrderLineId;
  }

  public void setSalesforceOrderLineId(String salesforceOrderLineId) {
    this.salesforceOrderLineId = salesforceOrderLineId;
  }

  /**
   * Start date of the order line.
   * @return startDate
   */
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
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
    return Objects.equals(this.acceptedTermsId, ssIOOrderLine.acceptedTermsId) &&
        Objects.equals(this.acceptedTermsTime, ssIOOrderLine.acceptedTermsTime) &&
        Objects.equals(this.adsManagerOrderLineId, ssIOOrderLine.adsManagerOrderLineId) &&
        Objects.equals(this.agencyLink, ssIOOrderLine.agencyLink) &&
        Objects.equals(this.billToCompanyName, ssIOOrderLine.billToCompanyName) &&
        Objects.equals(this.billingContactEmail, ssIOOrderLine.billingContactEmail) &&
        Objects.equals(this.billingContactFirstname, ssIOOrderLine.billingContactFirstname) &&
        Objects.equals(this.billingContactLastname, ssIOOrderLine.billingContactLastname) &&
        Objects.equals(this.budgetAmount, ssIOOrderLine.budgetAmount) &&
        Objects.equals(this.currencyInfo, ssIOOrderLine.currencyInfo) &&
        Objects.equals(this.endDate, ssIOOrderLine.endDate) &&
        Objects.equals(this.estimatedMonthlySpend, ssIOOrderLine.estimatedMonthlySpend) &&
        Objects.equals(this.lastModifiedDateTime, ssIOOrderLine.lastModifiedDateTime) &&
        Objects.equals(this.mediaContactEmail, ssIOOrderLine.mediaContactEmail) &&
        Objects.equals(this.mediaContactFirstname, ssIOOrderLine.mediaContactFirstname) &&
        Objects.equals(this.mediaContactLastname, ssIOOrderLine.mediaContactLastname) &&
        Objects.equals(this.orderName, ssIOOrderLine.orderName) &&
        Objects.equals(this.pinOrderId, ssIOOrderLine.pinOrderId) &&
        Objects.equals(this.pmpName, ssIOOrderLine.pmpName) &&
        Objects.equals(this.poNumber, ssIOOrderLine.poNumber) &&
        Objects.equals(this.salesforceOrderLineId, ssIOOrderLine.salesforceOrderLineId) &&
        Objects.equals(this.startDate, ssIOOrderLine.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptedTermsId, acceptedTermsTime, adsManagerOrderLineId, agencyLink, billToCompanyName, billingContactEmail, billingContactFirstname, billingContactLastname, budgetAmount, currencyInfo, endDate, estimatedMonthlySpend, lastModifiedDateTime, mediaContactEmail, mediaContactFirstname, mediaContactLastname, orderName, pinOrderId, pmpName, poNumber, salesforceOrderLineId, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSIOOrderLine {\n");
    
    sb.append("    acceptedTermsId: ").append(toIndentedString(acceptedTermsId)).append("\n");
    sb.append("    acceptedTermsTime: ").append(toIndentedString(acceptedTermsTime)).append("\n");
    sb.append("    adsManagerOrderLineId: ").append(toIndentedString(adsManagerOrderLineId)).append("\n");
    sb.append("    agencyLink: ").append(toIndentedString(agencyLink)).append("\n");
    sb.append("    billToCompanyName: ").append(toIndentedString(billToCompanyName)).append("\n");
    sb.append("    billingContactEmail: ").append(toIndentedString(billingContactEmail)).append("\n");
    sb.append("    billingContactFirstname: ").append(toIndentedString(billingContactFirstname)).append("\n");
    sb.append("    billingContactLastname: ").append(toIndentedString(billingContactLastname)).append("\n");
    sb.append("    budgetAmount: ").append(toIndentedString(budgetAmount)).append("\n");
    sb.append("    currencyInfo: ").append(toIndentedString(currencyInfo)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    estimatedMonthlySpend: ").append(toIndentedString(estimatedMonthlySpend)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    mediaContactEmail: ").append(toIndentedString(mediaContactEmail)).append("\n");
    sb.append("    mediaContactFirstname: ").append(toIndentedString(mediaContactFirstname)).append("\n");
    sb.append("    mediaContactLastname: ").append(toIndentedString(mediaContactLastname)).append("\n");
    sb.append("    orderName: ").append(toIndentedString(orderName)).append("\n");
    sb.append("    pinOrderId: ").append(toIndentedString(pinOrderId)).append("\n");
    sb.append("    pmpName: ").append(toIndentedString(pmpName)).append("\n");
    sb.append("    poNumber: ").append(toIndentedString(poNumber)).append("\n");
    sb.append("    salesforceOrderLineId: ").append(toIndentedString(salesforceOrderLineId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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
