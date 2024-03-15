package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ConversionTagConfigs
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ConversionTagConfigs   {
  @JsonProperty("aem_enabled")
  private Boolean aemEnabled = false;

  @JsonProperty("md_frequency")
  private BigDecimal mdFrequency = new BigDecimal("1");

  @JsonProperty("aem_fnln_enabled")
  private Boolean aemFnlnEnabled = false;

  @JsonProperty("aem_ph_enabled")
  private Boolean aemPhEnabled = false;

  @JsonProperty("aem_ge_enabled")
  private Boolean aemGeEnabled = false;

  @JsonProperty("aem_db_enabled")
  private Boolean aemDbEnabled = false;

  @JsonProperty("aem_loc_enabled")
  private Boolean aemLocEnabled = false;

  public ConversionTagConfigs aemEnabled(Boolean aemEnabled) {
    this.aemEnabled = aemEnabled;
    return this;
  }

   /**
   * Whether Automatic Enhanced Match email is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
   * @return aemEnabled
  **/
  @ApiModelProperty(example = "true", value = "Whether Automatic Enhanced Match email is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.")
  public Boolean getAemEnabled() {
    return aemEnabled;
  }

  public void setAemEnabled(Boolean aemEnabled) {
    this.aemEnabled = aemEnabled;
  }

  public ConversionTagConfigs mdFrequency(BigDecimal mdFrequency) {
    this.mdFrequency = mdFrequency;
    return this;
  }

   /**
   * Metadata ingestion frequency.
   * @return mdFrequency
  **/
  @ApiModelProperty(example = "0.6", value = "Metadata ingestion frequency.")
  public BigDecimal getMdFrequency() {
    return mdFrequency;
  }

  public void setMdFrequency(BigDecimal mdFrequency) {
    this.mdFrequency = mdFrequency;
  }

  public ConversionTagConfigs aemFnlnEnabled(Boolean aemFnlnEnabled) {
    this.aemFnlnEnabled = aemFnlnEnabled;
    return this;
  }

   /**
   * Whether Automatic Enhanced Match name is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
   * @return aemFnlnEnabled
  **/
  @ApiModelProperty(example = "true", value = "Whether Automatic Enhanced Match name is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.")
  public Boolean getAemFnlnEnabled() {
    return aemFnlnEnabled;
  }

  public void setAemFnlnEnabled(Boolean aemFnlnEnabled) {
    this.aemFnlnEnabled = aemFnlnEnabled;
  }

  public ConversionTagConfigs aemPhEnabled(Boolean aemPhEnabled) {
    this.aemPhEnabled = aemPhEnabled;
    return this;
  }

   /**
   * Whether Automatic Enhanced Match phone is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
   * @return aemPhEnabled
  **/
  @ApiModelProperty(example = "true", value = "Whether Automatic Enhanced Match phone is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.")
  public Boolean getAemPhEnabled() {
    return aemPhEnabled;
  }

  public void setAemPhEnabled(Boolean aemPhEnabled) {
    this.aemPhEnabled = aemPhEnabled;
  }

  public ConversionTagConfigs aemGeEnabled(Boolean aemGeEnabled) {
    this.aemGeEnabled = aemGeEnabled;
    return this;
  }

   /**
   * Whether Automatic Enhanced Match gender is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
   * @return aemGeEnabled
  **/
  @ApiModelProperty(example = "true", value = "Whether Automatic Enhanced Match gender is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.")
  public Boolean getAemGeEnabled() {
    return aemGeEnabled;
  }

  public void setAemGeEnabled(Boolean aemGeEnabled) {
    this.aemGeEnabled = aemGeEnabled;
  }

  public ConversionTagConfigs aemDbEnabled(Boolean aemDbEnabled) {
    this.aemDbEnabled = aemDbEnabled;
    return this;
  }

   /**
   * Whether Automatic Enhanced Match birthdate is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
   * @return aemDbEnabled
  **/
  @ApiModelProperty(example = "true", value = "Whether Automatic Enhanced Match birthdate is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.")
  public Boolean getAemDbEnabled() {
    return aemDbEnabled;
  }

  public void setAemDbEnabled(Boolean aemDbEnabled) {
    this.aemDbEnabled = aemDbEnabled;
  }

  public ConversionTagConfigs aemLocEnabled(Boolean aemLocEnabled) {
    this.aemLocEnabled = aemLocEnabled;
    return this;
  }

   /**
   * Whether Automatic Enhanced Match location is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
   * @return aemLocEnabled
  **/
  @ApiModelProperty(example = "true", value = "Whether Automatic Enhanced Match location is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.")
  public Boolean getAemLocEnabled() {
    return aemLocEnabled;
  }

  public void setAemLocEnabled(Boolean aemLocEnabled) {
    this.aemLocEnabled = aemLocEnabled;
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
    return Objects.equals(this.aemEnabled, conversionTagConfigs.aemEnabled) &&
        Objects.equals(this.mdFrequency, conversionTagConfigs.mdFrequency) &&
        Objects.equals(this.aemFnlnEnabled, conversionTagConfigs.aemFnlnEnabled) &&
        Objects.equals(this.aemPhEnabled, conversionTagConfigs.aemPhEnabled) &&
        Objects.equals(this.aemGeEnabled, conversionTagConfigs.aemGeEnabled) &&
        Objects.equals(this.aemDbEnabled, conversionTagConfigs.aemDbEnabled) &&
        Objects.equals(this.aemLocEnabled, conversionTagConfigs.aemLocEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aemEnabled, mdFrequency, aemFnlnEnabled, aemPhEnabled, aemGeEnabled, aemDbEnabled, aemLocEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTagConfigs {\n");
    
    sb.append("    aemEnabled: ").append(toIndentedString(aemEnabled)).append("\n");
    sb.append("    mdFrequency: ").append(toIndentedString(mdFrequency)).append("\n");
    sb.append("    aemFnlnEnabled: ").append(toIndentedString(aemFnlnEnabled)).append("\n");
    sb.append("    aemPhEnabled: ").append(toIndentedString(aemPhEnabled)).append("\n");
    sb.append("    aemGeEnabled: ").append(toIndentedString(aemGeEnabled)).append("\n");
    sb.append("    aemDbEnabled: ").append(toIndentedString(aemDbEnabled)).append("\n");
    sb.append("    aemLocEnabled: ").append(toIndentedString(aemLocEnabled)).append("\n");
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

