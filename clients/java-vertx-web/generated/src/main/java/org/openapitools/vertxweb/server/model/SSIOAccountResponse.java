package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.SSIOAccountItem;
import org.openapitools.vertxweb.server.model.SSIOAccountPMPName;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SSIOAccountResponse   {
  
  private Boolean eligible;
  private Boolean canEdit;
  private List<SSIOAccountItem> billtoInfos = new ArrayList<>();
  private String currency;
  private List<SSIOAccountPMPName> pmpNames = new ArrayList<>();
  private String error;

  public SSIOAccountResponse () {

  }

  public SSIOAccountResponse (Boolean eligible, Boolean canEdit, List<SSIOAccountItem> billtoInfos, String currency, List<SSIOAccountPMPName> pmpNames, String error) {
    this.eligible = eligible;
    this.canEdit = canEdit;
    this.billtoInfos = billtoInfos;
    this.currency = currency;
    this.pmpNames = pmpNames;
    this.error = error;
  }

    
  @JsonProperty("eligible")
  public Boolean getEligible() {
    return eligible;
  }
  public void setEligible(Boolean eligible) {
    this.eligible = eligible;
  }

    
  @JsonProperty("can_edit")
  public Boolean getCanEdit() {
    return canEdit;
  }
  public void setCanEdit(Boolean canEdit) {
    this.canEdit = canEdit;
  }

    
  @JsonProperty("billto_infos")
  public List<SSIOAccountItem> getBilltoInfos() {
    return billtoInfos;
  }
  public void setBilltoInfos(List<SSIOAccountItem> billtoInfos) {
    this.billtoInfos = billtoInfos;
  }

    
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

    
  @JsonProperty("pmp_names")
  public List<SSIOAccountPMPName> getPmpNames() {
    return pmpNames;
  }
  public void setPmpNames(List<SSIOAccountPMPName> pmpNames) {
    this.pmpNames = pmpNames;
  }

    
  @JsonProperty("error")
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
