package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SSIOAccountItem;
import org.openapitools.model.SSIOAccountPMPName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SSIOAccountResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class SSIOAccountResponse {

  private Boolean eligible;

  private Boolean canEdit;

  @Valid
  private List<@Valid SSIOAccountItem> billtoInfos;

  private String currency;

  @Valid
  private List<@Valid SSIOAccountPMPName> pmpNames;

  private String error;

  public SSIOAccountResponse eligible(Boolean eligible) {
    this.eligible = eligible;
    return this;
  }

  /**
   * Advertiser eligible to create order lines
   * @return eligible
  */
  
  @Schema(name = "eligible", example = "true", description = "Advertiser eligible to create order lines", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eligible")
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
  */
  
  @Schema(name = "can_edit", example = "true", description = "Advertiser eligible to update order lines", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("can_edit")
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
  */
  @Valid 
  @Schema(name = "billto_infos", description = "An array of Salesforce account information that includes address, io terms, etc.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billto_infos")
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
  */
  
  @Schema(name = "currency", example = "USD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency")
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
  */
  @Valid 
  @Schema(name = "pmp_names", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pmp_names")
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
  */
  
  @Schema(name = "error", example = "No Error", description = "Error indicator from Salesforce which could be \"No Error\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

