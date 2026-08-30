package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.Currency;
import org.openapitools.server.model.SSIOOrderLineType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create operation model.
 */
public class SSIOInsertionOrderCreate   {

    private String acceptedTermsId;
    private Integer acceptedTermsTime;
    private String agencyLink;
    private String billingContactEmail;
    private String billingContactFirstname;
    private String billingContactLastname;
    private String billtoBillingAddressId;
    private String billtoBusinessAddressId;
    private String billtoCompanyId;
    private Double budgetAmount;
    private Currency currencyInfo;
    private String endDate;
    private Double estimatedMonthlySpend;
    private String mediaContactEmail;
    private String mediaContactFirstname;
    private String mediaContactLastname;
    private SSIOOrderLineType orderLineType;
    private String orderName;
    private String pmpId;
    private String poNumber;
    private String startDate;
    private String userEmail;

    /**
     * Default constructor.
     */
    public SSIOInsertionOrderCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create SSIOInsertionOrderCreate.
     *
     * @param acceptedTermsId The SFDC id for the terms
     * @param acceptedTermsTime The UTC timestamp (to the nearest sec) of when terms were accepted
     * @param agencyLink URL link for agency
     * @param billingContactEmail The billing contact email
     * @param billingContactFirstname The billing contact first name
     * @param billingContactLastname The billing contact last name
     * @param billtoBillingAddressId The bill-to billing address id
     * @param billtoBusinessAddressId The bill-to business address id
     * @param billtoCompanyId The bill-to company id
     * @param budgetAmount If Budget order line, the budget amount.
     * @param currencyInfo currencyInfo
     * @param endDate End date of time period. Format: YYYY-MM-DD
     * @param estimatedMonthlySpend If Ongoing (perpetual) order line, the estimated monthly spend
     * @param mediaContactEmail The media contact email
     * @param mediaContactFirstname The media contact first name
     * @param mediaContactLastname The media contact last name
     * @param orderLineType Type can be Budget or Perpetual
     * @param orderName The order name
     * @param pmpId The pmp id
     * @param poNumber The po number
     * @param startDate Starting date of time period. Format: YYYY-MM-DD
     * @param userEmail The email of user submitting the insertion order
     */
    public SSIOInsertionOrderCreate(
        String acceptedTermsId, 
        Integer acceptedTermsTime, 
        String agencyLink, 
        String billingContactEmail, 
        String billingContactFirstname, 
        String billingContactLastname, 
        String billtoBillingAddressId, 
        String billtoBusinessAddressId, 
        String billtoCompanyId, 
        Double budgetAmount, 
        Currency currencyInfo, 
        String endDate, 
        Double estimatedMonthlySpend, 
        String mediaContactEmail, 
        String mediaContactFirstname, 
        String mediaContactLastname, 
        SSIOOrderLineType orderLineType, 
        String orderName, 
        String pmpId, 
        String poNumber, 
        String startDate, 
        String userEmail
    ) {
        this.acceptedTermsId = acceptedTermsId;
        this.acceptedTermsTime = acceptedTermsTime;
        this.agencyLink = agencyLink;
        this.billingContactEmail = billingContactEmail;
        this.billingContactFirstname = billingContactFirstname;
        this.billingContactLastname = billingContactLastname;
        this.billtoBillingAddressId = billtoBillingAddressId;
        this.billtoBusinessAddressId = billtoBusinessAddressId;
        this.billtoCompanyId = billtoCompanyId;
        this.budgetAmount = budgetAmount;
        this.currencyInfo = currencyInfo;
        this.endDate = endDate;
        this.estimatedMonthlySpend = estimatedMonthlySpend;
        this.mediaContactEmail = mediaContactEmail;
        this.mediaContactFirstname = mediaContactFirstname;
        this.mediaContactLastname = mediaContactLastname;
        this.orderLineType = orderLineType;
        this.orderName = orderName;
        this.pmpId = pmpId;
        this.poNumber = poNumber;
        this.startDate = startDate;
        this.userEmail = userEmail;
    }



    /**
     * The SFDC id for the terms
     * @return acceptedTermsId
     */
    public String getAcceptedTermsId() {
        return acceptedTermsId;
    }

    public void setAcceptedTermsId(String acceptedTermsId) {
        this.acceptedTermsId = acceptedTermsId;
    }

    /**
     * The UTC timestamp (to the nearest sec) of when terms were accepted
     * @return acceptedTermsTime
     */
    public Integer getAcceptedTermsTime() {
        return acceptedTermsTime;
    }

    public void setAcceptedTermsTime(Integer acceptedTermsTime) {
        this.acceptedTermsTime = acceptedTermsTime;
    }

