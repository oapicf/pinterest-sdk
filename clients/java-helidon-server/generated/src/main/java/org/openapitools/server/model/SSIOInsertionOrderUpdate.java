package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create or update operation model.
 */
public class SSIOInsertionOrderUpdate   {

    private String adsManagerOrderLineId;
    private String agencyLink;
    private String billingContactEmail;
    private String billingContactFirstname;
    private String billingContactLastname;
    private Double budgetAmount;
    private String endDate;
    private String mediaContactEmail;
    private String mediaContactFirstname;
    private String mediaContactLastname;
    private String oracleLineId;
    private String poNumber;
    private String salesforceOrderId;
    private String salesforceOrderLineId;
    private String startDate;
    private String userEmail;

    /**
     * Default constructor.
     */
    public SSIOInsertionOrderUpdate() {
    // JSON-B / Jackson
    }

    /**
     * Create SSIOInsertionOrderUpdate.
     *
     * @param adsManagerOrderLineId Ads manager OrderLineId
     * @param agencyLink URL link for agency
     * @param billingContactEmail The billing contact email
     * @param billingContactFirstname The billing contact first name
     * @param billingContactLastname The billing contact last name
     * @param budgetAmount If Budget order line, the budget amount.
     * @param endDate End date of time period. Format: YYYY-MM-DD
     * @param mediaContactEmail The media contact email
     * @param mediaContactFirstname The media contact first name
     * @param mediaContactLastname The media contact last name
     * @param oracleLineId LineId in the Oracle DB
     * @param poNumber The po number
     * @param salesforceOrderId OrderId in SFDC
     * @param salesforceOrderLineId OrderLineId in SFDC
     * @param startDate Starting date of time period. Format: YYYY-MM-DD
     * @param userEmail The email of user submitting the insertion order
     */
    public SSIOInsertionOrderUpdate(
        String adsManagerOrderLineId, 
        String agencyLink, 
        String billingContactEmail, 
        String billingContactFirstname, 
        String billingContactLastname, 
        Double budgetAmount, 
        String endDate, 
        String mediaContactEmail, 
        String mediaContactFirstname, 
        String mediaContactLastname, 
        String oracleLineId, 
        String poNumber, 
        String salesforceOrderId, 
        String salesforceOrderLineId, 
        String startDate, 
        String userEmail
    ) {
        this.adsManagerOrderLineId = adsManagerOrderLineId;
        this.agencyLink = agencyLink;
        this.billingContactEmail = billingContactEmail;
        this.billingContactFirstname = billingContactFirstname;
        this.billingContactLastname = billingContactLastname;
        this.budgetAmount = budgetAmount;
        this.endDate = endDate;
        this.mediaContactEmail = mediaContactEmail;
        this.mediaContactFirstname = mediaContactFirstname;
        this.mediaContactLastname = mediaContactLastname;
        this.oracleLineId = oracleLineId;
        this.poNumber = poNumber;
        this.salesforceOrderId = salesforceOrderId;
        this.salesforceOrderLineId = salesforceOrderLineId;
        this.startDate = startDate;
        this.userEmail = userEmail;
    }



    /**
     * Ads manager OrderLineId
     * @return adsManagerOrderLineId
     */
    public String getAdsManagerOrderLineId() {
        return adsManagerOrderLineId;
    }

    public void setAdsManagerOrderLineId(String adsManagerOrderLineId) {
        this.adsManagerOrderLineId = adsManagerOrderLineId;
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
     * LineId in the Oracle DB
     * @return oracleLineId
     */
    public String getOracleLineId() {
        return oracleLineId;
    }

    public void setOracleLineId(String oracleLineId) {
        this.oracleLineId = oracleLineId;
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
     * OrderId in SFDC
     * @return salesforceOrderId
     */
    public String getSalesforceOrderId() {
        return salesforceOrderId;
    }

    public void setSalesforceOrderId(String salesforceOrderId) {
        this.salesforceOrderId = salesforceOrderId;
    }

    /**
     * OrderLineId in SFDC
     * @return salesforceOrderLineId
     */
    public String getSalesforceOrderLineId() {
        return salesforceOrderLineId;
    }

    public void setSalesforceOrderLineId(String salesforceOrderLineId) {
        this.salesforceOrderLineId = salesforceOrderLineId;
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
        sb.append("class SSIOInsertionOrderUpdate {\n");
        
        sb.append("    adsManagerOrderLineId: ").append(toIndentedString(adsManagerOrderLineId)).append("\n");
        sb.append("    agencyLink: ").append(toIndentedString(agencyLink)).append("\n");
        sb.append("    billingContactEmail: ").append(toIndentedString(billingContactEmail)).append("\n");
        sb.append("    billingContactFirstname: ").append(toIndentedString(billingContactFirstname)).append("\n");
        sb.append("    billingContactLastname: ").append(toIndentedString(billingContactLastname)).append("\n");
        sb.append("    budgetAmount: ").append(toIndentedString(budgetAmount)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    mediaContactEmail: ").append(toIndentedString(mediaContactEmail)).append("\n");
        sb.append("    mediaContactFirstname: ").append(toIndentedString(mediaContactFirstname)).append("\n");
        sb.append("    mediaContactLastname: ").append(toIndentedString(mediaContactLastname)).append("\n");
        sb.append("    oracleLineId: ").append(toIndentedString(oracleLineId)).append("\n");
        sb.append("    poNumber: ").append(toIndentedString(poNumber)).append("\n");
        sb.append("    salesforceOrderId: ").append(toIndentedString(salesforceOrderId)).append("\n");
        sb.append("    salesforceOrderLineId: ").append(toIndentedString(salesforceOrderLineId)).append("\n");
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

