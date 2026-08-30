package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-08-30T09:54:43.403996865Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionTagConfigs   {
  
  private Boolean aemDbEnabled = false;
  private Boolean aemEnabled = false;
  private Boolean aemExternalIdEnabled = false;
  private Boolean aemFnlnEnabled = false;
  private Boolean aemGeEnabled = false;
  private Boolean aemLocEnabled = false;
  private Boolean aemPhEnabled = false;
  private BigDecimal mdFrequency = new BigDecimal("1");
  private List<String> noCodeCapiDomains = new ArrayList<>();

  /**
   * Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
   **/
  
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
    return Objects.equals(this.aemDbEnabled, conversionTagConfigs.aemDbEnabled) &&
        Objects.equals(this.aemEnabled, conversionTagConfigs.aemEnabled) &&
        Objects.equals(this.aemExternalIdEnabled, conversionTagConfigs.aemExternalIdEnabled) &&
        Objects.equals(this.aemFnlnEnabled, conversionTagConfigs.aemFnlnEnabled) &&
        Objects.equals(this.aemGeEnabled, conversionTagConfigs.aemGeEnabled) &&
        Objects.equals(this.aemLocEnabled, conversionTagConfigs.aemLocEnabled) &&
        Objects.equals(this.aemPhEnabled, conversionTagConfigs.aemPhEnabled) &&
        Objects.equals(this.mdFrequency, conversionTagConfigs.mdFrequency) &&
        Objects.equals(this.noCodeCapiDomains, conversionTagConfigs.noCodeCapiDomains);
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