    /**
     * URL link for agency
     * @return agencyLink
     */
    public String getAgencyLink() {
        return agencyLink;
    }

    public void setAgencyLink(String agencyLink) {
        this.agencyLink = agencyLink;
    }

    /**
     * The billing contact email
     * @return billingContactEmail
     */
    public String getBillingContactEmail() {
        return billingContactEmail;
    }

    public void setBillingContactEmail(String billingContactEmail) {
        this.billingContactEmail = billingContactEmail;
    }

    /**
     * The billing contact first name
     * @return billingContactFirstname
     */
    public String getBillingContactFirstname() {
        return billingContactFirstname;
    }

    public void setBillingContactFirstname(String billingContactFirstname) {
        this.billingContactFirstname = billingContactFirstname;
    }

    /**
     * The billing contact last name
     * @return billingContactLastname
     */
    public String getBillingContactLastname() {
        return billingContactLastname;
    }

    public void setBillingContactLastname(String billingContactLastname) {
        this.billingContactLastname = billingContactLastname;
    }

    /**
     * The bill-to billing address id
     * @return billtoBillingAddressId
     */
    public String getBilltoBillingAddressId() {
        return billtoBillingAddressId;
    }

    public void setBilltoBillingAddressId(String billtoBillingAddressId) {
        this.billtoBillingAddressId = billtoBillingAddressId;
    }

    /**
     * The bill-to business address id
     * @return billtoBusinessAddressId
     */
    public String getBilltoBusinessAddressId() {
        return billtoBusinessAddressId;
    }

    public void setBilltoBusinessAddressId(String billtoBusinessAddressId) {
        this.billtoBusinessAddressId = billtoBusinessAddressId;
    }

    /**
     * The bill-to company id
     * @return billtoCompanyId
     */
    public String getBilltoCompanyId() {
        return billtoCompanyId;
    }

    public void setBilltoCompanyId(String billtoCompanyId) {
        this.billtoCompanyId = billtoCompanyId;
    }

    /**
     * If Budget order line, the budget amount.
     * @return budgetAmount
     */
    public Double getBudgetAmount() {
        return budgetAmount;
    }

    public void setBudgetAmount(Double budgetAmount) {
        this.budgetAmount = budgetAmount;
    }

    /**
     * Get currencyInfo
     * @return currencyInfo
     */
    public Currency getCurrencyInfo() {
        return currencyInfo;
    }

    public void setCurrencyInfo(Currency currencyInfo) {
        this.currencyInfo = currencyInfo;
    }

    /**
     * End date of time period. Format: YYYY-MM-DD
     * @return endDate
     */
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * If Ongoing (perpetual) order line, the estimated monthly spend
     * @return estimatedMonthlySpend
     */
    public Double getEstimatedMonthlySpend() {
        return estimatedMonthlySpend;
    }

    public void setEstimatedMonthlySpend(Double estimatedMonthlySpend) {
        this.estimatedMonthlySpend = estimatedMonthlySpend;
    }

    /**
     * The media contact email
     * @return mediaContactEmail
     */
    public String getMediaContactEmail() {
        return mediaContactEmail;
    }

    public void setMediaContactEmail(String mediaContactEmail) {
        this.mediaContactEmail = mediaContactEmail;
    }

    /**
     * The media contact first name
     * @return mediaContactFirstname
     */
    public String getMediaContactFirstname() {
        return mediaContactFirstname;
    }

    public void setMediaContactFirstname(String mediaContactFirstname) {
        this.mediaContactFirstname = mediaContactFirstname;
    }

    /**
     * The media contact last name
     * @return mediaContactLastname
     */
    public String getMediaContactLastname() {
        return mediaContactLastname;
    }

    public void setMediaContactLastname(String mediaContactLastname) {
        this.mediaContactLastname = mediaContactLastname;
    }

    /**
     * Type can be Budget or Perpetual
     * @return orderLineType
     */
    public SSIOOrderLineType getOrderLineType() {
        return orderLineType;
    }

    public void setOrderLineType(SSIOOrderLineType orderLineType) {
        this.orderLineType = orderLineType;
    }

    /**
     * The order name
     * @return orderName
     */
    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    /**
     * The pmp id
     * @return pmpId
     */
    public String getPmpId() {
        return pmpId;
    }

    public void setPmpId(String pmpId) {
        this.pmpId = pmpId;
    }

    /**
     * The po number
     * @return poNumber
     */
    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    /**
     * Starting date of time period. Format: YYYY-MM-DD
     * @return startDate
     */
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * The email of user submitting the insertion order
     * @return userEmail
     */
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

