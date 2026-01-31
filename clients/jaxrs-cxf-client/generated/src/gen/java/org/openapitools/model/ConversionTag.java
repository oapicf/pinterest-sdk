package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConversionTagConfigs;
import org.openapitools.model.EnhancedMatchStatusType;
import org.openapitools.model.EntityStatus;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ConversionTag  {
  
 /**
  * Tag code snippet.
  */
  @ApiModelProperty(example = "<script type=text/javascript> [...]", value = "Tag code snippet.")

  private String codeSnippet;

  @ApiModelProperty(value = "")

  private ConversionTagConfigs configs;

 /**
  * The enhanced match status of the tag
  */
  @ApiModelProperty(value = "The enhanced match status of the tag")

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

  private BigDecimal lastFiredTimeMs;

 /**
  * Conversion tag name.
  */
  @ApiModelProperty(example = "ACME Checkout Test Tag", required = true, value = "Conversion tag name.")

  private String name;

 /**
  * Version number.
  */
  @ApiModelProperty(example = "3", value = "Version number.")

  private String version;

 /**
  * Ad account ID.
  */
  @ApiModelProperty(example = "549755885175", required = true, value = "Ad account ID.")

  private String adAccountId;

  @ApiModelProperty(value = "")

  private EntityStatus status;
 /**
   * Tag code snippet.
   * @return codeSnippet
  **/
  @JsonProperty("code_snippet")
  public String getCodeSnippet() {
    return codeSnippet;
  }


 /**
   * Get configs
   * @return configs
  **/
  @JsonProperty("configs")
  public ConversionTagConfigs getConfigs() {
    return configs;
  }


 /**
   * The enhanced match status of the tag
   * @return enhancedMatchStatus
  **/
  @JsonProperty("enhanced_match_status")
  public EnhancedMatchStatusType getEnhancedMatchStatus() {
    return enhancedMatchStatus;
  }


 /**
   * Tag ID.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }


 /**
   * Time for the last event fired.
   * @return lastFiredTimeMs
  **/
  @JsonProperty("last_fired_time_ms")
  public BigDecimal getLastFiredTimeMs() {
    return lastFiredTimeMs;
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

  public ConversionTag name(String name) {
    this.name = name;
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


 /**
   * Ad account ID.
   * @return adAccountId
  **/
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }


 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

