package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConversionTagConfigs;
import org.openapitools.model.EnhancedMatchStatusType;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConversionTagCommon
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionTagCommon {

  private String codeSnippet;

  private ConversionTagConfigs configs;

  private JsonNullable<EnhancedMatchStatusType> enhancedMatchStatus = JsonNullable.<EnhancedMatchStatusType>undefined();

  private String id;

  private JsonNullable<BigDecimal> lastFiredTimeMs = JsonNullable.<BigDecimal>undefined();

  private String name;

  private String version;

  public ConversionTagCommon() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ConversionTagCommon(String name) {
    this.name = name;
  }

  public ConversionTagCommon codeSnippet(String codeSnippet) {
    this.codeSnippet = codeSnippet;
    return this;
  }

  /**
   * Tag code snippet.
   * @return codeSnippet
   */
  
  @Schema(name = "code_snippet", accessMode = Schema.AccessMode.READ_ONLY, example = "<script type=text/javascript> [...]", description = "Tag code snippet.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code_snippet")
  public String getCodeSnippet() {
    return codeSnippet;
  }

  public void setCodeSnippet(String codeSnippet) {
    this.codeSnippet = codeSnippet;
  }

  public ConversionTagCommon configs(ConversionTagConfigs configs) {
    this.configs = configs;
    return this;
  }

  /**
   * Get configs
   * @return configs
   */
  @Valid 
  @Schema(name = "configs", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configs")
  public ConversionTagConfigs getConfigs() {
    return configs;
  }

  public void setConfigs(ConversionTagConfigs configs) {
    this.configs = configs;
  }

  public ConversionTagCommon enhancedMatchStatus(EnhancedMatchStatusType enhancedMatchStatus) {
    this.enhancedMatchStatus = JsonNullable.of(enhancedMatchStatus);
    return this;
  }

  /**
   * The enhanced match status of the tag
   * @return enhancedMatchStatus
   */
  @Valid 
  @Schema(name = "enhanced_match_status", accessMode = Schema.AccessMode.READ_ONLY, example = "VALIDATION_COMPLETE", description = "The enhanced match status of the tag", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enhanced_match_status")
  public JsonNullable<EnhancedMatchStatusType> getEnhancedMatchStatus() {
    return enhancedMatchStatus;
  }

  public void setEnhancedMatchStatus(JsonNullable<EnhancedMatchStatusType> enhancedMatchStatus) {
    this.enhancedMatchStatus = enhancedMatchStatus;
  }

  public ConversionTagCommon id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Tag ID.
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, example = "2617998078212", description = "Tag ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
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
  @Schema(name = "last_fired_time_ms", accessMode = Schema.AccessMode.READ_ONLY, example = "1599030000000", description = "Time for the last event fired.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_fired_time_ms")
  public JsonNullable<BigDecimal> getLastFiredTimeMs() {
    return lastFiredTimeMs;
  }

  public void setLastFiredTimeMs(JsonNullable<BigDecimal> lastFiredTimeMs) {
    this.lastFiredTimeMs = lastFiredTimeMs;
  }

  public ConversionTagCommon name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Conversion tag name.
   * @return name
   */
  @NotNull 
  @Schema(name = "name", example = "download_picture", description = "Conversion tag name.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ConversionTagCommon version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Version number.
   * @return version
   */
  
  @Schema(name = "version", accessMode = Schema.AccessMode.READ_ONLY, example = "3", description = "Version number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
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
        equalsNullable(this.enhancedMatchStatus, conversionTagCommon.enhancedMatchStatus) &&
        Objects.equals(this.id, conversionTagCommon.id) &&
        equalsNullable(this.lastFiredTimeMs, conversionTagCommon.lastFiredTimeMs) &&
        Objects.equals(this.name, conversionTagCommon.name) &&
        Objects.equals(this.version, conversionTagCommon.version);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeSnippet, configs, hashCodeNullable(enhancedMatchStatus), id, hashCodeNullable(lastFiredTimeMs), name, version);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

