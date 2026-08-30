/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Currency;
import org.openapitools.model.SSIOOrderLineType;



/**
 * Resource create operation model.
 */

@ApiModel(description = "Resource create operation model.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

  /**
   * The SFDC id for the terms
   */
  public SSIOInsertionOrderCreate acceptedTermsId(String acceptedTermsId) {
    this.acceptedTermsId = acceptedTermsId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The SFDC id for the terms")
  @JsonProperty("accepted_terms_id")
  public String getAcceptedTermsId() {
    return acceptedTermsId;
  }
  public void setAcceptedTermsId(String acceptedTermsId) {
    this.acceptedTermsId = acceptedTermsId;
  }

  /**
   * The UTC timestamp (to the nearest sec) of when terms were accepted
   */
  public SSIOInsertionOrderCreate acceptedTermsTime(Integer acceptedTermsTime) {
    this.acceptedTermsTime = acceptedTermsTime;
    return this;
  }

  
  @ApiModelProperty(value = "The UTC timestamp (to the nearest sec) of when terms were accepted")
  @JsonProperty("accepted_terms_time")
  public Integer getAcceptedTermsTime() {
    return acceptedTermsTime;
  }
  public void setAcceptedTermsTime(Integer acceptedTermsTime) {
    this.acceptedTermsTime = acceptedTermsTime;
  }

  /**
   * URL link for agency
   */
  public SSIOInsertionOrderCreate agencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
    return this;
  }

  
  @ApiModelProperty(value = "URL link for agency")
  @JsonProperty("agency_link")
  public String getAgencyLink() {
    return agencyLink;
  }
  public void setAgencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
  }

  /**
   * The billing contact email
   */
  public SSIOInsertionOrderCreate billingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The billing contact email")
  @JsonProperty("billing_contact_email")
  public String getBillingContactEmail() {
    return billingContactEmail;
  }
  public void setBillingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
  }

  /**
   * The billing contact first name
   */
  public SSIOInsertionOrderCreate billingContactFirstname(String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The billing contact first name")
  @JsonProperty("billing_contact_firstname")
  public String getBillingContactFirstname() {
    return billingContactFirstname;
  }
  public void setBillingContactFirstname(String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
  }

  /**
   * The billing contact last name
   */
  public SSIOInsertionOrderCreate billingContactLastname(String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The billing contact last name")
  @JsonProperty("billing_contact_lastname")
  public String getBillingContactLastname() {
    return billingContactLastname;
  }
  public void setBillingContactLastname(String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
  }

  /**
   * The bill-to billing address id
   */
  public SSIOInsertionOrderCreate billtoBillingAddressId(String billtoBillingAddressId) {
    this.billtoBillingAddressId = billtoBillingAddressId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The bill-to billing address id")
  @JsonProperty("billto_billing_address_id")
  public String getBilltoBillingAddressId() {
    return billtoBillingAddressId;
  }
  public void setBilltoBillingAddressId(String billtoBillingAddressId) {
    this.billtoBillingAddressId = billtoBillingAddressId;
  }

  /**
   * The bill-to business address id
   */
  public SSIOInsertionOrderCreate billtoBusinessAddressId(String billtoBusinessAddressId) {
    this.billtoBusinessAddressId = billtoBusinessAddressId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The bill-to business address id")
  @JsonProperty("billto_business_address_id")
  public String getBilltoBusinessAddressId() {
    return billtoBusinessAddressId;
  }
  public void setBilltoBusinessAddressId(String billtoBusinessAddressId) {
    this.billtoBusinessAddressId = billtoBusinessAddressId;
  }

  /**
   * The bill-to company id
   */
  public SSIOInsertionOrderCreate billtoCompanyId(String billtoCompanyId) {
    this.billtoCompanyId = billtoCompanyId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The bill-to company id")
  @JsonProperty("billto_company_id")
  public String getBilltoCompanyId() {
    return billtoCompanyId;
  }
  public void setBilltoCompanyId(String billtoCompanyId) {
    this.billtoCompanyId = billtoCompanyId;
  }

  /**
   * If Budget order line, the budget amount.
   */
  public SSIOInsertionOrderCreate budgetAmount(Double budgetAmount) {
    this.budgetAmount = budgetAmount;
    return this;
  }

  
  @ApiModelProperty(value = "If Budget order line, the budget amount.")
  @JsonProperty("budget_amount")
  public Double getBudgetAmount() {
    return budgetAmount;
  }
  public void setBudgetAmount(Double budgetAmount) {
    this.budgetAmount = budgetAmount;
  }

  /**
   */
  public SSIOInsertionOrderCreate currencyInfo(Currency currencyInfo) {
    this.currencyInfo = currencyInfo;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("currency_info")
  public Currency getCurrencyInfo() {
    return currencyInfo;
  }
  public void setCurrencyInfo(Currency currencyInfo) {
    this.currencyInfo = currencyInfo;
  }

  /**
   * End date of time period. Format: YYYY-MM-DD
   */
  public SSIOInsertionOrderCreate endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  
  @ApiModelProperty(value = "End date of time period. Format: YYYY-MM-DD")
  @JsonProperty("end_date")
  public String getEndDate() {
    return endDate;
  }
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   * If Ongoing (perpetual) order line, the estimated monthly spend
   */
  public SSIOInsertionOrderCreate estimatedMonthlySpend(Double estimatedMonthlySpend) {
    this.estimatedMonthlySpend = estimatedMonthlySpend;
    return this;
  }

  
  @ApiModelProperty(value = "If Ongoing (perpetual) order line, the estimated monthly spend")
  @JsonProperty("estimated_monthly_spend")
  public Double getEstimatedMonthlySpend() {
    return estimatedMonthlySpend;
  }
  public void setEstimatedMonthlySpend(Double estimatedMonthlySpend) {
    this.estimatedMonthlySpend = estimatedMonthlySpend;
  }

  /**
   * The media contact email
   */
  public SSIOInsertionOrderCreate mediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The media contact email")
  @JsonProperty("media_contact_email")
  public String getMediaContactEmail() {
    return mediaContactEmail;
  }
  public void setMediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
  }

  /**
   * The media contact first name
   */
  public SSIOInsertionOrderCreate mediaContactFirstname(String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The media contact first name")
  @JsonProperty("media_contact_firstname")
  public String getMediaContactFirstname() {
    return mediaContactFirstname;
  }
  public void setMediaContactFirstname(String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
  }

  /**
   * The media contact last name
   */
  public SSIOInsertionOrderCreate mediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The media contact last name")
  @JsonProperty("media_contact_lastname")
  public String getMediaContactLastname() {
    return mediaContactLastname;
  }
  public void setMediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
  }

  /**
   * Type can be Budget or Perpetual
   */
  public SSIOInsertionOrderCreate orderLineType(SSIOOrderLineType orderLineType) {
    this.orderLineType = orderLineType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Type can be Budget or Perpetual")
  @JsonProperty("order_line_type")
  public SSIOOrderLineType getOrderLineType() {
    return orderLineType;
  }
  public void setOrderLineType(SSIOOrderLineType orderLineType) {
    this.orderLineType = orderLineType;
  }

  /**
   * The order name
   */
  public SSIOInsertionOrderCreate orderName(String orderName) {
    this.orderName = orderName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The order name")
  @JsonProperty("order_name")
  public String getOrderName() {
    return orderName;
  }
  public void setOrderName(String orderName) {
    this.orderName = orderName;
  }

  /**
   * The pmp id
   */
  public SSIOInsertionOrderCreate pmpId(String pmpId) {
    this.pmpId = pmpId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The pmp id")
  @JsonProperty("pmp_id")
  public String getPmpId() {
    return pmpId;
  }
  public void setPmpId(String pmpId) {
    this.pmpId = pmpId;
  }

  /**
   * The po number
   */
  public SSIOInsertionOrderCreate poNumber(String poNumber) {
    this.poNumber = poNumber;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The po number")
  @JsonProperty("po_number")
  public String getPoNumber() {
    return poNumber;
  }
  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }

  /**
   * Starting date of time period. Format: YYYY-MM-DD
   */
  public SSIOInsertionOrderCreate startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Starting date of time period. Format: YYYY-MM-DD")
  @JsonProperty("start_date")
  public String getStartDate() {
    return startDate;
  }
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * The email of user submitting the insertion order
   */
  public SSIOInsertionOrderCreate userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  
  @ApiModelProperty(value = "The email of user submitting the insertion order")
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

