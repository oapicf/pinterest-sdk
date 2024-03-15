package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
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
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-03-14T23:04:54.712028318Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ConversionTagCommon   {
  
  private String adAccountId;
  private String codeSnippet;
  private EnhancedMatchStatusType enhancedMatchStatus;
  private String id;
  private BigDecimal lastFiredTimeMs;
  private String name;
  private EntityStatus status;
  private String version;
  private ConversionTagConfigs configs;

  /**
   * Ad account ID.
   **/
  
  @ApiModelProperty(example = "549755885175", value = "Ad account ID.")
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Tag code snippet.
   **/
  
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
  
  @ApiModelProperty(value = "")
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
  
  @ApiModelProperty(example = "ACME Checkout Test Tag", value = "Conversion tag name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }
  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  /**
   * Version number.
   **/
  
  @ApiModelProperty(example = "3", value = "Version number.")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("configs")
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

