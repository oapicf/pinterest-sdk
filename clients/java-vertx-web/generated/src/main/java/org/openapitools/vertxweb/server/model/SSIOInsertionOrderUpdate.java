package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource create or update operation model.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public SSIOInsertionOrderUpdate () {

  }

  public SSIOInsertionOrderUpdate (String adsManagerOrderLineId, String agencyLink, String billingContactEmail, String billingContactFirstname, String billingContactLastname, Double budgetAmount, String endDate, String mediaContactEmail, String mediaContactFirstname, String mediaContactLastname, String oracleLineId, String poNumber, String salesforceOrderId, String salesforceOrderLineId, String startDate, String userEmail) {
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

    
  @JsonProperty("ads_manager_order_line_id")
  public String getAdsManagerOrderLineId() {
    return adsManagerOrderLineId;
  }
  public void setAdsManagerOrderLineId(String adsManagerOrderLineId) {
    this.adsManagerOrderLineId = adsManagerOrderLineId;
  }

    
  @JsonProperty("agency_link")
  public String getAgencyLink() {
    return agencyLink;
  }
  public void setAgencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
  }

    
  @JsonProperty("billing_contact_email")
  public String getBillingContactEmail() {
    return billingContactEmail;
  }
  public void setBillingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
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

    
  @JsonProperty("budget_amount")
  public Double getBudgetAmount() {
    return budgetAmount;
  }
  public void setBudgetAmount(Double budgetAmount) {
    this.budgetAmount = budgetAmount;
  }

    
  @JsonProperty("end_date")
  public String getEndDate() {
    return endDate;
  }
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

    
  @JsonProperty("media_contact_email")
  public String getMediaContactEmail() {
    return mediaContactEmail;
  }
  public void setMediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
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

    
  @JsonProperty("oracle_line_id")
  public String getOracleLineId() {
    return oracleLineId;
  }
  public void setOracleLineId(String oracleLineId) {
    this.oracleLineId = oracleLineId;
  }

    
  @JsonProperty("po_number")
  public String getPoNumber() {
    return poNumber;
  }
  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }

    
  @JsonProperty("salesforce_order_id")
  public String getSalesforceOrderId() {
    return salesforceOrderId;
  }
  public void setSalesforceOrderId(String salesforceOrderId) {
    this.salesforceOrderId = salesforceOrderId;
  }

    
  @JsonProperty("salesforce_order_line_id")
  public String getSalesforceOrderLineId() {
    return salesforceOrderLineId;
  }
  public void setSalesforceOrderLineId(String salesforceOrderLineId) {
    this.salesforceOrderLineId = salesforceOrderLineId;
  }

    
  @JsonProperty("start_date")
  public String getStartDate() {
    return startDate;
  }
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

    
  @JsonProperty("user_email")
  public String getUserEmail() {
    return userEmail;
  }
  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSIOInsertionOrderUpdate ssIOInsertionOrderUpdate = (SSIOInsertionOrderUpdate) o;
    return Objects.equals(adsManagerOrderLineId, ssIOInsertionOrderUpdate.adsManagerOrderLineId) &&
        Objects.equals(agencyLink, ssIOInsertionOrderUpdate.agencyLink) &&
        Objects.equals(billingContactEmail, ssIOInsertionOrderUpdate.billingContactEmail) &&
        Objects.equals(billingContactFirstname, ssIOInsertionOrderUpdate.billingContactFirstname) &&
        Objects.equals(billingContactLastname, ssIOInsertionOrderUpdate.billingContactLastname) &&
        Objects.equals(budgetAmount, ssIOInsertionOrderUpdate.budgetAmount) &&
        Objects.equals(endDate, ssIOInsertionOrderUpdate.endDate) &&
        Objects.equals(mediaContactEmail, ssIOInsertionOrderUpdate.mediaContactEmail) &&
        Objects.equals(mediaContactFirstname, ssIOInsertionOrderUpdate.mediaContactFirstname) &&
        Objects.equals(mediaContactLastname, ssIOInsertionOrderUpdate.mediaContactLastname) &&
        Objects.equals(oracleLineId, ssIOInsertionOrderUpdate.oracleLineId) &&
        Objects.equals(poNumber, ssIOInsertionOrderUpdate.poNumber) &&
        Objects.equals(salesforceOrderId, ssIOInsertionOrderUpdate.salesforceOrderId) &&
        Objects.equals(salesforceOrderLineId, ssIOInsertionOrderUpdate.salesforceOrderLineId) &&
        Objects.equals(startDate, ssIOInsertionOrderUpdate.startDate) &&
        Objects.equals(userEmail, ssIOInsertionOrderUpdate.userEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adsManagerOrderLineId, agencyLink, billingContactEmail, billingContactFirstname, billingContactLastname, budgetAmount, endDate, mediaContactEmail, mediaContactFirstname, mediaContactLastname, oracleLineId, poNumber, salesforceOrderId, salesforceOrderLineId, startDate, userEmail);
  }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
