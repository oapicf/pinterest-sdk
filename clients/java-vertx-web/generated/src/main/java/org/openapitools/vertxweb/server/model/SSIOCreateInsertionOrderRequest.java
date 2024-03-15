package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.vertxweb.server.model.Currency;

@JsonInclude(JsonInclude.Include.NON_NULL)
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
      return value;
    }
  }

  private OrderLineTypeEnum orderLineType;
  private String acceptedTermsId;
  private String billtoCompanyId;
  private String billtoBusinessAddressId;
  private String billtoBillingAddressId;
  private BigDecimal estimatedMonthlySpend;
  private Currency currencyInfo;

  public SSIOCreateInsertionOrderRequest () {

  }

  public SSIOCreateInsertionOrderRequest (String startDate, String endDate, String poNumber, BigDecimal budgetAmount, String billingContactFirstname, String billingContactLastname, String billingContactEmail, String mediaContactFirstname, String mediaContactLastname, String mediaContactEmail, String agencyLink, String userEmail, Integer acceptedTermsTime, String pmpId, String orderName, OrderLineTypeEnum orderLineType, String acceptedTermsId, String billtoCompanyId, String billtoBusinessAddressId, String billtoBillingAddressId, BigDecimal estimatedMonthlySpend, Currency currencyInfo) {
    this.startDate = startDate;
    this.endDate = endDate;
    this.poNumber = poNumber;
    this.budgetAmount = budgetAmount;
    this.billingContactFirstname = billingContactFirstname;
    this.billingContactLastname = billingContactLastname;
    this.billingContactEmail = billingContactEmail;
    this.mediaContactFirstname = mediaContactFirstname;
    this.mediaContactLastname = mediaContactLastname;
    this.mediaContactEmail = mediaContactEmail;
    this.agencyLink = agencyLink;
    this.userEmail = userEmail;
    this.acceptedTermsTime = acceptedTermsTime;
    this.pmpId = pmpId;
    this.orderName = orderName;
    this.orderLineType = orderLineType;
    this.acceptedTermsId = acceptedTermsId;
    this.billtoCompanyId = billtoCompanyId;
    this.billtoBusinessAddressId = billtoBusinessAddressId;
    this.billtoBillingAddressId = billtoBillingAddressId;
    this.estimatedMonthlySpend = estimatedMonthlySpend;
    this.currencyInfo = currencyInfo;
  }

    
  @JsonProperty("start_date")
  public String getStartDate() {
    return startDate;
  }
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

    
  @JsonProperty("end_date")
  public String getEndDate() {
    return endDate;
  }
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

    
  @JsonProperty("po_number")
  public String getPoNumber() {
    return poNumber;
  }
  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }

    
  @JsonProperty("budget_amount")
  public BigDecimal getBudgetAmount() {
    return budgetAmount;
  }
  public void setBudgetAmount(BigDecimal budgetAmount) {
    this.budgetAmount = budgetAmount;
  }

    
  @JsonProperty("billing_contact_firstname")
  public String getBillingContactFirstname() {
    return billingContactFirstname;
  }
  public void setBillingContactFirstname(String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
  }

    
  @JsonProperty("billing_contact_lastname")
  public String getBillingContactLastname() {
    return billingContactLastname;
  }
  public void setBillingContactLastname(String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
  }

    
  @JsonProperty("billing_contact_email")
  public String getBillingContactEmail() {
    return billingContactEmail;
  }
  public void setBillingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
  }

    
  @JsonProperty("media_contact_firstname")
  public String getMediaContactFirstname() {
    return mediaContactFirstname;
  }
  public void setMediaContactFirstname(String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
  }

    
  @JsonProperty("media_contact_lastname")
  public String getMediaContactLastname() {
    return mediaContactLastname;
  }
  public void setMediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
  }

    
  @JsonProperty("media_contact_email")
  public String getMediaContactEmail() {
    return mediaContactEmail;
  }
  public void setMediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
  }

    
  @JsonProperty("agency_link")
  public String getAgencyLink() {
    return agencyLink;
  }
  public void setAgencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
  }

    
  @JsonProperty("user_email")
  public String getUserEmail() {
    return userEmail;
  }
  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

    
  @JsonProperty("accepted_terms_time")
  public Integer getAcceptedTermsTime() {
    return acceptedTermsTime;
  }
  public void setAcceptedTermsTime(Integer acceptedTermsTime) {
    this.acceptedTermsTime = acceptedTermsTime;
  }

    
  @JsonProperty("pmp_id")
  public String getPmpId() {
    return pmpId;
  }
  public void setPmpId(String pmpId) {
    this.pmpId = pmpId;
  }

    
  @JsonProperty("order_name")
  public String getOrderName() {
    return orderName;
  }
  public void setOrderName(String orderName) {
    this.orderName = orderName;
  }

    
  @JsonProperty("order_line_type")
  public OrderLineTypeEnum getOrderLineType() {
    return orderLineType;
  }
  public void setOrderLineType(OrderLineTypeEnum orderLineType) {
    this.orderLineType = orderLineType;
  }

    
  @JsonProperty("accepted_terms_id")
  public String getAcceptedTermsId() {
    return acceptedTermsId;
  }
  public void setAcceptedTermsId(String acceptedTermsId) {
    this.acceptedTermsId = acceptedTermsId;
  }

    
  @JsonProperty("billto_company_id")
  public String getBilltoCompanyId() {
    return billtoCompanyId;
  }
  public void setBilltoCompanyId(String billtoCompanyId) {
    this.billtoCompanyId = billtoCompanyId;
  }

    
  @JsonProperty("billto_business_address_id")
  public String getBilltoBusinessAddressId() {
    return billtoBusinessAddressId;
  }
  public void setBilltoBusinessAddressId(String billtoBusinessAddressId) {
    this.billtoBusinessAddressId = billtoBusinessAddressId;
  }

    
  @JsonProperty("billto_billing_address_id")
  public String getBilltoBillingAddressId() {
    return billtoBillingAddressId;
  }
  public void setBilltoBillingAddressId(String billtoBillingAddressId) {
    this.billtoBillingAddressId = billtoBillingAddressId;
  }

    
  @JsonProperty("estimated_monthly_spend")
  public BigDecimal getEstimatedMonthlySpend() {
    return estimatedMonthlySpend;
  }
  public void setEstimatedMonthlySpend(BigDecimal estimatedMonthlySpend) {
    this.estimatedMonthlySpend = estimatedMonthlySpend;
  }

    
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
