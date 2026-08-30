package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SSIOAccountItem;
import org.openapitools.model.SSIOAccountPMPName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Salesforce account details including bill-to information.
 */

@Schema(name = "SSIOAccount", description = "Salesforce account details including bill-to information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SSIOAccount {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid SSIOAccountItem> billtoInfos = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean canEdit;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String currency;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean eligible;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String error;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid SSIOAccountPMPName> pmpNames = new ArrayList<>();

  public SSIOAccount billtoInfos(List<@Valid SSIOAccountItem> billtoInfos) {
    this.billtoInfos = billtoInfos;
    return this;
  }

  public SSIOAccount addBilltoInfosItem(SSIOAccountItem billtoInfosItem) {
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

  @JsonProperty("billto_infos")
  public void setBilltoInfos(List<@Valid SSIOAccountItem> billtoInfos) {
    this.billtoInfos = billtoInfos;
  }

  public SSIOAccount canEdit(@Nullable Boolean canEdit) {
    this.canEdit = canEdit;
    return this;
  }

  /**
   * Advertiser eligible to update order lines
   * @return canEdit
   */
  
  @Schema(name = "can_edit", example = "true", description = "Advertiser eligible to update order lines", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("can_edit")
  public @Nullable Boolean getCanEdit() {
    return canEdit;
  }

  @JsonProperty("can_edit")
  public void setCanEdit(@Nullable Boolean canEdit) {
    this.canEdit = canEdit;
  }

  public SSIOAccount currency(@Nullable String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  
  @Schema(name = "currency", example = "USD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency")
  public @Nullable String getCurrency() {
    return currency;
  }

  @JsonProperty("currency")
  public void setCurrency(@Nullable String currency) {
    this.currency = currency;
  }

  public SSIOAccount eligible(@Nullable Boolean eligible) {
    this.eligible = eligible;
    return this;
  }

  /**
   * Advertiser eligible to create order lines
   * @return eligible
   */
  
  @Schema(name = "eligible", example = "true", description = "Advertiser eligible to create order lines", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eligible")
  public @Nullable Boolean getEligible() {
    return eligible;
  }

  @JsonProperty("eligible")
  public void setEligible(@Nullable Boolean eligible) {
    this.eligible = eligible;
  }

  public SSIOAccount error(@Nullable String error) {
    this.error = error;
    return this;
  }

  /**
   * Error indicator from Salesforce which could be \"No Error\"
   * @return error
   */
  
  @Schema(name = "error", example = "No Error", description = "Error indicator from Salesforce which could be \"No Error\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error")
  public @Nullable String getError() {
    return error;
  }

  @JsonProperty("error")
  public void setError(@Nullable String error) {
    this.error = error;
  }

  public SSIOAccount pmpNames(List<@Valid SSIOAccountPMPName> pmpNames) {
    this.pmpNames = pmpNames;
    return this;
  }

  public SSIOAccount addPmpNamesItem(SSIOAccountPMPName pmpNamesItem) {
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

  @JsonProperty("pmp_names")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

