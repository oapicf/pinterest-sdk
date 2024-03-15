package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.SSIOAccountItem;
import com.prokarma.pkmst.model.SSIOAccountPMPName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * SSIOAccountResponse
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class SSIOAccountResponse   {
  @JsonProperty("eligible")
  private Boolean eligible;

  @JsonProperty("can_edit")
  private Boolean canEdit;

  @JsonProperty("billto_infos")
  
  private List<SSIOAccountItem> billtoInfos = null;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("pmp_names")
  
  private List<SSIOAccountPMPName> pmpNames = null;

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
  @ApiModelProperty(example = "true", value = "Advertiser eligible to create order lines")
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
  @ApiModelProperty(example = "true", value = "Advertiser eligible to update order lines")
  public Boolean getCanEdit() {
    return canEdit;
  }

  public void setCanEdit(Boolean canEdit) {
    this.canEdit = canEdit;
  }

  public SSIOAccountResponse billtoInfos(List<SSIOAccountItem> billtoInfos) {
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
  @ApiModelProperty(value = "An array of Salesforce account information that includes address, io terms, etc.")
  public List<SSIOAccountItem> getBilltoInfos() {
    return billtoInfos;
  }

  public void setBilltoInfos(List<SSIOAccountItem> billtoInfos) {
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
  @ApiModelProperty(example = "USD", value = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public SSIOAccountResponse pmpNames(List<SSIOAccountPMPName> pmpNames) {
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
  @ApiModelProperty(value = "")
  public List<SSIOAccountPMPName> getPmpNames() {
    return pmpNames;
  }

  public void setPmpNames(List<SSIOAccountPMPName> pmpNames) {
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
  @ApiModelProperty(example = "No Error", value = "Error indicator from Salesforce which could be \"No Error\"")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

