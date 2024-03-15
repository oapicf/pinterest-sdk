package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
import java.util.Objects;



public class ConversionTagResponse   {
  
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
  public ConversionTagResponse adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  
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
  public ConversionTagResponse codeSnippet(String codeSnippet) {
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
  public ConversionTagResponse enhancedMatchStatus(EnhancedMatchStatusType enhancedMatchStatus) {
    this.enhancedMatchStatus = enhancedMatchStatus;
    return this;
  }

  
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
  public ConversionTagResponse id(String id) {
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
  public ConversionTagResponse lastFiredTimeMs(BigDecimal lastFiredTimeMs) {
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
  public ConversionTagResponse name(String name) {
    this.name = name;
    return this;
  }

  
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
  public ConversionTagResponse status(EntityStatus status) {
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


  /**
   * Version number.
   **/
  public ConversionTagResponse version(String version) {
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
   **/
  public ConversionTagResponse configs(ConversionTagConfigs configs) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

