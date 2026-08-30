package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConversionTagConfigs;
import org.openapitools.model.EnhancedMatchStatusType;
import org.openapitools.model.EntityStatus;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionTag   {
  @JsonProperty("code_snippet")
  private String codeSnippet;

  @JsonProperty("configs")
  private ConversionTagConfigs configs;

  @JsonProperty("enhanced_match_status")
  private EnhancedMatchStatusType enhancedMatchStatus;

  @JsonProperty("id")
  private String id;

  @JsonProperty("last_fired_time_ms")
  private BigDecimal lastFiredTimeMs;

  @JsonProperty("name")
  private String name;

  @JsonProperty("version")
  private String version;

  @JsonProperty("ad_account_id")
  private String adAccountId;

  @JsonProperty("status")
  private EntityStatus status;

  /**
   * Tag code snippet.
   **/
  public ConversionTag codeSnippet(String codeSnippet) {
    this.codeSnippet = codeSnippet;
    return this;
  }

  
  @ApiModelProperty(example = "<script type=text/javascript> [...]", value = "Tag code snippet.")
  @JsonProperty("code_snippet")
  public String getCodeSnippet() {
    return codeSnippet;
  }
  public void setCodeSnippet(String codeSnippet) {
    this.codeSnippet = codeSnippet;
  }

  /**
   **/
  public ConversionTag configs(ConversionTagConfigs configs) {
    this.configs = configs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("configs")
  public ConversionTagConfigs getConfigs() {
    return configs;
  }
  public void setConfigs(ConversionTagConfigs configs) {
    this.configs = configs;
  }

  /**
   * The enhanced match status of the tag
   **/
  public ConversionTag enhancedMatchStatus(EnhancedMatchStatusType enhancedMatchStatus) {
    this.enhancedMatchStatus = enhancedMatchStatus;
    return this;
  }

  
  @ApiModelProperty(example = "VALIDATION_COMPLETE", value = "The enhanced match status of the tag")
  @JsonProperty("enhanced_match_status")
  public EnhancedMatchStatusType getEnhancedMatchStatus() {
    return enhancedMatchStatus;
  }
  public void setEnhancedMatchStatus(EnhancedMatchStatusType enhancedMatchStatus) {
    this.enhancedMatchStatus = enhancedMatchStatus;
  }

  /**
   * Tag ID.
   **/
  public ConversionTag id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "2617998078212", value = "Tag ID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Time for the last event fired.
   **/
  public ConversionTag lastFiredTimeMs(BigDecimal lastFiredTimeMs) {
    this.lastFiredTimeMs = lastFiredTimeMs;
    return this;
  }

  
  @ApiModelProperty(example = "1599030000000", value = "Time for the last event fired.")
  @JsonProperty("last_fired_time_ms")
  public BigDecimal getLastFiredTimeMs() {
    return lastFiredTimeMs;
  }
  public void setLastFiredTimeMs(BigDecimal lastFiredTimeMs) {
    this.lastFiredTimeMs = lastFiredTimeMs;
  }

  /**
   * Conversion tag name.
   **/
  public ConversionTag name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "download_picture", required = true, value = "Conversion tag name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Version number.
   **/
  public ConversionTag version(String version) {
    this.version = version;
    return this;
  }

  
  @ApiModelProperty(example = "3", value = "Version number.")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * Ad account ID.
   **/
  public ConversionTag adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  
  @ApiModelProperty(example = "549755885175", required = true, value = "Ad account ID.")
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   **/
  public ConversionTag status(EntityStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }
  public void setStatus(EntityStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionTag conversionTag = (ConversionTag) o;
    return Objects.equals(codeSnippet, conversionTag.codeSnippet) &&
        Objects.equals(configs, conversionTag.configs) &&
        Objects.equals(enhancedMatchStatus, conversionTag.enhancedMatchStatus) &&
        Objects.equals(id, conversionTag.id) &&
        Objects.equals(lastFiredTimeMs, conversionTag.lastFiredTimeMs) &&
        Objects.equals(name, conversionTag.name) &&
        Objects.equals(version, conversionTag.version) &&
        Objects.equals(adAccountId, conversionTag.adAccountId) &&
        Objects.equals(status, conversionTag.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeSnippet, configs, enhancedMatchStatus, id, lastFiredTimeMs, name, version, adAccountId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTag {\n");
    
    sb.append("    codeSnippet: ").append(toIndentedString(codeSnippet)).append("\n");
    sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
    sb.append("    enhancedMatchStatus: ").append(toIndentedString(enhancedMatchStatus)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastFiredTimeMs: ").append(toIndentedString(lastFiredTimeMs)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

