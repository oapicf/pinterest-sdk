package apimodels;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * SSIOInsertionOrderCommon
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class SSIOInsertionOrderCommon   {
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

  public SSIOInsertionOrderCommon startDate(String startDate) {
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

  public SSIOInsertionOrderCommon endDate(String endDate) {
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

  public SSIOInsertionOrderCommon poNumber(String poNumber) {
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

  public SSIOInsertionOrderCommon budgetAmount(BigDecimal budgetAmount) {
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

  public SSIOInsertionOrderCommon billingContactFirstname(String billingContactFirstname) {
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

  public SSIOInsertionOrderCommon billingContactLastname(String billingContactLastname) {
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

  public SSIOInsertionOrderCommon billingContactEmail(String billingContactEmail) {
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

  public SSIOInsertionOrderCommon mediaContactFirstname(String mediaContactFirstname) {
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

  public SSIOInsertionOrderCommon mediaContactLastname(String mediaContactLastname) {
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

  public SSIOInsertionOrderCommon mediaContactEmail(String mediaContactEmail) {
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

  public SSIOInsertionOrderCommon agencyLink(String agencyLink) {
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

  public SSIOInsertionOrderCommon userEmail(String userEmail) {
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
    SSIOInsertionOrderCommon ssIOInsertionOrderCommon = (SSIOInsertionOrderCommon) o;
    return Objects.equals(startDate, ssIOInsertionOrderCommon.startDate) &&
        Objects.equals(endDate, ssIOInsertionOrderCommon.endDate) &&
        Objects.equals(poNumber, ssIOInsertionOrderCommon.poNumber) &&
        Objects.equals(budgetAmount, ssIOInsertionOrderCommon.budgetAmount) &&
        Objects.equals(billingContactFirstname, ssIOInsertionOrderCommon.billingContactFirstname) &&
        Objects.equals(billingContactLastname, ssIOInsertionOrderCommon.billingContactLastname) &&
        Objects.equals(billingContactEmail, ssIOInsertionOrderCommon.billingContactEmail) &&
        Objects.equals(mediaContactFirstname, ssIOInsertionOrderCommon.mediaContactFirstname) &&
        Objects.equals(mediaContactLastname, ssIOInsertionOrderCommon.mediaContactLastname) &&
        Objects.equals(mediaContactEmail, ssIOInsertionOrderCommon.mediaContactEmail) &&
        Objects.equals(agencyLink, ssIOInsertionOrderCommon.agencyLink) &&
        Objects.equals(userEmail, ssIOInsertionOrderCommon.userEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, poNumber, budgetAmount, billingContactFirstname, billingContactLastname, billingContactEmail, mediaContactFirstname, mediaContactLastname, mediaContactEmail, agencyLink, userEmail);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSIOInsertionOrderCommon {\n");
    
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

