package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConversionTagConfigs;
import org.openapitools.model.EnhancedMatchStatusType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ConversionTagCommon  {
  
 /**
  * Tag code snippet.
  */
  @ApiModelProperty(example = "<script type=text/javascript> [...]", value = "Tag code snippet.")

  private String codeSnippet;

  @ApiModelProperty(value = "")

  @Valid

  private ConversionTagConfigs configs;

 /**
  * The enhanced match status of the tag
  */
  @ApiModelProperty(example = "VALIDATION_COMPLETE", value = "The enhanced match status of the tag")

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
  @ApiModelProperty(example = "download_picture", required = true, value = "Conversion tag name.")

  private String name;

 /**
  * Version number.
  */
  @ApiModelProperty(example = "3", value = "Version number.")

  private String version;
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
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ConversionTagCommon name(String name) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionTagCommon conversionTagCommon = (ConversionTagCommon) o;
    return Objects.equals(this.codeSnippet, conversionTagCommon.codeSnippet) &&
        Objects.equals(this.configs, conversionTagCommon.configs) &&
        Objects.equals(this.enhancedMatchStatus, conversionTagCommon.enhancedMatchStatus) &&
        Objects.equals(this.id, conversionTagCommon.id) &&
        Objects.equals(this.lastFiredTimeMs, conversionTagCommon.lastFiredTimeMs) &&
        Objects.equals(this.name, conversionTagCommon.name) &&
        Objects.equals(this.version, conversionTagCommon.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeSnippet, configs, enhancedMatchStatus, id, lastFiredTimeMs, name, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTagCommon {\n");
    
    sb.append("    codeSnippet: ").append(toIndentedString(codeSnippet)).append("\n");
    sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
    sb.append("    enhancedMatchStatus: ").append(toIndentedString(enhancedMatchStatus)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastFiredTimeMs: ").append(toIndentedString(lastFiredTimeMs)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

