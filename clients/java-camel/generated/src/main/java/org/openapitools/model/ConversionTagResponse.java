package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConversionTagConfigs;
import org.openapitools.model.EnhancedMatchStatusType;
import org.openapitools.model.EntityStatus;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ConversionTagResponse
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ConversionTagResponse {

  private String adAccountId;

  private String codeSnippet;

  private JsonNullable<EnhancedMatchStatusType> enhancedMatchStatus = JsonNullable.<EnhancedMatchStatusType>undefined();

  private String id;

  private JsonNullable<BigDecimal> lastFiredTimeMs = JsonNullable.<BigDecimal>undefined();

  private String name;

  private EntityStatus status;

  private String version;

  private ConversionTagConfigs configs;

  public ConversionTagResponse adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * Ad account ID.
   * @return adAccountId
  */
  
  @Schema(name = "ad_account_id", example = "549755885175", description = "Ad account ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public ConversionTagResponse codeSnippet(String codeSnippet) {
    this.codeSnippet = codeSnippet;
    return this;
  }

  /**
   * Tag code snippet.
   * @return codeSnippet
  */
  
  @Schema(name = "code_snippet", example = "<script type=text/javascript> [...]", description = "Tag code snippet.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code_snippet")
  public String getCodeSnippet() {
    return codeSnippet;
  }

  public void setCodeSnippet(String codeSnippet) {
    this.codeSnippet = codeSnippet;
  }

  public ConversionTagResponse enhancedMatchStatus(EnhancedMatchStatusType enhancedMatchStatus) {
    this.enhancedMatchStatus = JsonNullable.of(enhancedMatchStatus);
    return this;
  }

  /**
   * Get enhancedMatchStatus
   * @return enhancedMatchStatus
  */
  @Valid 
  @Schema(name = "enhanced_match_status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enhanced_match_status")
  public JsonNullable<EnhancedMatchStatusType> getEnhancedMatchStatus() {
    return enhancedMatchStatus;
  }

  public void setEnhancedMatchStatus(JsonNullable<EnhancedMatchStatusType> enhancedMatchStatus) {
    this.enhancedMatchStatus = enhancedMatchStatus;
  }

  public ConversionTagResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Tag ID.
   * @return id
  */
  
  @Schema(name = "id", example = "2617998078212", description = "Tag ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ConversionTagResponse lastFiredTimeMs(BigDecimal lastFiredTimeMs) {
    this.lastFiredTimeMs = JsonNullable.of(lastFiredTimeMs);
    return this;
  }

  /**
   * Time for the last event fired.
   * @return lastFiredTimeMs
  */
  @Valid 
  @Schema(name = "last_fired_time_ms", example = "1599030000000", description = "Time for the last event fired.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_fired_time_ms")
  public JsonNullable<BigDecimal> getLastFiredTimeMs() {
    return lastFiredTimeMs;
  }

  public void setLastFiredTimeMs(JsonNullable<BigDecimal> lastFiredTimeMs) {
    this.lastFiredTimeMs = lastFiredTimeMs;
  }

  public ConversionTagResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Conversion tag name.
   * @return name
  */
  
  @Schema(name = "name", example = "ACME Checkout Test Tag", description = "Conversion tag name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ConversionTagResponse status(EntityStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  public ConversionTagResponse version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Version number.
   * @return version
  */
  
  @Schema(name = "version", example = "3", description = "Version number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ConversionTagResponse configs(ConversionTagConfigs configs) {
    this.configs = configs;
    return this;
  }

  /**
   * Get configs
   * @return configs
  */
  @Valid 
  @Schema(name = "configs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        equalsNullable(this.enhancedMatchStatus, conversionTagResponse.enhancedMatchStatus) &&
        Objects.equals(this.id, conversionTagResponse.id) &&
        equalsNullable(this.lastFiredTimeMs, conversionTagResponse.lastFiredTimeMs) &&
        Objects.equals(this.name, conversionTagResponse.name) &&
        Objects.equals(this.status, conversionTagResponse.status) &&
        Objects.equals(this.version, conversionTagResponse.version) &&
        Objects.equals(this.configs, conversionTagResponse.configs);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, codeSnippet, hashCodeNullable(enhancedMatchStatus), id, hashCodeNullable(lastFiredTimeMs), name, status, version, configs);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

