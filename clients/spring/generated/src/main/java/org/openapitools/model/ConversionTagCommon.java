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
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ConversionTagCommon
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-26T05:48:22.520185154Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ConversionTagCommon {

  private @Nullable String adAccountId;

  private @Nullable String codeSnippet;

  private JsonNullable<EnhancedMatchStatusType> enhancedMatchStatus = JsonNullable.<EnhancedMatchStatusType>undefined();

  private @Nullable String id;

  private JsonNullable<BigDecimal> lastFiredTimeMs = JsonNullable.<BigDecimal>undefined();

  private @Nullable String name;

  private @Nullable EntityStatus status;

  private @Nullable String version;

  private @Nullable ConversionTagConfigs configs;

  public ConversionTagCommon adAccountId(@Nullable String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * Ad account ID.
   * @return adAccountId
   */
  
  @Schema(name = "ad_account_id", example = "549755885175", description = "Ad account ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_account_id")
  public @Nullable String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(@Nullable String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public ConversionTagCommon codeSnippet(@Nullable String codeSnippet) {
    this.codeSnippet = codeSnippet;
    return this;
  }

  /**
   * Tag code snippet.
   * @return codeSnippet
   */
  
  @Schema(name = "code_snippet", example = "<script type=text/javascript> [...]", description = "Tag code snippet.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code_snippet")
  public @Nullable String getCodeSnippet() {
    return codeSnippet;
  }

  public void setCodeSnippet(@Nullable String codeSnippet) {
    this.codeSnippet = codeSnippet;
  }

  public ConversionTagCommon enhancedMatchStatus(EnhancedMatchStatusType enhancedMatchStatus) {
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

  public ConversionTagCommon id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Tag ID.
   * @return id
   */
  
  @Schema(name = "id", example = "2617998078212", description = "Tag ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public ConversionTagCommon lastFiredTimeMs(BigDecimal lastFiredTimeMs) {
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

  public ConversionTagCommon name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Conversion tag name.
   * @return name
   */
  
  @Schema(name = "name", example = "ACME Checkout Test Tag", description = "Conversion tag name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public ConversionTagCommon status(@Nullable EntityStatus status) {
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
  public @Nullable EntityStatus getStatus() {
    return status;
  }

  public void setStatus(@Nullable EntityStatus status) {
    this.status = status;
  }

  public ConversionTagCommon version(@Nullable String version) {
    this.version = version;
    return this;
  }

  /**
   * Version number.
   * @return version
   */
  
  @Schema(name = "version", example = "3", description = "Version number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public @Nullable String getVersion() {
    return version;
  }

  public void setVersion(@Nullable String version) {
    this.version = version;
  }

  public ConversionTagCommon configs(@Nullable ConversionTagConfigs configs) {
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
  public @Nullable ConversionTagConfigs getConfigs() {
    return configs;
  }

  public void setConfigs(@Nullable ConversionTagConfigs configs) {
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
        equalsNullable(this.enhancedMatchStatus, conversionTagCommon.enhancedMatchStatus) &&
        Objects.equals(this.id, conversionTagCommon.id) &&
        equalsNullable(this.lastFiredTimeMs, conversionTagCommon.lastFiredTimeMs) &&
        Objects.equals(this.name, conversionTagCommon.name) &&
        Objects.equals(this.status, conversionTagCommon.status) &&
        Objects.equals(this.version, conversionTagCommon.version) &&
        Objects.equals(this.configs, conversionTagCommon.configs);
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

