package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Demographic detail for a single audience demographic
 */

@Schema(name = "AudienceDemographicValue", description = "Demographic detail for a single audience demographic")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AudienceDemographicValue {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String key;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String name;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BigDecimal ratio;

  public AudienceDemographicValue key(@Nullable String key) {
    this.key = key;
    return this;
  }

  /**
   * Unique key for demographic item
   * @return key
   */
  
  @Schema(name = "key", example = "us", description = "Unique key for demographic item", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public @Nullable String getKey() {
    return key;
  }

  @JsonProperty("key")
  public void setKey(@Nullable String key) {
    this.key = key;
  }

  public AudienceDemographicValue name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Display name for demographic
   * @return name
   */
  
  @Schema(name = "name", example = "United States", description = "Display name for demographic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(@Nullable String name) {
    this.name = name;
  }

  public AudienceDemographicValue ratio(@Nullable BigDecimal ratio) {
    this.ratio = ratio;
    return this;
  }

  /**
   * Value of demographic item as a percent of total audience
   * @return ratio
   */
  @Valid 
  @Schema(name = "ratio", example = "0.551", description = "Value of demographic item as a percent of total audience", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ratio")
  public @Nullable BigDecimal getRatio() {
    return ratio;
  }

  @JsonProperty("ratio")
  public void setRatio(@Nullable BigDecimal ratio) {
    this.ratio = ratio;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceDemographicValue audienceDemographicValue = (AudienceDemographicValue) o;
    return Objects.equals(this.key, audienceDemographicValue.key) &&
        Objects.equals(this.name, audienceDemographicValue.name) &&
        Objects.equals(this.ratio, audienceDemographicValue.ratio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, ratio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceDemographicValue {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
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

