package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.Currency;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;
import javax.validation.Valid;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-14T23:04:42.546429009Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class SSIOCreateInsertionOrderRequest   {
  
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

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private OrderLineTypeEnum orderLineType;
  private String acceptedTermsId;
  private String billtoCompanyId;
  private String billtoBusinessAddressId;
  private String billtoBillingAddressId;
  private BigDecimal estimatedMonthlySpend;
  private Currency currencyInfo;

  /**
   * Starting date of time period. Format: YYYY-MM-DD
   **/
  
  @ApiModelProperty(example = "2020-12-20", required = true, value = "Starting date of time period. Format: YYYY-MM-DD")
  @JsonProperty("start_date")
  @NotNull
 @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")  public String getStartDate() {
    return startDate;
  }
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * End date of time period. Format: YYYY-MM-DD
   **/
  
  @ApiModelProperty(example = "2020-12-20", value = "End date of time period. Format: YYYY-MM-DD")
  @JsonProperty("end_date")
 @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")  public String getEndDate() {
    return endDate;
  }
  public void setEndDate(String endDate) {
    this.endDate = endDate;
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
   * If Budget order line, the budget amount.
   **/
  
  @ApiModelProperty(example = "5000000", value = "If Budget order line, the budget amount.")
  @JsonProperty("budget_amount")
  @Valid
  public BigDecimal getBudgetAmount() {
    return budgetAmount;
  }
  public void setBudgetAmount(BigDecimal budgetAmount) {
    this.budgetAmount = budgetAmount;
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
   * The billing contact email
   **/
  
  @ApiModelProperty(example = "test@example", required = true, value = "The billing contact email")
  @JsonProperty("billing_contact_email")
  @NotNull
  public String getBillingContactEmail() {
    return billingContactEmail;
  }
  public void setBillingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
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
   * The media contact email
   **/
  
  @ApiModelProperty(example = "test@example", required = true, value = "The media contact email")
  @JsonProperty("media_contact_email")
  @NotNull
  public String getMediaContactEmail() {
    return mediaContactEmail;
  }
  public void setMediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
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
   * The email of user submitting the insertion order
   **/
  
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
   * Type can be Budget or Perpetual
   **/
  
  @ApiModelProperty(required = true, value = "Type can be Budget or Perpetual")
  @JsonProperty("order_line_type")
  @NotNull
  public OrderLineTypeEnum getOrderLineType() {
    return orderLineType;
  }
  public void setOrderLineType(OrderLineTypeEnum orderLineType) {
    this.orderLineType = orderLineType;
  }

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
   * If Ongoing (perpetual) order line, the estimated monthly spend
   **/
  
  @ApiModelProperty(value = "If Ongoing (perpetual) order line, the estimated monthly spend")
  @JsonProperty("estimated_monthly_spend")
  @Valid
  public BigDecimal getEstimatedMonthlySpend() {
    return estimatedMonthlySpend;
  }
  public void setEstimatedMonthlySpend(BigDecimal estimatedMonthlySpend) {
    this.estimatedMonthlySpend = estimatedMonthlySpend;
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

