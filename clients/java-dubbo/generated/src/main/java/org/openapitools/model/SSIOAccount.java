package org.openapitools.model;

import org.openapitools.model.SSIOAccountItem;
import org.openapitools.model.SSIOAccountPMPName;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Salesforce account details including bill-to information.
 */
public class SSIOAccount implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * An array of Salesforce account information that includes address, io terms, etc.
   */
  @JsonProperty("billto_infos")
  private List<SSIOAccountItem> billtoInfos = new ArrayList<>();

  /**
   * Advertiser eligible to update order lines
   */
  @JsonProperty("can_edit")
  private Boolean canEdit;

  @JsonProperty("currency")
  private String currency;

  /**
   * Advertiser eligible to create order lines
   */
  @JsonProperty("eligible")
  private Boolean eligible;

  /**
   * Error indicator from Salesforce which could be \&quot;No Error\&quot;
   */
  @JsonProperty("error")
  private String error;

  @JsonProperty("pmp_names")
  private List<SSIOAccountPMPName> pmpNames = new ArrayList<>();

  /**
   * An array of Salesforce account information that includes address, io terms, etc.
   * @return billtoInfos
   */
  public List<SSIOAccountItem> getBilltoInfos() {
    return billtoInfos;
  }

  public void setBilltoInfos(List<SSIOAccountItem> billtoInfos) {
    this.billtoInfos = billtoInfos;
  }

  /**
   * Advertiser eligible to update order lines
   * @return canEdit
   */
  public Boolean getCanEdit() {
    return canEdit;
  }

  public void setCanEdit(Boolean canEdit) {
    this.canEdit = canEdit;
  }

  /**
   * 
   * @return currency
   */
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * Advertiser eligible to create order lines
   * @return eligible
   */
  public Boolean getEligible() {
    return eligible;
  }

  public void setEligible(Boolean eligible) {
    this.eligible = eligible;
  }

  /**
   * Error indicator from Salesforce which could be \&quot;No Error\&quot;
   * @return error
   */
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  /**
   * 
   * @return pmpNames
   */
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
    return Objects.equals(this.billtoInfos, ssIOAccount.billtoInfos) &&
        Objects.equals(this.canEdit, ssIOAccount.canEdit) &&
        Objects.equals(this.currency, ssIOAccount.currency) &&
        Objects.equals(this.eligible, ssIOAccount.eligible) &&
        Objects.equals(this.error, ssIOAccount.error) &&
        Objects.equals(this.pmpNames, ssIOAccount.pmpNames);
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
