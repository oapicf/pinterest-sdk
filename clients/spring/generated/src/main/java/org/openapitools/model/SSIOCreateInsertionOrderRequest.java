package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.model.Currency;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SSIOCreateInsertionOrderRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class SSIOCreateInsertionOrderRequest {

  private String startDate;

  private String endDate;

  private String poNumber;

  private BigDecimal budgetAmount;

  private String billingContactFirstname;

  private String billingContactLastname;

  private String billingContactEmail;

  private String mediaContactFirstname;

  private String mediaContactLastname;

  private String mediaContactEmail;

  private String agencyLink;

  private String userEmail;

  private Integer acceptedTermsTime;

  private String pmpId;

  private String orderName;

  /**
   * Type can be Budget or Perpetual
   */
  public enum OrderLineTypeEnum {
    BUDGET("BUDGET"),
    
    PERPETUALS("PERPETUALS");

    private String value;

    OrderLineTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OrderLineTypeEnum fromValue(String value) {
      for (OrderLineTypeEnum b : OrderLineTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private OrderLineTypeEnum orderLineType;

  private String acceptedTermsId;

  private String billtoCompanyId;

  private String billtoBusinessAddressId;

  private String billtoBillingAddressId;

  private BigDecimal estimatedMonthlySpend;

  private Currency currencyInfo;

  public SSIOCreateInsertionOrderRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SSIOCreateInsertionOrderRequest(String startDate, String poNumber, String billingContactFirstname, String billingContactLastname, String billingContactEmail, String mediaContactFirstname, String mediaContactLastname, String mediaContactEmail, String pmpId, String orderName, OrderLineTypeEnum orderLineType, String acceptedTermsId, String billtoCompanyId, String billtoBusinessAddressId, String billtoBillingAddressId, Currency currencyInfo) {
    this.startDate = startDate;
    this.poNumber = poNumber;
    this.billingContactFirstname = billingContactFirstname;
    this.billingContactLastname = billingContactLastname;
    this.billingContactEmail = billingContactEmail;
    this.mediaContactFirstname = mediaContactFirstname;
    this.mediaContactLastname = mediaContactLastname;
    this.mediaContactEmail = mediaContactEmail;
    this.pmpId = pmpId;
    this.orderName = orderName;
    this.orderLineType = orderLineType;
    this.acceptedTermsId = acceptedTermsId;
    this.billtoCompanyId = billtoCompanyId;
    this.billtoBusinessAddressId = billtoBusinessAddressId;
    this.billtoBillingAddressId = billtoBillingAddressId;
    this.currencyInfo = currencyInfo;
  }

  public SSIOCreateInsertionOrderRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Starting date of time period. Format: YYYY-MM-DD
   * @return startDate
  */
  @NotNull @Pattern(regexp = "^(\\d{4})-(\\d{2})-(\\d{2})$") 
  @Schema(name = "start_date", example = "2020-12-20", description = "Starting date of time period. Format: YYYY-MM-DD", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("start_date")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public SSIOCreateInsertionOrderRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * End date of time period. Format: YYYY-MM-DD
   * @return endDate
  */
  @Pattern(regexp = "^(\\d{4})-(\\d{2})-(\\d{2})$") 
  @Schema(name = "end_date", example = "2020-12-20", description = "End date of time period. Format: YYYY-MM-DD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_date")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public SSIOCreateInsertionOrderRequest poNumber(String poNumber) {
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

  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }

  public SSIOCreateInsertionOrderRequest budgetAmount(BigDecimal budgetAmount) {
    this.budgetAmount = budgetAmount;
    return this;
  }

  /**
   * If Budget order line, the budget amount.
   * @return budgetAmount
  */
  @Valid 
  @Schema(name = "budget_amount", example = "5000000", description = "If Budget order line, the budget amount.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("budget_amount")
  public BigDecimal getBudgetAmount() {
    return budgetAmount;
  }

  public void setBudgetAmount(BigDecimal budgetAmount) {
    this.budgetAmount = budgetAmount;
  }

  public SSIOCreateInsertionOrderRequest billingContactFirstname(String billingContactFirstname) {
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

  public void setBillingContactFirstname(String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
  }

  public SSIOCreateInsertionOrderRequest billingContactLastname(String billingContactLastname) {
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

  public void setBillingContactLastname(String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
  }

  public SSIOCreateInsertionOrderRequest billingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
    return this;
  }

  /**
   * The billing contact email
   * @return billingContactEmail
  */
  @NotNull 
  @Schema(name = "billing_contact_email", example = "test@example", description = "The billing contact email", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("billing_contact_email")
  public String getBillingContactEmail() {
    return billingContactEmail;
  }

  public void setBillingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
  }

  public SSIOCreateInsertionOrderRequest mediaContactFirstname(String mediaContactFirstname) {
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

  public void setMediaContactFirstname(String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
  }

  public SSIOCreateInsertionOrderRequest mediaContactLastname(String mediaContactLastname) {
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

  public void setMediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
  }

  public SSIOCreateInsertionOrderRequest mediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
    return this;
  }

  /**
   * The media contact email
   * @return mediaContactEmail
  */
  @NotNull 
  @Schema(name = "media_contact_email", example = "test@example", description = "The media contact email", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("media_contact_email")
  public String getMediaContactEmail() {
    return mediaContactEmail;
  }

  public void setMediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
  }

  public SSIOCreateInsertionOrderRequest agencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
    return this;
  }

  /**
   * URL link for agency
   * @return agencyLink
  */
  
  @Schema(name = "agency_link", description = "URL link for agency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("agency_link")
  public String getAgencyLink() {
    return agencyLink;
  }

  public void setAgencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
  }

  public SSIOCreateInsertionOrderRequest userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  /**
   * The email of user submitting the insertion order
   * @return userEmail
  */
  
  @Schema(name = "user_email", example = "test@example", description = "The email of user submitting the insertion order", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_email")
  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public SSIOCreateInsertionOrderRequest acceptedTermsTime(Integer acceptedTermsTime) {
    this.acceptedTermsTime = acceptedTermsTime;
    return this;
  }

  /**
   * The UTC timestamp (to the nearest sec) of when terms were accepted
   * @return acceptedTermsTime
  */
  
  @Schema(name = "accepted_terms_time", description = "The UTC timestamp (to the nearest sec) of when terms were accepted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accepted_terms_time")
  public Integer getAcceptedTermsTime() {
    return acceptedTermsTime;
  }

  public void setAcceptedTermsTime(Integer acceptedTermsTime) {
    this.acceptedTermsTime = acceptedTermsTime;
  }

  public SSIOCreateInsertionOrderRequest pmpId(String pmpId) {
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

  public void setPmpId(String pmpId) {
    this.pmpId = pmpId;
  }

  public SSIOCreateInsertionOrderRequest orderName(String orderName) {
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

  public void setOrderName(String orderName) {
    this.orderName = orderName;
  }

  public SSIOCreateInsertionOrderRequest orderLineType(OrderLineTypeEnum orderLineType) {
    this.orderLineType = orderLineType;
    return this;
  }

  /**
   * Type can be Budget or Perpetual
   * @return orderLineType
  */
  @NotNull 
  @Schema(name = "order_line_type", description = "Type can be Budget or Perpetual", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("order_line_type")
  public OrderLineTypeEnum getOrderLineType() {
    return orderLineType;
  }

  public void setOrderLineType(OrderLineTypeEnum orderLineType) {
    this.orderLineType = orderLineType;
  }

  public SSIOCreateInsertionOrderRequest acceptedTermsId(String acceptedTermsId) {
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

  public void setAcceptedTermsId(String acceptedTermsId) {
    this.acceptedTermsId = acceptedTermsId;
  }

  public SSIOCreateInsertionOrderRequest billtoCompanyId(String billtoCompanyId) {
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

  public void setBilltoCompanyId(String billtoCompanyId) {
    this.billtoCompanyId = billtoCompanyId;
  }

  public SSIOCreateInsertionOrderRequest billtoBusinessAddressId(String billtoBusinessAddressId) {
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

  public void setBilltoBusinessAddressId(String billtoBusinessAddressId) {
    this.billtoBusinessAddressId = billtoBusinessAddressId;
  }

  public SSIOCreateInsertionOrderRequest billtoBillingAddressId(String billtoBillingAddressId) {
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

  public void setBilltoBillingAddressId(String billtoBillingAddressId) {
    this.billtoBillingAddressId = billtoBillingAddressId;
  }

  public SSIOCreateInsertionOrderRequest estimatedMonthlySpend(BigDecimal estimatedMonthlySpend) {
    this.estimatedMonthlySpend = estimatedMonthlySpend;
    return this;
  }

  /**
   * If Ongoing (perpetual) order line, the estimated monthly spend
   * @return estimatedMonthlySpend
  */
  @Valid 
  @Schema(name = "estimated_monthly_spend", description = "If Ongoing (perpetual) order line, the estimated monthly spend", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimated_monthly_spend")
  public BigDecimal getEstimatedMonthlySpend() {
    return estimatedMonthlySpend;
  }

  public void setEstimatedMonthlySpend(BigDecimal estimatedMonthlySpend) {
    this.estimatedMonthlySpend = estimatedMonthlySpend;
  }

  public SSIOCreateInsertionOrderRequest currencyInfo(Currency currencyInfo) {
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

  public void setCurrencyInfo(Currency currencyInfo) {
    this.currencyInfo = currencyInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest = (SSIOCreateInsertionOrderRequest) o;
    return Objects.equals(this.startDate, ssIOCreateInsertionOrderRequest.startDate) &&
        Objects.equals(this.endDate, ssIOCreateInsertionOrderRequest.endDate) &&
        Objects.equals(this.poNumber, ssIOCreateInsertionOrderRequest.poNumber) &&
        Objects.equals(this.budgetAmount, ssIOCreateInsertionOrderRequest.budgetAmount) &&
        Objects.equals(this.billingContactFirstname, ssIOCreateInsertionOrderRequest.billingContactFirstname) &&
        Objects.equals(this.billingContactLastname, ssIOCreateInsertionOrderRequest.billingContactLastname) &&
        Objects.equals(this.billingContactEmail, ssIOCreateInsertionOrderRequest.billingContactEmail) &&
        Objects.equals(this.mediaContactFirstname, ssIOCreateInsertionOrderRequest.mediaContactFirstname) &&
        Objects.equals(this.mediaContactLastname, ssIOCreateInsertionOrderRequest.mediaContactLastname) &&
        Objects.equals(this.mediaContactEmail, ssIOCreateInsertionOrderRequest.mediaContactEmail) &&
        Objects.equals(this.agencyLink, ssIOCreateInsertionOrderRequest.agencyLink) &&
        Objects.equals(this.userEmail, ssIOCreateInsertionOrderRequest.userEmail) &&
        Objects.equals(this.acceptedTermsTime, ssIOCreateInsertionOrderRequest.acceptedTermsTime) &&
        Objects.equals(this.pmpId, ssIOCreateInsertionOrderRequest.pmpId) &&
        Objects.equals(this.orderName, ssIOCreateInsertionOrderRequest.orderName) &&
        Objects.equals(this.orderLineType, ssIOCreateInsertionOrderRequest.orderLineType) &&
        Objects.equals(this.acceptedTermsId, ssIOCreateInsertionOrderRequest.acceptedTermsId) &&
        Objects.equals(this.billtoCompanyId, ssIOCreateInsertionOrderRequest.billtoCompanyId) &&
        Objects.equals(this.billtoBusinessAddressId, ssIOCreateInsertionOrderRequest.billtoBusinessAddressId) &&
        Objects.equals(this.billtoBillingAddressId, ssIOCreateInsertionOrderRequest.billtoBillingAddressId) &&
        Objects.equals(this.estimatedMonthlySpend, ssIOCreateInsertionOrderRequest.estimatedMonthlySpend) &&
        Objects.equals(this.currencyInfo, ssIOCreateInsertionOrderRequest.currencyInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, poNumber, budgetAmount, billingContactFirstname, billingContactLastname, billingContactEmail, mediaContactFirstname, mediaContactLastname, mediaContactEmail, agencyLink, userEmail, acceptedTermsTime, pmpId, orderName, orderLineType, acceptedTermsId, billtoCompanyId, billtoBusinessAddressId, billtoBillingAddressId, estimatedMonthlySpend, currencyInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSIOCreateInsertionOrderRequest {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    poNumber: ").append(toIndentedString(poNumber)).append("\n");
    sb.append("    budgetAmount: ").append(toIndentedString(budgetAmount)).append("\n");
    sb.append("    billingContactFirstname: ").append(toIndentedString(billingContactFirstname)).append("\n");
    sb.append("    billingContactLastname: ").append(toIndentedString(billingContactLastname)).append("\n");
    sb.append("    billingContactEmail: ").append(toIndentedString(billingContactEmail)).append("\n");
    sb.append("    mediaContactFirstname: ").append(toIndentedString(mediaContactFirstname)).append("\n");
    sb.append("    mediaContactLastname: ").append(toIndentedString(mediaContactLastname)).append("\n");
    sb.append("    mediaContactEmail: ").append(toIndentedString(mediaContactEmail)).append("\n");
    sb.append("    agencyLink: ").append(toIndentedString(agencyLink)).append("\n");
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
    sb.append("    acceptedTermsTime: ").append(toIndentedString(acceptedTermsTime)).append("\n");
    sb.append("    pmpId: ").append(toIndentedString(pmpId)).append("\n");
    sb.append("    orderName: ").append(toIndentedString(orderName)).append("\n");
    sb.append("    orderLineType: ").append(toIndentedString(orderLineType)).append("\n");
    sb.append("    acceptedTermsId: ").append(toIndentedString(acceptedTermsId)).append("\n");
    sb.append("    billtoCompanyId: ").append(toIndentedString(billtoCompanyId)).append("\n");
    sb.append("    billtoBusinessAddressId: ").append(toIndentedString(billtoBusinessAddressId)).append("\n");
    sb.append("    billtoBillingAddressId: ").append(toIndentedString(billtoBillingAddressId)).append("\n");
    sb.append("    estimatedMonthlySpend: ").append(toIndentedString(estimatedMonthlySpend)).append("\n");
    sb.append("    currencyInfo: ").append(toIndentedString(currencyInfo)).append("\n");
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

