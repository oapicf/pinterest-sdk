package apimodels;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * SSIOEditInsertionOrderRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class SSIOEditInsertionOrderRequest   {
  @JsonProperty("start_date")
  @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")

  private String startDate;

  @JsonProperty("end_date")
  @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")

  private String endDate;

  @JsonProperty("po_number")
  
  private String poNumber;

  @JsonProperty("budget_amount")
  @Valid

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

  @JsonProperty("oracle_line_id")
  
  private String oracleLineId;

  @JsonProperty("salesforce_order_id")
  
  private String salesforceOrderId;

  @JsonProperty("salesforce_order_line_id")
  
  private String salesforceOrderLineId;

  @JsonProperty("ads_manager_order_line_id")
  
  private String adsManagerOrderLineId;

  public SSIOEditInsertionOrderRequest startDate(String startDate) {
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

  public SSIOEditInsertionOrderRequest endDate(String endDate) {
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

  public SSIOEditInsertionOrderRequest poNumber(String poNumber) {
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

  public SSIOEditInsertionOrderRequest budgetAmount(BigDecimal budgetAmount) {
    this.budgetAmount = budgetAmount;
    return this;
  }

   /**
   * If Budget order line, the budget amount.
   * @return budgetAmount
  **/
  public BigDecimal getBudgetAmount() {
    return budgetAmount;
  }

  public void setBudgetAmount(BigDecimal budgetAmount) {
    this.budgetAmount = budgetAmount;
  }

  public SSIOEditInsertionOrderRequest billingContactFirstname(String billingContactFirstname) {
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

  public SSIOEditInsertionOrderRequest billingContactLastname(String billingContactLastname) {
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

  public SSIOEditInsertionOrderRequest billingContactEmail(String billingContactEmail) {
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

  public SSIOEditInsertionOrderRequest mediaContactFirstname(String mediaContactFirstname) {
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

  public SSIOEditInsertionOrderRequest mediaContactLastname(String mediaContactLastname) {
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

  public SSIOEditInsertionOrderRequest mediaContactEmail(String mediaContactEmail) {
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

  public SSIOEditInsertionOrderRequest agencyLink(String agencyLink) {
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

  public SSIOEditInsertionOrderRequest userEmail(String userEmail) {
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

  public SSIOEditInsertionOrderRequest oracleLineId(String oracleLineId) {
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

  public SSIOEditInsertionOrderRequest salesforceOrderId(String salesforceOrderId) {
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

  public SSIOEditInsertionOrderRequest salesforceOrderLineId(String salesforceOrderLineId) {
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

  public SSIOEditInsertionOrderRequest adsManagerOrderLineId(String adsManagerOrderLineId) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest = (SSIOEditInsertionOrderRequest) o;
    return Objects.equals(startDate, ssIOEditInsertionOrderRequest.startDate) &&
        Objects.equals(endDate, ssIOEditInsertionOrderRequest.endDate) &&
        Objects.equals(poNumber, ssIOEditInsertionOrderRequest.poNumber) &&
        Objects.equals(budgetAmount, ssIOEditInsertionOrderRequest.budgetAmount) &&
        Objects.equals(billingContactFirstname, ssIOEditInsertionOrderRequest.billingContactFirstname) &&
        Objects.equals(billingContactLastname, ssIOEditInsertionOrderRequest.billingContactLastname) &&
        Objects.equals(billingContactEmail, ssIOEditInsertionOrderRequest.billingContactEmail) &&
        Objects.equals(mediaContactFirstname, ssIOEditInsertionOrderRequest.mediaContactFirstname) &&
        Objects.equals(mediaContactLastname, ssIOEditInsertionOrderRequest.mediaContactLastname) &&
        Objects.equals(mediaContactEmail, ssIOEditInsertionOrderRequest.mediaContactEmail) &&
        Objects.equals(agencyLink, ssIOEditInsertionOrderRequest.agencyLink) &&
        Objects.equals(userEmail, ssIOEditInsertionOrderRequest.userEmail) &&
        Objects.equals(oracleLineId, ssIOEditInsertionOrderRequest.oracleLineId) &&
        Objects.equals(salesforceOrderId, ssIOEditInsertionOrderRequest.salesforceOrderId) &&
        Objects.equals(salesforceOrderLineId, ssIOEditInsertionOrderRequest.salesforceOrderLineId) &&
        Objects.equals(adsManagerOrderLineId, ssIOEditInsertionOrderRequest.adsManagerOrderLineId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, poNumber, budgetAmount, billingContactFirstname, billingContactLastname, billingContactEmail, mediaContactFirstname, mediaContactLastname, mediaContactEmail, agencyLink, userEmail, oracleLineId, salesforceOrderId, salesforceOrderLineId, adsManagerOrderLineId);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSIOEditInsertionOrderRequest {\n");
    
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
    sb.append("    oracleLineId: ").append(toIndentedString(oracleLineId)).append("\n");
    sb.append("    salesforceOrderId: ").append(toIndentedString(salesforceOrderId)).append("\n");
    sb.append("    salesforceOrderLineId: ").append(toIndentedString(salesforceOrderLineId)).append("\n");
    sb.append("    adsManagerOrderLineId: ").append(toIndentedString(adsManagerOrderLineId)).append("\n");
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

