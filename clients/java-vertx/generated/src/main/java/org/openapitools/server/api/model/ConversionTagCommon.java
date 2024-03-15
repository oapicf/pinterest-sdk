package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.ConversionTagConfigs;
import org.openapitools.server.api.model.EnhancedMatchStatusType;
import org.openapitools.server.api.model.EntityStatus;

@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public ConversionTagCommon () {

  }

  public ConversionTagCommon (String adAccountId, String codeSnippet, EnhancedMatchStatusType enhancedMatchStatus, String id, BigDecimal lastFiredTimeMs, String name, EntityStatus status, String version, ConversionTagConfigs configs) {
    this.adAccountId = adAccountId;
    this.codeSnippet = codeSnippet;
    this.enhancedMatchStatus = enhancedMatchStatus;
    this.id = id;
    this.lastFiredTimeMs = lastFiredTimeMs;
    this.name = name;
    this.status = status;
    this.version = version;
    this.configs = configs;
  }

    
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

    
  @JsonProperty("code_snippet")
  public String getCodeSnippet() {
    return codeSnippet;
  }
  public void setCodeSnippet(String codeSnippet) {
    this.codeSnippet = codeSnippet;
  }

    
  @JsonProperty("enhanced_match_status")
  public EnhancedMatchStatusType getEnhancedMatchStatus() {
    return enhancedMatchStatus;
  }
  public void setEnhancedMatchStatus(EnhancedMatchStatusType enhancedMatchStatus) {
    this.enhancedMatchStatus = enhancedMatchStatus;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("last_fired_time_ms")
  public BigDecimal getLastFiredTimeMs() {
    return lastFiredTimeMs;
  }
  public void setLastFiredTimeMs(BigDecimal lastFiredTimeMs) {
    this.lastFiredTimeMs = lastFiredTimeMs;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }
  public void setStatus(EntityStatus status) {
    this.status = status;
  }

    
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

    
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
    return Objects.equals(adAccountId, conversionTagCommon.adAccountId) &&
        Objects.equals(codeSnippet, conversionTagCommon.codeSnippet) &&
        Objects.equals(enhancedMatchStatus, conversionTagCommon.enhancedMatchStatus) &&
        Objects.equals(id, conversionTagCommon.id) &&
        Objects.equals(lastFiredTimeMs, conversionTagCommon.lastFiredTimeMs) &&
        Objects.equals(name, conversionTagCommon.name) &&
        Objects.equals(status, conversionTagCommon.status) &&
        Objects.equals(version, conversionTagCommon.version) &&
        Objects.equals(configs, conversionTagCommon.configs);
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
