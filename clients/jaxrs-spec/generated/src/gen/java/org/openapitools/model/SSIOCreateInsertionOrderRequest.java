package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.Currency;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("SSIOCreateInsertionOrderRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class SSIOCreateInsertionOrderRequest   {
  private String agencyLink;
  private String billingContactEmail;
  private String billingContactFirstname;
  private String billingContactLastname;
  private BigDecimal budgetAmount;
  private String endDate;
  private String mediaContactEmail;
  private String mediaContactFirstname;
  private String mediaContactLastname;
  private String poNumber;
  private String startDate;
  private String userEmail;
  private String acceptedTermsId;
  private Integer acceptedTermsTime;
  private String billtoBillingAddressId;
  private String billtoBusinessAddressId;
  private String billtoCompanyId;
  private Currency currencyInfo;
  private BigDecimal estimatedMonthlySpend;
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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static OrderLineTypeEnum fromString(String s) {
        for (OrderLineTypeEnum b : OrderLineTypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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
  private String orderName;
  private String pmpId;

  public SSIOCreateInsertionOrderRequest() {
  }

  @JsonCreator
  public SSIOCreateInsertionOrderRequest(
    @JsonProperty(required = true, value = "billing_contact_email") String billingContactEmail,
    @JsonProperty(required = true, value = "billing_contact_firstname") String billingContactFirstname,
    @JsonProperty(required = true, value = "billing_contact_lastname") String billingContactLastname,
    @JsonProperty(required = true, value = "media_contact_email") String mediaContactEmail,
    @JsonProperty(required = true, value = "media_contact_firstname") String mediaContactFirstname,
    @JsonProperty(required = true, value = "media_contact_lastname") String mediaContactLastname,
    @JsonProperty(required = true, value = "po_number") String poNumber,
    @JsonProperty(required = true, value = "start_date") String startDate,
    @JsonProperty(required = true, value = "accepted_terms_id") String acceptedTermsId,
    @JsonProperty(required = true, value = "billto_billing_address_id") String billtoBillingAddressId,
    @JsonProperty(required = true, value = "billto_business_address_id") String billtoBusinessAddressId,
    @JsonProperty(required = true, value = "billto_company_id") String billtoCompanyId,
    @JsonProperty(required = true, value = "currency_info") Currency currencyInfo,
    @JsonProperty(required = true, value = "order_line_type") OrderLineTypeEnum orderLineType,
    @JsonProperty(required = true, value = "order_name") String orderName,
    @JsonProperty(required = true, value = "pmp_id") String pmpId
  ) {
    this.billingContactEmail = billingContactEmail;
    this.billingContactFirstname = billingContactFirstname;
    this.billingContactLastname = billingContactLastname;
    this.mediaContactEmail = mediaContactEmail;
    this.mediaContactFirstname = mediaContactFirstname;
    this.mediaContactLastname = mediaContactLastname;
    this.poNumber = poNumber;
    this.startDate = startDate;
    this.acceptedTermsId = acceptedTermsId;
    this.billtoBillingAddressId = billtoBillingAddressId;
    this.billtoBusinessAddressId = billtoBusinessAddressId;
    this.billtoCompanyId = billtoCompanyId;
    this.currencyInfo = currencyInfo;
    this.orderLineType = orderLineType;
    this.orderName = orderName;
    this.pmpId = pmpId;
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

  @JsonProperty("agency_link")
  public void setAgencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
  }

  /**
   * The billing contact email
   **/
  public SSIOCreateInsertionOrderRequest billingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
    return this;
  }

  
  @ApiModelProperty(example = "test@example", required = true, value = "The billing contact email")
  @JsonProperty(required = true, value = "billing_contact_email")
  @NotNull public String getBillingContactEmail() {
    return billingContactEmail;
  }

  @JsonProperty(required = true, value = "billing_contact_email")
  public void setBillingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
  }

  /**
   * The billing contact first name
   **/
  public SSIOCreateInsertionOrderRequest billingContactFirstname(String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The billing contact first name")
  @JsonProperty(required = true, value = "billing_contact_firstname")
  @NotNull public String getBillingContactFirstname() {
    return billingContactFirstname;
  }

  @JsonProperty(required = true, value = "billing_contact_firstname")
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
  @JsonProperty(required = true, value = "billing_contact_lastname")
  @NotNull public String getBillingContactLastname() {
    return billingContactLastname;
  }

  @JsonProperty(required = true, value = "billing_contact_lastname")
  public void setBillingContactLastname(String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
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
  @Valid public BigDecimal getBudgetAmount() {
    return budgetAmount;
  }

  @JsonProperty("budget_amount")
  public void setBudgetAmount(BigDecimal budgetAmount) {
    this.budgetAmount = budgetAmount;
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
   @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")public String getEndDate() {
    return endDate;
  }

  @JsonProperty("end_date")
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   * The media contact email
   **/
  public SSIOCreateInsertionOrderRequest mediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
    return this;
  }

  
  @ApiModelProperty(example = "test@example", required = true, value = "The media contact email")
  @JsonProperty(required = true, value = "media_contact_email")
  @NotNull public String getMediaContactEmail() {
    return mediaContactEmail;
  }

  @JsonProperty(required = true, value = "media_contact_email")
  public void setMediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
  }

  /**
   * The media contact first name
   **/
  public SSIOCreateInsertionOrderRequest mediaContactFirstname(String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The media contact first name")
  @JsonProperty(required = true, value = "media_contact_firstname")
  @NotNull public String getMediaContactFirstname() {
    return mediaContactFirstname;
  }

  @JsonProperty(required = true, value = "media_contact_firstname")
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
  @JsonProperty(required = true, value = "media_contact_lastname")
  @NotNull public String getMediaContactLastname() {
    return mediaContactLastname;
  }

  @JsonProperty(required = true, value = "media_contact_lastname")
  public void setMediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
  }

  /**
   * The po number
   **/
  public SSIOCreateInsertionOrderRequest poNumber(String poNumber) {
    this.poNumber = poNumber;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The po number")
  @JsonProperty(required = true, value = "po_number")
  @NotNull public String getPoNumber() {
    return poNumber;
  }

  @JsonProperty(required = true, value = "po_number")
  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }

  /**
   * Starting date of time period. Format: YYYY-MM-DD
   **/
  public SSIOCreateInsertionOrderRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  
  @ApiModelProperty(example = "2020-12-20", required = true, value = "Starting date of time period. Format: YYYY-MM-DD")
  @JsonProperty(required = true, value = "start_date")
  @NotNull  @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")public String getStartDate() {
    return startDate;
  }

  @JsonProperty(required = true, value = "start_date")
  public void setStartDate(String startDate) {
    this.startDate = startDate;
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

  @JsonProperty("user_email")
  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  /**
   * The SFDC id for the terms
   **/
  public SSIOCreateInsertionOrderRequest acceptedTermsId(String acceptedTermsId) {
    this.acceptedTermsId = acceptedTermsId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The SFDC id for the terms")
  @JsonProperty(required = true, value = "accepted_terms_id")
  @NotNull public String getAcceptedTermsId() {
    return acceptedTermsId;
  }

  @JsonProperty(required = true, value = "accepted_terms_id")
  public void setAcceptedTermsId(String acceptedTermsId) {
    this.acceptedTermsId = acceptedTermsId;
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

  @JsonProperty("accepted_terms_time")
  public void setAcceptedTermsTime(Integer acceptedTermsTime) {
    this.acceptedTermsTime = acceptedTermsTime;
  }

  /**
   * The bill-to billing address id
   **/
  public SSIOCreateInsertionOrderRequest billtoBillingAddressId(String billtoBillingAddressId) {
    this.billtoBillingAddressId = billtoBillingAddressId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The bill-to billing address id")
  @JsonProperty(required = true, value = "billto_billing_address_id")
  @NotNull public String getBilltoBillingAddressId() {
    return billtoBillingAddressId;
  }

  @JsonProperty(required = true, value = "billto_billing_address_id")
  public void setBilltoBillingAddressId(String billtoBillingAddressId) {
    this.billtoBillingAddressId = billtoBillingAddressId;
  }

  /**
   * The bill-to business address id
   **/
  public SSIOCreateInsertionOrderRequest billtoBusinessAddressId(String billtoBusinessAddressId) {
    this.billtoBusinessAddressId = billtoBusinessAddressId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The bill-to business address id")
  @JsonProperty(required = true, value = "billto_business_address_id")
  @NotNull public String getBilltoBusinessAddressId() {
    return billtoBusinessAddressId;
  }

  @JsonProperty(required = true, value = "billto_business_address_id")
  public void setBilltoBusinessAddressId(String billtoBusinessAddressId) {
    this.billtoBusinessAddressId = billtoBusinessAddressId;
  }

  /**
   * The bill-to company id
   **/
  public SSIOCreateInsertionOrderRequest billtoCompanyId(String billtoCompanyId) {
    this.billtoCompanyId = billtoCompanyId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The bill-to company id")
  @JsonProperty(required = true, value = "billto_company_id")
  @NotNull public String getBilltoCompanyId() {
    return billtoCompanyId;
  }

  @JsonProperty(required = true, value = "billto_company_id")
  public void setBilltoCompanyId(String billtoCompanyId) {
    this.billtoCompanyId = billtoCompanyId;
  }

  /**
   **/
  public SSIOCreateInsertionOrderRequest currencyInfo(Currency currencyInfo) {
    this.currencyInfo = currencyInfo;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "currency_info")
  @NotNull public Currency getCurrencyInfo() {
    return currencyInfo;
  }

  @JsonProperty(required = true, value = "currency_info")
  public void setCurrencyInfo(Currency currencyInfo) {
    this.currencyInfo = currencyInfo;
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
  @Valid public BigDecimal getEstimatedMonthlySpend() {
    return estimatedMonthlySpend;
  }

  @JsonProperty("estimated_monthly_spend")
  public void setEstimatedMonthlySpend(BigDecimal estimatedMonthlySpend) {
    this.estimatedMonthlySpend = estimatedMonthlySpend;
  }

  /**
   * Type can be Budget or Perpetual
   **/
  public SSIOCreateInsertionOrderRequest orderLineType(OrderLineTypeEnum orderLineType) {
    this.orderLineType = orderLineType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Type can be Budget or Perpetual")
  @JsonProperty(required = true, value = "order_line_type")
  @NotNull public OrderLineTypeEnum getOrderLineType() {
    return orderLineType;
  }

  @JsonProperty(required = true, value = "order_line_type")
  public void setOrderLineType(OrderLineTypeEnum orderLineType) {
    this.orderLineType = orderLineType;
  }

  /**
   * The order name
   **/
  public SSIOCreateInsertionOrderRequest orderName(String orderName) {
    this.orderName = orderName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The order name")
  @JsonProperty(required = true, value = "order_name")
  @NotNull public String getOrderName() {
    return orderName;
  }

  @JsonProperty(required = true, value = "order_name")
  public void setOrderName(String orderName) {
    this.orderName = orderName;
  }

  /**
   * The pmp id
   **/
  public SSIOCreateInsertionOrderRequest pmpId(String pmpId) {
    this.pmpId = pmpId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The pmp id")
  @JsonProperty(required = true, value = "pmp_id")
  @NotNull public String getPmpId() {
    return pmpId;
  }

  @JsonProperty(required = true, value = "pmp_id")
  public void setPmpId(String pmpId) {
    this.pmpId = pmpId;
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
    return Objects.equals(this.agencyLink, ssIOCreateInsertionOrderRequest.agencyLink) &&
        Objects.equals(this.billingContactEmail, ssIOCreateInsertionOrderRequest.billingContactEmail) &&
        Objects.equals(this.billingContactFirstname, ssIOCreateInsertionOrderRequest.billingContactFirstname) &&
        Objects.equals(this.billingContactLastname, ssIOCreateInsertionOrderRequest.billingContactLastname) &&
        Objects.equals(this.budgetAmount, ssIOCreateInsertionOrderRequest.budgetAmount) &&
        Objects.equals(this.endDate, ssIOCreateInsertionOrderRequest.endDate) &&
        Objects.equals(this.mediaContactEmail, ssIOCreateInsertionOrderRequest.mediaContactEmail) &&
        Objects.equals(this.mediaContactFirstname, ssIOCreateInsertionOrderRequest.mediaContactFirstname) &&
        Objects.equals(this.mediaContactLastname, ssIOCreateInsertionOrderRequest.mediaContactLastname) &&
        Objects.equals(this.poNumber, ssIOCreateInsertionOrderRequest.poNumber) &&
        Objects.equals(this.startDate, ssIOCreateInsertionOrderRequest.startDate) &&
        Objects.equals(this.userEmail, ssIOCreateInsertionOrderRequest.userEmail) &&
        Objects.equals(this.acceptedTermsId, ssIOCreateInsertionOrderRequest.acceptedTermsId) &&
        Objects.equals(this.acceptedTermsTime, ssIOCreateInsertionOrderRequest.acceptedTermsTime) &&
        Objects.equals(this.billtoBillingAddressId, ssIOCreateInsertionOrderRequest.billtoBillingAddressId) &&
        Objects.equals(this.billtoBusinessAddressId, ssIOCreateInsertionOrderRequest.billtoBusinessAddressId) &&
        Objects.equals(this.billtoCompanyId, ssIOCreateInsertionOrderRequest.billtoCompanyId) &&
        Objects.equals(this.currencyInfo, ssIOCreateInsertionOrderRequest.currencyInfo) &&
        Objects.equals(this.estimatedMonthlySpend, ssIOCreateInsertionOrderRequest.estimatedMonthlySpend) &&
        Objects.equals(this.orderLineType, ssIOCreateInsertionOrderRequest.orderLineType) &&
        Objects.equals(this.orderName, ssIOCreateInsertionOrderRequest.orderName) &&
        Objects.equals(this.pmpId, ssIOCreateInsertionOrderRequest.pmpId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agencyLink, billingContactEmail, billingContactFirstname, billingContactLastname, budgetAmount, endDate, mediaContactEmail, mediaContactFirstname, mediaContactLastname, poNumber, startDate, userEmail, acceptedTermsId, acceptedTermsTime, billtoBillingAddressId, billtoBusinessAddressId, billtoCompanyId, currencyInfo, estimatedMonthlySpend, orderLineType, orderName, pmpId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSIOCreateInsertionOrderRequest {\n");
    
    sb.append("    agencyLink: ").append(toIndentedString(agencyLink)).append("\n");
    sb.append("    billingContactEmail: ").append(toIndentedString(billingContactEmail)).append("\n");
    sb.append("    billingContactFirstname: ").append(toIndentedString(billingContactFirstname)).append("\n");
    sb.append("    billingContactLastname: ").append(toIndentedString(billingContactLastname)).append("\n");
    sb.append("    budgetAmount: ").append(toIndentedString(budgetAmount)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    mediaContactEmail: ").append(toIndentedString(mediaContactEmail)).append("\n");
    sb.append("    mediaContactFirstname: ").append(toIndentedString(mediaContactFirstname)).append("\n");
    sb.append("    mediaContactLastname: ").append(toIndentedString(mediaContactLastname)).append("\n");
    sb.append("    poNumber: ").append(toIndentedString(poNumber)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
    sb.append("    acceptedTermsId: ").append(toIndentedString(acceptedTermsId)).append("\n");
    sb.append("    acceptedTermsTime: ").append(toIndentedString(acceptedTermsTime)).append("\n");
    sb.append("    billtoBillingAddressId: ").append(toIndentedString(billtoBillingAddressId)).append("\n");
    sb.append("    billtoBusinessAddressId: ").append(toIndentedString(billtoBusinessAddressId)).append("\n");
    sb.append("    billtoCompanyId: ").append(toIndentedString(billtoCompanyId)).append("\n");
    sb.append("    currencyInfo: ").append(toIndentedString(currencyInfo)).append("\n");
    sb.append("    estimatedMonthlySpend: ").append(toIndentedString(estimatedMonthlySpend)).append("\n");
    sb.append("    orderLineType: ").append(toIndentedString(orderLineType)).append("\n");
    sb.append("    orderName: ").append(toIndentedString(orderName)).append("\n");
    sb.append("    pmpId: ").append(toIndentedString(pmpId)).append("\n");
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

