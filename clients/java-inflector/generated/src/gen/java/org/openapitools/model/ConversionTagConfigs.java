package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionTagConfigs   {
  @JsonProperty("aem_db_enabled")
  private Boolean aemDbEnabled = false;

  @JsonProperty("aem_enabled")
  private Boolean aemEnabled = false;

  @JsonProperty("aem_external_id_enabled")
  private Boolean aemExternalIdEnabled = false;

  @JsonProperty("aem_fnln_enabled")
  private Boolean aemFnlnEnabled = false;

  @JsonProperty("aem_ge_enabled")
  private Boolean aemGeEnabled = false;

  @JsonProperty("aem_loc_enabled")
  private Boolean aemLocEnabled = false;

  @JsonProperty("aem_ph_enabled")
  private Boolean aemPhEnabled = false;

  @JsonProperty("md_frequency")
  private BigDecimal mdFrequency = new BigDecimal("1");

  @JsonProperty("no_code_capi_domains")
  private List<String> noCodeCapiDomains = null;

  /**
   * Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
   **/
  public ConversionTagConfigs aemDbEnabled(Boolean aemDbEnabled) {
    this.aemDbEnabled = aemDbEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.")
  @JsonProperty("aem_db_enabled")
  public Boolean getAemDbEnabled() {
    return aemDbEnabled;
  }
  public void setAemDbEnabled(Boolean aemDbEnabled) {
    this.aemDbEnabled = aemDbEnabled;
  }

  /**
   * Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
   **/
  public ConversionTagConfigs aemEnabled(Boolean aemEnabled) {
    this.aemEnabled = aemEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.")
  @JsonProperty("aem_enabled")
  public Boolean getAemEnabled() {
    return aemEnabled;
  }
  public void setAemEnabled(Boolean aemEnabled) {
    this.aemEnabled = aemEnabled;
  }

  /**
   * Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
   **/
  public ConversionTagConfigs aemExternalIdEnabled(Boolean aemExternalIdEnabled) {
    this.aemExternalIdEnabled = aemExternalIdEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.")
  @JsonProperty("aem_external_id_enabled")
  public Boolean getAemExternalIdEnabled() {
    return aemExternalIdEnabled;
  }
  public void setAemExternalIdEnabled(Boolean aemExternalIdEnabled) {
    this.aemExternalIdEnabled = aemExternalIdEnabled;
  }

  /**
   * Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
   **/
  public ConversionTagConfigs aemFnlnEnabled(Boolean aemFnlnEnabled) {
    this.aemFnlnEnabled = aemFnlnEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.")
  @JsonProperty("aem_fnln_enabled")
  public Boolean getAemFnlnEnabled() {
    return aemFnlnEnabled;
  }
  public void setAemFnlnEnabled(Boolean aemFnlnEnabled) {
    this.aemFnlnEnabled = aemFnlnEnabled;
  }

  /**
   * Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
   **/
  public ConversionTagConfigs aemGeEnabled(Boolean aemGeEnabled) {
    this.aemGeEnabled = aemGeEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.")
  @JsonProperty("aem_ge_enabled")
  public Boolean getAemGeEnabled() {
    return aemGeEnabled;
  }
  public void setAemGeEnabled(Boolean aemGeEnabled) {
    this.aemGeEnabled = aemGeEnabled;
  }

  /**
   * Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
   **/
  public ConversionTagConfigs aemLocEnabled(Boolean aemLocEnabled) {
    this.aemLocEnabled = aemLocEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.")
  @JsonProperty("aem_loc_enabled")
  public Boolean getAemLocEnabled() {
    return aemLocEnabled;
  }
  public void setAemLocEnabled(Boolean aemLocEnabled) {
    this.aemLocEnabled = aemLocEnabled;
  }

  /**
   * Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
   **/
  public ConversionTagConfigs aemPhEnabled(Boolean aemPhEnabled) {
    this.aemPhEnabled = aemPhEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.")
  @JsonProperty("aem_ph_enabled")
  public Boolean getAemPhEnabled() {
    return aemPhEnabled;
  }
  public void setAemPhEnabled(Boolean aemPhEnabled) {
    this.aemPhEnabled = aemPhEnabled;
  }

  /**
   * Metadata ingestion frequency.
   **/
  public ConversionTagConfigs mdFrequency(BigDecimal mdFrequency) {
    this.mdFrequency = mdFrequency;
    return this;
  }

  
  @ApiModelProperty(example = "0.6", value = "Metadata ingestion frequency.")
  @JsonProperty("md_frequency")
  public BigDecimal getMdFrequency() {
    return mdFrequency;
  }
  public void setMdFrequency(BigDecimal mdFrequency) {
    this.mdFrequency = mdFrequency;
  }

  /**
   * List of advertiser subdomains configured for NoCodeCAPI calls.
   **/
  public ConversionTagConfigs noCodeCapiDomains(List<String> noCodeCapiDomains) {
    this.noCodeCapiDomains = noCodeCapiDomains;
    return this;
  }

  
  @ApiModelProperty(example = "[\"https://sub.exampledomain.com\"]", value = "List of advertiser subdomains configured for NoCodeCAPI calls.")
  @JsonProperty("no_code_capi_domains")
  public List<String> getNoCodeCapiDomains() {
    return noCodeCapiDomains;
  }
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
    return Objects.equals(aemDbEnabled, conversionTagConfigs.aemDbEnabled) &&
        Objects.equals(aemEnabled, conversionTagConfigs.aemEnabled) &&
        Objects.equals(aemExternalIdEnabled, conversionTagConfigs.aemExternalIdEnabled) &&
        Objects.equals(aemFnlnEnabled, conversionTagConfigs.aemFnlnEnabled) &&
        Objects.equals(aemGeEnabled, conversionTagConfigs.aemGeEnabled) &&
        Objects.equals(aemLocEnabled, conversionTagConfigs.aemLocEnabled) &&
        Objects.equals(aemPhEnabled, conversionTagConfigs.aemPhEnabled) &&
        Objects.equals(mdFrequency, conversionTagConfigs.mdFrequency) &&
        Objects.equals(noCodeCapiDomains, conversionTagConfigs.noCodeCapiDomains);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aemDbEnabled, aemEnabled, aemExternalIdEnabled, aemFnlnEnabled, aemGeEnabled, aemLocEnabled, aemPhEnabled, mdFrequency, noCodeCapiDomains);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

