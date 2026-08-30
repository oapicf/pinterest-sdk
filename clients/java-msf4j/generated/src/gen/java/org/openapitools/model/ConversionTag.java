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

/**
 * ConversionTag
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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
   * @return codeSnippet
  **/
  @ApiModelProperty(example = "<script type=text/javascript> [...]", value = "Tag code snippet.")
  public String getCodeSnippet() {
    return codeSnippet;
  }

   /**
   * Get configs
   * @return configs
  **/
  @ApiModelProperty(value = "")
  public ConversionTagConfigs getConfigs() {
    return configs;
  }

   /**
   * The enhanced match status of the tag
   * @return enhancedMatchStatus
  **/
  @ApiModelProperty(example = "VALIDATION_COMPLETE", value = "The enhanced match status of the tag")
  public EnhancedMatchStatusType getEnhancedMatchStatus() {
    return enhancedMatchStatus;
  }

   /**
   * Tag ID.
   * @return id
  **/
  @ApiModelProperty(example = "2617998078212", value = "Tag ID.")
  public String getId() {
    return id;
  }

   /**
   * Time for the last event fired.
   * @return lastFiredTimeMs
  **/
  @ApiModelProperty(example = "1599030000000", value = "Time for the last event fired.")
  public BigDecimal getLastFiredTimeMs() {
    return lastFiredTimeMs;
  }

  public ConversionTag name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Conversion tag name.
   * @return name
  **/
  @ApiModelProperty(example = "download_picture", required = true, value = "Conversion tag name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

   /**
   * Version number.
   * @return version
  **/
  @ApiModelProperty(example = "3", value = "Version number.")
  public String getVersion() {
    return version;
  }

   /**
   * Ad account ID.
   * @return adAccountId
  **/
  @ApiModelProperty(example = "549755885175", required = true, value = "Ad account ID.")
  public String getAdAccountId() {
    return adAccountId;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public EntityStatus getStatus() {
    return status;
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
    return Objects.equals(this.codeSnippet, conversionTag.codeSnippet) &&
        Objects.equals(this.configs, conversionTag.configs) &&
        Objects.equals(this.enhancedMatchStatus, conversionTag.enhancedMatchStatus) &&
        Objects.equals(this.id, conversionTag.id) &&
        Objects.equals(this.lastFiredTimeMs, conversionTag.lastFiredTimeMs) &&
        Objects.equals(this.name, conversionTag.name) &&
        Objects.equals(this.version, conversionTag.version) &&
        Objects.equals(this.adAccountId, conversionTag.adAccountId) &&
        Objects.equals(this.status, conversionTag.status);
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

