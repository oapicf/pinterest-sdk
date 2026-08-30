package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConversionTagV3GoalMetadata;
import com.prokarma.pkmst.model.FrequencyGoalMetadata;
import com.prokarma.pkmst.model.ScrollupGoalMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * NullableOptimizationGoalMetadata
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class NullableOptimizationGoalMetadata   {
  @JsonProperty("conversion_tag_v3_goal_metadata")
  private ConversionTagV3GoalMetadata conversionTagV3GoalMetadata;

  @JsonProperty("frequency_goal_metadata")
  private FrequencyGoalMetadata frequencyGoalMetadata;

  @JsonProperty("scrollup_goal_metadata")
  private ScrollupGoalMetadata scrollupGoalMetadata;

  public NullableOptimizationGoalMetadata conversionTagV3GoalMetadata(ConversionTagV3GoalMetadata conversionTagV3GoalMetadata) {
    this.conversionTagV3GoalMetadata = conversionTagV3GoalMetadata;
    return this;
  }

  /**
   * Get conversionTagV3GoalMetadata
   * @return conversionTagV3GoalMetadata
   */
  @ApiModelProperty(value = "")
  public ConversionTagV3GoalMetadata getConversionTagV3GoalMetadata() {
    return conversionTagV3GoalMetadata;
  }

  public void setConversionTagV3GoalMetadata(ConversionTagV3GoalMetadata conversionTagV3GoalMetadata) {
    this.conversionTagV3GoalMetadata = conversionTagV3GoalMetadata;
  }

  public NullableOptimizationGoalMetadata frequencyGoalMetadata(FrequencyGoalMetadata frequencyGoalMetadata) {
    this.frequencyGoalMetadata = frequencyGoalMetadata;
    return this;
  }

  /**
   * Get frequencyGoalMetadata
   * @return frequencyGoalMetadata
   */
  @ApiModelProperty(value = "")
  public FrequencyGoalMetadata getFrequencyGoalMetadata() {
    return frequencyGoalMetadata;
  }

  public void setFrequencyGoalMetadata(FrequencyGoalMetadata frequencyGoalMetadata) {
    this.frequencyGoalMetadata = frequencyGoalMetadata;
  }

  public NullableOptimizationGoalMetadata scrollupGoalMetadata(ScrollupGoalMetadata scrollupGoalMetadata) {
    this.scrollupGoalMetadata = scrollupGoalMetadata;
    return this;
  }

  /**
   * Get scrollupGoalMetadata
   * @return scrollupGoalMetadata
   */
  @ApiModelProperty(value = "")
  public ScrollupGoalMetadata getScrollupGoalMetadata() {
    return scrollupGoalMetadata;
  }

  public void setScrollupGoalMetadata(ScrollupGoalMetadata scrollupGoalMetadata) {
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
    NullableOptimizationGoalMetadata nullableOptimizationGoalMetadata = (NullableOptimizationGoalMetadata) o;
    return Objects.equals(this.conversionTagV3GoalMetadata, nullableOptimizationGoalMetadata.conversionTagV3GoalMetadata) &&
        Objects.equals(this.frequencyGoalMetadata, nullableOptimizationGoalMetadata.frequencyGoalMetadata) &&
        Objects.equals(this.scrollupGoalMetadata, nullableOptimizationGoalMetadata.scrollupGoalMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionTagV3GoalMetadata, frequencyGoalMetadata, scrollupGoalMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NullableOptimizationGoalMetadata {\n");
    
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

