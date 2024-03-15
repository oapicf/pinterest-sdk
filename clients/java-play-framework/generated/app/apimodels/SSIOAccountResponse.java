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
 * SSIOAccountResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class SSIOAccountResponse   {
  @JsonProperty("eligible")
  
  private Boolean eligible;

  @JsonProperty("can_edit")
  
  private Boolean canEdit;

  @JsonProperty("billto_infos")
  @Valid

  private List<@Valid SSIOAccountItem> billtoInfos = null;

  @JsonProperty("currency")
  
  private String currency;

  @JsonProperty("pmp_names")
  @Valid

  private List<@Valid SSIOAccountPMPName> pmpNames = null;

  @JsonProperty("error")
  
  private String error;

  public SSIOAccountResponse eligible(Boolean eligible) {
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

  public SSIOAccountResponse canEdit(Boolean canEdit) {
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

  public SSIOAccountResponse billtoInfos(List<@Valid SSIOAccountItem> billtoInfos) {
    this.billtoInfos = billtoInfos;
    return this;
  }

  public SSIOAccountResponse addBilltoInfosItem(SSIOAccountItem billtoInfosItem) {
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

  public SSIOAccountResponse currency(String currency) {
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

  public SSIOAccountResponse pmpNames(List<@Valid SSIOAccountPMPName> pmpNames) {
    this.pmpNames = pmpNames;
    return this;
  }

  public SSIOAccountResponse addPmpNamesItem(SSIOAccountPMPName pmpNamesItem) {
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

  public SSIOAccountResponse error(String error) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSIOAccountResponse ssIOAccountResponse = (SSIOAccountResponse) o;
    return Objects.equals(eligible, ssIOAccountResponse.eligible) &&
        Objects.equals(canEdit, ssIOAccountResponse.canEdit) &&
        Objects.equals(billtoInfos, ssIOAccountResponse.billtoInfos) &&
        Objects.equals(currency, ssIOAccountResponse.currency) &&
        Objects.equals(pmpNames, ssIOAccountResponse.pmpNames) &&
        Objects.equals(error, ssIOAccountResponse.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eligible, canEdit, billtoInfos, currency, pmpNames, error);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSIOAccountResponse {\n");
    
    sb.append("    eligible: ").append(toIndentedString(eligible)).append("\n");
    sb.append("    canEdit: ").append(toIndentedString(canEdit)).append("\n");
    sb.append("    billtoInfos: ").append(toIndentedString(billtoInfos)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    pmpNames: ").append(toIndentedString(pmpNames)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

