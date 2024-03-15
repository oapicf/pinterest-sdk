package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.model.Currency;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SSIOCreateInsertionOrderRequest  {
  
 /**
  * Starting date of time period. Format: YYYY-MM-DD
  */
  @ApiModelProperty(example = "2020-12-20", required = true, value = "Starting date of time period. Format: YYYY-MM-DD")
  private String startDate;

 /**
  * End date of time period. Format: YYYY-MM-DD
  */
  @ApiModelProperty(example = "2020-12-20", value = "End date of time period. Format: YYYY-MM-DD")
  private String endDate;

 /**
  * The po number
  */
  @ApiModelProperty(required = true, value = "The po number")
  private String poNumber;

 /**
  * If Budget order line, the budget amount.
  */
  @ApiModelProperty(example = "5000000", value = "If Budget order line, the budget amount.")
  @Valid
  private BigDecimal budgetAmount;

 /**
  * The billing contact first name
  */
  @ApiModelProperty(required = true, value = "The billing contact first name")
  private String billingContactFirstname;

 /**
  * The billing contact last name
  */
  @ApiModelProperty(required = true, value = "The billing contact last name")
  private String billingContactLastname;

 /**
  * The billing contact email
  */
  @ApiModelProperty(example = "test@example", required = true, value = "The billing contact email")
  private String billingContactEmail;

 /**
  * The media contact first name
  */
  @ApiModelProperty(required = true, value = "The media contact first name")
  private String mediaContactFirstname;

 /**
  * The media contact last name
  */
  @ApiModelProperty(required = true, value = "The media contact last name")
  private String mediaContactLastname;

 /**
  * The media contact email
  */
  @ApiModelProperty(example = "test@example", required = true, value = "The media contact email")
  private String mediaContactEmail;

 /**
  * URL link for agency
  */
  @ApiModelProperty(value = "URL link for agency")
  private String agencyLink;

 /**
  * The email of user submitting the insertion order
  */
  @ApiModelProperty(example = "test@example", value = "The email of user submitting the insertion order")
  private String userEmail;

 /**
  * The UTC timestamp (to the nearest sec) of when terms were accepted
  */
  @ApiModelProperty(value = "The UTC timestamp (to the nearest sec) of when terms were accepted")
  private Integer acceptedTermsTime;

 /**
  * The pmp id
  */
  @ApiModelProperty(required = true, value = "The pmp id")
  private String pmpId;

 /**
  * The order name
  */
  @ApiModelProperty(required = true, value = "The order name")
  private String orderName;

public enum OrderLineTypeEnum {

    @JsonProperty("BUDGET") BUDGET(String.valueOf("BUDGET")),
    @JsonProperty("PERPETUALS") PERPETUALS(String.valueOf("PERPETUALS"));

    private String value;

    OrderLineTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OrderLineTypeEnum fromValue(String value) {
        for (OrderLineTypeEnum b : OrderLineTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * Type can be Budget or Perpetual
  */
  @ApiModelProperty(required = true, value = "Type can be Budget or Perpetual")
  private OrderLineTypeEnum orderLineType;

 /**
  * The SFDC id for the terms
  */
  @ApiModelProperty(required = true, value = "The SFDC id for the terms")
  private String acceptedTermsId;

 /**
  * The bill-to company id
  */
  @ApiModelProperty(required = true, value = "The bill-to company id")
  private String billtoCompanyId;

 /**
  * The bill-to business address id
  */
  @ApiModelProperty(required = true, value = "The bill-to business address id")
  private String billtoBusinessAddressId;

 /**
  * The bill-to billing address id
  */
  @ApiModelProperty(required = true, value = "The bill-to billing address id")
  private String billtoBillingAddressId;

 /**
  * If Ongoing (perpetual) order line, the estimated monthly spend
  */
  @ApiModelProperty(value = "If Ongoing (perpetual) order line, the estimated monthly spend")
  @Valid
  private BigDecimal estimatedMonthlySpend;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private Currency currencyInfo;
 /**
  * Starting date of time period. Format: YYYY-MM-DD
  * @return startDate
  */
  @JsonProperty("start_date")
  @NotNull
 @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")  public String getStartDate() {
    return startDate;
  }

  /**
   * Sets the <code>startDate</code> property.
   */
 public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * Sets the <code>startDate</code> property.
   */
  public SSIOCreateInsertionOrderRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

 /**
  * End date of time period. Format: YYYY-MM-DD
  * @return endDate
  */
  @JsonProperty("end_date")
 @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")  public String getEndDate() {
    return endDate;
  }

  /**
   * Sets the <code>endDate</code> property.
   */
 public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   * Sets the <code>endDate</code> property.
   */
  public SSIOCreateInsertionOrderRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

 /**
  * The po number
  * @return poNumber
  */
  @JsonProperty("po_number")
  @NotNull
  public String getPoNumber() {
    return poNumber;
  }

  /**
   * Sets the <code>poNumber</code> property.
   */
 public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }

  /**
   * Sets the <code>poNumber</code> property.
   */
  public SSIOCreateInsertionOrderRequest poNumber(String poNumber) {
    this.poNumber = poNumber;
    return this;
  }

 /**
  * If Budget order line, the budget amount.
  * @return budgetAmount
  */
  @JsonProperty("budget_amount")
  public BigDecimal getBudgetAmount() {
    return budgetAmount;
  }

  /**
   * Sets the <code>budgetAmount</code> property.
   */
 public void setBudgetAmount(BigDecimal budgetAmount) {
    this.budgetAmount = budgetAmount;
  }

  /**
   * Sets the <code>budgetAmount</code> property.
   */
  public SSIOCreateInsertionOrderRequest budgetAmount(BigDecimal budgetAmount) {
    this.budgetAmount = budgetAmount;
    return this;
  }

 /**
  * The billing contact first name
  * @return billingContactFirstname
  */
  @JsonProperty("billing_contact_firstname")
  @NotNull
  public String getBillingContactFirstname() {
    return billingContactFirstname;
  }

  /**
   * Sets the <code>billingContactFirstname</code> property.
   */
 public void setBillingContactFirstname(String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
  }

  /**
   * Sets the <code>billingContactFirstname</code> property.
   */
  public SSIOCreateInsertionOrderRequest billingContactFirstname(String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
    return this;
  }

 /**
  * The billing contact last name
  * @return billingContactLastname
  */
  @JsonProperty("billing_contact_lastname")
  @NotNull
  public String getBillingContactLastname() {
    return billingContactLastname;
  }

  /**
   * Sets the <code>billingContactLastname</code> property.
   */
 public void setBillingContactLastname(String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
  }

  /**
   * Sets the <code>billingContactLastname</code> property.
   */
  public SSIOCreateInsertionOrderRequest billingContactLastname(String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
    return this;
  }

 /**
  * The billing contact email
  * @return billingContactEmail
  */
  @JsonProperty("billing_contact_email")
  @NotNull
  public String getBillingContactEmail() {
    return billingContactEmail;
  }

  /**
   * Sets the <code>billingContactEmail</code> property.
   */
 public void setBillingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
  }

  /**
   * Sets the <code>billingContactEmail</code> property.
   */
  public SSIOCreateInsertionOrderRequest billingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
    return this;
  }

 /**
  * The media contact first name
  * @return mediaContactFirstname
  */
  @JsonProperty("media_contact_firstname")
  @NotNull
  public String getMediaContactFirstname() {
    return mediaContactFirstname;
  }

  /**
   * Sets the <code>mediaContactFirstname</code> property.
   */
 public void setMediaContactFirstname(String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
  }

  /**
   * Sets the <code>mediaContactFirstname</code> property.
   */
  public SSIOCreateInsertionOrderRequest mediaContactFirstname(String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
    return this;
  }

 /**
  * The media contact last name
  * @return mediaContactLastname
  */
  @JsonProperty("media_contact_lastname")
  @NotNull
  public String getMediaContactLastname() {
    return mediaContactLastname;
  }

  /**
   * Sets the <code>mediaContactLastname</code> property.
   */
 public void setMediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
  }

  /**
   * Sets the <code>mediaContactLastname</code> property.
   */
  public SSIOCreateInsertionOrderRequest mediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
    return this;
  }

 /**
  * The media contact email
  * @return mediaContactEmail
  */
  @JsonProperty("media_contact_email")
  @NotNull
  public String getMediaContactEmail() {
    return mediaContactEmail;
  }

  /**
   * Sets the <code>mediaContactEmail</code> property.
   */
 public void setMediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
  }

  /**
   * Sets the <code>mediaContactEmail</code> property.
   */
  public SSIOCreateInsertionOrderRequest mediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
    return this;
  }

 /**
  * URL link for agency
  * @return agencyLink
  */
  @JsonProperty("agency_link")
  public String getAgencyLink() {
    return agencyLink;
  }

  /**
   * Sets the <code>agencyLink</code> property.
   */
 public void setAgencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
  }

  /**
   * Sets the <code>agencyLink</code> property.
   */
  public SSIOCreateInsertionOrderRequest agencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
    return this;
  }

 /**
  * The email of user submitting the insertion order
  * @return userEmail
  */
  @JsonProperty("user_email")
  public String getUserEmail() {
    return userEmail;
  }

  /**
   * Sets the <code>userEmail</code> property.
   */
 public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  /**
   * Sets the <code>userEmail</code> property.
   */
  public SSIOCreateInsertionOrderRequest userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

 /**
  * The UTC timestamp (to the nearest sec) of when terms were accepted
  * @return acceptedTermsTime
  */
  @JsonProperty("accepted_terms_time")
  public Integer getAcceptedTermsTime() {
    return acceptedTermsTime;
  }

  /**
   * Sets the <code>acceptedTermsTime</code> property.
   */
 public void setAcceptedTermsTime(Integer acceptedTermsTime) {
    this.acceptedTermsTime = acceptedTermsTime;
  }

  /**
   * Sets the <code>acceptedTermsTime</code> property.
   */
  public SSIOCreateInsertionOrderRequest acceptedTermsTime(Integer acceptedTermsTime) {
    this.acceptedTermsTime = acceptedTermsTime;
    return this;
  }

 /**
  * The pmp id
  * @return pmpId
  */
  @JsonProperty("pmp_id")
  @NotNull
  public String getPmpId() {
    return pmpId;
  }

  /**
   * Sets the <code>pmpId</code> property.
   */
 public void setPmpId(String pmpId) {
    this.pmpId = pmpId;
  }

  /**
   * Sets the <code>pmpId</code> property.
   */
  public SSIOCreateInsertionOrderRequest pmpId(String pmpId) {
    this.pmpId = pmpId;
    return this;
  }

 /**
  * The order name
  * @return orderName
  */
  @JsonProperty("order_name")
  @NotNull
  public String getOrderName() {
    return orderName;
  }

  /**
   * Sets the <code>orderName</code> property.
   */
 public void setOrderName(String orderName) {
    this.orderName = orderName;
  }

  /**
   * Sets the <code>orderName</code> property.
   */
  public SSIOCreateInsertionOrderRequest orderName(String orderName) {
    this.orderName = orderName;
    return this;
  }

 /**
  * Type can be Budget or Perpetual
  * @return orderLineType
  */
  @JsonProperty("order_line_type")
  @NotNull
  public String getOrderLineType() {
    return orderLineType == null ? null : orderLineType.value();
  }

  /**
   * Sets the <code>orderLineType</code> property.
   */
 public void setOrderLineType(OrderLineTypeEnum orderLineType) {
    this.orderLineType = orderLineType;
  }

  /**
   * Sets the <code>orderLineType</code> property.
   */
  public SSIOCreateInsertionOrderRequest orderLineType(OrderLineTypeEnum orderLineType) {
    this.orderLineType = orderLineType;
    return this;
  }

 /**
  * The SFDC id for the terms
  * @return acceptedTermsId
  */
  @JsonProperty("accepted_terms_id")
  @NotNull
  public String getAcceptedTermsId() {
    return acceptedTermsId;
  }

  /**
   * Sets the <code>acceptedTermsId</code> property.
   */
 public void setAcceptedTermsId(String acceptedTermsId) {
    this.acceptedTermsId = acceptedTermsId;
  }

  /**
   * Sets the <code>acceptedTermsId</code> property.
   */
  public SSIOCreateInsertionOrderRequest acceptedTermsId(String acceptedTermsId) {
    this.acceptedTermsId = acceptedTermsId;
    return this;
  }

 /**
  * The bill-to company id
  * @return billtoCompanyId
  */
  @JsonProperty("billto_company_id")
  @NotNull
  public String getBilltoCompanyId() {
    return billtoCompanyId;
  }

  /**
   * Sets the <code>billtoCompanyId</code> property.
   */
 public void setBilltoCompanyId(String billtoCompanyId) {
    this.billtoCompanyId = billtoCompanyId;
  }

  /**
   * Sets the <code>billtoCompanyId</code> property.
   */
  public SSIOCreateInsertionOrderRequest billtoCompanyId(String billtoCompanyId) {
    this.billtoCompanyId = billtoCompanyId;
    return this;
  }

 /**
  * The bill-to business address id
  * @return billtoBusinessAddressId
  */
  @JsonProperty("billto_business_address_id")
  @NotNull
  public String getBilltoBusinessAddressId() {
    return billtoBusinessAddressId;
  }

  /**
   * Sets the <code>billtoBusinessAddressId</code> property.
   */
 public void setBilltoBusinessAddressId(String billtoBusinessAddressId) {
    this.billtoBusinessAddressId = billtoBusinessAddressId;
  }

  /**
   * Sets the <code>billtoBusinessAddressId</code> property.
   */
  public SSIOCreateInsertionOrderRequest billtoBusinessAddressId(String billtoBusinessAddressId) {
    this.billtoBusinessAddressId = billtoBusinessAddressId;
    return this;
  }

 /**
  * The bill-to billing address id
  * @return billtoBillingAddressId
  */
  @JsonProperty("billto_billing_address_id")
  @NotNull
  public String getBilltoBillingAddressId() {
    return billtoBillingAddressId;
  }

  /**
   * Sets the <code>billtoBillingAddressId</code> property.
   */
 public void setBilltoBillingAddressId(String billtoBillingAddressId) {
    this.billtoBillingAddressId = billtoBillingAddressId;
  }

  /**
   * Sets the <code>billtoBillingAddressId</code> property.
   */
  public SSIOCreateInsertionOrderRequest billtoBillingAddressId(String billtoBillingAddressId) {
    this.billtoBillingAddressId = billtoBillingAddressId;
    return this;
  }

 /**
  * If Ongoing (perpetual) order line, the estimated monthly spend
  * @return estimatedMonthlySpend
  */
  @JsonProperty("estimated_monthly_spend")
  public BigDecimal getEstimatedMonthlySpend() {
    return estimatedMonthlySpend;
  }

  /**
   * Sets the <code>estimatedMonthlySpend</code> property.
   */
 public void setEstimatedMonthlySpend(BigDecimal estimatedMonthlySpend) {
    this.estimatedMonthlySpend = estimatedMonthlySpend;
  }

  /**
   * Sets the <code>estimatedMonthlySpend</code> property.
   */
  public SSIOCreateInsertionOrderRequest estimatedMonthlySpend(BigDecimal estimatedMonthlySpend) {
    this.estimatedMonthlySpend = estimatedMonthlySpend;
    return this;
  }

 /**
  * Get currencyInfo
  * @return currencyInfo
  */
  @JsonProperty("currency_info")
  @NotNull
  public Currency getCurrencyInfo() {
    return currencyInfo;
  }

  /**
   * Sets the <code>currencyInfo</code> property.
   */
 public void setCurrencyInfo(Currency currencyInfo) {
    this.currencyInfo = currencyInfo;
  }

  /**
   * Sets the <code>currencyInfo</code> property.
   */
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

