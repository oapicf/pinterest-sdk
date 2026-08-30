package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SSIOAccountItem;
import org.openapitools.model.SSIOAccountPMPName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Salesforce account details including bill-to information.
 */
@ApiModel(description="Salesforce account details including bill-to information.")

public class SSIOAccount  {
  
 /**
  * An array of Salesforce account information that includes address, io terms, etc.
  */
  @ApiModelProperty(value = "An array of Salesforce account information that includes address, io terms, etc.")

  @Valid

  private List<@Valid SSIOAccountItem> billtoInfos = new ArrayList<>();

 /**
  * Advertiser eligible to update order lines
  */
  @ApiModelProperty(example = "true", value = "Advertiser eligible to update order lines")

  private Boolean canEdit;

  @ApiModelProperty(example = "USD", value = "")

  private String currency;

 /**
  * Advertiser eligible to create order lines
  */
  @ApiModelProperty(example = "true", value = "Advertiser eligible to create order lines")

  private Boolean eligible;

 /**
  * Error indicator from Salesforce which could be \"No Error\"
  */
  @ApiModelProperty(example = "No Error", value = "Error indicator from Salesforce which could be \"No Error\"")

  private String error;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid SSIOAccountPMPName> pmpNames = new ArrayList<>();
 /**
   * An array of Salesforce account information that includes address, io terms, etc.
   * @return billtoInfos
  **/
  @JsonProperty("billto_infos")
  public List<@Valid SSIOAccountItem> getBilltoInfos() {
    return billtoInfos;
  }

  public void setBilltoInfos(List<@Valid SSIOAccountItem> billtoInfos) {
    this.billtoInfos = billtoInfos;
  }

  public SSIOAccount billtoInfos(List<@Valid SSIOAccountItem> billtoInfos) {
    this.billtoInfos = billtoInfos;
    return this;
  }

  public SSIOAccount addBilltoInfosItem(SSIOAccountItem billtoInfosItem) {
    this.billtoInfos.add(billtoInfosItem);
    return this;
  }

 /**
   * Advertiser eligible to update order lines
   * @return canEdit
  **/
  @JsonProperty("can_edit")
  public Boolean getCanEdit() {
    return canEdit;
  }

  public void setCanEdit(Boolean canEdit) {
    this.canEdit = canEdit;
  }

  public SSIOAccount canEdit(Boolean canEdit) {
    this.canEdit = canEdit;
    return this;
  }

 /**
   * Get currency
   * @return currency
  **/
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public SSIOAccount currency(String currency) {
    this.currency = currency;
    return this;
  }

 /**
   * Advertiser eligible to create order lines
   * @return eligible
  **/
  @JsonProperty("eligible")
  public Boolean getEligible() {
    return eligible;
  }

  public void setEligible(Boolean eligible) {
    this.eligible = eligible;
  }

  public SSIOAccount eligible(Boolean eligible) {
    this.eligible = eligible;
    return this;
  }

 /**
   * Error indicator from Salesforce which could be \&quot;No Error\&quot;
   * @return error
  **/
  @JsonProperty("error")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public SSIOAccount error(String error) {
    this.error = error;
    return this;
  }

 /**
   * Get pmpNames
   * @return pmpNames
  **/
  @JsonProperty("pmp_names")
  public List<@Valid SSIOAccountPMPName> getPmpNames() {
    return pmpNames;
  }

  public void setPmpNames(List<@Valid SSIOAccountPMPName> pmpNames) {
    this.pmpNames = pmpNames;
  }

  public SSIOAccount pmpNames(List<@Valid SSIOAccountPMPName> pmpNames) {
    this.pmpNames = pmpNames;
    return this;
  }

  public SSIOAccount addPmpNamesItem(SSIOAccountPMPName pmpNamesItem) {
    this.pmpNames.add(pmpNamesItem);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

