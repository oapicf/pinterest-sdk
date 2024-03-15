package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.Currency;

/**
 * SSIOCreateInsertionOrderRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-14T23:02:29.393275857Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class SSIOCreateInsertionOrderRequest   {
  @JsonProperty("start_date")
  private String startDate;

  @JsonProperty("end_date")
  private String endDate;

  @JsonProperty("po_number")
  private String poNumber;

  @JsonProperty("budget_amount")
  private BigDecimal budgetAmount;

  @JsonProperty("billing_contact_firstname")
  private String billingContactFirstname;

  @JsonProperty("billing_contact_lastname")
  private String billingContactLastname;

  @JsonProperty("billing_contact_email")
  private String billingContactEmail;

  @JsonProperty("media_contact_firstname")
  private String mediaContactFirstname;

  @JsonProperty("media_contact_lastname")
  private String mediaContactLastname;

  @JsonProperty("media_contact_email")
  private String mediaContactEmail;

  @JsonProperty("agency_link")
  private String agencyLink;

  @JsonProperty("user_email")
  private String userEmail;

  @JsonProperty("accepted_terms_time")
  private Integer acceptedTermsTime;

  @JsonProperty("pmp_id")
  private String pmpId;

  @JsonProperty("order_name")
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

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OrderLineTypeEnum fromValue(String text) {
      for (OrderLineTypeEnum b : OrderLineTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("order_line_type")
  private OrderLineTypeEnum orderLineType;

  @JsonProperty("accepted_terms_id")
  private String acceptedTermsId;

  @JsonProperty("billto_company_id")
  private String billtoCompanyId;

  @JsonProperty("billto_business_address_id")
  private String billtoBusinessAddressId;

  @JsonProperty("billto_billing_address_id")
  private String billtoBillingAddressId;

  @JsonProperty("estimated_monthly_spend")
  private BigDecimal estimatedMonthlySpend;

  @JsonProperty("currency_info")
  private Currency currencyInfo;

  public SSIOCreateInsertionOrderRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Starting date of time period. Format: YYYY-MM-DD
   * @return startDate
  **/
  @ApiModelProperty(example = "2020-12-20", required = true, value = "Starting date of time period. Format: YYYY-MM-DD")
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
  **/
  @ApiModelProperty(example = "2020-12-20", value = "End date of time period. Format: YYYY-MM-DD")
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
  **/
  @ApiModelProperty(required = true, value = "The po number")
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
  **/
  @ApiModelProperty(example = "5000000", value = "If Budget order line, the budget amount.")
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
  **/
  @ApiModelProperty(required = true, value = "The billing contact first name")
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
  **/
  @ApiModelProperty(required = true, value = "The billing contact last name")
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
  **/
  @ApiModelProperty(example = "test@example", required = true, value = "The billing contact email")
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
  **/
  @ApiModelProperty(required = true, value = "The media contact first name")
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
  **/
  @ApiModelProperty(required = true, value = "The media contact last name")
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
  **/
  @ApiModelProperty(example = "test@example", required = true, value = "The media contact email")
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
  **/
  @ApiModelProperty(value = "URL link for agency")
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
  **/
  @ApiModelProperty(example = "test@example", value = "The email of user submitting the insertion order")
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
  **/
  @ApiModelProperty(value = "The UTC timestamp (to the nearest sec) of when terms were accepted")
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
  **/
  @ApiModelProperty(required = true, value = "The pmp id")
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
  **/
  @ApiModelProperty(required = true, value = "The order name")
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
  **/
  @ApiModelProperty(required = true, value = "Type can be Budget or Perpetual")
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
  **/
  @ApiModelProperty(required = true, value = "The SFDC id for the terms")
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
  **/
  @ApiModelProperty(required = true, value = "The bill-to company id")
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
  **/
  @ApiModelProperty(required = true, value = "The bill-to business address id")
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
  **/
  @ApiModelProperty(required = true, value = "The bill-to billing address id")
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
  **/
  @ApiModelProperty(value = "If Ongoing (perpetual) order line, the estimated monthly spend")
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
  **/
  @ApiModelProperty(required = true, value = "")
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

