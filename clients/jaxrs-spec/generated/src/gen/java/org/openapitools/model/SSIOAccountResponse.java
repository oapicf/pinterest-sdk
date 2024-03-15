package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SSIOAccountItem;
import org.openapitools.model.SSIOAccountPMPName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("SSIOAccountResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class SSIOAccountResponse   {
  private @Valid Boolean eligible;
  private @Valid Boolean canEdit;
  private @Valid List<@Valid SSIOAccountItem> billtoInfos;
  private @Valid String currency;
  private @Valid List<@Valid SSIOAccountPMPName> pmpNames;
  private @Valid String error;

  /**
   * Advertiser eligible to create order lines
   **/
  public SSIOAccountResponse eligible(Boolean eligible) {
    this.eligible = eligible;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "Advertiser eligible to create order lines")
  @JsonProperty("eligible")
  public Boolean getEligible() {
    return eligible;
  }

  @JsonProperty("eligible")
  public void setEligible(Boolean eligible) {
    this.eligible = eligible;
  }

  /**
   * Advertiser eligible to update order lines
   **/
  public SSIOAccountResponse canEdit(Boolean canEdit) {
    this.canEdit = canEdit;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "Advertiser eligible to update order lines")
  @JsonProperty("can_edit")
  public Boolean getCanEdit() {
    return canEdit;
  }

  @JsonProperty("can_edit")
  public void setCanEdit(Boolean canEdit) {
    this.canEdit = canEdit;
  }

  /**
   * An array of Salesforce account information that includes address, io terms, etc.
   **/
  public SSIOAccountResponse billtoInfos(List<@Valid SSIOAccountItem> billtoInfos) {
    this.billtoInfos = billtoInfos;
    return this;
  }

  
  @ApiModelProperty(value = "An array of Salesforce account information that includes address, io terms, etc.")
  @JsonProperty("billto_infos")
  public List<SSIOAccountItem> getBilltoInfos() {
    return billtoInfos;
  }

  @JsonProperty("billto_infos")
  public void setBilltoInfos(List<@Valid SSIOAccountItem> billtoInfos) {
    this.billtoInfos = billtoInfos;
  }

  public SSIOAccountResponse addBilltoInfosItem(SSIOAccountItem billtoInfosItem) {
    if (this.billtoInfos == null) {
      this.billtoInfos = new ArrayList<>();
    }

    this.billtoInfos.add(billtoInfosItem);
    return this;
  }

  public SSIOAccountResponse removeBilltoInfosItem(SSIOAccountItem billtoInfosItem) {
    if (billtoInfosItem != null && this.billtoInfos != null) {
      this.billtoInfos.remove(billtoInfosItem);
    }

    return this;
  }
  /**
   **/
  public SSIOAccountResponse currency(String currency) {
    this.currency = currency;
    return this;
  }

  
  @ApiModelProperty(example = "USD", value = "")
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  @JsonProperty("currency")
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   **/
  public SSIOAccountResponse pmpNames(List<@Valid SSIOAccountPMPName> pmpNames) {
    this.pmpNames = pmpNames;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pmp_names")
  public List<SSIOAccountPMPName> getPmpNames() {
    return pmpNames;
  }

  @JsonProperty("pmp_names")
  public void setPmpNames(List<@Valid SSIOAccountPMPName> pmpNames) {
    this.pmpNames = pmpNames;
  }

  public SSIOAccountResponse addPmpNamesItem(SSIOAccountPMPName pmpNamesItem) {
    if (this.pmpNames == null) {
      this.pmpNames = new ArrayList<>();
    }

    this.pmpNames.add(pmpNamesItem);
    return this;
  }

  public SSIOAccountResponse removePmpNamesItem(SSIOAccountPMPName pmpNamesItem) {
    if (pmpNamesItem != null && this.pmpNames != null) {
      this.pmpNames.remove(pmpNamesItem);
    }

    return this;
  }
  /**
   * Error indicator from Salesforce which could be \&quot;No Error\&quot;
   **/
  public SSIOAccountResponse error(String error) {
    this.error = error;
    return this;
  }

  
  @ApiModelProperty(example = "No Error", value = "Error indicator from Salesforce which could be \"No Error\"")
  @JsonProperty("error")
  public String getError() {
    return error;
  }

  @JsonProperty("error")
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

