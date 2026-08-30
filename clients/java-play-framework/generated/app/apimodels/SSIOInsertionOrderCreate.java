package apimodels;

import apimodels.Currency;
import apimodels.SSIOOrderLineType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Resource create operation model.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class SSIOInsertionOrderCreate   {
  @JsonProperty("accepted_terms_id")
  @NotNull

  private String acceptedTermsId;

  @JsonProperty("accepted_terms_time")
  
  private Integer acceptedTermsTime;

  @JsonProperty("agency_link")
  
  private String agencyLink;

  @JsonProperty("billing_contact_email")
  @NotNull

  private String billingContactEmail;

  @JsonProperty("billing_contact_firstname")
  @NotNull

  private String billingContactFirstname;

  @JsonProperty("billing_contact_lastname")
  @NotNull

  private String billingContactLastname;

  @JsonProperty("billto_billing_address_id")
  @NotNull

  private String billtoBillingAddressId;

  @JsonProperty("billto_business_address_id")
  @NotNull

  private String billtoBusinessAddressId;

  @JsonProperty("billto_company_id")
  @NotNull

  private String billtoCompanyId;

  @JsonProperty("budget_amount")
  
  private Double budgetAmount;

  @JsonProperty("currency_info")
  @NotNull
@Valid

  private Currency currencyInfo;

  @JsonProperty("end_date")
  @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")

  private String endDate;

  @JsonProperty("estimated_monthly_spend")
  
  private Double estimatedMonthlySpend;

  @JsonProperty("media_contact_email")
  @NotNull

  private String mediaContactEmail;

  @JsonProperty("media_contact_firstname")
  @NotNull

  private String mediaContactFirstname;

  @JsonProperty("media_contact_lastname")
  @NotNull

  private String mediaContactLastname;

  @JsonProperty("order_line_type")
  @NotNull
@Valid

  private SSIOOrderLineType orderLineType;

  @JsonProperty("order_name")
  @NotNull

  private String orderName;

  @JsonProperty("pmp_id")
  @NotNull

  private String pmpId;

  @JsonProperty("po_number")
  @NotNull

  private String poNumber;

  @JsonProperty("start_date")
  @NotNull
@Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")

  private String startDate;

  @JsonProperty("user_email")
  
  private String userEmail;

  public SSIOInsertionOrderCreate acceptedTermsId(String acceptedTermsId) {
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

  public SSIOInsertionOrderCreate acceptedTermsTime(Integer acceptedTermsTime) {
    this.acceptedTermsTime = acceptedTermsTime;
    return this;
  }

   /**
   * The UTC timestamp (to the nearest sec) of when terms were accepted
   * @return acceptedTermsTime
  **/
  public Integer getAcceptedTermsTime() {
    return acceptedTermsTime;
  }

  public void setAcceptedTermsTime(Integer acceptedTermsTime) {
    this.acceptedTermsTime = acceptedTermsTime;
  }

  public SSIOInsertionOrderCreate agencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
    return this;
  }

   /**
   * URL link for agency
   * @return agencyLink
  **/
  public String getAgencyLink() {
    return agencyLink;
  }

  public void setAgencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
  }

  public SSIOInsertionOrderCreate billingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
    return this;
  }

   /**
   * The billing contact email
   * @return billingContactEmail
  **/
  public String getBillingContactEmail() {
    return billingContactEmail;
  }

  public void setBillingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
  }

  public SSIOInsertionOrderCreate billingContactFirstname(String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
    return this;
  }

   /**
   * The billing contact first name
   * @return billingContactFirstname
  **/
  public String getBillingContactFirstname() {
    return billingContactFirstname;
  }

  public void setBillingContactFirstname(String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
  }

  public SSIOInsertionOrderCreate billingContactLastname(String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
    return this;
  }

   /**
   * The billing contact last name
   * @return billingContactLastname
  **/
  public String getBillingContactLastname() {
    return billingContactLastname;
  }

  public void setBillingContactLastname(String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
  }

  public SSIOInsertionOrderCreate billtoBillingAddressId(String billtoBillingAddressId) {
    this.billtoBillingAddressId = billtoBillingAddressId;
    return this;
  }

   /**
   * The bill-to billing address id
   * @return billtoBillingAddressId
  **/
  public String getBilltoBillingAddressId() {
    return billtoBillingAddressId;
  }

  public void setBilltoBillingAddressId(String billtoBillingAddressId) {
    this.billtoBillingAddressId = billtoBillingAddressId;
  }

  public SSIOInsertionOrderCreate billtoBusinessAddressId(String billtoBusinessAddressId) {
    this.billtoBusinessAddressId = billtoBusinessAddressId;
    return this;
  }

   /**
   * The bill-to business address id
   * @return billtoBusinessAddressId
  **/
  public String getBilltoBusinessAddressId() {
    return billtoBusinessAddressId;
  }

  public void setBilltoBusinessAddressId(String billtoBusinessAddressId) {
    this.billtoBusinessAddressId = billtoBusinessAddressId;
  }

  public SSIOInsertionOrderCreate billtoCompanyId(String billtoCompanyId) {
    this.billtoCompanyId = billtoCompanyId;
    return this;
  }

   /**
   * The bill-to company id
   * @return billtoCompanyId
  **/
  public String getBilltoCompanyId() {
    return billtoCompanyId;
  }

  public void setBilltoCompanyId(String billtoCompanyId) {
    this.billtoCompanyId = billtoCompanyId;
  }

  public SSIOInsertionOrderCreate budgetAmount(Double budgetAmount) {
    this.budgetAmount = budgetAmount;
    return this;
  }

   /**
   * If Budget order line, the budget amount.
   * @return budgetAmount
  **/
  public Double getBudgetAmount() {
    return budgetAmount;
  }

  public void setBudgetAmount(Double budgetAmount) {
    this.budgetAmount = budgetAmount;
  }

  public SSIOInsertionOrderCreate currencyInfo(Currency currencyInfo) {
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

  public SSIOInsertionOrderCreate endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * End date of time period. Format: YYYY-MM-DD
   * @return endDate
  **/
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public SSIOInsertionOrderCreate estimatedMonthlySpend(Double estimatedMonthlySpend) {
    this.estimatedMonthlySpend = estimatedMonthlySpend;
    return this;
  }

   /**
   * If Ongoing (perpetual) order line, the estimated monthly spend
   * @return estimatedMonthlySpend
  **/
  public Double getEstimatedMonthlySpend() {
    return estimatedMonthlySpend;
  }

  public void setEstimatedMonthlySpend(Double estimatedMonthlySpend) {
    this.estimatedMonthlySpend = estimatedMonthlySpend;
  }

  public SSIOInsertionOrderCreate mediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
    return this;
  }

   /**
   * The media contact email
   * @return mediaContactEmail
  **/
  public String getMediaContactEmail() {
    return mediaContactEmail;
  }

  public void setMediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
  }

  public SSIOInsertionOrderCreate mediaContactFirstname(String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
    return this;
  }

   /**
   * The media contact first name
   * @return mediaContactFirstname
  **/
  public String getMediaContactFirstname() {
    return mediaContactFirstname;
  }

  public void setMediaContactFirstname(String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
  }

  public SSIOInsertionOrderCreate mediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
    return this;
  }

   /**
   * The media contact last name
   * @return mediaContactLastname
  **/
  public String getMediaContactLastname() {
    return mediaContactLastname;
  }

  public void setMediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
  }

  public SSIOInsertionOrderCreate orderLineType(SSIOOrderLineType orderLineType) {
    this.orderLineType = orderLineType;
    return this;
  }

   /**
   * Type can be Budget or Perpetual
   * @return orderLineType
  **/
  public SSIOOrderLineType getOrderLineType() {
    return orderLineType;
  }

  public void setOrderLineType(SSIOOrderLineType orderLineType) {
    this.orderLineType = orderLineType;
  }

  public SSIOInsertionOrderCreate orderName(String orderName) {
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

  public SSIOInsertionOrderCreate pmpId(String pmpId) {
    this.pmpId = pmpId;
    return this;
  }

   /**
   * The pmp id
   * @return pmpId
  **/
  public String getPmpId() {
    return pmpId;
  }

  public void setPmpId(String pmpId) {
    this.pmpId = pmpId;
  }

  public SSIOInsertionOrderCreate poNumber(String poNumber) {
    this.poNumber = poNumber;
    return this;
  }

   /**
   * The po number
   * @return poNumber
  **/
  public String getPoNumber() {
    return poNumber;
  }

  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }

  public SSIOInsertionOrderCreate startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Starting date of time period. Format: YYYY-MM-DD
   * @return startDate
  **/
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public SSIOInsertionOrderCreate userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

   /**
   * The email of user submitting the insertion order
   * @return userEmail
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

