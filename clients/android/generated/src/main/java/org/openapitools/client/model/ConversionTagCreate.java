/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ConversionTagCreate {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("aem_enabled")
  private Boolean aemEnabled = false;
  @SerializedName("md_frequency")
  private BigDecimal mdFrequency = 1;
  @SerializedName("aem_fnln_enabled")
  private Boolean aemFnlnEnabled = false;
  @SerializedName("aem_ph_enabled")
  private Boolean aemPhEnabled = false;
  @SerializedName("aem_ge_enabled")
  private Boolean aemGeEnabled = false;
  @SerializedName("aem_db_enabled")
  private Boolean aemDbEnabled = false;
  @SerializedName("aem_loc_enabled")
  private Boolean aemLocEnabled = false;

  /**
   * Conversion tag name.
   **/
  @ApiModelProperty(required = true, value = "Conversion tag name.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Whether Automatic Enhanced Match email is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
   **/
  @ApiModelProperty(value = "Whether Automatic Enhanced Match email is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.")
  public Boolean getAemEnabled() {
    return aemEnabled;
  }
  public void setAemEnabled(Boolean aemEnabled) {
    this.aemEnabled = aemEnabled;
  }

  /**
   * Metadata ingestion frequency.
   **/
  @ApiModelProperty(value = "Metadata ingestion frequency.")
  public BigDecimal getMdFrequency() {
    return mdFrequency;
  }
  public void setMdFrequency(BigDecimal mdFrequency) {
    this.mdFrequency = mdFrequency;
  }

  /**
   * Whether Automatic Enhanced Match name is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
   **/
  @ApiModelProperty(value = "Whether Automatic Enhanced Match name is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.")
  public Boolean getAemFnlnEnabled() {
    return aemFnlnEnabled;
  }
  public void setAemFnlnEnabled(Boolean aemFnlnEnabled) {
    this.aemFnlnEnabled = aemFnlnEnabled;
  }

  /**
   * Whether Automatic Enhanced Match phone is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
   **/
  @ApiModelProperty(value = "Whether Automatic Enhanced Match phone is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.")
  public Boolean getAemPhEnabled() {
    return aemPhEnabled;
  }
  public void setAemPhEnabled(Boolean aemPhEnabled) {
    this.aemPhEnabled = aemPhEnabled;
  }

  /**
   * Whether Automatic Enhanced Match gender is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
   **/
  @ApiModelProperty(value = "Whether Automatic Enhanced Match gender is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.")
  public Boolean getAemGeEnabled() {
    return aemGeEnabled;
  }
  public void setAemGeEnabled(Boolean aemGeEnabled) {
    this.aemGeEnabled = aemGeEnabled;
  }

  /**
   * Whether Automatic Enhanced Match birthdate is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
   **/
  @ApiModelProperty(value = "Whether Automatic Enhanced Match birthdate is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.")
  public Boolean getAemDbEnabled() {
    return aemDbEnabled;
  }
  public void setAemDbEnabled(Boolean aemDbEnabled) {
    this.aemDbEnabled = aemDbEnabled;
  }

  /**
   * Whether Automatic Enhanced Match location is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
   **/
  @ApiModelProperty(value = "Whether Automatic Enhanced Match location is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.")
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
    ConversionTagCreate conversionTagCreate = (ConversionTagCreate) o;
    return (this.name == null ? conversionTagCreate.name == null : this.name.equals(conversionTagCreate.name)) &&
        (this.aemEnabled == null ? conversionTagCreate.aemEnabled == null : this.aemEnabled.equals(conversionTagCreate.aemEnabled)) &&
        (this.mdFrequency == null ? conversionTagCreate.mdFrequency == null : this.mdFrequency.equals(conversionTagCreate.mdFrequency)) &&
        (this.aemFnlnEnabled == null ? conversionTagCreate.aemFnlnEnabled == null : this.aemFnlnEnabled.equals(conversionTagCreate.aemFnlnEnabled)) &&
        (this.aemPhEnabled == null ? conversionTagCreate.aemPhEnabled == null : this.aemPhEnabled.equals(conversionTagCreate.aemPhEnabled)) &&
        (this.aemGeEnabled == null ? conversionTagCreate.aemGeEnabled == null : this.aemGeEnabled.equals(conversionTagCreate.aemGeEnabled)) &&
        (this.aemDbEnabled == null ? conversionTagCreate.aemDbEnabled == null : this.aemDbEnabled.equals(conversionTagCreate.aemDbEnabled)) &&
        (this.aemLocEnabled == null ? conversionTagCreate.aemLocEnabled == null : this.aemLocEnabled.equals(conversionTagCreate.aemLocEnabled));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.aemEnabled == null ? 0: this.aemEnabled.hashCode());
    result = 31 * result + (this.mdFrequency == null ? 0: this.mdFrequency.hashCode());
    result = 31 * result + (this.aemFnlnEnabled == null ? 0: this.aemFnlnEnabled.hashCode());
    result = 31 * result + (this.aemPhEnabled == null ? 0: this.aemPhEnabled.hashCode());
    result = 31 * result + (this.aemGeEnabled == null ? 0: this.aemGeEnabled.hashCode());
    result = 31 * result + (this.aemDbEnabled == null ? 0: this.aemDbEnabled.hashCode());
    result = 31 * result + (this.aemLocEnabled == null ? 0: this.aemLocEnabled.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTagCreate {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  aemEnabled: ").append(aemEnabled).append("\n");
    sb.append("  mdFrequency: ").append(mdFrequency).append("\n");
    sb.append("  aemFnlnEnabled: ").append(aemFnlnEnabled).append("\n");
    sb.append("  aemPhEnabled: ").append(aemPhEnabled).append("\n");
    sb.append("  aemGeEnabled: ").append(aemGeEnabled).append("\n");
    sb.append("  aemDbEnabled: ").append(aemDbEnabled).append("\n");
    sb.append("  aemLocEnabled: ").append(aemLocEnabled).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
