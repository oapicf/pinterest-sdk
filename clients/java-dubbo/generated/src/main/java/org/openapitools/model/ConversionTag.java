package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConversionTagConfigs;
import org.openapitools.model.EnhancedMatchStatusType;
import org.openapitools.model.EntityStatus;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ConversionTag implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Tag code snippet.
   */
  @JsonProperty("code_snippet")
  private String codeSnippet;

  @JsonProperty("configs")
  private ConversionTagConfigs configs;

  /**
   * The enhanced match status of the tag
   */
  @JsonProperty("enhanced_match_status")
  private EnhancedMatchStatusType enhancedMatchStatus;

  /**
   * Tag ID.
   */
  @JsonProperty("id")
  private String id;

  /**
   * Time for the last event fired.
   */
  @JsonProperty("last_fired_time_ms")
  private BigDecimal lastFiredTimeMs;

  /**
   * Conversion tag name.
   */
  @JsonProperty("name")
  private String name;

  /**
   * Version number.
   */
  @JsonProperty("version")
  private String version;

  /**
   * Ad account ID.
   */
  @JsonProperty("ad_account_id")
  private String adAccountId;

  @JsonProperty("status")
  private EntityStatus status;

  /**
   * Tag code snippet.
   * @return codeSnippet
   */
  public String getCodeSnippet() {
    return codeSnippet;
  }

  public void setCodeSnippet(String codeSnippet) {
    this.codeSnippet = codeSnippet;
  }

  /**
   * 
   * @return configs
   */
  public ConversionTagConfigs getConfigs() {
    return configs;
  }

  public void setConfigs(ConversionTagConfigs configs) {
    this.configs = configs;
  }

  /**
   * The enhanced match status of the tag
   * @return enhancedMatchStatus
   */
  public EnhancedMatchStatusType getEnhancedMatchStatus() {
    return enhancedMatchStatus;
  }

  public void setEnhancedMatchStatus(EnhancedMatchStatusType enhancedMatchStatus) {
    this.enhancedMatchStatus = enhancedMatchStatus;
  }

  /**
   * Tag ID.
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Time for the last event fired.
   * @return lastFiredTimeMs
   */
  public BigDecimal getLastFiredTimeMs() {
    return lastFiredTimeMs;
  }

  public void setLastFiredTimeMs(BigDecimal lastFiredTimeMs) {
    this.lastFiredTimeMs = lastFiredTimeMs;
  }

  /**
   * Conversion tag name.
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Version number.
   * @return version
   */
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * Ad account ID.
   * @return adAccountId
   */
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * 
   * @return status
   */
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
