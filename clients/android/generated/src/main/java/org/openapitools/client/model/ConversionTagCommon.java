/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.math.BigDecimal;
import org.openapitools.client.model.ConversionTagConfigs;
import org.openapitools.client.model.EnhancedMatchStatusType;
import org.openapitools.client.model.EntityStatus;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ConversionTagCommon {
  
  @SerializedName("ad_account_id")
  private String adAccountId = null;
  @SerializedName("code_snippet")
  private String codeSnippet = null;
  @SerializedName("enhanced_match_status")
  private EnhancedMatchStatusType enhancedMatchStatus = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("last_fired_time_ms")
  private BigDecimal lastFiredTimeMs = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("status")
  private EntityStatus status = null;
  @SerializedName("version")
  private String version = null;
  @SerializedName("configs")
  private ConversionTagConfigs configs = null;

  /**
   * Ad account ID.
   **/
  @ApiModelProperty(value = "Ad account ID.")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Tag code snippet.
   **/
  @ApiModelProperty(value = "Tag code snippet.")
  public String getCodeSnippet() {
    return codeSnippet;
  }
  public void setCodeSnippet(String codeSnippet) {
    this.codeSnippet = codeSnippet;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public EnhancedMatchStatusType getEnhancedMatchStatus() {
    return enhancedMatchStatus;
  }
  public void setEnhancedMatchStatus(EnhancedMatchStatusType enhancedMatchStatus) {
    this.enhancedMatchStatus = enhancedMatchStatus;
  }

  /**
   * Tag ID.
   **/
  @ApiModelProperty(value = "Tag ID.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Time for the last event fired.
   **/
  @ApiModelProperty(value = "Time for the last event fired.")
  public BigDecimal getLastFiredTimeMs() {
    return lastFiredTimeMs;
  }
  public void setLastFiredTimeMs(BigDecimal lastFiredTimeMs) {
    this.lastFiredTimeMs = lastFiredTimeMs;
  }

  /**
   * Conversion tag name.
   **/
  @ApiModelProperty(value = "Conversion tag name.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public EntityStatus getStatus() {
    return status;
  }
  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  /**
   * Version number.
   **/
  @ApiModelProperty(value = "Version number.")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConversionTagConfigs getConfigs() {
    return configs;
  }
  public void setConfigs(ConversionTagConfigs configs) {
    this.configs = configs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionTagCommon conversionTagCommon = (ConversionTagCommon) o;
    return (this.adAccountId == null ? conversionTagCommon.adAccountId == null : this.adAccountId.equals(conversionTagCommon.adAccountId)) &&
        (this.codeSnippet == null ? conversionTagCommon.codeSnippet == null : this.codeSnippet.equals(conversionTagCommon.codeSnippet)) &&
        (this.enhancedMatchStatus == null ? conversionTagCommon.enhancedMatchStatus == null : this.enhancedMatchStatus.equals(conversionTagCommon.enhancedMatchStatus)) &&
        (this.id == null ? conversionTagCommon.id == null : this.id.equals(conversionTagCommon.id)) &&
        (this.lastFiredTimeMs == null ? conversionTagCommon.lastFiredTimeMs == null : this.lastFiredTimeMs.equals(conversionTagCommon.lastFiredTimeMs)) &&
        (this.name == null ? conversionTagCommon.name == null : this.name.equals(conversionTagCommon.name)) &&
        (this.status == null ? conversionTagCommon.status == null : this.status.equals(conversionTagCommon.status)) &&
        (this.version == null ? conversionTagCommon.version == null : this.version.equals(conversionTagCommon.version)) &&
        (this.configs == null ? conversionTagCommon.configs == null : this.configs.equals(conversionTagCommon.configs));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.adAccountId == null ? 0: this.adAccountId.hashCode());
    result = 31 * result + (this.codeSnippet == null ? 0: this.codeSnippet.hashCode());
    result = 31 * result + (this.enhancedMatchStatus == null ? 0: this.enhancedMatchStatus.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.lastFiredTimeMs == null ? 0: this.lastFiredTimeMs.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.version == null ? 0: this.version.hashCode());
    result = 31 * result + (this.configs == null ? 0: this.configs.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTagCommon {\n");
    
    sb.append("  adAccountId: ").append(adAccountId).append("\n");
    sb.append("  codeSnippet: ").append(codeSnippet).append("\n");
    sb.append("  enhancedMatchStatus: ").append(enhancedMatchStatus).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  lastFiredTimeMs: ").append(lastFiredTimeMs).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("  configs: ").append(configs).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}