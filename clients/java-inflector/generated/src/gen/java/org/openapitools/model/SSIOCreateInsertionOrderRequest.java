package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.Currency;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-14T23:01:39.171456580Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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

  /**
   * Starting date of time period. Format: YYYY-MM-DD
   **/
  public SSIOCreateInsertionOrderRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  
  @ApiModelProperty(example = "2020-12-20", required = true, value = "Starting date of time period. Format: YYYY-MM-DD")
  @JsonProperty("start_date")
  public String getStartDate() {
    return startDate;
  }
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * End date of time period. Format: YYYY-MM-DD
   **/
  public SSIOCreateInsertionOrderRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  
  @ApiModelProperty(example = "2020-12-20", value = "End date of time period. Format: YYYY-MM-DD")
  @JsonProperty("end_date")
  public String getEndDate() {
    return endDate;
  }
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   * The po number
   **/
  public SSIOCreateInsertionOrderRequest poNumber(String poNumber) {
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
   * If Budget order line, the budget amount.
   **/
  public SSIOCreateInsertionOrderRequest budgetAmount(BigDecimal budgetAmount) {
    this.budgetAmount = budgetAmount;
    return this;
  }

  
  @ApiModelProperty(example = "5000000", value = "If Budget order line, the budget amount.")
  @JsonProperty("budget_amount")
  public BigDecimal getBudgetAmount() {
    return budgetAmount;
  }
  public void setBudgetAmount(BigDecimal budgetAmount) {
    this.budgetAmount = budgetAmount;
  }

  /**
   * The billing contact first name
   **/
  public SSIOCreateInsertionOrderRequest billingContactFirstname(String billingContactFirstname) {
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
   **/
  public SSIOCreateInsertionOrderRequest billingContactLastname(String billingContactLastname) {
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
   * The billing contact email
   **/
  public SSIOCreateInsertionOrderRequest billingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
    return this;
  }

  
  @ApiModelProperty(example = "test@example", required = true, value = "The billing contact email")
  @JsonProperty("billing_contact_email")
  public String getBillingContactEmail() {
    return billingContactEmail;
  }
  public void setBillingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
  }

  /**
   * The media contact first name
   **/
  public SSIOCreateInsertionOrderRequest mediaContactFirstname(String mediaContactFirstname) {
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
   **/
  public SSIOCreateInsertionOrderRequest mediaContactLastname(String mediaContactLastname) {
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
   * The media contact email
   **/
  public SSIOCreateInsertionOrderRequest mediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
    return this;
  }

  
  @ApiModelProperty(example = "test@example", required = true, value = "The media contact email")
  @JsonProperty("media_contact_email")
  public String getMediaContactEmail() {
    return mediaContactEmail;
  }
  public void setMediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
  }

  /**
   * URL link for agency
   **/
  public SSIOCreateInsertionOrderRequest agencyLink(String agencyLink) {
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
   * The email of user submitting the insertion order
   **/
  public SSIOCreateInsertionOrderRequest userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  
  @ApiModelProperty(example = "test@example", value = "The email of user submitting the insertion order")
  @JsonProperty("user_email")
  public String getUserEmail() {
    return userEmail;
  }
  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  /**
   * The UTC timestamp (to the nearest sec) of when terms were accepted
   **/
  public SSIOCreateInsertionOrderRequest acceptedTermsTime(Integer acceptedTermsTime) {
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
   * The pmp id
   **/
  public SSIOCreateInsertionOrderRequest pmpId(String pmpId) {
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
   * The order name
   **/
  public SSIOCreateInsertionOrderRequest orderName(String orderName) {
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
   * Type can be Budget or Perpetual
   **/
  public SSIOCreateInsertionOrderRequest orderLineType(OrderLineTypeEnum orderLineType) {
    this.orderLineType = orderLineType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Type can be Budget or Perpetual")
  @JsonProperty("order_line_type")
  public OrderLineTypeEnum getOrderLineType() {
    return orderLineType;
  }
  public void setOrderLineType(OrderLineTypeEnum orderLineType) {
    this.orderLineType = orderLineType;
  }

  /**
   * The SFDC id for the terms
   **/
  public SSIOCreateInsertionOrderRequest acceptedTermsId(String acceptedTermsId) {
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
   * The bill-to company id
   **/
  public SSIOCreateInsertionOrderRequest billtoCompanyId(String billtoCompanyId) {
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
   * The bill-to business address id
   **/
  public SSIOCreateInsertionOrderRequest billtoBusinessAddressId(String billtoBusinessAddressId) {
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
   * The bill-to billing address id
   **/
  public SSIOCreateInsertionOrderRequest billtoBillingAddressId(String billtoBillingAddressId) {
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
   * If Ongoing (perpetual) order line, the estimated monthly spend
   **/
  public SSIOCreateInsertionOrderRequest estimatedMonthlySpend(BigDecimal estimatedMonthlySpend) {
    this.estimatedMonthlySpend = estimatedMonthlySpend;
    return this;
  }

  
  @ApiModelProperty(value = "If Ongoing (perpetual) order line, the estimated monthly spend")
  @JsonProperty("estimated_monthly_spend")
  public BigDecimal getEstimatedMonthlySpend() {
    return estimatedMonthlySpend;
  }
  public void setEstimatedMonthlySpend(BigDecimal estimatedMonthlySpend) {
    this.estimatedMonthlySpend = estimatedMonthlySpend;
  }

  /**
   **/
  public SSIOCreateInsertionOrderRequest currencyInfo(Currency currencyInfo) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest = (SSIOCreateInsertionOrderRequest) o;
    return Objects.equals(startDate, ssIOCreateInsertionOrderRequest.startDate) &&
        Objects.equals(endDate, ssIOCreateInsertionOrderRequest.endDate) &&
        Objects.equals(poNumber, ssIOCreateInsertionOrderRequest.poNumber) &&
        Objects.equals(budgetAmount, ssIOCreateInsertionOrderRequest.budgetAmount) &&
        Objects.equals(billingContactFirstname, ssIOCreateInsertionOrderRequest.billingContactFirstname) &&
        Objects.equals(billingContactLastname, ssIOCreateInsertionOrderRequest.billingContactLastname) &&
        Objects.equals(billingContactEmail, ssIOCreateInsertionOrderRequest.billingContactEmail) &&
        Objects.equals(mediaContactFirstname, ssIOCreateInsertionOrderRequest.mediaContactFirstname) &&
        Objects.equals(mediaContactLastname, ssIOCreateInsertionOrderRequest.mediaContactLastname) &&
        Objects.equals(mediaContactEmail, ssIOCreateInsertionOrderRequest.mediaContactEmail) &&
        Objects.equals(agencyLink, ssIOCreateInsertionOrderRequest.agencyLink) &&
        Objects.equals(userEmail, ssIOCreateInsertionOrderRequest.userEmail) &&
        Objects.equals(acceptedTermsTime, ssIOCreateInsertionOrderRequest.acceptedTermsTime) &&
        Objects.equals(pmpId, ssIOCreateInsertionOrderRequest.pmpId) &&
        Objects.equals(orderName, ssIOCreateInsertionOrderRequest.orderName) &&
        Objects.equals(orderLineType, ssIOCreateInsertionOrderRequest.orderLineType) &&
        Objects.equals(acceptedTermsId, ssIOCreateInsertionOrderRequest.acceptedTermsId) &&
        Objects.equals(billtoCompanyId, ssIOCreateInsertionOrderRequest.billtoCompanyId) &&
        Objects.equals(billtoBusinessAddressId, ssIOCreateInsertionOrderRequest.billtoBusinessAddressId) &&
        Objects.equals(billtoBillingAddressId, ssIOCreateInsertionOrderRequest.billtoBillingAddressId) &&
        Objects.equals(estimatedMonthlySpend, ssIOCreateInsertionOrderRequest.estimatedMonthlySpend) &&
        Objects.equals(currencyInfo, ssIOCreateInsertionOrderRequest.currencyInfo);
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

