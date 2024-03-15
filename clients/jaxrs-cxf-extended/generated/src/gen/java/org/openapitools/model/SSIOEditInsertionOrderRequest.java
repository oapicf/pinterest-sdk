package org.openapitools.model;

import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SSIOEditInsertionOrderRequest  {
  
 /**
  * Starting date of time period. Format: YYYY-MM-DD
  */
  @ApiModelProperty(example = "2020-12-20", value = "Starting date of time period. Format: YYYY-MM-DD")
  private String startDate;

 /**
  * End date of time period. Format: YYYY-MM-DD
  */
  @ApiModelProperty(example = "2020-12-20", value = "End date of time period. Format: YYYY-MM-DD")
  private String endDate;

 /**
  * The po number
  */
  @ApiModelProperty(value = "The po number")
  private String poNumber;

 /**
  * If Budget order line, the budget amount.
  */
  @ApiModelProperty(example = "5000000", value = "If Budget order line, the budget amount.")
  @Valid
  private BigDecimal budgetAmount;

 /**
  * The billing contact first name
  */
  @ApiModelProperty(value = "The billing contact first name")
  private String billingContactFirstname;

 /**
  * The billing contact last name
  */
  @ApiModelProperty(value = "The billing contact last name")
  private String billingContactLastname;

 /**
  * The billing contact email
  */
  @ApiModelProperty(example = "test@example", value = "The billing contact email")
  private String billingContactEmail;

 /**
  * The media contact first name
  */
  @ApiModelProperty(value = "The media contact first name")
  private String mediaContactFirstname;

 /**
  * The media contact last name
  */
  @ApiModelProperty(value = "The media contact last name")
  private String mediaContactLastname;

 /**
  * The media contact email
  */
  @ApiModelProperty(example = "test@example", value = "The media contact email")
  private String mediaContactEmail;

 /**
  * URL link for agency
  */
  @ApiModelProperty(value = "URL link for agency")
  private String agencyLink;

 /**
  * The email of user submitting the insertion order
  */
  @ApiModelProperty(example = "test@example", value = "The email of user submitting the insertion order")
  private String userEmail;

 /**
  * LineId in the Oracle DB
  */
  @ApiModelProperty(value = "LineId in the Oracle DB")
  private String oracleLineId;

 /**
  * OrderId in SFDC
  */
  @ApiModelProperty(value = "OrderId in SFDC")
  private String salesforceOrderId;

 /**
  * OrderLineId in SFDC
  */
  @ApiModelProperty(value = "OrderLineId in SFDC")
  private String salesforceOrderLineId;

 /**
  * Ads manager OrderLineId
  */
  @ApiModelProperty(value = "Ads manager OrderLineId")
  private String adsManagerOrderLineId;
 /**
  * Starting date of time period. Format: YYYY-MM-DD
  * @return startDate
  */
  @JsonProperty("start_date")
 @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")  public String getStartDate() {
    return startDate;
  }

  /**
   * Sets the <code>startDate</code> property.
   */
 public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * Sets the <code>startDate</code> property.
   */
  public SSIOEditInsertionOrderRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

 /**
  * End date of time period. Format: YYYY-MM-DD
  * @return endDate
  */
  @JsonProperty("end_date")
 @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")  public String getEndDate() {
    return endDate;
  }

  /**
   * Sets the <code>endDate</code> property.
   */
 public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   * Sets the <code>endDate</code> property.
   */
  public SSIOEditInsertionOrderRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

 /**
  * The po number
  * @return poNumber
  */
  @JsonProperty("po_number")
  public String getPoNumber() {
    return poNumber;
  }

  /**
   * Sets the <code>poNumber</code> property.
   */
 public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }

  /**
   * Sets the <code>poNumber</code> property.
   */
  public SSIOEditInsertionOrderRequest poNumber(String poNumber) {
    this.poNumber = poNumber;
    return this;
  }

 /**
  * If Budget order line, the budget amount.
  * @return budgetAmount
  */
  @JsonProperty("budget_amount")
  public BigDecimal getBudgetAmount() {
    return budgetAmount;
  }

  /**
   * Sets the <code>budgetAmount</code> property.
   */
 public void setBudgetAmount(BigDecimal budgetAmount) {
    this.budgetAmount = budgetAmount;
  }

  /**
   * Sets the <code>budgetAmount</code> property.
   */
  public SSIOEditInsertionOrderRequest budgetAmount(BigDecimal budgetAmount) {
    this.budgetAmount = budgetAmount;
    return this;
  }

 /**
  * The billing contact first name
  * @return billingContactFirstname
  */
  @JsonProperty("billing_contact_firstname")
  public String getBillingContactFirstname() {
    return billingContactFirstname;
  }

  /**
   * Sets the <code>billingContactFirstname</code> property.
   */
 public void setBillingContactFirstname(String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
  }

  /**
   * Sets the <code>billingContactFirstname</code> property.
   */
  public SSIOEditInsertionOrderRequest billingContactFirstname(String billingContactFirstname) {
    this.billingContactFirstname = billingContactFirstname;
    return this;
  }

 /**
  * The billing contact last name
  * @return billingContactLastname
  */
  @JsonProperty("billing_contact_lastname")
  public String getBillingContactLastname() {
    return billingContactLastname;
  }

  /**
   * Sets the <code>billingContactLastname</code> property.
   */
 public void setBillingContactLastname(String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
  }

  /**
   * Sets the <code>billingContactLastname</code> property.
   */
  public SSIOEditInsertionOrderRequest billingContactLastname(String billingContactLastname) {
    this.billingContactLastname = billingContactLastname;
    return this;
  }

 /**
  * The billing contact email
  * @return billingContactEmail
  */
  @JsonProperty("billing_contact_email")
  public String getBillingContactEmail() {
    return billingContactEmail;
  }

  /**
   * Sets the <code>billingContactEmail</code> property.
   */
 public void setBillingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
  }

  /**
   * Sets the <code>billingContactEmail</code> property.
   */
  public SSIOEditInsertionOrderRequest billingContactEmail(String billingContactEmail) {
    this.billingContactEmail = billingContactEmail;
    return this;
  }

 /**
  * The media contact first name
  * @return mediaContactFirstname
  */
  @JsonProperty("media_contact_firstname")
  public String getMediaContactFirstname() {
    return mediaContactFirstname;
  }

  /**
   * Sets the <code>mediaContactFirstname</code> property.
   */
 public void setMediaContactFirstname(String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
  }

  /**
   * Sets the <code>mediaContactFirstname</code> property.
   */
  public SSIOEditInsertionOrderRequest mediaContactFirstname(String mediaContactFirstname) {
    this.mediaContactFirstname = mediaContactFirstname;
    return this;
  }

 /**
  * The media contact last name
  * @return mediaContactLastname
  */
  @JsonProperty("media_contact_lastname")
  public String getMediaContactLastname() {
    return mediaContactLastname;
  }

  /**
   * Sets the <code>mediaContactLastname</code> property.
   */
 public void setMediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
  }

  /**
   * Sets the <code>mediaContactLastname</code> property.
   */
  public SSIOEditInsertionOrderRequest mediaContactLastname(String mediaContactLastname) {
    this.mediaContactLastname = mediaContactLastname;
    return this;
  }

 /**
  * The media contact email
  * @return mediaContactEmail
  */
  @JsonProperty("media_contact_email")
  public String getMediaContactEmail() {
    return mediaContactEmail;
  }

  /**
   * Sets the <code>mediaContactEmail</code> property.
   */
 public void setMediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
  }

  /**
   * Sets the <code>mediaContactEmail</code> property.
   */
  public SSIOEditInsertionOrderRequest mediaContactEmail(String mediaContactEmail) {
    this.mediaContactEmail = mediaContactEmail;
    return this;
  }

 /**
  * URL link for agency
  * @return agencyLink
  */
  @JsonProperty("agency_link")
  public String getAgencyLink() {
    return agencyLink;
  }

  /**
   * Sets the <code>agencyLink</code> property.
   */
 public void setAgencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
  }

  /**
   * Sets the <code>agencyLink</code> property.
   */
  public SSIOEditInsertionOrderRequest agencyLink(String agencyLink) {
    this.agencyLink = agencyLink;
    return this;
  }

 /**
  * The email of user submitting the insertion order
  * @return userEmail
  */
  @JsonProperty("user_email")
  public String getUserEmail() {
    return userEmail;
  }

  /**
   * Sets the <code>userEmail</code> property.
   */
 public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  /**
   * Sets the <code>userEmail</code> property.
   */
  public SSIOEditInsertionOrderRequest userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

 /**
  * LineId in the Oracle DB
  * @return oracleLineId
  */
  @JsonProperty("oracle_line_id")
  public String getOracleLineId() {
    return oracleLineId;
  }

  /**
   * Sets the <code>oracleLineId</code> property.
   */
 public void setOracleLineId(String oracleLineId) {
    this.oracleLineId = oracleLineId;
  }

  /**
   * Sets the <code>oracleLineId</code> property.
   */
  public SSIOEditInsertionOrderRequest oracleLineId(String oracleLineId) {
    this.oracleLineId = oracleLineId;
    return this;
  }

 /**
  * OrderId in SFDC
  * @return salesforceOrderId
  */
  @JsonProperty("salesforce_order_id")
  public String getSalesforceOrderId() {
    return salesforceOrderId;
  }

  /**
   * Sets the <code>salesforceOrderId</code> property.
   */
 public void setSalesforceOrderId(String salesforceOrderId) {
    this.salesforceOrderId = salesforceOrderId;
  }

  /**
   * Sets the <code>salesforceOrderId</code> property.
   */
  public SSIOEditInsertionOrderRequest salesforceOrderId(String salesforceOrderId) {
    this.salesforceOrderId = salesforceOrderId;
    return this;
  }

 /**
  * OrderLineId in SFDC
  * @return salesforceOrderLineId
  */
  @JsonProperty("salesforce_order_line_id")
  public String getSalesforceOrderLineId() {
    return salesforceOrderLineId;
  }

  /**
   * Sets the <code>salesforceOrderLineId</code> property.
   */
 public void setSalesforceOrderLineId(String salesforceOrderLineId) {
    this.salesforceOrderLineId = salesforceOrderLineId;
  }

  /**
   * Sets the <code>salesforceOrderLineId</code> property.
   */
  public SSIOEditInsertionOrderRequest salesforceOrderLineId(String salesforceOrderLineId) {
    this.salesforceOrderLineId = salesforceOrderLineId;
    return this;
  }

 /**
  * Ads manager OrderLineId
  * @return adsManagerOrderLineId
  */
  @JsonProperty("ads_manager_order_line_id")
  public String getAdsManagerOrderLineId() {
    return adsManagerOrderLineId;
  }

  /**
   * Sets the <code>adsManagerOrderLineId</code> property.
   */
 public void setAdsManagerOrderLineId(String adsManagerOrderLineId) {
    this.adsManagerOrderLineId = adsManagerOrderLineId;
  }

  /**
   * Sets the <code>adsManagerOrderLineId</code> property.
   */
  public SSIOEditInsertionOrderRequest adsManagerOrderLineId(String adsManagerOrderLineId) {
    this.adsManagerOrderLineId = adsManagerOrderLineId;
    return this;
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
    return Objects.equals(this.startDate, ssIOEditInsertionOrderRequest.startDate) &&
        Objects.equals(this.endDate, ssIOEditInsertionOrderRequest.endDate) &&
        Objects.equals(this.poNumber, ssIOEditInsertionOrderRequest.poNumber) &&
        Objects.equals(this.budgetAmount, ssIOEditInsertionOrderRequest.budgetAmount) &&
        Objects.equals(this.billingContactFirstname, ssIOEditInsertionOrderRequest.billingContactFirstname) &&
        Objects.equals(this.billingContactLastname, ssIOEditInsertionOrderRequest.billingContactLastname) &&
        Objects.equals(this.billingContactEmail, ssIOEditInsertionOrderRequest.billingContactEmail) &&
        Objects.equals(this.mediaContactFirstname, ssIOEditInsertionOrderRequest.mediaContactFirstname) &&
        Objects.equals(this.mediaContactLastname, ssIOEditInsertionOrderRequest.mediaContactLastname) &&
        Objects.equals(this.mediaContactEmail, ssIOEditInsertionOrderRequest.mediaContactEmail) &&
        Objects.equals(this.agencyLink, ssIOEditInsertionOrderRequest.agencyLink) &&
        Objects.equals(this.userEmail, ssIOEditInsertionOrderRequest.userEmail) &&
        Objects.equals(this.oracleLineId, ssIOEditInsertionOrderRequest.oracleLineId) &&
        Objects.equals(this.salesforceOrderId, ssIOEditInsertionOrderRequest.salesforceOrderId) &&
        Objects.equals(this.salesforceOrderLineId, ssIOEditInsertionOrderRequest.salesforceOrderLineId) &&
        Objects.equals(this.adsManagerOrderLineId, ssIOEditInsertionOrderRequest.adsManagerOrderLineId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, poNumber, budgetAmount, billingContactFirstname, billingContactLastname, billingContactEmail, mediaContactFirstname, mediaContactLastname, mediaContactEmail, agencyLink, userEmail, oracleLineId, salesforceOrderId, salesforceOrderLineId, adsManagerOrderLineId);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

