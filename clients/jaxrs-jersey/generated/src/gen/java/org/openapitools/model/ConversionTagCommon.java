/*
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


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.ConversionTagConfigs;
import org.openapitools.model.EnhancedMatchStatusType;
import org.openapitools.model.EntityStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * ConversionTagCommon
 */
@JsonPropertyOrder({
  ConversionTagCommon.JSON_PROPERTY_AD_ACCOUNT_ID,
  ConversionTagCommon.JSON_PROPERTY_CODE_SNIPPET,
  ConversionTagCommon.JSON_PROPERTY_ENHANCED_MATCH_STATUS,
  ConversionTagCommon.JSON_PROPERTY_ID,
  ConversionTagCommon.JSON_PROPERTY_LAST_FIRED_TIME_MS,
  ConversionTagCommon.JSON_PROPERTY_NAME,
  ConversionTagCommon.JSON_PROPERTY_STATUS,
  ConversionTagCommon.JSON_PROPERTY_VERSION,
  ConversionTagCommon.JSON_PROPERTY_CONFIGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-05T02:20:07.425136412Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ConversionTagCommon   {
  public static final String JSON_PROPERTY_AD_ACCOUNT_ID = "ad_account_id";
  @JsonProperty(JSON_PROPERTY_AD_ACCOUNT_ID)
  private String adAccountId;

  public static final String JSON_PROPERTY_CODE_SNIPPET = "code_snippet";
  @JsonProperty(JSON_PROPERTY_CODE_SNIPPET)
  private String codeSnippet;

  public static final String JSON_PROPERTY_ENHANCED_MATCH_STATUS = "enhanced_match_status";
  @JsonProperty(JSON_PROPERTY_ENHANCED_MATCH_STATUS)
  private EnhancedMatchStatusType enhancedMatchStatus;

  public static final String JSON_PROPERTY_ID = "id";
  @JsonProperty(JSON_PROPERTY_ID)
  private String id;

  public static final String JSON_PROPERTY_LAST_FIRED_TIME_MS = "last_fired_time_ms";
  @JsonProperty(JSON_PROPERTY_LAST_FIRED_TIME_MS)
  private BigDecimal lastFiredTimeMs;

  public static final String JSON_PROPERTY_NAME = "name";
  @JsonProperty(JSON_PROPERTY_NAME)
  private String name;

  public static final String JSON_PROPERTY_STATUS = "status";
  @JsonProperty(JSON_PROPERTY_STATUS)
  private EntityStatus status;

  public static final String JSON_PROPERTY_VERSION = "version";
  @JsonProperty(JSON_PROPERTY_VERSION)
  private String version;

  public static final String JSON_PROPERTY_CONFIGS = "configs";
  @JsonProperty(JSON_PROPERTY_CONFIGS)
  private ConversionTagConfigs configs;

  public ConversionTagCommon adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * Ad account ID.
   * @return adAccountId
   **/
  @JsonProperty(value = "ad_account_id")
  @ApiModelProperty(example = "549755885175", value = "Ad account ID.")
  
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public ConversionTagCommon codeSnippet(String codeSnippet) {
    this.codeSnippet = codeSnippet;
    return this;
  }

  /**
   * Tag code snippet.
   * @return codeSnippet
   **/
  @JsonProperty(value = "code_snippet")
  @ApiModelProperty(example = "<script type=text/javascript> [...]", value = "Tag code snippet.")
  
  public String getCodeSnippet() {
    return codeSnippet;
  }

  public void setCodeSnippet(String codeSnippet) {
    this.codeSnippet = codeSnippet;
  }

  public ConversionTagCommon enhancedMatchStatus(EnhancedMatchStatusType enhancedMatchStatus) {
    this.enhancedMatchStatus = enhancedMatchStatus;
    return this;
  }

  /**
   * Get enhancedMatchStatus
   * @return enhancedMatchStatus
   **/
  @JsonProperty(value = "enhanced_match_status")
  @ApiModelProperty(value = "")
  
  public EnhancedMatchStatusType getEnhancedMatchStatus() {
    return enhancedMatchStatus;
  }

  public void setEnhancedMatchStatus(EnhancedMatchStatusType enhancedMatchStatus) {
    this.enhancedMatchStatus = enhancedMatchStatus;
  }

  public ConversionTagCommon id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Tag ID.
   * @return id
   **/
  @JsonProperty(value = "id")
  @ApiModelProperty(example = "2617998078212", value = "Tag ID.")
  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ConversionTagCommon lastFiredTimeMs(BigDecimal lastFiredTimeMs) {
    this.lastFiredTimeMs = lastFiredTimeMs;
    return this;
  }

  /**
   * Time for the last event fired.
   * @return lastFiredTimeMs
   **/
  @JsonProperty(value = "last_fired_time_ms")
  @ApiModelProperty(example = "1599030000000", value = "Time for the last event fired.")
  @Valid 
  public BigDecimal getLastFiredTimeMs() {
    return lastFiredTimeMs;
  }

  public void setLastFiredTimeMs(BigDecimal lastFiredTimeMs) {
    this.lastFiredTimeMs = lastFiredTimeMs;
  }

  public ConversionTagCommon name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Conversion tag name.
   * @return name
   **/
  @JsonProperty(value = "name")
  @ApiModelProperty(example = "ACME Checkout Test Tag", value = "Conversion tag name.")
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ConversionTagCommon status(EntityStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @JsonProperty(value = "status")
  @ApiModelProperty(value = "")
  
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  public ConversionTagCommon version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Version number.
   * @return version
   **/
  @JsonProperty(value = "version")
  @ApiModelProperty(example = "3", value = "Version number.")
  
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ConversionTagCommon configs(ConversionTagConfigs configs) {
    this.configs = configs;
    return this;
  }

  /**
   * Get configs
   * @return configs
   **/
  @JsonProperty(value = "configs")
  @ApiModelProperty(value = "")
  @Valid 
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

