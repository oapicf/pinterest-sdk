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
import org.openapitools.model.EntityStatus;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConversionTag
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionTag {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String codeSnippet;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConversionTagConfigs configs;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<EnhancedMatchStatusType> enhancedMatchStatus = JsonNullable.<EnhancedMatchStatusType>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String id;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<BigDecimal> lastFiredTimeMs = JsonNullable.<BigDecimal>undefined();

  private String name;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String version;

  private String adAccountId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable EntityStatus status;

  public ConversionTag() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ConversionTag(String name, String adAccountId) {
    this.name = name;
    this.adAccountId = adAccountId;
  }

  public ConversionTag codeSnippet(@Nullable String codeSnippet) {
    this.codeSnippet = codeSnippet;
    return this;
  }

  /**
   * Tag code snippet.
   * @return codeSnippet
   */
  
  @Schema(name = "code_snippet", accessMode = Schema.AccessMode.READ_ONLY, example = "<script type=text/javascript> [...]", description = "Tag code snippet.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code_snippet")
  public @Nullable String getCodeSnippet() {
    return codeSnippet;
  }

  @JsonProperty("code_snippet")
  public void setCodeSnippet(@Nullable String codeSnippet) {
    this.codeSnippet = codeSnippet;
  }

  public ConversionTag configs(@Nullable ConversionTagConfigs configs) {
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
  public @Nullable ConversionTagConfigs getConfigs() {
    return configs;
  }

  @JsonProperty("configs")
  public void setConfigs(@Nullable ConversionTagConfigs configs) {
    this.configs = configs;
  }

  public ConversionTag enhancedMatchStatus(EnhancedMatchStatusType enhancedMatchStatus) {
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

  public ConversionTag id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Tag ID.
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, example = "2617998078212", description = "Tag ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(@Nullable String id) {
    this.id = id;
  }

  public ConversionTag lastFiredTimeMs(BigDecimal lastFiredTimeMs) {
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

  public ConversionTag name(String name) {
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

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  public ConversionTag version(@Nullable String version) {
    this.version = version;
    return this;
  }

  /**
   * Version number.
   * @return version
   */
  
  @Schema(name = "version", accessMode = Schema.AccessMode.READ_ONLY, example = "3", description = "Version number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public @Nullable String getVersion() {
    return version;
  }

  @JsonProperty("version")
  public void setVersion(@Nullable String version) {
    this.version = version;
  }

  public ConversionTag adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * Ad account ID.
   * @return adAccountId
   */
  
  @Schema(name = "ad_account_id", accessMode = Schema.AccessMode.READ_ONLY, example = "549755885175", description = "Ad account ID.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }

  @JsonProperty("ad_account_id")
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public ConversionTag status(@Nullable EntityStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @Valid 
  @Schema(name = "status", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable EntityStatus getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(@Nullable EntityStatus status) {
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
        equalsNullable(this.enhancedMatchStatus, conversionTag.enhancedMatchStatus) &&
        Objects.equals(this.id, conversionTag.id) &&
        equalsNullable(this.lastFiredTimeMs, conversionTag.lastFiredTimeMs) &&
        Objects.equals(this.name, conversionTag.name) &&
        Objects.equals(this.version, conversionTag.version) &&
        Objects.equals(this.adAccountId, conversionTag.adAccountId) &&
        Objects.equals(this.status, conversionTag.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeSnippet, configs, hashCodeNullable(enhancedMatchStatus), id, hashCodeNullable(lastFiredTimeMs), name, version, adAccountId, status);
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

