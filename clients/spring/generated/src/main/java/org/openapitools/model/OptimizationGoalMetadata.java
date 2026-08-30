package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConversionTagV3GoalMetadata;
import org.openapitools.model.FrequencyGoalMetadata;
import org.openapitools.model.ScrollupGoalMetadata;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OptimizationGoalMetadata
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OptimizationGoalMetadata {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConversionTagV3GoalMetadata conversionTagV3GoalMetadata;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable FrequencyGoalMetadata frequencyGoalMetadata;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ScrollupGoalMetadata scrollupGoalMetadata;

  public OptimizationGoalMetadata conversionTagV3GoalMetadata(@Nullable ConversionTagV3GoalMetadata conversionTagV3GoalMetadata) {
    this.conversionTagV3GoalMetadata = conversionTagV3GoalMetadata;
    return this;
  }

  /**
   * Get conversionTagV3GoalMetadata
   * @return conversionTagV3GoalMetadata
   */
  @Valid 
  @Schema(name = "conversion_tag_v3_goal_metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conversion_tag_v3_goal_metadata")
  public @Nullable ConversionTagV3GoalMetadata getConversionTagV3GoalMetadata() {
    return conversionTagV3GoalMetadata;
  }

  @JsonProperty("conversion_tag_v3_goal_metadata")
  public void setConversionTagV3GoalMetadata(@Nullable ConversionTagV3GoalMetadata conversionTagV3GoalMetadata) {
    this.conversionTagV3GoalMetadata = conversionTagV3GoalMetadata;
  }

  public OptimizationGoalMetadata frequencyGoalMetadata(@Nullable FrequencyGoalMetadata frequencyGoalMetadata) {
    this.frequencyGoalMetadata = frequencyGoalMetadata;
    return this;
  }

  /**
   * Get frequencyGoalMetadata
   * @return frequencyGoalMetadata
   */
  @Valid 
  @Schema(name = "frequency_goal_metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("frequency_goal_metadata")
  public @Nullable FrequencyGoalMetadata getFrequencyGoalMetadata() {
    return frequencyGoalMetadata;
  }

  @JsonProperty("frequency_goal_metadata")
  public void setFrequencyGoalMetadata(@Nullable FrequencyGoalMetadata frequencyGoalMetadata) {
    this.frequencyGoalMetadata = frequencyGoalMetadata;
  }

  public OptimizationGoalMetadata scrollupGoalMetadata(@Nullable ScrollupGoalMetadata scrollupGoalMetadata) {
    this.scrollupGoalMetadata = scrollupGoalMetadata;
    return this;
  }

  /**
   * Get scrollupGoalMetadata
   * @return scrollupGoalMetadata
   */
  @Valid 
  @Schema(name = "scrollup_goal_metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scrollup_goal_metadata")
  public @Nullable ScrollupGoalMetadata getScrollupGoalMetadata() {
    return scrollupGoalMetadata;
  }

  @JsonProperty("scrollup_goal_metadata")
  public void setScrollupGoalMetadata(@Nullable ScrollupGoalMetadata scrollupGoalMetadata) {
    this.scrollupGoalMetadata = scrollupGoalMetadata;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizationGoalMetadata optimizationGoalMetadata = (OptimizationGoalMetadata) o;
    return Objects.equals(this.conversionTagV3GoalMetadata, optimizationGoalMetadata.conversionTagV3GoalMetadata) &&
        Objects.equals(this.frequencyGoalMetadata, optimizationGoalMetadata.frequencyGoalMetadata) &&
        Objects.equals(this.scrollupGoalMetadata, optimizationGoalMetadata.scrollupGoalMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionTagV3GoalMetadata, frequencyGoalMetadata, scrollupGoalMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizationGoalMetadata {\n");
    sb.append("    conversionTagV3GoalMetadata: ").append(toIndentedString(conversionTagV3GoalMetadata)).append("\n");
    sb.append("    frequencyGoalMetadata: ").append(toIndentedString(frequencyGoalMetadata)).append("\n");
    sb.append("    scrollupGoalMetadata: ").append(toIndentedString(scrollupGoalMetadata)).append("\n");
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

