package apimodels;

import apimodels.Currency;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * A Salesforce SSIO order line.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class SSIOOrderLine   {
  @JsonProperty("accepted_terms_id")
  
  private String acceptedTermsId;

  @JsonProperty("accepted_terms_time")
  @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})T(\\d{2}):(\\d{2}):(\\d{2})\\.(\\d{3})Z$")

  private String acceptedTermsTime;

  @JsonProperty("ads_manager_order_line_id")
  
  private String adsManagerOrderLineId;

  @JsonProperty("agency_link")
  
  private String agencyLink;

  @JsonProperty("bill_to_company_name")
  
  private String billToCompanyName;

  @JsonProperty("billing_contact_email")
  
  private String billingContactEmail;

  @JsonProperty("billing_contact_firstname")
  
  private String billingContactFirstname;

  @JsonProperty("billing_contact_lastname")
  
  private String billingContactLastname;

  @JsonProperty("budget_amount")
  @Valid

  private BigDecimal budgetAmount;

  @JsonProperty("currency_info")
  @Valid

  private Currency currencyInfo;

  @JsonProperty("end_date")
  @Valid

  private LocalDate endDate;

  @JsonProperty("estimated_monthly_spend")
  @Valid

  private BigDecimal estimatedMonthlySpend;

  @JsonProperty("last_modified_date_time")
  @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})T(\\d{2}):(\\d{2}):(\\d{2})\\.(\\d{3})Z$")

  private String lastModifiedDateTime;

  @JsonProperty("media_contact_email")
  
  private String mediaContactEmail;

  @JsonProperty("media_contact_firstname")
  
  private String mediaContactFirstname;

  @JsonProperty("media_contact_lastname")
  
  private String mediaContactLastname;

  @JsonProperty("order_name")
  
  private String orderName;

  @JsonProperty("pin_order_id")
  
  private String pinOrderId;

  @JsonProperty("pmp_name")
  
  private String pmpName;

  @JsonProperty("po_number")
  
  private String poNumber;

  @JsonProperty("salesforce_order_line_id")
  
  private String salesforceOrderLineId;

  @JsonProperty("start_date")
  @Valid

  private LocalDate startDate;

  public SSIOOrderLine acceptedTermsId(String acceptedTermsId) {
    this.acceptedTermsId = acceptedTermsId;
    return this;
  }

   /**
   * The SFDC id for the terms
   * @return acceptedTermsId
  **/
  public String getAcceptedTermsId() {
    return acceptedTermsId;
  }

  public void setAcceptedTermsId(String acceptedTermsId) {
    this.acceptedTermsId = acceptedTermsId;
  }

  public SSIOOrderLine acceptedTermsTime(String acceptedTermsTime) {
    this.acceptedTermsTime = acceptedTermsTime;
    return this;
  }

   /**
   * The UTC timestamp (to the nearest second) when terms were accepted.
   * @return acceptedTermsTime
  **/
  public String getAcceptedTermsTime() {
    return acceptedTermsTime;
  }

  public void setAcceptedTermsTime(String acceptedTermsTime) {
    this.acceptedTermsTime = acceptedTermsTime;
  }

  public SSIOOrderLine adsManagerOrderLineId(String adsManagerOrderLineId) {
    this.adsManagerOrderLineId = adsManagerOrderLineId;
    return this;
  }

   /**
   * Ads manager order line id
   * @return adsManagerOrderLineId
  **/
  public String getAdsManagerOrderLineId() {
    return adsManagerOrderLineId;
  }

  public void setAdsManagerOrderLineId(String adsManagerOrderLineId) {
    this.adsManagerOrderLineId = adsManagerOrderLineId;
  }

  public SSIOOrderLine agencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
    return this;
  }

   /**
   * Agency link
   * @return agencyLink
  **/
  public String getAgencyLink() {
    return agencyLink;
  }

  public void setAgencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
  }

  public SSIOOrderLine billToCompanyName(String billToCompanyName) {
    this.billToCompanyName = billToCompanyName;
    return this;
  }

   /**
   * Bill-to company name
   * @return billToCompanyName
  **/
  public String getBillToCompanyName() {
    return billToCompanyName;
  }

  public void setBillToCompanyName(String billToCompanyName) {
    this.billToCompanyName = billToCompanyName;
  }

  public SSIOOrderLine billingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
    return this;
  }

   /**
   * Billing contact email
   * @return billingContactEmail
  **/
  public String getBillingContactEmail() {
    return billingContactEmail;
  }

  public void setBillingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
  }

  public SSIOOrderLine billingContactFirstname(String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
    return this;
  }

   /**
   * Billing contact first name
   * @return billingContactFirstname
  **/
  public String getBillingContactFirstname() {
    return billingContactFirstname;
  }

  public void setBillingContactFirstname(String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
  }

  public SSIOOrderLine billingContactLastname(String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
    return this;
  }

   /**
   * Billing contact last name
   * @return billingContactLastname
  **/
  public String getBillingContactLastname() {
    return billingContactLastname;
  }

  public void setBillingContactLastname(String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
  }

  public SSIOOrderLine budgetAmount(BigDecimal budgetAmount) {
    this.budgetAmount = budgetAmount;
    return this;
  }

   /**
   * If budget order line, the budget amount.
   * @return budgetAmount
  **/
  public BigDecimal getBudgetAmount() {
    return budgetAmount;
  }

  public void setBudgetAmount(BigDecimal budgetAmount) {
    this.budgetAmount = budgetAmount;
  }

  public SSIOOrderLine currencyInfo(Currency currencyInfo) {
    this.currencyInfo = currencyInfo;
    return this;
  }

   /**
   * Get currencyInfo
   * @return currencyInfo
  **/
  public Currency getCurrencyInfo() {
    return currencyInfo;
  }

  public void setCurrencyInfo(Currency currencyInfo) {
    this.currencyInfo = currencyInfo;
  }

  public SSIOOrderLine endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * End date of the order line.
   * @return endDate
  **/
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public SSIOOrderLine estimatedMonthlySpend(BigDecimal estimatedMonthlySpend) {
    this.estimatedMonthlySpend = estimatedMonthlySpend;
    return this;
  }

   /**
   * If ongoing (perpetual) order line, the estimated monthly spend.
   * @return estimatedMonthlySpend
  **/
  public BigDecimal getEstimatedMonthlySpend() {
    return estimatedMonthlySpend;
  }

  public void setEstimatedMonthlySpend(BigDecimal estimatedMonthlySpend) {
    this.estimatedMonthlySpend = estimatedMonthlySpend;
  }

  public SSIOOrderLine lastModifiedDateTime(String lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
    return this;
  }

   /**
   * Last modified date.
   * @return lastModifiedDateTime
  **/
  public String getLastModifiedDateTime() {
    return lastModifiedDateTime;
  }

  public void setLastModifiedDateTime(String lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
  }

  public SSIOOrderLine mediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
    return this;
  }

   /**
   * Billing media email
   * @return mediaContactEmail
  **/
  public String getMediaContactEmail() {
    return mediaContactEmail;
  }

  public void setMediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
  }

  public SSIOOrderLine mediaContactFirstname(String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
    return this;
  }

   /**
   * Billing media contact first name
   * @return mediaContactFirstname
  **/
  public String getMediaContactFirstname() {
    return mediaContactFirstname;
  }

  public void setMediaContactFirstname(String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
  }

  public SSIOOrderLine mediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
    return this;
  }

   /**
   * Billing media contact last name
   * @return mediaContactLastname
  **/
  public String getMediaContactLastname() {
    return mediaContactLastname;
  }

  public void setMediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
  }

  public SSIOOrderLine orderName(String orderName) {
    this.orderName = orderName;
    return this;
  }

   /**
   * The order name
   * @return orderName
  **/
  public String getOrderName() {
    return orderName;
  }

  public void setOrderName(String orderName) {
    this.orderName = orderName;
  }

  public SSIOOrderLine pinOrderId(String pinOrderId) {
    this.pinOrderId = pinOrderId;
    return this;
  }

   /**
   * The pin order id associated with the order line in SFDC
   * @return pinOrderId
  **/
  public String getPinOrderId() {
    return pinOrderId;
  }

  public void setPinOrderId(String pinOrderId) {
    this.pinOrderId = pinOrderId;
  }

  public SSIOOrderLine pmpName(String pmpName) {
    this.pmpName = pmpName;
    return this;
  }

   /**
   * The Pinterest marketing partner name
   * @return pmpName
  **/
  public String getPmpName() {
    return pmpName;
  }

  public void setPmpName(String pmpName) {
    this.pmpName = pmpName;
  }

  public SSIOOrderLine poNumber(String poNumber) {
    this.poNumber = poNumber;
    return this;
  }

   /**
   * The PO number
   * @return poNumber
  **/
  public String getPoNumber() {
    return poNumber;
  }

  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }

  public SSIOOrderLine salesforceOrderLineId(String salesforceOrderLineId) {
    this.salesforceOrderLineId = salesforceOrderLineId;
    return this;
  }

   /**
   * Order line id in SFDC
   * @return salesforceOrderLineId
  **/
  public String getSalesforceOrderLineId() {
    return salesforceOrderLineId;
  }

  public void setSalesforceOrderLineId(String salesforceOrderLineId) {
    this.salesforceOrderLineId = salesforceOrderLineId;
  }

  public SSIOOrderLine startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Start date of the order line.
   * @return startDate
  **/
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
    return Objects.equals(acceptedTermsId, ssIOOrderLine.acceptedTermsId) &&
        Objects.equals(acceptedTermsTime, ssIOOrderLine.acceptedTermsTime) &&
        Objects.equals(adsManagerOrderLineId, ssIOOrderLine.adsManagerOrderLineId) &&
        Objects.equals(agencyLink, ssIOOrderLine.agencyLink) &&
        Objects.equals(billToCompanyName, ssIOOrderLine.billToCompanyName) &&
        Objects.equals(billingContactEmail, ssIOOrderLine.billingContactEmail) &&
        Objects.equals(billingContactFirstname, ssIOOrderLine.billingContactFirstname) &&
        Objects.equals(billingContactLastname, ssIOOrderLine.billingContactLastname) &&
        Objects.equals(budgetAmount, ssIOOrderLine.budgetAmount) &&
        Objects.equals(currencyInfo, ssIOOrderLine.currencyInfo) &&
        Objects.equals(endDate, ssIOOrderLine.endDate) &&
        Objects.equals(estimatedMonthlySpend, ssIOOrderLine.estimatedMonthlySpend) &&
        Objects.equals(lastModifiedDateTime, ssIOOrderLine.lastModifiedDateTime) &&
        Objects.equals(mediaContactEmail, ssIOOrderLine.mediaContactEmail) &&
        Objects.equals(mediaContactFirstname, ssIOOrderLine.mediaContactFirstname) &&
        Objects.equals(mediaContactLastname, ssIOOrderLine.mediaContactLastname) &&
        Objects.equals(orderName, ssIOOrderLine.orderName) &&
        Objects.equals(pinOrderId, ssIOOrderLine.pinOrderId) &&
        Objects.equals(pmpName, ssIOOrderLine.pmpName) &&
        Objects.equals(poNumber, ssIOOrderLine.poNumber) &&
        Objects.equals(salesforceOrderLineId, ssIOOrderLine.salesforceOrderLineId) &&
        Objects.equals(startDate, ssIOOrderLine.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptedTermsId, acceptedTermsTime, adsManagerOrderLineId, agencyLink, billToCompanyName, billingContactEmail, billingContactFirstname, billingContactLastname, budgetAmount, currencyInfo, endDate, estimatedMonthlySpend, lastModifiedDateTime, mediaContactEmail, mediaContactFirstname, mediaContactLastname, orderName, pinOrderId, pmpName, poNumber, salesforceOrderLineId, startDate);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

