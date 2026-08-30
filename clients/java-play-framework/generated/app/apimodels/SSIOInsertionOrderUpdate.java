package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Resource create or update operation model.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class SSIOInsertionOrderUpdate   {
  @JsonProperty("ads_manager_order_line_id")
  
  private String adsManagerOrderLineId;

  @JsonProperty("agency_link")
  
  private String agencyLink;

  @JsonProperty("billing_contact_email")
  
  private String billingContactEmail;

  @JsonProperty("billing_contact_firstname")
  
  private String billingContactFirstname;

  @JsonProperty("billing_contact_lastname")
  
  private String billingContactLastname;

  @JsonProperty("budget_amount")
  
  private Double budgetAmount;

  @JsonProperty("end_date")
  @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")

  private String endDate;

  @JsonProperty("media_contact_email")
  
  private String mediaContactEmail;

  @JsonProperty("media_contact_firstname")
  
  private String mediaContactFirstname;

  @JsonProperty("media_contact_lastname")
  
  private String mediaContactLastname;

  @JsonProperty("oracle_line_id")
  
  private String oracleLineId;

  @JsonProperty("po_number")
  
  private String poNumber;

  @JsonProperty("salesforce_order_id")
  
  private String salesforceOrderId;

  @JsonProperty("salesforce_order_line_id")
  
  private String salesforceOrderLineId;

  @JsonProperty("start_date")
  @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")

  private String startDate;

  @JsonProperty("user_email")
  
  private String userEmail;

  public SSIOInsertionOrderUpdate adsManagerOrderLineId(String adsManagerOrderLineId) {
    this.adsManagerOrderLineId = adsManagerOrderLineId;
    return this;
  }

   /**
   * Ads manager OrderLineId
   * @return adsManagerOrderLineId
  **/
  public String getAdsManagerOrderLineId() {
    return adsManagerOrderLineId;
  }

  public void setAdsManagerOrderLineId(String adsManagerOrderLineId) {
    this.adsManagerOrderLineId = adsManagerOrderLineId;
  }

  public SSIOInsertionOrderUpdate agencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
    return this;
  }

   /**
   * URL link for agency
   * @return agencyLink
  **/
  public String getAgencyLink() {
    return agencyLink;
  }

  public void setAgencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
  }

  public SSIOInsertionOrderUpdate billingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
    return this;
  }

   /**
   * The billing contact email
   * @return billingContactEmail
  **/
  public String getBillingContactEmail() {
    return billingContactEmail;
  }

  public void setBillingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
  }

  public SSIOInsertionOrderUpdate billingContactFirstname(String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
    return this;
  }

   /**
   * The billing contact first name
   * @return billingContactFirstname
  **/
  public String getBillingContactFirstname() {
    return billingContactFirstname;
  }

  public void setBillingContactFirstname(String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
  }

  public SSIOInsertionOrderUpdate billingContactLastname(String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
    return this;
  }

   /**
   * The billing contact last name
   * @return billingContactLastname
  **/
  public String getBillingContactLastname() {
    return billingContactLastname;
  }

  public void setBillingContactLastname(String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
  }

  public SSIOInsertionOrderUpdate budgetAmount(Double budgetAmount) {
    this.budgetAmount = budgetAmount;
    return this;
  }

   /**
   * If Budget order line, the budget amount.
   * @return budgetAmount
  **/
  public Double getBudgetAmount() {
    return budgetAmount;
  }

  public void setBudgetAmount(Double budgetAmount) {
    this.budgetAmount = budgetAmount;
  }

  public SSIOInsertionOrderUpdate endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * End date of time period. Format: YYYY-MM-DD
   * @return endDate
  **/
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public SSIOInsertionOrderUpdate mediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
    return this;
  }

   /**
   * The media contact email
   * @return mediaContactEmail
  **/
  public String getMediaContactEmail() {
    return mediaContactEmail;
  }

  public void setMediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
  }

  public SSIOInsertionOrderUpdate mediaContactFirstname(String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
    return this;
  }

   /**
   * The media contact first name
   * @return mediaContactFirstname
  **/
  public String getMediaContactFirstname() {
    return mediaContactFirstname;
  }

  public void setMediaContactFirstname(String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
  }

  public SSIOInsertionOrderUpdate mediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
    return this;
  }

   /**
   * The media contact last name
   * @return mediaContactLastname
  **/
  public String getMediaContactLastname() {
    return mediaContactLastname;
  }

  public void setMediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
  }

  public SSIOInsertionOrderUpdate oracleLineId(String oracleLineId) {
    this.oracleLineId = oracleLineId;
    return this;
  }

   /**
   * LineId in the Oracle DB
   * @return oracleLineId
  **/
  public String getOracleLineId() {
    return oracleLineId;
  }

  public void setOracleLineId(String oracleLineId) {
    this.oracleLineId = oracleLineId;
  }

  public SSIOInsertionOrderUpdate poNumber(String poNumber) {
    this.poNumber = poNumber;
    return this;
  }

   /**
   * The po number
   * @return poNumber
  **/
  public String getPoNumber() {
    return poNumber;
  }

  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }

  public SSIOInsertionOrderUpdate salesforceOrderId(String salesforceOrderId) {
    this.salesforceOrderId = salesforceOrderId;
    return this;
  }

   /**
   * OrderId in SFDC
   * @return salesforceOrderId
  **/
  public String getSalesforceOrderId() {
    return salesforceOrderId;
  }

  public void setSalesforceOrderId(String salesforceOrderId) {
    this.salesforceOrderId = salesforceOrderId;
  }

  public SSIOInsertionOrderUpdate salesforceOrderLineId(String salesforceOrderLineId) {
    this.salesforceOrderLineId = salesforceOrderLineId;
    return this;
  }

   /**
   * OrderLineId in SFDC
   * @return salesforceOrderLineId
  **/
  public String getSalesforceOrderLineId() {
    return salesforceOrderLineId;
  }

  public void setSalesforceOrderLineId(String salesforceOrderLineId) {
    this.salesforceOrderLineId = salesforceOrderLineId;
  }

  public SSIOInsertionOrderUpdate startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Starting date of time period. Format: YYYY-MM-DD
   * @return startDate
  **/
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public SSIOInsertionOrderUpdate userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

   /**
   * The email of user submitting the insertion order
   * @return userEmail
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

