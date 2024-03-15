package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.model.Currency;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SSIOCreateInsertionOrderRequest  {
  
  @ApiModelProperty(example = "2020-12-20", required = true, value = "Starting date of time period. Format: YYYY-MM-DD")
 /**
   * Starting date of time period. Format: YYYY-MM-DD
  **/
  private String startDate;

  @ApiModelProperty(example = "2020-12-20", value = "End date of time period. Format: YYYY-MM-DD")
 /**
   * End date of time period. Format: YYYY-MM-DD
  **/
  private String endDate;

  @ApiModelProperty(required = true, value = "The po number")
 /**
   * The po number
  **/
  private String poNumber;

  @ApiModelProperty(example = "5000000", value = "If Budget order line, the budget amount.")
  @Valid
 /**
   * If Budget order line, the budget amount.
  **/
  private BigDecimal budgetAmount;

  @ApiModelProperty(required = true, value = "The billing contact first name")
 /**
   * The billing contact first name
  **/
  private String billingContactFirstname;

  @ApiModelProperty(required = true, value = "The billing contact last name")
 /**
   * The billing contact last name
  **/
  private String billingContactLastname;

  @ApiModelProperty(example = "test@example", required = true, value = "The billing contact email")
 /**
   * The billing contact email
  **/
  private String billingContactEmail;

  @ApiModelProperty(required = true, value = "The media contact first name")
 /**
   * The media contact first name
  **/
  private String mediaContactFirstname;

  @ApiModelProperty(required = true, value = "The media contact last name")
 /**
   * The media contact last name
  **/
  private String mediaContactLastname;

  @ApiModelProperty(example = "test@example", required = true, value = "The media contact email")
 /**
   * The media contact email
  **/
  private String mediaContactEmail;

  @ApiModelProperty(value = "URL link for agency")
 /**
   * URL link for agency
  **/
  private String agencyLink;

  @ApiModelProperty(example = "test@example", value = "The email of user submitting the insertion order")
 /**
   * The email of user submitting the insertion order
  **/
  private String userEmail;

  @ApiModelProperty(value = "The UTC timestamp (to the nearest sec) of when terms were accepted")
 /**
   * The UTC timestamp (to the nearest sec) of when terms were accepted
  **/
  private Integer acceptedTermsTime;

  @ApiModelProperty(required = true, value = "The pmp id")
 /**
   * The pmp id
  **/
  private String pmpId;

  @ApiModelProperty(required = true, value = "The order name")
 /**
   * The order name
  **/
  private String orderName;

public enum OrderLineTypeEnum {

BUDGET(String.valueOf("BUDGET")), PERPETUALS(String.valueOf("PERPETUALS"));


    private String value;

    OrderLineTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
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

  @ApiModelProperty(required = true, value = "Type can be Budget or Perpetual")
 /**
   * Type can be Budget or Perpetual
  **/
  private OrderLineTypeEnum orderLineType;

  @ApiModelProperty(required = true, value = "The SFDC id for the terms")
 /**
   * The SFDC id for the terms
  **/
  private String acceptedTermsId;

  @ApiModelProperty(required = true, value = "The bill-to company id")
 /**
   * The bill-to company id
  **/
  private String billtoCompanyId;

  @ApiModelProperty(required = true, value = "The bill-to business address id")
 /**
   * The bill-to business address id
  **/
  private String billtoBusinessAddressId;

  @ApiModelProperty(required = true, value = "The bill-to billing address id")
 /**
   * The bill-to billing address id
  **/
  private String billtoBillingAddressId;

  @ApiModelProperty(value = "If Ongoing (perpetual) order line, the estimated monthly spend")
  @Valid
 /**
   * If Ongoing (perpetual) order line, the estimated monthly spend
  **/
  private BigDecimal estimatedMonthlySpend;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private Currency currencyInfo;
 /**
   * Starting date of time period. Format: YYYY-MM-DD
   * @return startDate
  **/
  @JsonProperty("start_date")
  @NotNull
 @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public SSIOCreateInsertionOrderRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

 /**
   * End date of time period. Format: YYYY-MM-DD
   * @return endDate
  **/
  @JsonProperty("end_date")
 @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public SSIOCreateInsertionOrderRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

 /**
   * The po number
   * @return poNumber
  **/
  @JsonProperty("po_number")
  @NotNull
  public String getPoNumber() {
    return poNumber;
  }

  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }

  public SSIOCreateInsertionOrderRequest poNumber(String poNumber) {
    this.poNumber = poNumber;
    return this;
  }

 /**
   * If Budget order line, the budget amount.
   * @return budgetAmount
  **/
  @JsonProperty("budget_amount")
  public BigDecimal getBudgetAmount() {
    return budgetAmount;
  }

  public void setBudgetAmount(BigDecimal budgetAmount) {
    this.budgetAmount = budgetAmount;
  }

  public SSIOCreateInsertionOrderRequest budgetAmount(BigDecimal budgetAmount) {
    this.budgetAmount = budgetAmount;
    return this;
  }

 /**
   * The billing contact first name
   * @return billingContactFirstname
  **/
  @JsonProperty("billing_contact_firstname")
  @NotNull
  public String getBillingContactFirstname() {
    return billingContactFirstname;
  }

  public void setBillingContactFirstname(String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
  }

  public SSIOCreateInsertionOrderRequest billingContactFirstname(String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
    return this;
  }

 /**
   * The billing contact last name
   * @return billingContactLastname
  **/
  @JsonProperty("billing_contact_lastname")
  @NotNull
  public String getBillingContactLastname() {
    return billingContactLastname;
  }

  public void setBillingContactLastname(String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
  }

  public SSIOCreateInsertionOrderRequest billingContactLastname(String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
    return this;
  }

 /**
   * The billing contact email
   * @return billingContactEmail
  **/
  @JsonProperty("billing_contact_email")
  @NotNull
  public String getBillingContactEmail() {
    return billingContactEmail;
  }

  public void setBillingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
  }

  public SSIOCreateInsertionOrderRequest billingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
    return this;
  }

 /**
   * The media contact first name
   * @return mediaContactFirstname
  **/
  @JsonProperty("media_contact_firstname")
  @NotNull
  public String getMediaContactFirstname() {
    return mediaContactFirstname;
  }

  public void setMediaContactFirstname(String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
  }

  public SSIOCreateInsertionOrderRequest mediaContactFirstname(String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
    return this;
  }

 /**
   * The media contact last name
   * @return mediaContactLastname
  **/
  @JsonProperty("media_contact_lastname")
  @NotNull
  public String getMediaContactLastname() {
    return mediaContactLastname;
  }

  public void setMediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
  }

  public SSIOCreateInsertionOrderRequest mediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
    return this;
  }

 /**
   * The media contact email
   * @return mediaContactEmail
  **/
  @JsonProperty("media_contact_email")
  @NotNull
  public String getMediaContactEmail() {
    return mediaContactEmail;
  }

  public void setMediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
  }

  public SSIOCreateInsertionOrderRequest mediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
    return this;
  }

 /**
   * URL link for agency
   * @return agencyLink
  **/
  @JsonProperty("agency_link")
  public String getAgencyLink() {
    return agencyLink;
  }

  public void setAgencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
  }

  public SSIOCreateInsertionOrderRequest agencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
    return this;
  }

 /**
   * The email of user submitting the insertion order
   * @return userEmail
  **/
  @JsonProperty("user_email")
  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public SSIOCreateInsertionOrderRequest userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

 /**
   * The UTC timestamp (to the nearest sec) of when terms were accepted
   * @return acceptedTermsTime
  **/
  @JsonProperty("accepted_terms_time")
  public Integer getAcceptedTermsTime() {
    return acceptedTermsTime;
  }

  public void setAcceptedTermsTime(Integer acceptedTermsTime) {
    this.acceptedTermsTime = acceptedTermsTime;
  }

  public SSIOCreateInsertionOrderRequest acceptedTermsTime(Integer acceptedTermsTime) {
    this.acceptedTermsTime = acceptedTermsTime;
    return this;
  }

 /**
   * The pmp id
   * @return pmpId
  **/
  @JsonProperty("pmp_id")
  @NotNull
  public String getPmpId() {
    return pmpId;
  }

  public void setPmpId(String pmpId) {
    this.pmpId = pmpId;
  }

  public SSIOCreateInsertionOrderRequest pmpId(String pmpId) {
    this.pmpId = pmpId;
    return this;
  }

 /**
   * The order name
   * @return orderName
  **/
  @JsonProperty("order_name")
  @NotNull
  public String getOrderName() {
    return orderName;
  }

  public void setOrderName(String orderName) {
    this.orderName = orderName;
  }

  public SSIOCreateInsertionOrderRequest orderName(String orderName) {
    this.orderName = orderName;
    return this;
  }

 /**
   * Type can be Budget or Perpetual
   * @return orderLineType
  **/
  @JsonProperty("order_line_type")
  @NotNull
  public String getOrderLineType() {
    if (orderLineType == null) {
      return null;
    }
    return orderLineType.value();
  }

  public void setOrderLineType(OrderLineTypeEnum orderLineType) {
    this.orderLineType = orderLineType;
  }

  public SSIOCreateInsertionOrderRequest orderLineType(OrderLineTypeEnum orderLineType) {
    this.orderLineType = orderLineType;
    return this;
  }

 /**
   * The SFDC id for the terms
   * @return acceptedTermsId
  **/
  @JsonProperty("accepted_terms_id")
  @NotNull
  public String getAcceptedTermsId() {
    return acceptedTermsId;
  }

  public void setAcceptedTermsId(String acceptedTermsId) {
    this.acceptedTermsId = acceptedTermsId;
  }

  public SSIOCreateInsertionOrderRequest acceptedTermsId(String acceptedTermsId) {
    this.acceptedTermsId = acceptedTermsId;
    return this;
  }

 /**
   * The bill-to company id
   * @return billtoCompanyId
  **/
  @JsonProperty("billto_company_id")
  @NotNull
  public String getBilltoCompanyId() {
    return billtoCompanyId;
  }

  public void setBilltoCompanyId(String billtoCompanyId) {
    this.billtoCompanyId = billtoCompanyId;
  }

  public SSIOCreateInsertionOrderRequest billtoCompanyId(String billtoCompanyId) {
    this.billtoCompanyId = billtoCompanyId;
    return this;
  }

 /**
   * The bill-to business address id
   * @return billtoBusinessAddressId
  **/
  @JsonProperty("billto_business_address_id")
  @NotNull
  public String getBilltoBusinessAddressId() {
    return billtoBusinessAddressId;
  }

  public void setBilltoBusinessAddressId(String billtoBusinessAddressId) {
    this.billtoBusinessAddressId = billtoBusinessAddressId;
  }

  public SSIOCreateInsertionOrderRequest billtoBusinessAddressId(String billtoBusinessAddressId) {
    this.billtoBusinessAddressId = billtoBusinessAddressId;
    return this;
  }

 /**
   * The bill-to billing address id
   * @return billtoBillingAddressId
  **/
  @JsonProperty("billto_billing_address_id")
  @NotNull
  public String getBilltoBillingAddressId() {
    return billtoBillingAddressId;
  }

  public void setBilltoBillingAddressId(String billtoBillingAddressId) {
    this.billtoBillingAddressId = billtoBillingAddressId;
  }

  public SSIOCreateInsertionOrderRequest billtoBillingAddressId(String billtoBillingAddressId) {
    this.billtoBillingAddressId = billtoBillingAddressId;
    return this;
  }

 /**
   * If Ongoing (perpetual) order line, the estimated monthly spend
   * @return estimatedMonthlySpend
  **/
  @JsonProperty("estimated_monthly_spend")
  public BigDecimal getEstimatedMonthlySpend() {
    return estimatedMonthlySpend;
  }

  public void setEstimatedMonthlySpend(BigDecimal estimatedMonthlySpend) {
    this.estimatedMonthlySpend = estimatedMonthlySpend;
  }

  public SSIOCreateInsertionOrderRequest estimatedMonthlySpend(BigDecimal estimatedMonthlySpend) {
    this.estimatedMonthlySpend = estimatedMonthlySpend;
    return this;
  }

 /**
   * Get currencyInfo
   * @return currencyInfo
  **/
  @JsonProperty("currency_info")
  @NotNull
  public Currency getCurrencyInfo() {
    return currencyInfo;
  }

  public void setCurrencyInfo(Currency currencyInfo) {
    this.currencyInfo = currencyInfo;
  }

  public SSIOCreateInsertionOrderRequest currencyInfo(Currency currencyInfo) {
    this.currencyInfo = currencyInfo;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

