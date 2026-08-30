package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.Currency;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * A Salesforce SSIO order line.
 */
public class SSIOOrderLine   {

    private String acceptedTermsId;
    private String acceptedTermsTime;
    private String adsManagerOrderLineId;
    private String agencyLink;
    private String billToCompanyName;
    private String billingContactEmail;
    private String billingContactFirstname;
    private String billingContactLastname;
    private BigDecimal budgetAmount;
    private Currency currencyInfo;
    private LocalDate endDate;
    private BigDecimal estimatedMonthlySpend;
    private String lastModifiedDateTime;
    private String mediaContactEmail;
    private String mediaContactFirstname;
    private String mediaContactLastname;
    private String orderName;
    private String pinOrderId;
    private String pmpName;
    private String poNumber;
    private String salesforceOrderLineId;
    private LocalDate startDate;

    /**
     * Default constructor.
     */
    public SSIOOrderLine() {
    // JSON-B / Jackson
    }

    /**
     * Create SSIOOrderLine.
     *
     * @param acceptedTermsId The SFDC id for the terms
     * @param acceptedTermsTime The UTC timestamp (to the nearest second) when terms were accepted.
     * @param adsManagerOrderLineId Ads manager order line id
     * @param agencyLink Agency link
     * @param billToCompanyName Bill-to company name
     * @param billingContactEmail Billing contact email
     * @param billingContactFirstname Billing contact first name
     * @param billingContactLastname Billing contact last name
     * @param budgetAmount If budget order line, the budget amount.
     * @param currencyInfo currencyInfo
     * @param endDate End date of the order line.
     * @param estimatedMonthlySpend If ongoing (perpetual) order line, the estimated monthly spend.
     * @param lastModifiedDateTime Last modified date.
     * @param mediaContactEmail Billing media email
     * @param mediaContactFirstname Billing media contact first name
     * @param mediaContactLastname Billing media contact last name
     * @param orderName The order name
     * @param pinOrderId The pin order id associated with the order line in SFDC
     * @param pmpName The Pinterest marketing partner name
     * @param poNumber The PO number
     * @param salesforceOrderLineId Order line id in SFDC
     * @param startDate Start date of the order line.
     */
    public SSIOOrderLine(
        String acceptedTermsId, 
        String acceptedTermsTime, 
        String adsManagerOrderLineId, 
        String agencyLink, 
        String billToCompanyName, 
        String billingContactEmail, 
        String billingContactFirstname, 
        String billingContactLastname, 
        BigDecimal budgetAmount, 
        Currency currencyInfo, 
        LocalDate endDate, 
        BigDecimal estimatedMonthlySpend, 
        String lastModifiedDateTime, 
        String mediaContactEmail, 
        String mediaContactFirstname, 
        String mediaContactLastname, 
        String orderName, 
        String pinOrderId, 
        String pmpName, 
        String poNumber, 
        String salesforceOrderLineId, 
        LocalDate startDate
    ) {
        this.acceptedTermsId = acceptedTermsId;
        this.acceptedTermsTime = acceptedTermsTime;
        this.adsManagerOrderLineId = adsManagerOrderLineId;
        this.agencyLink = agencyLink;
        this.billToCompanyName = billToCompanyName;
        this.billingContactEmail = billingContactEmail;
        this.billingContactFirstname = billingContactFirstname;
        this.billingContactLastname = billingContactLastname;
        this.budgetAmount = budgetAmount;
        this.currencyInfo = currencyInfo;
        this.endDate = endDate;
        this.estimatedMonthlySpend = estimatedMonthlySpend;
        this.lastModifiedDateTime = lastModifiedDateTime;
        this.mediaContactEmail = mediaContactEmail;
        this.mediaContactFirstname = mediaContactFirstname;
        this.mediaContactLastname = mediaContactLastname;
        this.orderName = orderName;
        this.pinOrderId = pinOrderId;
        this.pmpName = pmpName;
        this.poNumber = poNumber;
        this.salesforceOrderLineId = salesforceOrderLineId;
        this.startDate = startDate;
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
     * The UTC timestamp (to the nearest second) when terms were accepted.
     * @return acceptedTermsTime
     */
    public String getAcceptedTermsTime() {
        return acceptedTermsTime;
    }

    public void setAcceptedTermsTime(String acceptedTermsTime) {
        this.acceptedTermsTime = acceptedTermsTime;
    }

    /**
     * Ads manager order line id
     * @return adsManagerOrderLineId
     */
    public String getAdsManagerOrderLineId() {
        return adsManagerOrderLineId;
    }

    public void setAdsManagerOrderLineId(String adsManagerOrderLineId) {
        this.adsManagerOrderLineId = adsManagerOrderLineId;
    }

    /**
     * Agency link
     * @return agencyLink
     */
    public String getAgencyLink() {
        return agencyLink;
    }

    public void setAgencyLink(String agencyLink) {
        this.agencyLink = agencyLink;
    }

    /**
     * Bill-to company name
     * @return billToCompanyName
     */
    public String getBillToCompanyName() {
        return billToCompanyName;
    }

    public void setBillToCompanyName(String billToCompanyName) {
        this.billToCompanyName = billToCompanyName;
    }

    /**
     * Billing contact email
     * @return billingContactEmail
     */
    public String getBillingContactEmail() {
        return billingContactEmail;
    }

    public void setBillingContactEmail(String billingContactEmail) {
        this.billingContactEmail = billingContactEmail;
    }

    /**
     * Billing contact first name
     * @return billingContactFirstname
     */
    public String getBillingContactFirstname() {
        return billingContactFirstname;
    }

    public void setBillingContactFirstname(String billingContactFirstname) {
        this.billingContactFirstname = billingContactFirstname;
    }

    /**
     * Billing contact last name
     * @return billingContactLastname
     */
    public String getBillingContactLastname() {
        return billingContactLastname;
    }

    public void setBillingContactLastname(String billingContactLastname) {
        this.billingContactLastname = billingContactLastname;
    }

    /**
     * If budget order line, the budget amount.
     * @return budgetAmount
     */
    public BigDecimal getBudgetAmount() {
        return budgetAmount;
    }

    public void setBudgetAmount(BigDecimal budgetAmount) {
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
     * End date of the order line.
     * @return endDate
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /**
     * If ongoing (perpetual) order line, the estimated monthly spend.
     * @return estimatedMonthlySpend
     */
    public BigDecimal getEstimatedMonthlySpend() {
        return estimatedMonthlySpend;
    }

    public void setEstimatedMonthlySpend(BigDecimal estimatedMonthlySpend) {
        this.estimatedMonthlySpend = estimatedMonthlySpend;
    }

    /**
     * Last modified date.
     * @return lastModifiedDateTime
     */
    public String getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    public void setLastModifiedDateTime(String lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }

    /**
     * Billing media email
     * @return mediaContactEmail
     */
    public String getMediaContactEmail() {
        return mediaContactEmail;
    }

    public void setMediaContactEmail(String mediaContactEmail) {
        this.mediaContactEmail = mediaContactEmail;
    }

    /**
     * Billing media contact first name
     * @return mediaContactFirstname
     */
    public String getMediaContactFirstname() {
        return mediaContactFirstname;
    }

    public void setMediaContactFirstname(String mediaContactFirstname) {
        this.mediaContactFirstname = mediaContactFirstname;
    }

    /**
     * Billing media contact last name
     * @return mediaContactLastname
     */
    public String getMediaContactLastname() {
        return mediaContactLastname;
    }

    public void setMediaContactLastname(String mediaContactLastname) {
        this.mediaContactLastname = mediaContactLastname;
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
     * The pin order id associated with the order line in SFDC
     * @return pinOrderId
     */
    public String getPinOrderId() {
        return pinOrderId;
    }

    public void setPinOrderId(String pinOrderId) {
        this.pinOrderId = pinOrderId;
    }

    /**
     * The Pinterest marketing partner name
     * @return pmpName
     */
    public String getPmpName() {
        return pmpName;
    }

    public void setPmpName(String pmpName) {
        this.pmpName = pmpName;
    }

    /**
     * The PO number
     * @return poNumber
     */
    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    /**
     * Order line id in SFDC
     * @return salesforceOrderLineId
     */
    public String getSalesforceOrderLineId() {
        return salesforceOrderLineId;
    }

    public void setSalesforceOrderLineId(String salesforceOrderLineId) {
        this.salesforceOrderLineId = salesforceOrderLineId;
    }

    /**
     * Start date of the order line.
     * @return startDate
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SSIOOrderLine {\n");
        
        sb.append("    acceptedTermsId: ").append(toIndentedString(acceptedTermsId)).append("\n");
        sb.append("    acceptedTermsTime: ").append(toIndentedString(acceptedTermsTime)).append("\n");
        sb.append("    adsManagerOrderLineId: ").append(toIndentedString(adsManagerOrderLineId)).append("\n");
        sb.append("    agencyLink: ").append(toIndentedString(agencyLink)).append("\n");
        sb.append("    billToCompanyName: ").append(toIndentedString(billToCompanyName)).append("\n");
        sb.append("    billingContactEmail: ").append(toIndentedString(billingContactEmail)).append("\n");
        sb.append("    billingContactFirstname: ").append(toIndentedString(billingContactFirstname)).append("\n");
        sb.append("    billingContactLastname: ").append(toIndentedString(billingContactLastname)).append("\n");
        sb.append("    budgetAmount: ").append(toIndentedString(budgetAmount)).append("\n");
        sb.append("    currencyInfo: ").append(toIndentedString(currencyInfo)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    estimatedMonthlySpend: ").append(toIndentedString(estimatedMonthlySpend)).append("\n");
        sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
        sb.append("    mediaContactEmail: ").append(toIndentedString(mediaContactEmail)).append("\n");
        sb.append("    mediaContactFirstname: ").append(toIndentedString(mediaContactFirstname)).append("\n");
        sb.append("    mediaContactLastname: ").append(toIndentedString(mediaContactLastname)).append("\n");
        sb.append("    orderName: ").append(toIndentedString(orderName)).append("\n");
        sb.append("    pinOrderId: ").append(toIndentedString(pinOrderId)).append("\n");
        sb.append("    pmpName: ").append(toIndentedString(pmpName)).append("\n");
        sb.append("    poNumber: ").append(toIndentedString(poNumber)).append("\n");
        sb.append("    salesforceOrderLineId: ").append(toIndentedString(salesforceOrderLineId)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

