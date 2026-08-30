package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Currency;
import org.openapitools.model.SSIOOrderLineType;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Resource create operation model.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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
   **/
  
  @ApiModelProperty(required = true, value = "The SFDC id for the terms")
  @JsonProperty("accepted_terms_id")
  @NotNull
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
  @JsonProperty("accepted_terms_time")
  public Integer getAcceptedTermsTime() {
    return acceptedTermsTime;
  }
  public void setAcceptedTermsTime(Integer acceptedTermsTime) {
    this.acceptedTermsTime = acceptedTermsTime;
  }

  /**
   * URL link for agency
   **/
  
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
   **/
  
  @ApiModelProperty(required = true, value = "The billing contact email")
  @JsonProperty("billing_contact_email")
  @NotNull
  public String getBillingContactEmail() {
    return billingContactEmail;
  }
  public void setBillingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
  }

  /**
   * The billing contact first name
   **/
  
  @ApiModelProperty(required = true, value = "The billing contact first name")
  @JsonProperty("billing_contact_firstname")
  @NotNull
  public String getBillingContactFirstname() {
    return billingContactFirstname;
  }
  public void setBillingContactFirstname(String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
  }

  /**
   * The billing contact last name
   **/
  
  @ApiModelProperty(required = true, value = "The billing contact last name")
  @JsonProperty("billing_contact_lastname")
  @NotNull
  public String getBillingContactLastname() {
    return billingContactLastname;
  }
  public void setBillingContactLastname(String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
  }

  /**
   * The bill-to billing address id
   **/
  
  @ApiModelProperty(required = true, value = "The bill-to billing address id")
  @JsonProperty("billto_billing_address_id")
  @NotNull
  public String getBilltoBillingAddressId() {
    return billtoBillingAddressId;
  }
  public void setBilltoBillingAddressId(String billtoBillingAddressId) {
    this.billtoBillingAddressId = billtoBillingAddressId;
  }

  /**
   * The bill-to business address id
   **/
  
  @ApiModelProperty(required = true, value = "The bill-to business address id")
  @JsonProperty("billto_business_address_id")
  @NotNull
  public String getBilltoBusinessAddressId() {
    return billtoBusinessAddressId;
  }
  public void setBilltoBusinessAddressId(String billtoBusinessAddressId) {
    this.billtoBusinessAddressId = billtoBusinessAddressId;
  }

  /**
   * The bill-to company id
   **/
  
  @ApiModelProperty(required = true, value = "The bill-to company id")
  @JsonProperty("billto_company_id")
  @NotNull
  public String getBilltoCompanyId() {
    return billtoCompanyId;
  }
  public void setBilltoCompanyId(String billtoCompanyId) {
    this.billtoCompanyId = billtoCompanyId;
  }

  /**
   * If Budget order line, the budget amount.
   **/
  
  @ApiModelProperty(value = "If Budget order line, the budget amount.")
  @JsonProperty("budget_amount")
  public Double getBudgetAmount() {
    return budgetAmount;
  }
  public void setBudgetAmount(Double budgetAmount) {
    this.budgetAmount = budgetAmount;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("currency_info")
  @NotNull
  @Valid
  public Currency getCurrencyInfo() {
    return currencyInfo;
  }
  public void setCurrencyInfo(Currency currencyInfo) {
    this.currencyInfo = currencyInfo;
  }

  /**
   * End date of time period. Format: YYYY-MM-DD
   **/
  
  @ApiModelProperty(value = "End date of time period. Format: YYYY-MM-DD")
  @JsonProperty("end_date")
 @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")  public String getEndDate() {
    return endDate;
  }
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   * If Ongoing (perpetual) order line, the estimated monthly spend
   **/
  
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
   **/
  
  @ApiModelProperty(required = true, value = "The media contact email")
  @JsonProperty("media_contact_email")
  @NotNull
  public String getMediaContactEmail() {
    return mediaContactEmail;
  }
  public void setMediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
  }

  /**
   * The media contact first name
   **/
  
  @ApiModelProperty(required = true, value = "The media contact first name")
  @JsonProperty("media_contact_firstname")
  @NotNull
  public String getMediaContactFirstname() {
    return mediaContactFirstname;
  }
  public void setMediaContactFirstname(String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
  }

  /**
   * The media contact last name
   **/
  
  @ApiModelProperty(required = true, value = "The media contact last name")
  @JsonProperty("media_contact_lastname")
  @NotNull
  public String getMediaContactLastname() {
    return mediaContactLastname;
  }
  public void setMediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
  }

  /**
   * Type can be Budget or Perpetual
   **/
  
  @ApiModelProperty(required = true, value = "Type can be Budget or Perpetual")
  @JsonProperty("order_line_type")
  @NotNull
  @Valid
  public SSIOOrderLineType getOrderLineType() {
    return orderLineType;
  }
  public void setOrderLineType(SSIOOrderLineType orderLineType) {
    this.orderLineType = orderLineType;
  }

  /**
   * The order name
   **/
  
  @ApiModelProperty(required = true, value = "The order name")
  @JsonProperty("order_name")
  @NotNull
  public String getOrderName() {
    return orderName;
  }
  public void setOrderName(String orderName) {
    this.orderName = orderName;
  }

  /**
   * The pmp id
   **/
  
  @ApiModelProperty(required = true, value = "The pmp id")
  @JsonProperty("pmp_id")
  @NotNull
  public String getPmpId() {
    return pmpId;
  }
  public void setPmpId(String pmpId) {
    this.pmpId = pmpId;
  }

  /**
   * The po number
   **/
  
  @ApiModelProperty(required = true, value = "The po number")
  @JsonProperty("po_number")
  @NotNull
  public String getPoNumber() {
    return poNumber;
  }
  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }

  /**
   * Starting date of time period. Format: YYYY-MM-DD
   **/
  
  @ApiModelProperty(required = true, value = "Starting date of time period. Format: YYYY-MM-DD")
  @JsonProperty("start_date")
  @NotNull
 @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")  public String getStartDate() {
    return startDate;
  }
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * The email of user submitting the insertion order
   **/
  
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

