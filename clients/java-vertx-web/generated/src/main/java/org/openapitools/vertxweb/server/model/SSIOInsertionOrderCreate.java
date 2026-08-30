package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.Currency;
import org.openapitools.vertxweb.server.model.SSIOOrderLineType;

/**
 * Resource create operation model.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SSIOInsertionOrderCreate   {
  
  private String acceptedTermsId;
  private Integer acceptedTermsTime;
  private String agencyLink;
  private String billingContactEmail;
  private String billingContactFirstname;
  private String billingContactLastname;
  private String billtoBillingAddressId;
  private String billtoBusinessAddressId;
  private String billtoCompanyId;
  private Double budgetAmount;
  private Currency currencyInfo;
  private String endDate;
  private Double estimatedMonthlySpend;
  private String mediaContactEmail;
  private String mediaContactFirstname;
  private String mediaContactLastname;
  private SSIOOrderLineType orderLineType;
  private String orderName;
  private String pmpId;
  private String poNumber;
  private String startDate;
  private String userEmail;

  public SSIOInsertionOrderCreate () {

  }

  public SSIOInsertionOrderCreate (String acceptedTermsId, Integer acceptedTermsTime, String agencyLink, String billingContactEmail, String billingContactFirstname, String billingContactLastname, String billtoBillingAddressId, String billtoBusinessAddressId, String billtoCompanyId, Double budgetAmount, Currency currencyInfo, String endDate, Double estimatedMonthlySpend, String mediaContactEmail, String mediaContactFirstname, String mediaContactLastname, SSIOOrderLineType orderLineType, String orderName, String pmpId, String poNumber, String startDate, String userEmail) {
    this.acceptedTermsId = acceptedTermsId;
    this.acceptedTermsTime = acceptedTermsTime;
    this.agencyLink = agencyLink;
    this.billingContactEmail = billingContactEmail;
    this.billingContactFirstname = billingContactFirstname;
    this.billingContactLastname = billingContactLastname;
    this.billtoBillingAddressId = billtoBillingAddressId;
    this.billtoBusinessAddressId = billtoBusinessAddressId;
    this.billtoCompanyId = billtoCompanyId;
    this.budgetAmount = budgetAmount;
    this.currencyInfo = currencyInfo;
    this.endDate = endDate;
    this.estimatedMonthlySpend = estimatedMonthlySpend;
    this.mediaContactEmail = mediaContactEmail;
    this.mediaContactFirstname = mediaContactFirstname;
    this.mediaContactLastname = mediaContactLastname;
    this.orderLineType = orderLineType;
    this.orderName = orderName;
    this.pmpId = pmpId;
    this.poNumber = poNumber;
    this.startDate = startDate;
    this.userEmail = userEmail;
  }

    
  @JsonProperty("accepted_terms_id")
  public String getAcceptedTermsId() {
    return acceptedTermsId;
  }
  public void setAcceptedTermsId(String acceptedTermsId) {
    this.acceptedTermsId = acceptedTermsId;
  }

    
  @JsonProperty("accepted_terms_time")
  public Integer getAcceptedTermsTime() {
    return acceptedTermsTime;
  }
  public void setAcceptedTermsTime(Integer acceptedTermsTime) {
    this.acceptedTermsTime = acceptedTermsTime;
  }

    
  @JsonProperty("agency_link")
  public String getAgencyLink() {
    return agencyLink;
  }
  public void setAgencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
  }

    
  @JsonProperty("billing_contact_email")
  public String getBillingContactEmail() {
    return billingContactEmail;
  }
  public void setBillingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
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

    
  @JsonProperty("billto_billing_address_id")
  public String getBilltoBillingAddressId() {
    return billtoBillingAddressId;
  }
  public void setBilltoBillingAddressId(String billtoBillingAddressId) {
    this.billtoBillingAddressId = billtoBillingAddressId;
  }

    
  @JsonProperty("billto_business_address_id")
  public String getBilltoBusinessAddressId() {
    return billtoBusinessAddressId;
  }
  public void setBilltoBusinessAddressId(String billtoBusinessAddressId) {
    this.billtoBusinessAddressId = billtoBusinessAddressId;
  }

    
  @JsonProperty("billto_company_id")
  public String getBilltoCompanyId() {
    return billtoCompanyId;
  }
  public void setBilltoCompanyId(String billtoCompanyId) {
    this.billtoCompanyId = billtoCompanyId;
  }

    
  @JsonProperty("budget_amount")
  public Double getBudgetAmount() {
    return budgetAmount;
  }
  public void setBudgetAmount(Double budgetAmount) {
    this.budgetAmount = budgetAmount;
  }

    
  @JsonProperty("currency_info")
  public Currency getCurrencyInfo() {
    return currencyInfo;
  }
  public void setCurrencyInfo(Currency currencyInfo) {
    this.currencyInfo = currencyInfo;
  }

    
  @JsonProperty("end_date")
  public String getEndDate() {
    return endDate;
  }
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

    
  @JsonProperty("estimated_monthly_spend")
  public Double getEstimatedMonthlySpend() {
    return estimatedMonthlySpend;
  }
  public void setEstimatedMonthlySpend(Double estimatedMonthlySpend) {
    this.estimatedMonthlySpend = estimatedMonthlySpend;
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

    
  @JsonProperty("order_line_type")
  public SSIOOrderLineType getOrderLineType() {
    return orderLineType;
  }
  public void setOrderLineType(SSIOOrderLineType orderLineType) {
    this.orderLineType = orderLineType;
  }

    
  @JsonProperty("order_name")
  public String getOrderName() {
    return orderName;
  }
  public void setOrderName(String orderName) {
    this.orderName = orderName;
  }

    
  @JsonProperty("pmp_id")
  public String getPmpId() {
    return pmpId;
  }
  public void setPmpId(String pmpId) {
    this.pmpId = pmpId;
  }

    
  @JsonProperty("po_number")
  public String getPoNumber() {
    return poNumber;
  }
  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }

    
  @JsonProperty("start_date")
  public String getStartDate() {
    return startDate;
  }
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

    
  @JsonProperty("user_email")
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
    SSIOInsertionOrderCreate ssIOInsertionOrderCreate = (SSIOInsertionOrderCreate) o;
    return Objects.equals(acceptedTermsId, ssIOInsertionOrderCreate.acceptedTermsId) &&
        Objects.equals(acceptedTermsTime, ssIOInsertionOrderCreate.acceptedTermsTime) &&
        Objects.equals(agencyLink, ssIOInsertionOrderCreate.agencyLink) &&
        Objects.equals(billingContactEmail, ssIOInsertionOrderCreate.billingContactEmail) &&
        Objects.equals(billingContactFirstname, ssIOInsertionOrderCreate.billingContactFirstname) &&
        Objects.equals(billingContactLastname, ssIOInsertionOrderCreate.billingContactLastname) &&
        Objects.equals(billtoBillingAddressId, ssIOInsertionOrderCreate.billtoBillingAddressId) &&
        Objects.equals(billtoBusinessAddressId, ssIOInsertionOrderCreate.billtoBusinessAddressId) &&
        Objects.equals(billtoCompanyId, ssIOInsertionOrderCreate.billtoCompanyId) &&
        Objects.equals(budgetAmount, ssIOInsertionOrderCreate.budgetAmount) &&
        Objects.equals(currencyInfo, ssIOInsertionOrderCreate.currencyInfo) &&
        Objects.equals(endDate, ssIOInsertionOrderCreate.endDate) &&
        Objects.equals(estimatedMonthlySpend, ssIOInsertionOrderCreate.estimatedMonthlySpend) &&
        Objects.equals(mediaContactEmail, ssIOInsertionOrderCreate.mediaContactEmail) &&
        Objects.equals(mediaContactFirstname, ssIOInsertionOrderCreate.mediaContactFirstname) &&
        Objects.equals(mediaContactLastname, ssIOInsertionOrderCreate.mediaContactLastname) &&
        Objects.equals(orderLineType, ssIOInsertionOrderCreate.orderLineType) &&
        Objects.equals(orderName, ssIOInsertionOrderCreate.orderName) &&
        Objects.equals(pmpId, ssIOInsertionOrderCreate.pmpId) &&
        Objects.equals(poNumber, ssIOInsertionOrderCreate.poNumber) &&
        Objects.equals(startDate, ssIOInsertionOrderCreate.startDate) &&
        Objects.equals(userEmail, ssIOInsertionOrderCreate.userEmail);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
