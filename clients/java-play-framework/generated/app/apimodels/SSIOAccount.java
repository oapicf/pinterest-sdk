package apimodels;

import apimodels.SSIOAccountItem;
import apimodels.SSIOAccountPMPName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Salesforce account details including bill-to information.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class SSIOAccount   {
  @JsonProperty("billto_infos")
  @Valid

  private List<@Valid SSIOAccountItem> billtoInfos = null;

  @JsonProperty("can_edit")
  
  private Boolean canEdit;

  @JsonProperty("currency")
  
  private String currency;

  @JsonProperty("eligible")
  
  private Boolean eligible;

  @JsonProperty("error")
  
  private String error;

  @JsonProperty("pmp_names")
  @Valid

  private List<@Valid SSIOAccountPMPName> pmpNames = null;

  public SSIOAccount billtoInfos(List<@Valid SSIOAccountItem> billtoInfos) {
    this.billtoInfos = billtoInfos;
    return this;
  }

  public SSIOAccount addBilltoInfosItem(SSIOAccountItem billtoInfosItem) {
    if (this.billtoInfos == null) {
      this.billtoInfos = new ArrayList<>();
    }
    this.billtoInfos.add(billtoInfosItem);
    return this;
  }

   /**
   * An array of Salesforce account information that includes address, io terms, etc.
   * @return billtoInfos
  **/
  public List<@Valid SSIOAccountItem> getBilltoInfos() {
    return billtoInfos;
  }

  public void setBilltoInfos(List<@Valid SSIOAccountItem> billtoInfos) {
    this.billtoInfos = billtoInfos;
  }

  public SSIOAccount canEdit(Boolean canEdit) {
    this.canEdit = canEdit;
    return this;
  }

   /**
   * Advertiser eligible to update order lines
   * @return canEdit
  **/
  public Boolean getCanEdit() {
    return canEdit;
  }

  public void setCanEdit(Boolean canEdit) {
    this.canEdit = canEdit;
  }

  public SSIOAccount currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public SSIOAccount eligible(Boolean eligible) {
    this.eligible = eligible;
    return this;
  }

   /**
   * Advertiser eligible to create order lines
   * @return eligible
  **/
  public Boolean getEligible() {
    return eligible;
  }

  public void setEligible(Boolean eligible) {
    this.eligible = eligible;
  }

  public SSIOAccount error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Error indicator from Salesforce which could be \"No Error\"
   * @return error
  **/
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public SSIOAccount pmpNames(List<@Valid SSIOAccountPMPName> pmpNames) {
    this.pmpNames = pmpNames;
    return this;
  }

  public SSIOAccount addPmpNamesItem(SSIOAccountPMPName pmpNamesItem) {
    if (this.pmpNames == null) {
      this.pmpNames = new ArrayList<>();
    }
    this.pmpNames.add(pmpNamesItem);
    return this;
  }

   /**
   * Get pmpNames
   * @return pmpNames
  **/
  public List<@Valid SSIOAccountPMPName> getPmpNames() {
    return pmpNames;
  }

  public void setPmpNames(List<@Valid SSIOAccountPMPName> pmpNames) {
    this.pmpNames = pmpNames;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSIOAccount ssIOAccount = (SSIOAccount) o;
    return Objects.equals(billtoInfos, ssIOAccount.billtoInfos) &&
        Objects.equals(canEdit, ssIOAccount.canEdit) &&
        Objects.equals(currency, ssIOAccount.currency) &&
        Objects.equals(eligible, ssIOAccount.eligible) &&
        Objects.equals(error, ssIOAccount.error) &&
        Objects.equals(pmpNames, ssIOAccount.pmpNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billtoInfos, canEdit, currency, eligible, error, pmpNames);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSIOAccount {\n");
    
    sb.append("    billtoInfos: ").append(toIndentedString(billtoInfos)).append("\n");
    sb.append("    canEdit: ").append(toIndentedString(canEdit)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    eligible: ").append(toIndentedString(eligible)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    pmpNames: ").append(toIndentedString(pmpNames)).append("\n");
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

