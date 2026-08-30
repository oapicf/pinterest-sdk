/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SSIOAccountItem;
import org.openapitools.model.SSIOAccountPMPName;



/**
 * Salesforce account details including bill-to information.
 */

@ApiModel(description = "Salesforce account details including bill-to information.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SSIOAccount   {
  
  private List<SSIOAccountItem> billtoInfos = new ArrayList<>();
  private Boolean canEdit;
  private String currency;
  private Boolean eligible;
  private String error;
  private List<SSIOAccountPMPName> pmpNames = new ArrayList<>();

  /**
   * An array of Salesforce account information that includes address, io terms, etc.
   */
  public SSIOAccount billtoInfos(List<SSIOAccountItem> billtoInfos) {
    this.billtoInfos = billtoInfos;
    return this;
  }

  
  @ApiModelProperty(value = "An array of Salesforce account information that includes address, io terms, etc.")
  @JsonProperty("billto_infos")
  public List<SSIOAccountItem> getBilltoInfos() {
    return billtoInfos;
  }
  public void setBilltoInfos(List<SSIOAccountItem> billtoInfos) {
    this.billtoInfos = billtoInfos;
  }

  /**
   * Advertiser eligible to update order lines
   */
  public SSIOAccount canEdit(Boolean canEdit) {
    this.canEdit = canEdit;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "Advertiser eligible to update order lines")
  @JsonProperty("can_edit")
  public Boolean getCanEdit() {
    return canEdit;
  }
  public void setCanEdit(Boolean canEdit) {
    this.canEdit = canEdit;
  }

  /**
   */
  public SSIOAccount currency(String currency) {
    this.currency = currency;
    return this;
  }

  
  @ApiModelProperty(example = "USD", value = "")
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * Advertiser eligible to create order lines
   */
  public SSIOAccount eligible(Boolean eligible) {
    this.eligible = eligible;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "Advertiser eligible to create order lines")
  @JsonProperty("eligible")
  public Boolean getEligible() {
    return eligible;
  }
  public void setEligible(Boolean eligible) {
    this.eligible = eligible;
  }

  /**
   * Error indicator from Salesforce which could be \"No Error\"
   */
  public SSIOAccount error(String error) {
    this.error = error;
    return this;
  }

  
  @ApiModelProperty(example = "No Error", value = "Error indicator from Salesforce which could be \"No Error\"")
  @JsonProperty("error")
  public String getError() {
    return error;
  }
  public void setError(String error) {
    this.error = error;
  }

  /**
   */
  public SSIOAccount pmpNames(List<SSIOAccountPMPName> pmpNames) {
    this.pmpNames = pmpNames;
    return this;
  }

  
  @ApiModelProperty(value = "")
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

