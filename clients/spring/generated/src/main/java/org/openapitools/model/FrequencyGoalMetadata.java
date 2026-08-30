package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.FrequencyGoalMetadataTimerange;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Frequency target can only be between 2 and 20
 */

@Schema(name = "FrequencyGoalMetadata", description = "Frequency target can only be between 2 and 20")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class FrequencyGoalMetadata {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer frequency;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable FrequencyGoalMetadataTimerange timerange;

  public FrequencyGoalMetadata frequency(@Nullable Integer frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Get frequency
   * minimum: 2
   * maximum: 20
   * @return frequency
   */
  @Min(value = 2) @Max(value = 20) 
  @Schema(name = "frequency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("frequency")
  public @Nullable Integer getFrequency() {
    return frequency;
  }

  @JsonProperty("frequency")
  public void setFrequency(@Nullable Integer frequency) {
    this.frequency = frequency;
  }

  public FrequencyGoalMetadata timerange(@Nullable FrequencyGoalMetadataTimerange timerange) {
    this.timerange = timerange;
    return this;
  }

  /**
   * Get timerange
   * @return timerange
   */
  @Valid 
  @Schema(name = "timerange", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timerange")
  public @Nullable FrequencyGoalMetadataTimerange getTimerange() {
    return timerange;
  }

  @JsonProperty("timerange")
  public void setTimerange(@Nullable FrequencyGoalMetadataTimerange timerange) {
    this.timerange = timerange;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FrequencyGoalMetadata frequencyGoalMetadata = (FrequencyGoalMetadata) o;
    return Objects.equals(this.frequency, frequencyGoalMetadata.frequency) &&
        Objects.equals(this.timerange, frequencyGoalMetadata.timerange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequency, timerange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrequencyGoalMetadata {\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    timerange: ").append(toIndentedString(timerange)).append("\n");
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

