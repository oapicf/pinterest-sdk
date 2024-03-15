package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConversionTagConfigs;
import org.openapitools.model.EnhancedMatchStatusType;
import org.openapitools.model.EntityStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ConversionTagCommon  {
  
 /**
  * Ad account ID.
  */
  @ApiModelProperty(example = "549755885175", value = "Ad account ID.")
  private String adAccountId;

 /**
  * Tag code snippet.
  */
  @ApiModelProperty(example = "<script type=text/javascript> [...]", value = "Tag code snippet.")
  private String codeSnippet;

  @ApiModelProperty(value = "")
  @Valid
  private EnhancedMatchStatusType enhancedMatchStatus;

 /**
  * Tag ID.
  */
  @ApiModelProperty(example = "2617998078212", value = "Tag ID.")
  private String id;

 /**
  * Time for the last event fired.
  */
  @ApiModelProperty(example = "1599030000000", value = "Time for the last event fired.")
  @Valid
  private BigDecimal lastFiredTimeMs;

 /**
  * Conversion tag name.
  */
  @ApiModelProperty(example = "ACME Checkout Test Tag", value = "Conversion tag name.")
  private String name;

  @ApiModelProperty(value = "")
  @Valid
  private EntityStatus status;

 /**
  * Version number.
  */
  @ApiModelProperty(example = "3", value = "Version number.")
  private String version;

  @ApiModelProperty(value = "")
  @Valid
  private ConversionTagConfigs configs;
 /**
  * Ad account ID.
  * @return adAccountId
  */
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   */
 public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   */
  public ConversionTagCommon adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

 /**
  * Tag code snippet.
  * @return codeSnippet
  */
  @JsonProperty("code_snippet")
  public String getCodeSnippet() {
    return codeSnippet;
  }

  /**
   * Sets the <code>codeSnippet</code> property.
   */
 public void setCodeSnippet(String codeSnippet) {
    this.codeSnippet = codeSnippet;
  }

  /**
   * Sets the <code>codeSnippet</code> property.
   */
  public ConversionTagCommon codeSnippet(String codeSnippet) {
    this.codeSnippet = codeSnippet;
    return this;
  }

 /**
  * Get enhancedMatchStatus
  * @return enhancedMatchStatus
  */
  @JsonProperty("enhanced_match_status")
  public EnhancedMatchStatusType getEnhancedMatchStatus() {
    return enhancedMatchStatus;
  }

  /**
   * Sets the <code>enhancedMatchStatus</code> property.
   */
 public void setEnhancedMatchStatus(EnhancedMatchStatusType enhancedMatchStatus) {
    this.enhancedMatchStatus = enhancedMatchStatus;
  }

  /**
   * Sets the <code>enhancedMatchStatus</code> property.
   */
  public ConversionTagCommon enhancedMatchStatus(EnhancedMatchStatusType enhancedMatchStatus) {
    this.enhancedMatchStatus = enhancedMatchStatus;
    return this;
  }

 /**
  * Tag ID.
  * @return id
  */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public ConversionTagCommon id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Time for the last event fired.
  * @return lastFiredTimeMs
  */
  @JsonProperty("last_fired_time_ms")
  public BigDecimal getLastFiredTimeMs() {
    return lastFiredTimeMs;
  }

  /**
   * Sets the <code>lastFiredTimeMs</code> property.
   */
 public void setLastFiredTimeMs(BigDecimal lastFiredTimeMs) {
    this.lastFiredTimeMs = lastFiredTimeMs;
  }

  /**
   * Sets the <code>lastFiredTimeMs</code> property.
   */
  public ConversionTagCommon lastFiredTimeMs(BigDecimal lastFiredTimeMs) {
    this.lastFiredTimeMs = lastFiredTimeMs;
    return this;
  }

 /**
  * Conversion tag name.
  * @return name
  */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public ConversionTagCommon name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get status
  * @return status
  */
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(EntityStatus status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public ConversionTagCommon status(EntityStatus status) {
    this.status = status;
    return this;
  }

 /**
  * Version number.
  * @return version
  */
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  /**
   * Sets the <code>version</code> property.
   */
 public void setVersion(String version) {
    this.version = version;
  }

  /**
   * Sets the <code>version</code> property.
   */
  public ConversionTagCommon version(String version) {
    this.version = version;
    return this;
  }

 /**
  * Get configs
  * @return configs
  */
  @JsonProperty("configs")
  public ConversionTagConfigs getConfigs() {
    return configs;
  }

  /**
   * Sets the <code>configs</code> property.
   */
 public void setConfigs(ConversionTagConfigs configs) {
    this.configs = configs;
  }

  /**
   * Sets the <code>configs</code> property.
   */
  public ConversionTagCommon configs(ConversionTagConfigs configs) {
    this.configs = configs;
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
    ConversionTagCommon conversionTagCommon = (ConversionTagCommon) o;
    return Objects.equals(this.adAccountId, conversionTagCommon.adAccountId) &&
        Objects.equals(this.codeSnippet, conversionTagCommon.codeSnippet) &&
        Objects.equals(this.enhancedMatchStatus, conversionTagCommon.enhancedMatchStatus) &&
        Objects.equals(this.id, conversionTagCommon.id) &&
        Objects.equals(this.lastFiredTimeMs, conversionTagCommon.lastFiredTimeMs) &&
        Objects.equals(this.name, conversionTagCommon.name) &&
        Objects.equals(this.status, conversionTagCommon.status) &&
        Objects.equals(this.version, conversionTagCommon.version) &&
        Objects.equals(this.configs, conversionTagCommon.configs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, codeSnippet, enhancedMatchStatus, id, lastFiredTimeMs, name, status, version, configs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTagCommon {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    codeSnippet: ").append(toIndentedString(codeSnippet)).append("\n");
    sb.append("    enhancedMatchStatus: ").append(toIndentedString(enhancedMatchStatus)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastFiredTimeMs: ").append(toIndentedString(lastFiredTimeMs)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
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

