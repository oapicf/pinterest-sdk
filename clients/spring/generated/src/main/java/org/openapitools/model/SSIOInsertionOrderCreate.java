package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.Currency;
import org.openapitools.model.SSIOOrderLineType;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Resource create operation model.
 */

@Schema(name = "SSIOInsertionOrderCreate", description = "Resource create operation model.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SSIOInsertionOrderCreate {

  private String acceptedTermsId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer acceptedTermsTime;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String agencyLink;

  private String billingContactEmail;

  private String billingContactFirstname;

  private String billingContactLastname;

  private String billtoBillingAddressId;

  private String billtoBusinessAddressId;

  private String billtoCompanyId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Double budgetAmount;

  private Currency currencyInfo;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String endDate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Double estimatedMonthlySpend;

  private String mediaContactEmail;

  private String mediaContactFirstname;

  private String mediaContactLastname;

  private SSIOOrderLineType orderLineType;

  private String orderName;

  private String pmpId;

  private String poNumber;

  private String startDate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String userEmail;

  public SSIOInsertionOrderCreate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SSIOInsertionOrderCreate(String acceptedTermsId, String billingContactEmail, String billingContactFirstname, String billingContactLastname, String billtoBillingAddressId, String billtoBusinessAddressId, String billtoCompanyId, Currency currencyInfo, String mediaContactEmail, String mediaContactFirstname, String mediaContactLastname, SSIOOrderLineType orderLineType, String orderName, String pmpId, String poNumber, String startDate) {
    this.acceptedTermsId = acceptedTermsId;
    this.billingContactEmail = billingContactEmail;
    this.billingContactFirstname = billingContactFirstname;
    this.billingContactLastname = billingContactLastname;
    this.billtoBillingAddressId = billtoBillingAddressId;
    this.billtoBusinessAddressId = billtoBusinessAddressId;
    this.billtoCompanyId = billtoCompanyId;
    this.currencyInfo = currencyInfo;
    this.mediaContactEmail = mediaContactEmail;
    this.mediaContactFirstname = mediaContactFirstname;
    this.mediaContactLastname = mediaContactLastname;
    this.orderLineType = orderLineType;
    this.orderName = orderName;
    this.pmpId = pmpId;
    this.poNumber = poNumber;
    this.startDate = startDate;
  }

  public SSIOInsertionOrderCreate acceptedTermsId(String acceptedTermsId) {
    this.acceptedTermsId = acceptedTermsId;
    return this;
  }

  /**
   * The SFDC id for the terms
   * @return acceptedTermsId
   */
  @NotNull 
  @Schema(name = "accepted_terms_id", description = "The SFDC id for the terms", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("accepted_terms_id")
  public String getAcceptedTermsId() {
    return acceptedTermsId;
  }

  @JsonProperty("accepted_terms_id")
  public void setAcceptedTermsId(String acceptedTermsId) {
    this.acceptedTermsId = acceptedTermsId;
  }

  public SSIOInsertionOrderCreate acceptedTermsTime(@Nullable Integer acceptedTermsTime) {
    this.acceptedTermsTime = acceptedTermsTime;
    return this;
  }

  /**
   * The UTC timestamp (to the nearest sec) of when terms were accepted
   * @return acceptedTermsTime
   */
  
  @Schema(name = "accepted_terms_time", description = "The UTC timestamp (to the nearest sec) of when terms were accepted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accepted_terms_time")
  public @Nullable Integer getAcceptedTermsTime() {
    return acceptedTermsTime;
  }

  @JsonProperty("accepted_terms_time")
  public void setAcceptedTermsTime(@Nullable Integer acceptedTermsTime) {
    this.acceptedTermsTime = acceptedTermsTime;
  }

  public SSIOInsertionOrderCreate agencyLink(@Nullable String agencyLink) {
    this.agencyLink = agencyLink;
    return this;
  }

  /**
   * URL link for agency
   * @return agencyLink
   */
  
  @Schema(name = "agency_link", description = "URL link for agency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("agency_link")
  public @Nullable String getAgencyLink() {
    return agencyLink;
  }

  @JsonProperty("agency_link")
  public void setAgencyLink(@Nullable String agencyLink) {
    this.agencyLink = agencyLink;
  }

  public SSIOInsertionOrderCreate billingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
    return this;
  }

  /**
   * The billing contact email
   * @return billingContactEmail
   */
  @NotNull 
  @Schema(name = "billing_contact_email", description = "The billing contact email", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("billing_contact_email")
  public String getBillingContactEmail() {
    return billingContactEmail;
  }

  @JsonProperty("billing_contact_email")
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
   */
  @NotNull 
  @Schema(name = "billing_contact_firstname", description = "The billing contact first name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("billing_contact_firstname")
  public String getBillingContactFirstname() {
    return billingContactFirstname;
  }

  @JsonProperty("billing_contact_firstname")
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
   */
  @NotNull 
  @Schema(name = "billing_contact_lastname", description = "The billing contact last name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("billing_contact_lastname")
  public String getBillingContactLastname() {
    return billingContactLastname;
  }

  @JsonProperty("billing_contact_lastname")
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
   */
  @NotNull 
  @Schema(name = "billto_billing_address_id", description = "The bill-to billing address id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("billto_billing_address_id")
  public String getBilltoBillingAddressId() {
    return billtoBillingAddressId;
  }

  @JsonProperty("billto_billing_address_id")
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
   */
  @NotNull 
  @Schema(name = "billto_business_address_id", description = "The bill-to business address id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("billto_business_address_id")
  public String getBilltoBusinessAddressId() {
    return billtoBusinessAddressId;
  }

  @JsonProperty("billto_business_address_id")
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
   */
  @NotNull 
  @Schema(name = "billto_company_id", description = "The bill-to company id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("billto_company_id")
  public String getBilltoCompanyId() {
    return billtoCompanyId;
  }

  @JsonProperty("billto_company_id")
  public void setBilltoCompanyId(String billtoCompanyId) {
    this.billtoCompanyId = billtoCompanyId;
  }

  public SSIOInsertionOrderCreate budgetAmount(@Nullable Double budgetAmount) {
    this.budgetAmount = budgetAmount;
    return this;
  }

  /**
   * If Budget order line, the budget amount.
   * @return budgetAmount
   */
  
  @Schema(name = "budget_amount", description = "If Budget order line, the budget amount.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("budget_amount")
  public @Nullable Double getBudgetAmount() {
    return budgetAmount;
  }

  @JsonProperty("budget_amount")
  public void setBudgetAmount(@Nullable Double budgetAmount) {
    this.budgetAmount = budgetAmount;
  }

  public SSIOInsertionOrderCreate currencyInfo(Currency currencyInfo) {
    this.currencyInfo = currencyInfo;
    return this;
  }

  /**
   * Get currencyInfo
   * @return currencyInfo
   */
  @NotNull @Valid 
  @Schema(name = "currency_info", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currency_info")
  public Currency getCurrencyInfo() {
    return currencyInfo;
  }

  @JsonProperty("currency_info")
  public void setCurrencyInfo(Currency currencyInfo) {
    this.currencyInfo = currencyInfo;
  }

  public SSIOInsertionOrderCreate endDate(@Nullable String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * End date of time period. Format: YYYY-MM-DD
   * @return endDate
   */
  @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$") 
  @Schema(name = "end_date", description = "End date of time period. Format: YYYY-MM-DD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_date")
  public @Nullable String getEndDate() {
    return endDate;
  }

  @JsonProperty("end_date")
  public void setEndDate(@Nullable String endDate) {
    this.endDate = endDate;
  }

  public SSIOInsertionOrderCreate estimatedMonthlySpend(@Nullable Double estimatedMonthlySpend) {
    this.estimatedMonthlySpend = estimatedMonthlySpend;
    return this;
  }

  /**
   * If Ongoing (perpetual) order line, the estimated monthly spend
   * @return estimatedMonthlySpend
   */
  
  @Schema(name = "estimated_monthly_spend", description = "If Ongoing (perpetual) order line, the estimated monthly spend", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimated_monthly_spend")
  public @Nullable Double getEstimatedMonthlySpend() {
    return estimatedMonthlySpend;
  }

  @JsonProperty("estimated_monthly_spend")
  public void setEstimatedMonthlySpend(@Nullable Double estimatedMonthlySpend) {
    this.estimatedMonthlySpend = estimatedMonthlySpend;
  }

  public SSIOInsertionOrderCreate mediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
    return this;
  }

  /**
   * The media contact email
   * @return mediaContactEmail
   */
  @NotNull 
  @Schema(name = "media_contact_email", description = "The media contact email", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("media_contact_email")
  public String getMediaContactEmail() {
    return mediaContactEmail;
  }

  @JsonProperty("media_contact_email")
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
   */
  @NotNull 
  @Schema(name = "media_contact_firstname", description = "The media contact first name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("media_contact_firstname")
  public String getMediaContactFirstname() {
    return mediaContactFirstname;
  }

  @JsonProperty("media_contact_firstname")
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
   */
  @NotNull 
  @Schema(name = "media_contact_lastname", description = "The media contact last name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("media_contact_lastname")
  public String getMediaContactLastname() {
    return mediaContactLastname;
  }

  @JsonProperty("media_contact_lastname")
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
   */
  @NotNull @Valid 
  @Schema(name = "order_line_type", description = "Type can be Budget or Perpetual", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("order_line_type")
  public SSIOOrderLineType getOrderLineType() {
    return orderLineType;
  }

  @JsonProperty("order_line_type")
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
   */
  @NotNull 
  @Schema(name = "order_name", description = "The order name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("order_name")
  public String getOrderName() {
    return orderName;
  }

  @JsonProperty("order_name")
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
   */
  @NotNull 
  @Schema(name = "pmp_id", description = "The pmp id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pmp_id")
  public String getPmpId() {
    return pmpId;
  }

  @JsonProperty("pmp_id")
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
   */
  @NotNull 
  @Schema(name = "po_number", description = "The po number", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("po_number")
  public String getPoNumber() {
    return poNumber;
  }

  @JsonProperty("po_number")
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
   */
  @NotNull @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$") 
  @Schema(name = "start_date", description = "Starting date of time period. Format: YYYY-MM-DD", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("start_date")
  public String getStartDate() {
    return startDate;
  }

  @JsonProperty("start_date")
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public SSIOInsertionOrderCreate userEmail(@Nullable String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  /**
   * The email of user submitting the insertion order
   * @return userEmail
   */
  
  @Schema(name = "user_email", description = "The email of user submitting the insertion order", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_email")
  public @Nullable String getUserEmail() {
    return userEmail;
  }

  @JsonProperty("user_email")
  public void setUserEmail(@Nullable String userEmail) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

