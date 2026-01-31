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
 * ConversionTagResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-31T04:52:33.064583645Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ConversionTagResponse   {
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
  @ApiModelProperty(value = "The enhanced match status of the tag")
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

  public ConversionTagResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Conversion tag name.
   * @return name
  **/
  @ApiModelProperty(example = "ACME Checkout Test Tag", required = true, value = "Conversion tag name.")
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
    ConversionTagResponse conversionTagResponse = (ConversionTagResponse) o;
    return Objects.equals(this.codeSnippet, conversionTagResponse.codeSnippet) &&
        Objects.equals(this.configs, conversionTagResponse.configs) &&
        Objects.equals(this.enhancedMatchStatus, conversionTagResponse.enhancedMatchStatus) &&
        Objects.equals(this.id, conversionTagResponse.id) &&
        Objects.equals(this.lastFiredTimeMs, conversionTagResponse.lastFiredTimeMs) &&
        Objects.equals(this.name, conversionTagResponse.name) &&
        Objects.equals(this.version, conversionTagResponse.version) &&
        Objects.equals(this.adAccountId, conversionTagResponse.adAccountId) &&
        Objects.equals(this.status, conversionTagResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeSnippet, configs, enhancedMatchStatus, id, lastFiredTimeMs, name, version, adAccountId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTagResponse {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

