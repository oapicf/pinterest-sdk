package org.openapitools.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ConversionTagConfigs  {
  
 /**
  * Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  */
  @ApiModelProperty(value = "Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.")
  private Boolean aemDbEnabled = false;

 /**
  * Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  */
  @ApiModelProperty(value = "Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.")
  private Boolean aemEnabled = false;

 /**
  * Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  */
  @ApiModelProperty(value = "Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.")
  private Boolean aemExternalIdEnabled = false;

 /**
  * Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  */
  @ApiModelProperty(value = "Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.")
  private Boolean aemFnlnEnabled = false;

 /**
  * Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  */
  @ApiModelProperty(value = "Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.")
  private Boolean aemGeEnabled = false;

 /**
  * Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  */
  @ApiModelProperty(value = "Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.")
  private Boolean aemLocEnabled = false;

 /**
  * Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  */
  @ApiModelProperty(value = "Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.")
  private Boolean aemPhEnabled = false;

 /**
  * Metadata ingestion frequency.
  */
  @ApiModelProperty(example = "0.6", value = "Metadata ingestion frequency.")
  @Valid
  private BigDecimal mdFrequency = new BigDecimal("1");

 /**
  * List of advertiser subdomains configured for NoCodeCAPI calls.
  */
  @ApiModelProperty(example = "[\"https://sub.exampledomain.com\"]", value = "List of advertiser subdomains configured for NoCodeCAPI calls.")
  private List<String> noCodeCapiDomains = new ArrayList<>();
 /**
  * Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  * @return aemDbEnabled
  */
  @JsonProperty("aem_db_enabled")
  public Boolean getAemDbEnabled() {
    return aemDbEnabled;
  }

  /**
   * Sets the <code>aemDbEnabled</code> property.
   */
 public void setAemDbEnabled(Boolean aemDbEnabled) {
    this.aemDbEnabled = aemDbEnabled;
  }

  /**
   * Sets the <code>aemDbEnabled</code> property.
   */
  public ConversionTagConfigs aemDbEnabled(Boolean aemDbEnabled) {
    this.aemDbEnabled = aemDbEnabled;
    return this;
  }

 /**
  * Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  * @return aemEnabled
  */
  @JsonProperty("aem_enabled")
  public Boolean getAemEnabled() {
    return aemEnabled;
  }

  /**
   * Sets the <code>aemEnabled</code> property.
   */
 public void setAemEnabled(Boolean aemEnabled) {
    this.aemEnabled = aemEnabled;
  }

  /**
   * Sets the <code>aemEnabled</code> property.
   */
  public ConversionTagConfigs aemEnabled(Boolean aemEnabled) {
    this.aemEnabled = aemEnabled;
    return this;
  }

 /**
  * Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  * @return aemExternalIdEnabled
  */
  @JsonProperty("aem_external_id_enabled")
  public Boolean getAemExternalIdEnabled() {
    return aemExternalIdEnabled;
  }

  /**
   * Sets the <code>aemExternalIdEnabled</code> property.
   */
 public void setAemExternalIdEnabled(Boolean aemExternalIdEnabled) {
    this.aemExternalIdEnabled = aemExternalIdEnabled;
  }

  /**
   * Sets the <code>aemExternalIdEnabled</code> property.
   */
  public ConversionTagConfigs aemExternalIdEnabled(Boolean aemExternalIdEnabled) {
    this.aemExternalIdEnabled = aemExternalIdEnabled;
    return this;
  }

 /**
  * Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  * @return aemFnlnEnabled
  */
  @JsonProperty("aem_fnln_enabled")
  public Boolean getAemFnlnEnabled() {
    return aemFnlnEnabled;
  }

  /**
   * Sets the <code>aemFnlnEnabled</code> property.
   */
 public void setAemFnlnEnabled(Boolean aemFnlnEnabled) {
    this.aemFnlnEnabled = aemFnlnEnabled;
  }

  /**
   * Sets the <code>aemFnlnEnabled</code> property.
   */
  public ConversionTagConfigs aemFnlnEnabled(Boolean aemFnlnEnabled) {
    this.aemFnlnEnabled = aemFnlnEnabled;
    return this;
  }

 /**
  * Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  * @return aemGeEnabled
  */
  @JsonProperty("aem_ge_enabled")
  public Boolean getAemGeEnabled() {
    return aemGeEnabled;
  }

  /**
   * Sets the <code>aemGeEnabled</code> property.
   */
 public void setAemGeEnabled(Boolean aemGeEnabled) {
    this.aemGeEnabled = aemGeEnabled;
  }

  /**
   * Sets the <code>aemGeEnabled</code> property.
   */
  public ConversionTagConfigs aemGeEnabled(Boolean aemGeEnabled) {
    this.aemGeEnabled = aemGeEnabled;
    return this;
  }

 /**
  * Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  * @return aemLocEnabled
  */
  @JsonProperty("aem_loc_enabled")
  public Boolean getAemLocEnabled() {
    return aemLocEnabled;
  }

  /**
   * Sets the <code>aemLocEnabled</code> property.
   */
 public void setAemLocEnabled(Boolean aemLocEnabled) {
    this.aemLocEnabled = aemLocEnabled;
  }

  /**
   * Sets the <code>aemLocEnabled</code> property.
   */
  public ConversionTagConfigs aemLocEnabled(Boolean aemLocEnabled) {
    this.aemLocEnabled = aemLocEnabled;
    return this;
  }

 /**
  * Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  * @return aemPhEnabled
  */
  @JsonProperty("aem_ph_enabled")
  public Boolean getAemPhEnabled() {
    return aemPhEnabled;
  }

  /**
   * Sets the <code>aemPhEnabled</code> property.
   */
 public void setAemPhEnabled(Boolean aemPhEnabled) {
    this.aemPhEnabled = aemPhEnabled;
  }

  /**
   * Sets the <code>aemPhEnabled</code> property.
   */
  public ConversionTagConfigs aemPhEnabled(Boolean aemPhEnabled) {
    this.aemPhEnabled = aemPhEnabled;
    return this;
  }

 /**
  * Metadata ingestion frequency.
  * @return mdFrequency
  */
  @JsonProperty("md_frequency")
  public BigDecimal getMdFrequency() {
    return mdFrequency;
  }

  /**
   * Sets the <code>mdFrequency</code> property.
   */
 public void setMdFrequency(BigDecimal mdFrequency) {
    this.mdFrequency = mdFrequency;
  }

  /**
   * Sets the <code>mdFrequency</code> property.
   */
  public ConversionTagConfigs mdFrequency(BigDecimal mdFrequency) {
    this.mdFrequency = mdFrequency;
    return this;
  }

 /**
  * List of advertiser subdomains configured for NoCodeCAPI calls.
  * @return noCodeCapiDomains
  */
  @JsonProperty("no_code_capi_domains")
  public List<String> getNoCodeCapiDomains() {
    return noCodeCapiDomains;
  }

  /**
   * Sets the <code>noCodeCapiDomains</code> property.
   */
 public void setNoCodeCapiDomains(List<String> noCodeCapiDomains) {
    this.noCodeCapiDomains = noCodeCapiDomains;
  }

  /**
   * Sets the <code>noCodeCapiDomains</code> property.
   */
  public ConversionTagConfigs noCodeCapiDomains(List<String> noCodeCapiDomains) {
    this.noCodeCapiDomains = noCodeCapiDomains;
    return this;
  }

  /**
   * Adds a new item to the <code>noCodeCapiDomains</code> list.
   */
  public ConversionTagConfigs addNoCodeCapiDomainsItem(String noCodeCapiDomainsItem) {
    this.noCodeCapiDomains.add(noCodeCapiDomainsItem);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

