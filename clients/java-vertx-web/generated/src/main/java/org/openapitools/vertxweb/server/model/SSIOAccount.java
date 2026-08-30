package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.SSIOAccountItem;
import org.openapitools.vertxweb.server.model.SSIOAccountPMPName;

/**
 * Salesforce account details including bill-to information.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SSIOAccount   {
  
  private List<SSIOAccountItem> billtoInfos = new ArrayList<>();
  private Boolean canEdit;
  private String currency;
  private Boolean eligible;
  private String error;
  private List<SSIOAccountPMPName> pmpNames = new ArrayList<>();

  public SSIOAccount () {

  }

  public SSIOAccount (List<SSIOAccountItem> billtoInfos, Boolean canEdit, String currency, Boolean eligible, String error, List<SSIOAccountPMPName> pmpNames) {
    this.billtoInfos = billtoInfos;
    this.canEdit = canEdit;
    this.currency = currency;
    this.eligible = eligible;
    this.error = error;
    this.pmpNames = pmpNames;
  }

    
  @JsonProperty("billto_infos")
  public List<SSIOAccountItem> getBilltoInfos() {
    return billtoInfos;
  }
  public void setBilltoInfos(List<SSIOAccountItem> billtoInfos) {
    this.billtoInfos = billtoInfos;
  }

    
  @JsonProperty("can_edit")
  public Boolean getCanEdit() {
    return canEdit;
  }
  public void setCanEdit(Boolean canEdit) {
    this.canEdit = canEdit;
  }

    
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

    
  @JsonProperty("eligible")
  public Boolean getEligible() {
    return eligible;
  }
  public void setEligible(Boolean eligible) {
    this.eligible = eligible;
  }

    
  @JsonProperty("error")
  public String getError() {
    return error;
  }
  public void setError(String error) {
    this.error = error;
  }

    
  @JsonProperty("pmp_names")
  public List<SSIOAccountPMPName> getPmpNames() {
    return pmpNames;
  }
  public void setPmpNames(List<SSIOAccountPMPName> pmpNames) {
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
