package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.Currency;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SSIOOrderLine
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class SSIOOrderLine {

  private JsonNullable<String> salesforceOrderLineId = JsonNullable.<String>undefined();

  private JsonNullable<String> adsManagerOrderLineId = JsonNullable.<String>undefined();

  private JsonNullable<String> pinOrderId = JsonNullable.<String>undefined();

  private JsonNullable<@Pattern(regexp = "^(\\d{4})-(\\d{2})-(\\d{2})T(\\d{2}):(\\d{2}):(\\d{2}).(\\d{3})Z$") String> lastModifiedDateTime = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private JsonNullable<Date> startDate = JsonNullable.<Date>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private JsonNullable<Date> endDate = JsonNullable.<Date>undefined();

  private JsonNullable<String> billToCompanyName = JsonNullable.<String>undefined();

  private JsonNullable<String> billingContactFirstname = JsonNullable.<String>undefined();

  private JsonNullable<String> billingContactLastname = JsonNullable.<String>undefined();

  private JsonNullable<String> billingContactEmail = JsonNullable.<String>undefined();

  private JsonNullable<String> mediaContactEmail = JsonNullable.<String>undefined();

  private JsonNullable<String> mediaContactFirstname = JsonNullable.<String>undefined();

  private JsonNullable<String> mediaContactLastname = JsonNullable.<String>undefined();

  private Currency currencyInfo;

  private JsonNullable<String> agencyLink = JsonNullable.<String>undefined();

  private JsonNullable<String> poNumber = JsonNullable.<String>undefined();

  private JsonNullable<String> orderName = JsonNullable.<String>undefined();

  private JsonNullable<String> pmpName = JsonNullable.<String>undefined();

  private JsonNullable<String> acceptedTermsId = JsonNullable.<String>undefined();

  private JsonNullable<@Pattern(regexp = "^(\\d{4})-(\\d{2})-(\\d{2})T(\\d{2}):(\\d{2}):(\\d{2}).(\\d{3})Z$") String> acceptedTermsTime = JsonNullable.<String>undefined();

  private JsonNullable<BigDecimal> budgetAmount = JsonNullable.<BigDecimal>undefined();

  private JsonNullable<BigDecimal> estimatedMonthlySpend = JsonNullable.<BigDecimal>undefined();

  public SSIOOrderLine salesforceOrderLineId(String salesforceOrderLineId) {
    this.salesforceOrderLineId = JsonNullable.of(salesforceOrderLineId);
    return this;
  }

  /**
   * OrderLineId in SFDC
   * @return salesforceOrderLineId
  */
  
  @Schema(name = "salesforce_order_line_id", description = "OrderLineId in SFDC", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("salesforce_order_line_id")
  public JsonNullable<String> getSalesforceOrderLineId() {
    return salesforceOrderLineId;
  }

  public void setSalesforceOrderLineId(JsonNullable<String> salesforceOrderLineId) {
    this.salesforceOrderLineId = salesforceOrderLineId;
  }

  public SSIOOrderLine adsManagerOrderLineId(String adsManagerOrderLineId) {
    this.adsManagerOrderLineId = JsonNullable.of(adsManagerOrderLineId);
    return this;
  }

  /**
   * Ads manager OrderLineId
   * @return adsManagerOrderLineId
  */
  
  @Schema(name = "ads_manager_order_line_id", description = "Ads manager OrderLineId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ads_manager_order_line_id")
  public JsonNullable<String> getAdsManagerOrderLineId() {
    return adsManagerOrderLineId;
  }

  public void setAdsManagerOrderLineId(JsonNullable<String> adsManagerOrderLineId) {
    this.adsManagerOrderLineId = adsManagerOrderLineId;
  }

  public SSIOOrderLine pinOrderId(String pinOrderId) {
    this.pinOrderId = JsonNullable.of(pinOrderId);
    return this;
  }

  /**
   * The pin order id associated with the order line in SFDC
   * @return pinOrderId
  */
  
  @Schema(name = "pin_order_id", description = "The pin order id associated with the order line in SFDC", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pin_order_id")
  public JsonNullable<String> getPinOrderId() {
    return pinOrderId;
  }

  public void setPinOrderId(JsonNullable<String> pinOrderId) {
    this.pinOrderId = pinOrderId;
  }

  public SSIOOrderLine lastModifiedDateTime(String lastModifiedDateTime) {
    this.lastModifiedDateTime = JsonNullable.of(lastModifiedDateTime);
    return this;
  }

  /**
   * Last modified date.
   * @return lastModifiedDateTime
  */
  @Pattern(regexp = "^(\\d{4})-(\\d{2})-(\\d{2})T(\\d{2}):(\\d{2}):(\\d{2}).(\\d{3})Z$") 
  @Schema(name = "last_modified_date_time", example = "2020-10-06T13:07:04.000Z", description = "Last modified date.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_modified_date_time")
  public JsonNullable<@Pattern(regexp = "^(\\d{4})-(\\d{2})-(\\d{2})T(\\d{2}):(\\d{2}):(\\d{2}).(\\d{3})Z$") String> getLastModifiedDateTime() {
    return lastModifiedDateTime;
  }

  public void setLastModifiedDateTime(JsonNullable<String> lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
  }

  public SSIOOrderLine startDate(Date startDate) {
    this.startDate = JsonNullable.of(startDate);
    return this;
  }

  /**
   * Start date of the order line.
   * @return startDate
  */
  @Valid 
  @Schema(name = "start_date", example = "Thu Mar 01 00:00:00 UTC 2018", description = "Start date of the order line.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_date")
  public JsonNullable<Date> getStartDate() {
    return startDate;
  }

  public void setStartDate(JsonNullable<Date> startDate) {
    this.startDate = startDate;
  }

  public SSIOOrderLine endDate(Date endDate) {
    this.endDate = JsonNullable.of(endDate);
    return this;
  }

  /**
   * End date of the order line.
   * @return endDate
  */
  @Valid 
  @Schema(name = "end_date", example = "Mon Oct 05 00:00:00 UTC 2020", description = "End date of the order line.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_date")
  public JsonNullable<Date> getEndDate() {
    return endDate;
  }

  public void setEndDate(JsonNullable<Date> endDate) {
    this.endDate = endDate;
  }

  public SSIOOrderLine billToCompanyName(String billToCompanyName) {
    this.billToCompanyName = JsonNullable.of(billToCompanyName);
    return this;
  }

  /**
   * Bill To Company name
   * @return billToCompanyName
  */
  
  @Schema(name = "bill_to_company_name", example = "Home Depot Inc.", description = "Bill To Company name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bill_to_company_name")
  public JsonNullable<String> getBillToCompanyName() {
    return billToCompanyName;
  }

  public void setBillToCompanyName(JsonNullable<String> billToCompanyName) {
    this.billToCompanyName = billToCompanyName;
  }

  public SSIOOrderLine billingContactFirstname(String billingContactFirstname) {
    this.billingContactFirstname = JsonNullable.of(billingContactFirstname);
    return this;
  }

  /**
   * Billing contact first name
   * @return billingContactFirstname
  */
  
  @Schema(name = "billing_contact_firstname", example = "Mary", description = "Billing contact first name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billing_contact_firstname")
  public JsonNullable<String> getBillingContactFirstname() {
    return billingContactFirstname;
  }

  public void setBillingContactFirstname(JsonNullable<String> billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
  }

  public SSIOOrderLine billingContactLastname(String billingContactLastname) {
    this.billingContactLastname = JsonNullable.of(billingContactLastname);
    return this;
  }

  /**
   * Billing contact last name
   * @return billingContactLastname
  */
  
  @Schema(name = "billing_contact_lastname", example = "Smith", description = "Billing contact last name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billing_contact_lastname")
  public JsonNullable<String> getBillingContactLastname() {
    return billingContactLastname;
  }

  public void setBillingContactLastname(JsonNullable<String> billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
  }

  public SSIOOrderLine billingContactEmail(String billingContactEmail) {
    this.billingContactEmail = JsonNullable.of(billingContactEmail);
    return this;
  }

  /**
   * Billing contact email
   * @return billingContactEmail
  */
  
  @Schema(name = "billing_contact_email", example = "mail@test.com", description = "Billing contact email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billing_contact_email")
  public JsonNullable<String> getBillingContactEmail() {
    return billingContactEmail;
  }

  public void setBillingContactEmail(JsonNullable<String> billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
  }

  public SSIOOrderLine mediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = JsonNullable.of(mediaContactEmail);
    return this;
  }

  /**
   * Billing media email
   * @return mediaContactEmail
  */
  
  @Schema(name = "media_contact_email", example = "mail@test.com", description = "Billing media email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("media_contact_email")
  public JsonNullable<String> getMediaContactEmail() {
    return mediaContactEmail;
  }

  public void setMediaContactEmail(JsonNullable<String> mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
  }

  public SSIOOrderLine mediaContactFirstname(String mediaContactFirstname) {
    this.mediaContactFirstname = JsonNullable.of(mediaContactFirstname);
    return this;
  }

  /**
   * Billing contact first name
   * @return mediaContactFirstname
  */
  
  @Schema(name = "media_contact_firstname", example = "John", description = "Billing contact first name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("media_contact_firstname")
  public JsonNullable<String> getMediaContactFirstname() {
    return mediaContactFirstname;
  }

  public void setMediaContactFirstname(JsonNullable<String> mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
  }

  public SSIOOrderLine mediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = JsonNullable.of(mediaContactLastname);
    return this;
  }

  /**
   * Billing contact first name
   * @return mediaContactLastname
  */
  
  @Schema(name = "media_contact_lastname", example = "Doe", description = "Billing contact first name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("media_contact_lastname")
  public JsonNullable<String> getMediaContactLastname() {
    return mediaContactLastname;
  }

  public void setMediaContactLastname(JsonNullable<String> mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
  }

  public SSIOOrderLine currencyInfo(Currency currencyInfo) {
    this.currencyInfo = currencyInfo;
    return this;
  }

  /**
   * Get currencyInfo
   * @return currencyInfo
  */
  @Valid 
  @Schema(name = "currency_info", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency_info")
  public Currency getCurrencyInfo() {
    return currencyInfo;
  }

  public void setCurrencyInfo(Currency currencyInfo) {
    this.currencyInfo = currencyInfo;
  }

  public SSIOOrderLine agencyLink(String agencyLink) {
    this.agencyLink = JsonNullable.of(agencyLink);
    return this;
  }

  /**
   * Agency link
   * @return agencyLink
  */
  
  @Schema(name = "agency_link", example = "", description = "Agency link", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("agency_link")
  public JsonNullable<String> getAgencyLink() {
    return agencyLink;
  }

  public void setAgencyLink(JsonNullable<String> agencyLink) {
    this.agencyLink = agencyLink;
  }

  public SSIOOrderLine poNumber(String poNumber) {
    this.poNumber = JsonNullable.of(poNumber);
    return this;
  }

  /**
   * The po number
   * @return poNumber
  */
  
  @Schema(name = "po_number", description = "The po number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("po_number")
  public JsonNullable<String> getPoNumber() {
    return poNumber;
  }

  public void setPoNumber(JsonNullable<String> poNumber) {
    this.poNumber = poNumber;
  }

  public SSIOOrderLine orderName(String orderName) {
    this.orderName = JsonNullable.of(orderName);
    return this;
  }

  /**
   * The order name
   * @return orderName
  */
  
  @Schema(name = "order_name", description = "The order name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("order_name")
  public JsonNullable<String> getOrderName() {
    return orderName;
  }

  public void setOrderName(JsonNullable<String> orderName) {
    this.orderName = orderName;
  }

  public SSIOOrderLine pmpName(String pmpName) {
    this.pmpName = JsonNullable.of(pmpName);
    return this;
  }

  /**
   * The Pinterest marketing partner name
   * @return pmpName
  */
  
  @Schema(name = "pmp_name", description = "The Pinterest marketing partner name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pmp_name")
  public JsonNullable<String> getPmpName() {
    return pmpName;
  }

  public void setPmpName(JsonNullable<String> pmpName) {
    this.pmpName = pmpName;
  }

  public SSIOOrderLine acceptedTermsId(String acceptedTermsId) {
    this.acceptedTermsId = JsonNullable.of(acceptedTermsId);
    return this;
  }

  /**
   * The SFDC id for the terms
   * @return acceptedTermsId
  */
  
  @Schema(name = "accepted_terms_id", description = "The SFDC id for the terms", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accepted_terms_id")
  public JsonNullable<String> getAcceptedTermsId() {
    return acceptedTermsId;
  }

  public void setAcceptedTermsId(JsonNullable<String> acceptedTermsId) {
    this.acceptedTermsId = acceptedTermsId;
  }

  public SSIOOrderLine acceptedTermsTime(String acceptedTermsTime) {
    this.acceptedTermsTime = JsonNullable.of(acceptedTermsTime);
    return this;
  }

  /**
   * The UTC timestamp (to the nearest sec) of when terms were accepted
   * @return acceptedTermsTime
  */
  @Pattern(regexp = "^(\\d{4})-(\\d{2})-(\\d{2})T(\\d{2}):(\\d{2}):(\\d{2}).(\\d{3})Z$") 
  @Schema(name = "accepted_terms_time", example = "2020-10-06T13:07:04.000Z", description = "The UTC timestamp (to the nearest sec) of when terms were accepted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accepted_terms_time")
  public JsonNullable<@Pattern(regexp = "^(\\d{4})-(\\d{2})-(\\d{2})T(\\d{2}):(\\d{2}):(\\d{2}).(\\d{3})Z$") String> getAcceptedTermsTime() {
    return acceptedTermsTime;
  }

  public void setAcceptedTermsTime(JsonNullable<String> acceptedTermsTime) {
    this.acceptedTermsTime = acceptedTermsTime;
  }

  public SSIOOrderLine budgetAmount(BigDecimal budgetAmount) {
    this.budgetAmount = JsonNullable.of(budgetAmount);
    return this;
  }

  /**
   * If Budget order line, the budget amount.
   * @return budgetAmount
  */
  @Valid 
  @Schema(name = "budget_amount", example = "5000000", description = "If Budget order line, the budget amount.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("budget_amount")
  public JsonNullable<BigDecimal> getBudgetAmount() {
    return budgetAmount;
  }

  public void setBudgetAmount(JsonNullable<BigDecimal> budgetAmount) {
    this.budgetAmount = budgetAmount;
  }

  public SSIOOrderLine estimatedMonthlySpend(BigDecimal estimatedMonthlySpend) {
    this.estimatedMonthlySpend = JsonNullable.of(estimatedMonthlySpend);
    return this;
  }

  /**
   * If Ongoing (perpetual) order line, the estimated monthly spend
   * @return estimatedMonthlySpend
  */
  @Valid 
  @Schema(name = "estimated_monthly_spend", description = "If Ongoing (perpetual) order line, the estimated monthly spend", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimated_monthly_spend")
  public JsonNullable<BigDecimal> getEstimatedMonthlySpend() {
    return estimatedMonthlySpend;
  }

  public void setEstimatedMonthlySpend(JsonNullable<BigDecimal> estimatedMonthlySpend) {
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
    return equalsNullable(this.salesforceOrderLineId, ssIOOrderLine.salesforceOrderLineId) &&
        equalsNullable(this.adsManagerOrderLineId, ssIOOrderLine.adsManagerOrderLineId) &&
        equalsNullable(this.pinOrderId, ssIOOrderLine.pinOrderId) &&
        equalsNullable(this.lastModifiedDateTime, ssIOOrderLine.lastModifiedDateTime) &&
        equalsNullable(this.startDate, ssIOOrderLine.startDate) &&
        equalsNullable(this.endDate, ssIOOrderLine.endDate) &&
        equalsNullable(this.billToCompanyName, ssIOOrderLine.billToCompanyName) &&
        equalsNullable(this.billingContactFirstname, ssIOOrderLine.billingContactFirstname) &&
        equalsNullable(this.billingContactLastname, ssIOOrderLine.billingContactLastname) &&
        equalsNullable(this.billingContactEmail, ssIOOrderLine.billingContactEmail) &&
        equalsNullable(this.mediaContactEmail, ssIOOrderLine.mediaContactEmail) &&
        equalsNullable(this.mediaContactFirstname, ssIOOrderLine.mediaContactFirstname) &&
        equalsNullable(this.mediaContactLastname, ssIOOrderLine.mediaContactLastname) &&
        Objects.equals(this.currencyInfo, ssIOOrderLine.currencyInfo) &&
        equalsNullable(this.agencyLink, ssIOOrderLine.agencyLink) &&
        equalsNullable(this.poNumber, ssIOOrderLine.poNumber) &&
        equalsNullable(this.orderName, ssIOOrderLine.orderName) &&
        equalsNullable(this.pmpName, ssIOOrderLine.pmpName) &&
        equalsNullable(this.acceptedTermsId, ssIOOrderLine.acceptedTermsId) &&
        equalsNullable(this.acceptedTermsTime, ssIOOrderLine.acceptedTermsTime) &&
        equalsNullable(this.budgetAmount, ssIOOrderLine.budgetAmount) &&
        equalsNullable(this.estimatedMonthlySpend, ssIOOrderLine.estimatedMonthlySpend);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(salesforceOrderLineId), hashCodeNullable(adsManagerOrderLineId), hashCodeNullable(pinOrderId), hashCodeNullable(lastModifiedDateTime), hashCodeNullable(startDate), hashCodeNullable(endDate), hashCodeNullable(billToCompanyName), hashCodeNullable(billingContactFirstname), hashCodeNullable(billingContactLastname), hashCodeNullable(billingContactEmail), hashCodeNullable(mediaContactEmail), hashCodeNullable(mediaContactFirstname), hashCodeNullable(mediaContactLastname), currencyInfo, hashCodeNullable(agencyLink), hashCodeNullable(poNumber), hashCodeNullable(orderName), hashCodeNullable(pmpName), hashCodeNullable(acceptedTermsId), hashCodeNullable(acceptedTermsTime), hashCodeNullable(budgetAmount), hashCodeNullable(estimatedMonthlySpend));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

