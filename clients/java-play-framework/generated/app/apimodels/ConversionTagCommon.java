package apimodels;

import apimodels.ConversionTagConfigs;
import apimodels.EnhancedMatchStatusType;
import apimodels.EntityStatus;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ConversionTagCommon
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ConversionTagCommon   {
  @JsonProperty("ad_account_id")
  
  private String adAccountId;

  @JsonProperty("code_snippet")
  
  private String codeSnippet;

  @JsonProperty("enhanced_match_status")
  @Valid

  private EnhancedMatchStatusType enhancedMatchStatus;

  @JsonProperty("id")
  
  private String id;

  @JsonProperty("last_fired_time_ms")
  @Valid

  private BigDecimal lastFiredTimeMs;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("status")
  @Valid

  private EntityStatus status;

  @JsonProperty("version")
  
  private String version;

  @JsonProperty("configs")
  @Valid

  private ConversionTagConfigs configs;

  public ConversionTagCommon adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

   /**
   * Ad account ID.
   * @return adAccountId
  **/
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public ConversionTagCommon codeSnippet(String codeSnippet) {
    this.codeSnippet = codeSnippet;
    return this;
  }

   /**
   * Tag code snippet.
   * @return codeSnippet
  **/
  public String getCodeSnippet() {
    return codeSnippet;
  }

  public void setCodeSnippet(String codeSnippet) {
    this.codeSnippet = codeSnippet;
  }

  public ConversionTagCommon enhancedMatchStatus(EnhancedMatchStatusType enhancedMatchStatus) {
    this.enhancedMatchStatus = enhancedMatchStatus;
    return this;
  }

   /**
   * Get enhancedMatchStatus
   * @return enhancedMatchStatus
  **/
  public EnhancedMatchStatusType getEnhancedMatchStatus() {
    return enhancedMatchStatus;
  }

  public void setEnhancedMatchStatus(EnhancedMatchStatusType enhancedMatchStatus) {
    this.enhancedMatchStatus = enhancedMatchStatus;
  }

  public ConversionTagCommon id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Tag ID.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ConversionTagCommon lastFiredTimeMs(BigDecimal lastFiredTimeMs) {
    this.lastFiredTimeMs = lastFiredTimeMs;
    return this;
  }

   /**
   * Time for the last event fired.
   * @return lastFiredTimeMs
  **/
  public BigDecimal getLastFiredTimeMs() {
    return lastFiredTimeMs;
  }

  public void setLastFiredTimeMs(BigDecimal lastFiredTimeMs) {
    this.lastFiredTimeMs = lastFiredTimeMs;
  }

  public ConversionTagCommon name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Conversion tag name.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ConversionTagCommon status(EntityStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  public ConversionTagCommon version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Version number.
   * @return version
  **/
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ConversionTagCommon configs(ConversionTagConfigs configs) {
    this.configs = configs;
    return this;
  }

   /**
   * Get configs
   * @return configs
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

