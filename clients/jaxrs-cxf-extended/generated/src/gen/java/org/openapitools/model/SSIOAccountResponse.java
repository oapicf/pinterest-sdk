package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SSIOAccountItem;
import org.openapitools.model.SSIOAccountPMPName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SSIOAccountResponse  {
  
 /**
  * Advertiser eligible to create order lines
  */
  @ApiModelProperty(example = "true", value = "Advertiser eligible to create order lines")
  private Boolean eligible;

 /**
  * Advertiser eligible to update order lines
  */
  @ApiModelProperty(example = "true", value = "Advertiser eligible to update order lines")
  private Boolean canEdit;

 /**
  * An array of Salesforce account information that includes address, io terms, etc.
  */
  @ApiModelProperty(value = "An array of Salesforce account information that includes address, io terms, etc.")
  @Valid
  private List<@Valid SSIOAccountItem> billtoInfos;

  @ApiModelProperty(example = "USD", value = "")
  private String currency;

  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid SSIOAccountPMPName> pmpNames;

 /**
  * Error indicator from Salesforce which could be \"No Error\"
  */
  @ApiModelProperty(example = "No Error", value = "Error indicator from Salesforce which could be \"No Error\"")
  private String error;
 /**
  * Advertiser eligible to create order lines
  * @return eligible
  */
  @JsonProperty("eligible")
  public Boolean getEligible() {
    return eligible;
  }

  /**
   * Sets the <code>eligible</code> property.
   */
 public void setEligible(Boolean eligible) {
    this.eligible = eligible;
  }

  /**
   * Sets the <code>eligible</code> property.
   */
  public SSIOAccountResponse eligible(Boolean eligible) {
    this.eligible = eligible;
    return this;
  }

 /**
  * Advertiser eligible to update order lines
  * @return canEdit
  */
  @JsonProperty("can_edit")
  public Boolean getCanEdit() {
    return canEdit;
  }

  /**
   * Sets the <code>canEdit</code> property.
   */
 public void setCanEdit(Boolean canEdit) {
    this.canEdit = canEdit;
  }

  /**
   * Sets the <code>canEdit</code> property.
   */
  public SSIOAccountResponse canEdit(Boolean canEdit) {
    this.canEdit = canEdit;
    return this;
  }

 /**
  * An array of Salesforce account information that includes address, io terms, etc.
  * @return billtoInfos
  */
  @JsonProperty("billto_infos")
  public List<@Valid SSIOAccountItem> getBilltoInfos() {
    return billtoInfos;
  }

  /**
   * Sets the <code>billtoInfos</code> property.
   */
 public void setBilltoInfos(List<@Valid SSIOAccountItem> billtoInfos) {
    this.billtoInfos = billtoInfos;
  }

  /**
   * Sets the <code>billtoInfos</code> property.
   */
  public SSIOAccountResponse billtoInfos(List<@Valid SSIOAccountItem> billtoInfos) {
    this.billtoInfos = billtoInfos;
    return this;
  }

  /**
   * Adds a new item to the <code>billtoInfos</code> list.
   */
  public SSIOAccountResponse addBilltoInfosItem(SSIOAccountItem billtoInfosItem) {
    this.billtoInfos.add(billtoInfosItem);
    return this;
  }

 /**
  * Get currency
  * @return currency
  */
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  /**
   * Sets the <code>currency</code> property.
   */
 public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * Sets the <code>currency</code> property.
   */
  public SSIOAccountResponse currency(String currency) {
    this.currency = currency;
    return this;
  }

 /**
  * Get pmpNames
  * @return pmpNames
  */
  @JsonProperty("pmp_names")
  public List<@Valid SSIOAccountPMPName> getPmpNames() {
    return pmpNames;
  }

  /**
   * Sets the <code>pmpNames</code> property.
   */
 public void setPmpNames(List<@Valid SSIOAccountPMPName> pmpNames) {
    this.pmpNames = pmpNames;
  }

  /**
   * Sets the <code>pmpNames</code> property.
   */
  public SSIOAccountResponse pmpNames(List<@Valid SSIOAccountPMPName> pmpNames) {
    this.pmpNames = pmpNames;
    return this;
  }

  /**
   * Adds a new item to the <code>pmpNames</code> list.
   */
  public SSIOAccountResponse addPmpNamesItem(SSIOAccountPMPName pmpNamesItem) {
    this.pmpNames.add(pmpNamesItem);
    return this;
  }

 /**
  * Error indicator from Salesforce which could be \&quot;No Error\&quot;
  * @return error
  */
  @JsonProperty("error")
  public String getError() {
    return error;
  }

  /**
   * Sets the <code>error</code> property.
   */
 public void setError(String error) {
    this.error = error;
  }

  /**
   * Sets the <code>error</code> property.
   */
  public SSIOAccountResponse error(String error) {
    this.error = error;
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
    SSIOAccountResponse ssIOAccountResponse = (SSIOAccountResponse) o;
    return Objects.equals(this.eligible, ssIOAccountResponse.eligible) &&
        Objects.equals(this.canEdit, ssIOAccountResponse.canEdit) &&
        Objects.equals(this.billtoInfos, ssIOAccountResponse.billtoInfos) &&
        Objects.equals(this.currency, ssIOAccountResponse.currency) &&
        Objects.equals(this.pmpNames, ssIOAccountResponse.pmpNames) &&
        Objects.equals(this.error, ssIOAccountResponse.error);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

