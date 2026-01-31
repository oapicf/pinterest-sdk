package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.ConversionTagConfigs;
import org.openapitools.vertxweb.server.model.EnhancedMatchStatusType;
import org.openapitools.vertxweb.server.model.EntityStatus;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConversionTagResponse   {
  
  private String codeSnippet;
  private ConversionTagConfigs configs;
  private EnhancedMatchStatusType enhancedMatchStatus;
  private String id;
  private BigDecimal lastFiredTimeMs;
  private String name;
  private String version;
  private String adAccountId;
  private EntityStatus status;

  public ConversionTagResponse () {

  }

  public ConversionTagResponse (String codeSnippet, ConversionTagConfigs configs, EnhancedMatchStatusType enhancedMatchStatus, String id, BigDecimal lastFiredTimeMs, String name, String version, String adAccountId, EntityStatus status) {
    this.codeSnippet = codeSnippet;
    this.configs = configs;
    this.enhancedMatchStatus = enhancedMatchStatus;
    this.id = id;
    this.lastFiredTimeMs = lastFiredTimeMs;
    this.name = name;
    this.version = version;
    this.adAccountId = adAccountId;
    this.status = status;
  }

    
  @JsonProperty("code_snippet")
  public String getCodeSnippet() {
    return codeSnippet;
  }
  public void setCodeSnippet(String codeSnippet) {
    this.codeSnippet = codeSnippet;
  }

    
  @JsonProperty("configs")
  public ConversionTagConfigs getConfigs() {
    return configs;
  }
  public void setConfigs(ConversionTagConfigs configs) {
    this.configs = configs;
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

    
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

    
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

    
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
    ConversionTagResponse conversionTagResponse = (ConversionTagResponse) o;
    return Objects.equals(codeSnippet, conversionTagResponse.codeSnippet) &&
        Objects.equals(configs, conversionTagResponse.configs) &&
        Objects.equals(enhancedMatchStatus, conversionTagResponse.enhancedMatchStatus) &&
        Objects.equals(id, conversionTagResponse.id) &&
        Objects.equals(lastFiredTimeMs, conversionTagResponse.lastFiredTimeMs) &&
        Objects.equals(name, conversionTagResponse.name) &&
        Objects.equals(version, conversionTagResponse.version) &&
        Objects.equals(adAccountId, conversionTagResponse.adAccountId) &&
        Objects.equals(status, conversionTagResponse.status);
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
