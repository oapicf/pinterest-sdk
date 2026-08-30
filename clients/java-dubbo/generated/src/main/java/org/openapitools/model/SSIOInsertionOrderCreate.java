package org.openapitools.model;

import org.openapitools.model.Currency;
import org.openapitools.model.SSIOOrderLineType;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Resource create operation model.
 */
public class SSIOInsertionOrderCreate implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The SFDC id for the terms
   */
  @JsonProperty("accepted_terms_id")
  private String acceptedTermsId;

  /**
   * The UTC timestamp (to the nearest sec) of when terms were accepted
   */
  @JsonProperty("accepted_terms_time")
  private Integer acceptedTermsTime;

  /**
   * URL link for agency
   */
  @JsonProperty("agency_link")
  private String agencyLink;

  /**
   * The billing contact email
   */
  @JsonProperty("billing_contact_email")
  private String billingContactEmail;

  /**
   * The billing contact first name
   */
  @JsonProperty("billing_contact_firstname")
  private String billingContactFirstname;

  /**
   * The billing contact last name
   */
  @JsonProperty("billing_contact_lastname")
  private String billingContactLastname;

  /**
   * The bill-to billing address id
   */
  @JsonProperty("billto_billing_address_id")
  private String billtoBillingAddressId;

  /**
   * The bill-to business address id
   */
  @JsonProperty("billto_business_address_id")
  private String billtoBusinessAddressId;

  /**
   * The bill-to company id
   */
  @JsonProperty("billto_company_id")
  private String billtoCompanyId;

  /**
   * If Budget order line, the budget amount.
   */
  @JsonProperty("budget_amount")
  private Double budgetAmount;

  @JsonProperty("currency_info")
  private Currency currencyInfo;

  /**
   * End date of time period. Format: YYYY-MM-DD
   */
  @JsonProperty("end_date")
  private String endDate;

  /**
   * If Ongoing (perpetual) order line, the estimated monthly spend
   */
  @JsonProperty("estimated_monthly_spend")
  private Double estimatedMonthlySpend;

  /**
   * The media contact email
   */
  @JsonProperty("media_contact_email")
  private String mediaContactEmail;

  /**
   * The media contact first name
   */
  @JsonProperty("media_contact_firstname")
  private String mediaContactFirstname;

  /**
   * The media contact last name
   */
  @JsonProperty("media_contact_lastname")
  private String mediaContactLastname;

  /**
   * Type can be Budget or Perpetual
   */
  @JsonProperty("order_line_type")
  private SSIOOrderLineType orderLineType;

  /**
   * The order name
   */
  @JsonProperty("order_name")
  private String orderName;

  /**
   * The pmp id
   */
  @JsonProperty("pmp_id")
  private String pmpId;

  /**
   * The po number
   */
  @JsonProperty("po_number")
  private String poNumber;

  /**
   * Starting date of time period. Format: YYYY-MM-DD
   */
  @JsonProperty("start_date")
  private String startDate;

  /**
   * The email of user submitting the insertion order
   */
  @JsonProperty("user_email")
  private String userEmail;

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
   * The UTC timestamp (to the nearest sec) of when terms were accepted
   * @return acceptedTermsTime
   */
  public Integer getAcceptedTermsTime() {
    return acceptedTermsTime;
  }

  public void setAcceptedTermsTime(Integer acceptedTermsTime) {
    this.acceptedTermsTime = acceptedTermsTime;
  }

  /**
   * URL link for agency
   * @return agencyLink
   */
  public String getAgencyLink() {
    return agencyLink;
  }

  public void setAgencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
  }

  /**
   * The billing contact email
   * @return billingContactEmail
   */
  public String getBillingContactEmail() {
    return billingContactEmail;
  }

  public void setBillingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
  }

  /**
   * The billing contact first name
   * @return billingContactFirstname
   */
  public String getBillingContactFirstname() {
    return billingContactFirstname;
  }

  public void setBillingContactFirstname(String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
  }

  /**
   * The billing contact last name
   * @return billingContactLastname
   */
  public String getBillingContactLastname() {
    return billingContactLastname;
  }

  public void setBillingContactLastname(String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
  }

  /**
   * The bill-to billing address id
   * @return billtoBillingAddressId
   */
  public String getBilltoBillingAddressId() {
    return billtoBillingAddressId;
  }

  public void setBilltoBillingAddressId(String billtoBillingAddressId) {
    this.billtoBillingAddressId = billtoBillingAddressId;
  }

  /**
   * The bill-to business address id
   * @return billtoBusinessAddressId
   */
  public String getBilltoBusinessAddressId() {
    return billtoBusinessAddressId;
  }

  public void setBilltoBusinessAddressId(String billtoBusinessAddressId) {
    this.billtoBusinessAddressId = billtoBusinessAddressId;
  }

  /**
   * The bill-to company id
   * @return billtoCompanyId
   */
  public String getBilltoCompanyId() {
    return billtoCompanyId;
  }

  public void setBilltoCompanyId(String billtoCompanyId) {
    this.billtoCompanyId = billtoCompanyId;
  }

  /**
   * If Budget order line, the budget amount.
   * @return budgetAmount
   */
  public Double getBudgetAmount() {
    return budgetAmount;
  }

  public void setBudgetAmount(Double budgetAmount) {
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
   * End date of time period. Format: YYYY-MM-DD
   * @return endDate
   */
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   * If Ongoing (perpetual) order line, the estimated monthly spend
   * @return estimatedMonthlySpend
   */
  public Double getEstimatedMonthlySpend() {
    return estimatedMonthlySpend;
  }

  public void setEstimatedMonthlySpend(Double estimatedMonthlySpend) {
    this.estimatedMonthlySpend = estimatedMonthlySpend;
  }

  /**
   * The media contact email
   * @return mediaContactEmail
   */
  public String getMediaContactEmail() {
    return mediaContactEmail;
  }

  public void setMediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
  }

  /**
   * The media contact first name
   * @return mediaContactFirstname
   */
  public String getMediaContactFirstname() {
    return mediaContactFirstname;
  }

  public void setMediaContactFirstname(String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
  }

  /**
   * The media contact last name
   * @return mediaContactLastname
   */
  public String getMediaContactLastname() {
    return mediaContactLastname;
  }

  public void setMediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
  }

  /**
   * Type can be Budget or Perpetual
   * @return orderLineType
   */
  public SSIOOrderLineType getOrderLineType() {
    return orderLineType;
  }

  public void setOrderLineType(SSIOOrderLineType orderLineType) {
    this.orderLineType = orderLineType;
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
   * The pmp id
   * @return pmpId
   */
  public String getPmpId() {
    return pmpId;
  }

  public void setPmpId(String pmpId) {
    this.pmpId = pmpId;
  }

  /**
   * The po number
   * @return poNumber
   */
  public String getPoNumber() {
    return poNumber;
  }

  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }

  /**
   * Starting date of time period. Format: YYYY-MM-DD
   * @return startDate
   */
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * The email of user submitting the insertion order
   * @return userEmail
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
