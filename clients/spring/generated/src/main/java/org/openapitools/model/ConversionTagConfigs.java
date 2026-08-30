package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConversionTagConfigs
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionTagConfigs {

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Boolean> aemDbEnabled = JsonNullable.<Boolean>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Boolean> aemEnabled = JsonNullable.<Boolean>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Boolean> aemExternalIdEnabled = JsonNullable.<Boolean>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Boolean> aemFnlnEnabled = JsonNullable.<Boolean>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Boolean> aemGeEnabled = JsonNullable.<Boolean>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Boolean> aemLocEnabled = JsonNullable.<Boolean>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Boolean> aemPhEnabled = JsonNullable.<Boolean>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<BigDecimal> mdFrequency = JsonNullable.<BigDecimal>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> noCodeCapiDomains = new ArrayList<>();

  public ConversionTagConfigs aemDbEnabled(Boolean aemDbEnabled) {
    this.aemDbEnabled = JsonNullable.of(aemDbEnabled);
    return this;
  }

  /**
   * Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
   * @return aemDbEnabled
   */
  
  @Schema(name = "aem_db_enabled", description = "Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aem_db_enabled")
  public JsonNullable<Boolean> getAemDbEnabled() {
    return aemDbEnabled;
  }

  public void setAemDbEnabled(JsonNullable<Boolean> aemDbEnabled) {
    this.aemDbEnabled = aemDbEnabled;
  }

  public ConversionTagConfigs aemEnabled(Boolean aemEnabled) {
    this.aemEnabled = JsonNullable.of(aemEnabled);
    return this;
  }

  /**
   * Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
   * @return aemEnabled
   */
  
  @Schema(name = "aem_enabled", description = "Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aem_enabled")
  public JsonNullable<Boolean> getAemEnabled() {
    return aemEnabled;
  }

  public void setAemEnabled(JsonNullable<Boolean> aemEnabled) {
    this.aemEnabled = aemEnabled;
  }

  public ConversionTagConfigs aemExternalIdEnabled(Boolean aemExternalIdEnabled) {
    this.aemExternalIdEnabled = JsonNullable.of(aemExternalIdEnabled);
    return this;
  }

  /**
   * Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
   * @return aemExternalIdEnabled
   */
  
  @Schema(name = "aem_external_id_enabled", description = "Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aem_external_id_enabled")
  public JsonNullable<Boolean> getAemExternalIdEnabled() {
    return aemExternalIdEnabled;
  }

  public void setAemExternalIdEnabled(JsonNullable<Boolean> aemExternalIdEnabled) {
    this.aemExternalIdEnabled = aemExternalIdEnabled;
  }

  public ConversionTagConfigs aemFnlnEnabled(Boolean aemFnlnEnabled) {
    this.aemFnlnEnabled = JsonNullable.of(aemFnlnEnabled);
    return this;
  }

  /**
   * Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
   * @return aemFnlnEnabled
   */
  
  @Schema(name = "aem_fnln_enabled", description = "Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aem_fnln_enabled")
  public JsonNullable<Boolean> getAemFnlnEnabled() {
    return aemFnlnEnabled;
  }

  public void setAemFnlnEnabled(JsonNullable<Boolean> aemFnlnEnabled) {
    this.aemFnlnEnabled = aemFnlnEnabled;
  }

  public ConversionTagConfigs aemGeEnabled(Boolean aemGeEnabled) {
    this.aemGeEnabled = JsonNullable.of(aemGeEnabled);
    return this;
  }

  /**
   * Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
   * @return aemGeEnabled
   */
  
  @Schema(name = "aem_ge_enabled", description = "Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aem_ge_enabled")
  public JsonNullable<Boolean> getAemGeEnabled() {
    return aemGeEnabled;
  }

  public void setAemGeEnabled(JsonNullable<Boolean> aemGeEnabled) {
    this.aemGeEnabled = aemGeEnabled;
  }

  public ConversionTagConfigs aemLocEnabled(Boolean aemLocEnabled) {
    this.aemLocEnabled = JsonNullable.of(aemLocEnabled);
    return this;
  }

  /**
   * Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
   * @return aemLocEnabled
   */
  
  @Schema(name = "aem_loc_enabled", description = "Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aem_loc_enabled")
  public JsonNullable<Boolean> getAemLocEnabled() {
    return aemLocEnabled;
  }

  public void setAemLocEnabled(JsonNullable<Boolean> aemLocEnabled) {
    this.aemLocEnabled = aemLocEnabled;
  }

  public ConversionTagConfigs aemPhEnabled(Boolean aemPhEnabled) {
    this.aemPhEnabled = JsonNullable.of(aemPhEnabled);
    return this;
  }

  /**
   * Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
   * @return aemPhEnabled
   */
  
  @Schema(name = "aem_ph_enabled", description = "Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aem_ph_enabled")
  public JsonNullable<Boolean> getAemPhEnabled() {
    return aemPhEnabled;
  }

  public void setAemPhEnabled(JsonNullable<Boolean> aemPhEnabled) {
    this.aemPhEnabled = aemPhEnabled;
  }

  public ConversionTagConfigs mdFrequency(BigDecimal mdFrequency) {
    this.mdFrequency = JsonNullable.of(mdFrequency);
    return this;
  }

  /**
   * Metadata ingestion frequency.
   * @return mdFrequency
   */
  @Valid 
  @Schema(name = "md_frequency", example = "0.6", description = "Metadata ingestion frequency.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("md_frequency")
  public JsonNullable<BigDecimal> getMdFrequency() {
    return mdFrequency;
  }

  public void setMdFrequency(JsonNullable<BigDecimal> mdFrequency) {
    this.mdFrequency = mdFrequency;
  }

  public ConversionTagConfigs noCodeCapiDomains(List<String> noCodeCapiDomains) {
    this.noCodeCapiDomains = noCodeCapiDomains;
    return this;
  }

  public ConversionTagConfigs addNoCodeCapiDomainsItem(String noCodeCapiDomainsItem) {
    if (this.noCodeCapiDomains == null) {
      this.noCodeCapiDomains = new ArrayList<>();
    }
    this.noCodeCapiDomains.add(noCodeCapiDomainsItem);
    return this;
  }

  /**
   * List of advertiser subdomains configured for NoCodeCAPI calls.
   * @return noCodeCapiDomains
   */
  
  @Schema(name = "no_code_capi_domains", example = "[\"https://sub.exampledomain.com\"]", description = "List of advertiser subdomains configured for NoCodeCAPI calls.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("no_code_capi_domains")
  public List<String> getNoCodeCapiDomains() {
    return noCodeCapiDomains;
  }

  @JsonProperty("no_code_capi_domains")
  public void setNoCodeCapiDomains(List<String> noCodeCapiDomains) {
    this.noCodeCapiDomains = noCodeCapiDomains;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionTagConfigs conversionTagConfigs = (ConversionTagConfigs) o;
    return equalsNullable(this.aemDbEnabled, conversionTagConfigs.aemDbEnabled) &&
        equalsNullable(this.aemEnabled, conversionTagConfigs.aemEnabled) &&
        equalsNullable(this.aemExternalIdEnabled, conversionTagConfigs.aemExternalIdEnabled) &&
        equalsNullable(this.aemFnlnEnabled, conversionTagConfigs.aemFnlnEnabled) &&
        equalsNullable(this.aemGeEnabled, conversionTagConfigs.aemGeEnabled) &&
        equalsNullable(this.aemLocEnabled, conversionTagConfigs.aemLocEnabled) &&
        equalsNullable(this.aemPhEnabled, conversionTagConfigs.aemPhEnabled) &&
        equalsNullable(this.mdFrequency, conversionTagConfigs.mdFrequency) &&
        Objects.equals(this.noCodeCapiDomains, conversionTagConfigs.noCodeCapiDomains);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(aemDbEnabled), hashCodeNullable(aemEnabled), hashCodeNullable(aemExternalIdEnabled), hashCodeNullable(aemFnlnEnabled), hashCodeNullable(aemGeEnabled), hashCodeNullable(aemLocEnabled), hashCodeNullable(aemPhEnabled), hashCodeNullable(mdFrequency), noCodeCapiDomains);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTagConfigs {\n");
    sb.append("    aemDbEnabled: ").append(toIndentedString(aemDbEnabled)).append("\n");
    sb.append("    aemEnabled: ").append(toIndentedString(aemEnabled)).append("\n");
    sb.append("    aemExternalIdEnabled: ").append(toIndentedString(aemExternalIdEnabled)).append("\n");
    sb.append("    aemFnlnEnabled: ").append(toIndentedString(aemFnlnEnabled)).append("\n");
    sb.append("    aemGeEnabled: ").append(toIndentedString(aemGeEnabled)).append("\n");
    sb.append("    aemLocEnabled: ").append(toIndentedString(aemLocEnabled)).append("\n");
    sb.append("    aemPhEnabled: ").append(toIndentedString(aemPhEnabled)).append("\n");
    sb.append("    mdFrequency: ").append(toIndentedString(mdFrequency)).append("\n");
    sb.append("    noCodeCapiDomains: ").append(toIndentedString(noCodeCapiDomains)).append("\n");
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

