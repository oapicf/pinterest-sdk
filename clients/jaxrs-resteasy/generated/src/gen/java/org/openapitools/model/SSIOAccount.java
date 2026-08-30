package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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

@ApiModel(description="Salesforce account details including bill-to information.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SSIOAccount   {
  
  private List<@Valid SSIOAccountItem> billtoInfos = new ArrayList<>();
  private Boolean canEdit;
  private String currency;
  private Boolean eligible;
  private String error;
  private List<@Valid SSIOAccountPMPName> pmpNames = new ArrayList<>();

  /**
   * An array of Salesforce account information that includes address, io terms, etc.
   **/
  
  @ApiModelProperty(value = "An array of Salesforce account information that includes address, io terms, etc.")
  @JsonProperty("billto_infos")
  @Valid
  public List<@Valid SSIOAccountItem> getBilltoInfos() {
    return billtoInfos;
  }
  public void setBilltoInfos(List<@Valid SSIOAccountItem> billtoInfos) {
    this.billtoInfos = billtoInfos;
  }

  /**
   * Advertiser eligible to update order lines
   **/
  
  @ApiModelProperty(example = "true", value = "Advertiser eligible to update order lines")
  @JsonProperty("can_edit")
  public Boolean getCanEdit() {
    return canEdit;
  }
  public void setCanEdit(Boolean canEdit) {
    this.canEdit = canEdit;
  }

  /**
   **/
  
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
   **/
  
  @ApiModelProperty(example = "true", value = "Advertiser eligible to create order lines")
  @JsonProperty("eligible")
  public Boolean getEligible() {
    return eligible;
  }
  public void setEligible(Boolean eligible) {
    this.eligible = eligible;
  }

  /**
   * Error indicator from Salesforce which could be \&quot;No Error\&quot;
   **/
  
  @ApiModelProperty(example = "No Error", value = "Error indicator from Salesforce which could be \"No Error\"")
  @JsonProperty("error")
  public String getError() {
    return error;
  }
  public void setError(String error) {
    this.error = error;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pmp_names")
  @Valid
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

