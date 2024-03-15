package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.Currency;

@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public SSIOOrderLine () {

  }

  public SSIOOrderLine (String salesforceOrderLineId, String adsManagerOrderLineId, String pinOrderId, String lastModifiedDateTime, LocalDate startDate, LocalDate endDate, String billToCompanyName, String billingContactFirstname, String billingContactLastname, String billingContactEmail, String mediaContactEmail, String mediaContactFirstname, String mediaContactLastname, Currency currencyInfo, String agencyLink, String poNumber, String orderName, String pmpName, String acceptedTermsId, String acceptedTermsTime, BigDecimal budgetAmount, BigDecimal estimatedMonthlySpend) {
    this.salesforceOrderLineId = salesforceOrderLineId;
    this.adsManagerOrderLineId = adsManagerOrderLineId;
    this.pinOrderId = pinOrderId;
    this.lastModifiedDateTime = lastModifiedDateTime;
    this.startDate = startDate;
    this.endDate = endDate;
    this.billToCompanyName = billToCompanyName;
    this.billingContactFirstname = billingContactFirstname;
    this.billingContactLastname = billingContactLastname;
    this.billingContactEmail = billingContactEmail;
    this.mediaContactEmail = mediaContactEmail;
    this.mediaContactFirstname = mediaContactFirstname;
    this.mediaContactLastname = mediaContactLastname;
    this.currencyInfo = currencyInfo;
    this.agencyLink = agencyLink;
    this.poNumber = poNumber;
    this.orderName = orderName;
    this.pmpName = pmpName;
    this.acceptedTermsId = acceptedTermsId;
    this.acceptedTermsTime = acceptedTermsTime;
    this.budgetAmount = budgetAmount;
    this.estimatedMonthlySpend = estimatedMonthlySpend;
  }

    
  @JsonProperty("salesforce_order_line_id")
  public String getSalesforceOrderLineId() {
    return salesforceOrderLineId;
  }
  public void setSalesforceOrderLineId(String salesforceOrderLineId) {
    this.salesforceOrderLineId = salesforceOrderLineId;
  }

    
  @JsonProperty("ads_manager_order_line_id")
  public String getAdsManagerOrderLineId() {
    return adsManagerOrderLineId;
  }
  public void setAdsManagerOrderLineId(String adsManagerOrderLineId) {
    this.adsManagerOrderLineId = adsManagerOrderLineId;
  }

    
  @JsonProperty("pin_order_id")
  public String getPinOrderId() {
    return pinOrderId;
  }
  public void setPinOrderId(String pinOrderId) {
    this.pinOrderId = pinOrderId;
  }

    
  @JsonProperty("last_modified_date_time")
  public String getLastModifiedDateTime() {
    return lastModifiedDateTime;
  }
  public void setLastModifiedDateTime(String lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
  }

    
  @JsonProperty("start_date")
  public LocalDate getStartDate() {
    return startDate;
  }
  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

    
  @JsonProperty("end_date")
  public LocalDate getEndDate() {
    return endDate;
  }
  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

    
  @JsonProperty("bill_to_company_name")
  public String getBillToCompanyName() {
    return billToCompanyName;
  }
  public void setBillToCompanyName(String billToCompanyName) {
    this.billToCompanyName = billToCompanyName;
  }

    
  @JsonProperty("billing_contact_firstname")
  public String getBillingContactFirstname() {
    return billingContactFirstname;
  }
  public void setBillingContactFirstname(String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
  }

    
  @JsonProperty("billing_contact_lastname")
  public String getBillingContactLastname() {
    return billingContactLastname;
  }
  public void setBillingContactLastname(String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
  }

    
  @JsonProperty("billing_contact_email")
  public String getBillingContactEmail() {
    return billingContactEmail;
  }
  public void setBillingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
  }

    
  @JsonProperty("media_contact_email")
  public String getMediaContactEmail() {
    return mediaContactEmail;
  }
  public void setMediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
  }

    
  @JsonProperty("media_contact_firstname")
  public String getMediaContactFirstname() {
    return mediaContactFirstname;
  }
  public void setMediaContactFirstname(String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
  }

    
  @JsonProperty("media_contact_lastname")
  public String getMediaContactLastname() {
    return mediaContactLastname;
  }
  public void setMediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
  }

    
  @JsonProperty("currency_info")
  public Currency getCurrencyInfo() {
    return currencyInfo;
  }
  public void setCurrencyInfo(Currency currencyInfo) {
    this.currencyInfo = currencyInfo;
  }

    
  @JsonProperty("agency_link")
  public String getAgencyLink() {
    return agencyLink;
  }
  public void setAgencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
  }

    
  @JsonProperty("po_number")
  public String getPoNumber() {
    return poNumber;
  }
  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }

    
  @JsonProperty("order_name")
  public String getOrderName() {
    return orderName;
  }
  public void setOrderName(String orderName) {
    this.orderName = orderName;
  }

    
  @JsonProperty("pmp_name")
  public String getPmpName() {
    return pmpName;
  }
  public void setPmpName(String pmpName) {
    this.pmpName = pmpName;
  }

    
  @JsonProperty("accepted_terms_id")
  public String getAcceptedTermsId() {
    return acceptedTermsId;
  }
  public void setAcceptedTermsId(String acceptedTermsId) {
    this.acceptedTermsId = acceptedTermsId;
  }

    
  @JsonProperty("accepted_terms_time")
  public String getAcceptedTermsTime() {
    return acceptedTermsTime;
  }
  public void setAcceptedTermsTime(String acceptedTermsTime) {
    this.acceptedTermsTime = acceptedTermsTime;
  }

    
  @JsonProperty("budget_amount")
  public BigDecimal getBudgetAmount() {
    return budgetAmount;
  }
  public void setBudgetAmount(BigDecimal budgetAmount) {
    this.budgetAmount = budgetAmount;
  }

    
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
    return Objects.equals(salesforceOrderLineId, ssIOOrderLine.salesforceOrderLineId) &&
        Objects.equals(adsManagerOrderLineId, ssIOOrderLine.adsManagerOrderLineId) &&
        Objects.equals(pinOrderId, ssIOOrderLine.pinOrderId) &&
        Objects.equals(lastModifiedDateTime, ssIOOrderLine.lastModifiedDateTime) &&
        Objects.equals(startDate, ssIOOrderLine.startDate) &&
        Objects.equals(endDate, ssIOOrderLine.endDate) &&
        Objects.equals(billToCompanyName, ssIOOrderLine.billToCompanyName) &&
        Objects.equals(billingContactFirstname, ssIOOrderLine.billingContactFirstname) &&
        Objects.equals(billingContactLastname, ssIOOrderLine.billingContactLastname) &&
        Objects.equals(billingContactEmail, ssIOOrderLine.billingContactEmail) &&
        Objects.equals(mediaContactEmail, ssIOOrderLine.mediaContactEmail) &&
        Objects.equals(mediaContactFirstname, ssIOOrderLine.mediaContactFirstname) &&
        Objects.equals(mediaContactLastname, ssIOOrderLine.mediaContactLastname) &&
        Objects.equals(currencyInfo, ssIOOrderLine.currencyInfo) &&
        Objects.equals(agencyLink, ssIOOrderLine.agencyLink) &&
        Objects.equals(poNumber, ssIOOrderLine.poNumber) &&
        Objects.equals(orderName, ssIOOrderLine.orderName) &&
        Objects.equals(pmpName, ssIOOrderLine.pmpName) &&
        Objects.equals(acceptedTermsId, ssIOOrderLine.acceptedTermsId) &&
        Objects.equals(acceptedTermsTime, ssIOOrderLine.acceptedTermsTime) &&
        Objects.equals(budgetAmount, ssIOOrderLine.budgetAmount) &&
        Objects.equals(estimatedMonthlySpend, ssIOOrderLine.estimatedMonthlySpend);
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
