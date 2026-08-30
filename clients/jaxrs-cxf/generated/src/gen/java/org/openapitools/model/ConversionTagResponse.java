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
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ConversionTagResponse  {
  
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
  * Ad account ID.
  */
  @ApiModelProperty(example = "549755885175", required = true, value = "Ad account ID.")

  private String adAccountId;

  @ApiModelProperty(value = "")

  @Valid

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
  @NotNull
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
  @NotNull
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

