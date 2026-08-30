package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource create operation model.
 */
@ApiModel(description="Resource create operation model.")

public class ConversionTagCreate  {
  
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

  private BigDecimal mdFrequency = new BigDecimal("1");

 /**
  * Conversion tag name.
  */
  @ApiModelProperty(example = "download_picture", required = true, value = "Conversion tag name.")

  private String name;
 /**
   * Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
   * @return aemDbEnabled
  **/
  @JsonProperty("aem_db_enabled")
  public Boolean getAemDbEnabled() {
    return aemDbEnabled;
  }

  public void setAemDbEnabled(Boolean aemDbEnabled) {
    this.aemDbEnabled = aemDbEnabled;
  }

  public ConversionTagCreate aemDbEnabled(Boolean aemDbEnabled) {
    this.aemDbEnabled = aemDbEnabled;
    return this;
  }

 /**
   * Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
   * @return aemEnabled
  **/
  @JsonProperty("aem_enabled")
  public Boolean getAemEnabled() {
    return aemEnabled;
  }

  public void setAemEnabled(Boolean aemEnabled) {
    this.aemEnabled = aemEnabled;
  }

  public ConversionTagCreate aemEnabled(Boolean aemEnabled) {
    this.aemEnabled = aemEnabled;
    return this;
  }

 /**
   * Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
   * @return aemExternalIdEnabled
  **/
  @JsonProperty("aem_external_id_enabled")
  public Boolean getAemExternalIdEnabled() {
    return aemExternalIdEnabled;
  }

  public void setAemExternalIdEnabled(Boolean aemExternalIdEnabled) {
    this.aemExternalIdEnabled = aemExternalIdEnabled;
  }

  public ConversionTagCreate aemExternalIdEnabled(Boolean aemExternalIdEnabled) {
    this.aemExternalIdEnabled = aemExternalIdEnabled;
    return this;
  }

 /**
   * Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
   * @return aemFnlnEnabled
  **/
  @JsonProperty("aem_fnln_enabled")
  public Boolean getAemFnlnEnabled() {
    return aemFnlnEnabled;
  }

  public void setAemFnlnEnabled(Boolean aemFnlnEnabled) {
    this.aemFnlnEnabled = aemFnlnEnabled;
  }

  public ConversionTagCreate aemFnlnEnabled(Boolean aemFnlnEnabled) {
    this.aemFnlnEnabled = aemFnlnEnabled;
    return this;
  }

 /**
   * Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
   * @return aemGeEnabled
  **/
  @JsonProperty("aem_ge_enabled")
  public Boolean getAemGeEnabled() {
    return aemGeEnabled;
  }

  public void setAemGeEnabled(Boolean aemGeEnabled) {
    this.aemGeEnabled = aemGeEnabled;
  }

  public ConversionTagCreate aemGeEnabled(Boolean aemGeEnabled) {
    this.aemGeEnabled = aemGeEnabled;
    return this;
  }

 /**
   * Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
   * @return aemLocEnabled
  **/
  @JsonProperty("aem_loc_enabled")
  public Boolean getAemLocEnabled() {
    return aemLocEnabled;
  }

  public void setAemLocEnabled(Boolean aemLocEnabled) {
    this.aemLocEnabled = aemLocEnabled;
  }

  public ConversionTagCreate aemLocEnabled(Boolean aemLocEnabled) {
    this.aemLocEnabled = aemLocEnabled;
    return this;
  }

 /**
   * Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
   * @return aemPhEnabled
  **/
  @JsonProperty("aem_ph_enabled")
  public Boolean getAemPhEnabled() {
    return aemPhEnabled;
  }

  public void setAemPhEnabled(Boolean aemPhEnabled) {
    this.aemPhEnabled = aemPhEnabled;
  }

  public ConversionTagCreate aemPhEnabled(Boolean aemPhEnabled) {
    this.aemPhEnabled = aemPhEnabled;
    return this;
  }

 /**
   * Metadata ingestion frequency.
   * @return mdFrequency
  **/
  @JsonProperty("md_frequency")
  public BigDecimal getMdFrequency() {
    return mdFrequency;
  }

  public void setMdFrequency(BigDecimal mdFrequency) {
    this.mdFrequency = mdFrequency;
  }

  public ConversionTagCreate mdFrequency(BigDecimal mdFrequency) {
    this.mdFrequency = mdFrequency;
    return this;
  }

 /**
   * Conversion tag name.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ConversionTagCreate name(String name) {
    this.name = name;
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
    ConversionTagCreate conversionTagCreate = (ConversionTagCreate) o;
    return Objects.equals(this.aemDbEnabled, conversionTagCreate.aemDbEnabled) &&
        Objects.equals(this.aemEnabled, conversionTagCreate.aemEnabled) &&
        Objects.equals(this.aemExternalIdEnabled, conversionTagCreate.aemExternalIdEnabled) &&
        Objects.equals(this.aemFnlnEnabled, conversionTagCreate.aemFnlnEnabled) &&
        Objects.equals(this.aemGeEnabled, conversionTagCreate.aemGeEnabled) &&
        Objects.equals(this.aemLocEnabled, conversionTagCreate.aemLocEnabled) &&
        Objects.equals(this.aemPhEnabled, conversionTagCreate.aemPhEnabled) &&
        Objects.equals(this.mdFrequency, conversionTagCreate.mdFrequency) &&
        Objects.equals(this.name, conversionTagCreate.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aemDbEnabled, aemEnabled, aemExternalIdEnabled, aemFnlnEnabled, aemGeEnabled, aemLocEnabled, aemPhEnabled, mdFrequency, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTagCreate {\n");
    
    sb.append("    aemDbEnabled: ").append(toIndentedString(aemDbEnabled)).append("\n");
    sb.append("    aemEnabled: ").append(toIndentedString(aemEnabled)).append("\n");
    sb.append("    aemExternalIdEnabled: ").append(toIndentedString(aemExternalIdEnabled)).append("\n");
    sb.append("    aemFnlnEnabled: ").append(toIndentedString(aemFnlnEnabled)).append("\n");
    sb.append("    aemGeEnabled: ").append(toIndentedString(aemGeEnabled)).append("\n");
    sb.append("    aemLocEnabled: ").append(toIndentedString(aemLocEnabled)).append("\n");
    sb.append("    aemPhEnabled: ").append(toIndentedString(aemPhEnabled)).append("\n");
    sb.append("    mdFrequency: ").append(toIndentedString(mdFrequency)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

