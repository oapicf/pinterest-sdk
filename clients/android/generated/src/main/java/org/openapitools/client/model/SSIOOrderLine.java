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
import java.util.Date;
import org.openapitools.client.model.Currency;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class SSIOOrderLine {
  
  @SerializedName("salesforce_order_line_id")
  private String salesforceOrderLineId = null;
  @SerializedName("ads_manager_order_line_id")
  private String adsManagerOrderLineId = null;
  @SerializedName("pin_order_id")
  private String pinOrderId = null;
  @SerializedName("last_modified_date_time")
  private String lastModifiedDateTime = null;
  @SerializedName("start_date")
  private Date startDate = null;
  @SerializedName("end_date")
  private Date endDate = null;
  @SerializedName("bill_to_company_name")
  private String billToCompanyName = null;
  @SerializedName("billing_contact_firstname")
  private String billingContactFirstname = null;
  @SerializedName("billing_contact_lastname")
  private String billingContactLastname = null;
  @SerializedName("billing_contact_email")
  private String billingContactEmail = null;
  @SerializedName("media_contact_email")
  private String mediaContactEmail = null;
  @SerializedName("media_contact_firstname")
  private String mediaContactFirstname = null;
  @SerializedName("media_contact_lastname")
  private String mediaContactLastname = null;
  @SerializedName("currency_info")
  private Currency currencyInfo = null;
  @SerializedName("agency_link")
  private String agencyLink = null;
  @SerializedName("po_number")
  private String poNumber = null;
  @SerializedName("order_name")
  private String orderName = null;
  @SerializedName("pmp_name")
  private String pmpName = null;
  @SerializedName("accepted_terms_id")
  private String acceptedTermsId = null;
  @SerializedName("accepted_terms_time")
  private String acceptedTermsTime = null;
  @SerializedName("budget_amount")
  private BigDecimal budgetAmount = null;
  @SerializedName("estimated_monthly_spend")
  private BigDecimal estimatedMonthlySpend = null;

  /**
   * OrderLineId in SFDC
   **/
  @ApiModelProperty(value = "OrderLineId in SFDC")
  public String getSalesforceOrderLineId() {
    return salesforceOrderLineId;
  }
  public void setSalesforceOrderLineId(String salesforceOrderLineId) {
    this.salesforceOrderLineId = salesforceOrderLineId;
  }

  /**
   * Ads manager OrderLineId
   **/
  @ApiModelProperty(value = "Ads manager OrderLineId")
  public String getAdsManagerOrderLineId() {
    return adsManagerOrderLineId;
  }
  public void setAdsManagerOrderLineId(String adsManagerOrderLineId) {
    this.adsManagerOrderLineId = adsManagerOrderLineId;
  }

  /**
   * The pin order id associated with the order line in SFDC
   **/
  @ApiModelProperty(value = "The pin order id associated with the order line in SFDC")
  public String getPinOrderId() {
    return pinOrderId;
  }
  public void setPinOrderId(String pinOrderId) {
    this.pinOrderId = pinOrderId;
  }

  /**
   * Last modified date.
   **/
  @ApiModelProperty(value = "Last modified date.")
  public String getLastModifiedDateTime() {
    return lastModifiedDateTime;
  }
  public void setLastModifiedDateTime(String lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
  }

  /**
   * Start date of the order line.
   **/
  @ApiModelProperty(value = "Start date of the order line.")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  /**
   * End date of the order line.
   **/
  @ApiModelProperty(value = "End date of the order line.")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  /**
   * Bill To Company name
   **/
  @ApiModelProperty(value = "Bill To Company name")
  public String getBillToCompanyName() {
    return billToCompanyName;
  }
  public void setBillToCompanyName(String billToCompanyName) {
    this.billToCompanyName = billToCompanyName;
  }

  /**
   * Billing contact first name
   **/
  @ApiModelProperty(value = "Billing contact first name")
  public String getBillingContactFirstname() {
    return billingContactFirstname;
  }
  public void setBillingContactFirstname(String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
  }

  /**
   * Billing contact last name
   **/
  @ApiModelProperty(value = "Billing contact last name")
  public String getBillingContactLastname() {
    return billingContactLastname;
  }
  public void setBillingContactLastname(String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
  }

  /**
   * Billing contact email
   **/
  @ApiModelProperty(value = "Billing contact email")
  public String getBillingContactEmail() {
    return billingContactEmail;
  }
  public void setBillingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
  }

  /**
   * Billing media email
   **/
  @ApiModelProperty(value = "Billing media email")
  public String getMediaContactEmail() {
    return mediaContactEmail;
  }
  public void setMediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
  }

  /**
   * Billing contact first name
   **/
  @ApiModelProperty(value = "Billing contact first name")
  public String getMediaContactFirstname() {
    return mediaContactFirstname;
  }
  public void setMediaContactFirstname(String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
  }

  /**
   * Billing contact first name
   **/
  @ApiModelProperty(value = "Billing contact first name")
  public String getMediaContactLastname() {
    return mediaContactLastname;
  }
  public void setMediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Currency getCurrencyInfo() {
    return currencyInfo;
  }
  public void setCurrencyInfo(Currency currencyInfo) {
    this.currencyInfo = currencyInfo;
  }

  /**
   * Agency link
   **/
  @ApiModelProperty(value = "Agency link")
  public String getAgencyLink() {
    return agencyLink;
  }
  public void setAgencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
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
   * The order name
   **/
  @ApiModelProperty(value = "The order name")
  public String getOrderName() {
    return orderName;
  }
  public void setOrderName(String orderName) {
    this.orderName = orderName;
  }

  /**
   * The Pinterest marketing partner name
   **/
  @ApiModelProperty(value = "The Pinterest marketing partner name")
  public String getPmpName() {
    return pmpName;
  }
  public void setPmpName(String pmpName) {
    this.pmpName = pmpName;
  }

  /**
   * The SFDC id for the terms
   **/
  @ApiModelProperty(value = "The SFDC id for the terms")
  public String getAcceptedTermsId() {
    return acceptedTermsId;
  }
  public void setAcceptedTermsId(String acceptedTermsId) {
    this.acceptedTermsId = acceptedTermsId;
  }

  /**
   * The UTC timestamp (to the nearest sec) of when terms were accepted
   **/
  @ApiModelProperty(value = "The UTC timestamp (to the nearest sec) of when terms were accepted")
  public String getAcceptedTermsTime() {
    return acceptedTermsTime;
  }
  public void setAcceptedTermsTime(String acceptedTermsTime) {
    this.acceptedTermsTime = acceptedTermsTime;
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
   * If Ongoing (perpetual) order line, the estimated monthly spend
   **/
  @ApiModelProperty(value = "If Ongoing (perpetual) order line, the estimated monthly spend")
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
    SSIOOrderLine sSIOOrderLine = (SSIOOrderLine) o;
    return (this.salesforceOrderLineId == null ? sSIOOrderLine.salesforceOrderLineId == null : this.salesforceOrderLineId.equals(sSIOOrderLine.salesforceOrderLineId)) &&
        (this.adsManagerOrderLineId == null ? sSIOOrderLine.adsManagerOrderLineId == null : this.adsManagerOrderLineId.equals(sSIOOrderLine.adsManagerOrderLineId)) &&
        (this.pinOrderId == null ? sSIOOrderLine.pinOrderId == null : this.pinOrderId.equals(sSIOOrderLine.pinOrderId)) &&
        (this.lastModifiedDateTime == null ? sSIOOrderLine.lastModifiedDateTime == null : this.lastModifiedDateTime.equals(sSIOOrderLine.lastModifiedDateTime)) &&
        (this.startDate == null ? sSIOOrderLine.startDate == null : this.startDate.equals(sSIOOrderLine.startDate)) &&
        (this.endDate == null ? sSIOOrderLine.endDate == null : this.endDate.equals(sSIOOrderLine.endDate)) &&
        (this.billToCompanyName == null ? sSIOOrderLine.billToCompanyName == null : this.billToCompanyName.equals(sSIOOrderLine.billToCompanyName)) &&
        (this.billingContactFirstname == null ? sSIOOrderLine.billingContactFirstname == null : this.billingContactFirstname.equals(sSIOOrderLine.billingContactFirstname)) &&
        (this.billingContactLastname == null ? sSIOOrderLine.billingContactLastname == null : this.billingContactLastname.equals(sSIOOrderLine.billingContactLastname)) &&
        (this.billingContactEmail == null ? sSIOOrderLine.billingContactEmail == null : this.billingContactEmail.equals(sSIOOrderLine.billingContactEmail)) &&
        (this.mediaContactEmail == null ? sSIOOrderLine.mediaContactEmail == null : this.mediaContactEmail.equals(sSIOOrderLine.mediaContactEmail)) &&
        (this.mediaContactFirstname == null ? sSIOOrderLine.mediaContactFirstname == null : this.mediaContactFirstname.equals(sSIOOrderLine.mediaContactFirstname)) &&
        (this.mediaContactLastname == null ? sSIOOrderLine.mediaContactLastname == null : this.mediaContactLastname.equals(sSIOOrderLine.mediaContactLastname)) &&
        (this.currencyInfo == null ? sSIOOrderLine.currencyInfo == null : this.currencyInfo.equals(sSIOOrderLine.currencyInfo)) &&
        (this.agencyLink == null ? sSIOOrderLine.agencyLink == null : this.agencyLink.equals(sSIOOrderLine.agencyLink)) &&
        (this.poNumber == null ? sSIOOrderLine.poNumber == null : this.poNumber.equals(sSIOOrderLine.poNumber)) &&
        (this.orderName == null ? sSIOOrderLine.orderName == null : this.orderName.equals(sSIOOrderLine.orderName)) &&
        (this.pmpName == null ? sSIOOrderLine.pmpName == null : this.pmpName.equals(sSIOOrderLine.pmpName)) &&
        (this.acceptedTermsId == null ? sSIOOrderLine.acceptedTermsId == null : this.acceptedTermsId.equals(sSIOOrderLine.acceptedTermsId)) &&
        (this.acceptedTermsTime == null ? sSIOOrderLine.acceptedTermsTime == null : this.acceptedTermsTime.equals(sSIOOrderLine.acceptedTermsTime)) &&
        (this.budgetAmount == null ? sSIOOrderLine.budgetAmount == null : this.budgetAmount.equals(sSIOOrderLine.budgetAmount)) &&
        (this.estimatedMonthlySpend == null ? sSIOOrderLine.estimatedMonthlySpend == null : this.estimatedMonthlySpend.equals(sSIOOrderLine.estimatedMonthlySpend));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.salesforceOrderLineId == null ? 0: this.salesforceOrderLineId.hashCode());
    result = 31 * result + (this.adsManagerOrderLineId == null ? 0: this.adsManagerOrderLineId.hashCode());
    result = 31 * result + (this.pinOrderId == null ? 0: this.pinOrderId.hashCode());
    result = 31 * result + (this.lastModifiedDateTime == null ? 0: this.lastModifiedDateTime.hashCode());
    result = 31 * result + (this.startDate == null ? 0: this.startDate.hashCode());
    result = 31 * result + (this.endDate == null ? 0: this.endDate.hashCode());
    result = 31 * result + (this.billToCompanyName == null ? 0: this.billToCompanyName.hashCode());
    result = 31 * result + (this.billingContactFirstname == null ? 0: this.billingContactFirstname.hashCode());
    result = 31 * result + (this.billingContactLastname == null ? 0: this.billingContactLastname.hashCode());
    result = 31 * result + (this.billingContactEmail == null ? 0: this.billingContactEmail.hashCode());
    result = 31 * result + (this.mediaContactEmail == null ? 0: this.mediaContactEmail.hashCode());
    result = 31 * result + (this.mediaContactFirstname == null ? 0: this.mediaContactFirstname.hashCode());
    result = 31 * result + (this.mediaContactLastname == null ? 0: this.mediaContactLastname.hashCode());
    result = 31 * result + (this.currencyInfo == null ? 0: this.currencyInfo.hashCode());
    result = 31 * result + (this.agencyLink == null ? 0: this.agencyLink.hashCode());
    result = 31 * result + (this.poNumber == null ? 0: this.poNumber.hashCode());
    result = 31 * result + (this.orderName == null ? 0: this.orderName.hashCode());
    result = 31 * result + (this.pmpName == null ? 0: this.pmpName.hashCode());
    result = 31 * result + (this.acceptedTermsId == null ? 0: this.acceptedTermsId.hashCode());
    result = 31 * result + (this.acceptedTermsTime == null ? 0: this.acceptedTermsTime.hashCode());
    result = 31 * result + (this.budgetAmount == null ? 0: this.budgetAmount.hashCode());
    result = 31 * result + (this.estimatedMonthlySpend == null ? 0: this.estimatedMonthlySpend.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSIOOrderLine {\n");
    
    sb.append("  salesforceOrderLineId: ").append(salesforceOrderLineId).append("\n");
    sb.append("  adsManagerOrderLineId: ").append(adsManagerOrderLineId).append("\n");
    sb.append("  pinOrderId: ").append(pinOrderId).append("\n");
    sb.append("  lastModifiedDateTime: ").append(lastModifiedDateTime).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("  billToCompanyName: ").append(billToCompanyName).append("\n");
    sb.append("  billingContactFirstname: ").append(billingContactFirstname).append("\n");
    sb.append("  billingContactLastname: ").append(billingContactLastname).append("\n");
    sb.append("  billingContactEmail: ").append(billingContactEmail).append("\n");
    sb.append("  mediaContactEmail: ").append(mediaContactEmail).append("\n");
    sb.append("  mediaContactFirstname: ").append(mediaContactFirstname).append("\n");
    sb.append("  mediaContactLastname: ").append(mediaContactLastname).append("\n");
    sb.append("  currencyInfo: ").append(currencyInfo).append("\n");
    sb.append("  agencyLink: ").append(agencyLink).append("\n");
    sb.append("  poNumber: ").append(poNumber).append("\n");
    sb.append("  orderName: ").append(orderName).append("\n");
    sb.append("  pmpName: ").append(pmpName).append("\n");
    sb.append("  acceptedTermsId: ").append(acceptedTermsId).append("\n");
    sb.append("  acceptedTermsTime: ").append(acceptedTermsTime).append("\n");
    sb.append("  budgetAmount: ").append(budgetAmount).append("\n");
    sb.append("  estimatedMonthlySpend: ").append(estimatedMonthlySpend).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
