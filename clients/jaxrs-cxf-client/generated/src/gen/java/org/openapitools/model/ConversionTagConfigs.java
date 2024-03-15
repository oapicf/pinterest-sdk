package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ConversionTagConfigs  {
  
  @ApiModelProperty(example = "true", value = "Whether Automatic Enhanced Match email is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.")
 /**
   * Whether Automatic Enhanced Match email is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
  **/
  private Boolean aemEnabled = false;

  @ApiModelProperty(example = "0.6", value = "Metadata ingestion frequency.")
 /**
   * Metadata ingestion frequency.
  **/
  private BigDecimal mdFrequency = new BigDecimal("1");

  @ApiModelProperty(example = "true", value = "Whether Automatic Enhanced Match name is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.")
 /**
   * Whether Automatic Enhanced Match name is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
  **/
  private Boolean aemFnlnEnabled = false;

  @ApiModelProperty(example = "true", value = "Whether Automatic Enhanced Match phone is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.")
 /**
   * Whether Automatic Enhanced Match phone is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
  **/
  private Boolean aemPhEnabled = false;

  @ApiModelProperty(example = "true", value = "Whether Automatic Enhanced Match gender is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.")
 /**
   * Whether Automatic Enhanced Match gender is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
  **/
  private Boolean aemGeEnabled = false;

  @ApiModelProperty(example = "true", value = "Whether Automatic Enhanced Match birthdate is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.")
 /**
   * Whether Automatic Enhanced Match birthdate is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
  **/
  private Boolean aemDbEnabled = false;

  @ApiModelProperty(example = "true", value = "Whether Automatic Enhanced Match location is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.")
 /**
   * Whether Automatic Enhanced Match location is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
  **/
  private Boolean aemLocEnabled = false;
 /**
   * Whether Automatic Enhanced Match email is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information.
   * @return aemEnabled
  **/
  @JsonProperty("aem_enabled")
  public Boolean getAemEnabled() {
    return aemEnabled;
  }

  public void setAemEnabled(Boolean aemEnabled) {
    this.aemEnabled = aemEnabled;
  }

  public ConversionTagConfigs aemEnabled(Boolean aemEnabled) {
    this.aemEnabled = aemEnabled;
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

  public ConversionTagConfigs mdFrequency(BigDecimal mdFrequency) {
    this.mdFrequency = mdFrequency;
    return this;
  }

 /**
   * Whether Automatic Enhanced Match name is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information.
   * @return aemFnlnEnabled
  **/
  @JsonProperty("aem_fnln_enabled")
  public Boolean getAemFnlnEnabled() {
    return aemFnlnEnabled;
  }

  public void setAemFnlnEnabled(Boolean aemFnlnEnabled) {
    this.aemFnlnEnabled = aemFnlnEnabled;
  }

  public ConversionTagConfigs aemFnlnEnabled(Boolean aemFnlnEnabled) {
    this.aemFnlnEnabled = aemFnlnEnabled;
    return this;
  }

 /**
   * Whether Automatic Enhanced Match phone is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information.
   * @return aemPhEnabled
  **/
  @JsonProperty("aem_ph_enabled")
  public Boolean getAemPhEnabled() {
    return aemPhEnabled;
  }

  public void setAemPhEnabled(Boolean aemPhEnabled) {
    this.aemPhEnabled = aemPhEnabled;
  }

  public ConversionTagConfigs aemPhEnabled(Boolean aemPhEnabled) {
    this.aemPhEnabled = aemPhEnabled;
    return this;
  }

 /**
   * Whether Automatic Enhanced Match gender is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information.
   * @return aemGeEnabled
  **/
  @JsonProperty("aem_ge_enabled")
  public Boolean getAemGeEnabled() {
    return aemGeEnabled;
  }

  public void setAemGeEnabled(Boolean aemGeEnabled) {
    this.aemGeEnabled = aemGeEnabled;
  }

  public ConversionTagConfigs aemGeEnabled(Boolean aemGeEnabled) {
    this.aemGeEnabled = aemGeEnabled;
    return this;
  }

 /**
   * Whether Automatic Enhanced Match birthdate is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information.
   * @return aemDbEnabled
  **/
  @JsonProperty("aem_db_enabled")
  public Boolean getAemDbEnabled() {
    return aemDbEnabled;
  }

  public void setAemDbEnabled(Boolean aemDbEnabled) {
    this.aemDbEnabled = aemDbEnabled;
  }

  public ConversionTagConfigs aemDbEnabled(Boolean aemDbEnabled) {
    this.aemDbEnabled = aemDbEnabled;
    return this;
  }

 /**
   * Whether Automatic Enhanced Match location is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information.
   * @return aemLocEnabled
  **/
  @JsonProperty("aem_loc_enabled")
  public Boolean getAemLocEnabled() {
    return aemLocEnabled;
  }

  public void setAemLocEnabled(Boolean aemLocEnabled) {
    this.aemLocEnabled = aemLocEnabled;
  }

  public ConversionTagConfigs aemLocEnabled(Boolean aemLocEnabled) {
    this.aemLocEnabled = aemLocEnabled;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

