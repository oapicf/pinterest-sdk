package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConversionTagConfigs;
import org.openapitools.model.EnhancedMatchStatusType;
import org.openapitools.model.EntityStatus;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ConversionTagResponse  {
  
  @ApiModelProperty(example = "549755885175", value = "Ad account ID.")
 /**
   * Ad account ID.
  **/
  private String adAccountId;

  @ApiModelProperty(example = "<script type=text/javascript> [...]", value = "Tag code snippet.")
 /**
   * Tag code snippet.
  **/
  private String codeSnippet;

  @ApiModelProperty(value = "")
  private EnhancedMatchStatusType enhancedMatchStatus;

  @ApiModelProperty(example = "2617998078212", value = "Tag ID.")
 /**
   * Tag ID.
  **/
  private String id;

  @ApiModelProperty(example = "1599030000000", value = "Time for the last event fired.")
 /**
   * Time for the last event fired.
  **/
  private BigDecimal lastFiredTimeMs;

  @ApiModelProperty(example = "ACME Checkout Test Tag", value = "Conversion tag name.")
 /**
   * Conversion tag name.
  **/
  private String name;

  @ApiModelProperty(value = "")
  private EntityStatus status;

  @ApiModelProperty(example = "3", value = "Version number.")
 /**
   * Version number.
  **/
  private String version;

  @ApiModelProperty(value = "")
  private ConversionTagConfigs configs;
 /**
   * Ad account ID.
   * @return adAccountId
  **/
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public ConversionTagResponse adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

 /**
   * Tag code snippet.
   * @return codeSnippet
  **/
  @JsonProperty("code_snippet")
  public String getCodeSnippet() {
    return codeSnippet;
  }

  public void setCodeSnippet(String codeSnippet) {
    this.codeSnippet = codeSnippet;
  }

  public ConversionTagResponse codeSnippet(String codeSnippet) {
    this.codeSnippet = codeSnippet;
    return this;
  }

 /**
   * Get enhancedMatchStatus
   * @return enhancedMatchStatus
  **/
  @JsonProperty("enhanced_match_status")
  public EnhancedMatchStatusType getEnhancedMatchStatus() {
    return enhancedMatchStatus;
  }

  public void setEnhancedMatchStatus(EnhancedMatchStatusType enhancedMatchStatus) {
    this.enhancedMatchStatus = enhancedMatchStatus;
  }

  public ConversionTagResponse enhancedMatchStatus(EnhancedMatchStatusType enhancedMatchStatus) {
    this.enhancedMatchStatus = enhancedMatchStatus;
    return this;
  }

 /**
   * Tag ID.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ConversionTagResponse id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Time for the last event fired.
   * @return lastFiredTimeMs
  **/
  @JsonProperty("last_fired_time_ms")
  public BigDecimal getLastFiredTimeMs() {
    return lastFiredTimeMs;
  }

  public void setLastFiredTimeMs(BigDecimal lastFiredTimeMs) {
    this.lastFiredTimeMs = lastFiredTimeMs;
  }

  public ConversionTagResponse lastFiredTimeMs(BigDecimal lastFiredTimeMs) {
    this.lastFiredTimeMs = lastFiredTimeMs;
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

  public ConversionTagResponse name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  public ConversionTagResponse status(EntityStatus status) {
    this.status = status;
    return this;
  }

 /**
   * Version number.
   * @return version
  **/
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ConversionTagResponse version(String version) {
    this.version = version;
    return this;
  }

 /**
   * Get configs
   * @return configs
  **/
  @JsonProperty("configs")
  public ConversionTagConfigs getConfigs() {
    return configs;
  }

  public void setConfigs(ConversionTagConfigs configs) {
    this.configs = configs;
  }

  public ConversionTagResponse configs(ConversionTagConfigs configs) {
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
    ConversionTagResponse conversionTagResponse = (ConversionTagResponse) o;
    return Objects.equals(this.adAccountId, conversionTagResponse.adAccountId) &&
        Objects.equals(this.codeSnippet, conversionTagResponse.codeSnippet) &&
        Objects.equals(this.enhancedMatchStatus, conversionTagResponse.enhancedMatchStatus) &&
        Objects.equals(this.id, conversionTagResponse.id) &&
        Objects.equals(this.lastFiredTimeMs, conversionTagResponse.lastFiredTimeMs) &&
        Objects.equals(this.name, conversionTagResponse.name) &&
        Objects.equals(this.status, conversionTagResponse.status) &&
        Objects.equals(this.version, conversionTagResponse.version) &&
        Objects.equals(this.configs, conversionTagResponse.configs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, codeSnippet, enhancedMatchStatus, id, lastFiredTimeMs, name, status, version, configs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTagResponse {\n");
    
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

