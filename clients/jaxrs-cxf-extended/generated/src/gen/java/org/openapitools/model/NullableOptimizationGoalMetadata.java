package org.openapitools.model;

import org.openapitools.model.ConversionTagV3GoalMetadata;
import org.openapitools.model.FrequencyGoalMetadata;
import org.openapitools.model.ScrollupGoalMetadata;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class NullableOptimizationGoalMetadata  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConversionTagV3GoalMetadata conversionTagV3GoalMetadata;

  @ApiModelProperty(value = "")
  @Valid
  private FrequencyGoalMetadata frequencyGoalMetadata;

  @ApiModelProperty(value = "")
  @Valid
  private ScrollupGoalMetadata scrollupGoalMetadata;
 /**
  * Get conversionTagV3GoalMetadata
  * @return conversionTagV3GoalMetadata
  */
  @JsonProperty("conversion_tag_v3_goal_metadata")
  public ConversionTagV3GoalMetadata getConversionTagV3GoalMetadata() {
    return conversionTagV3GoalMetadata;
  }

  /**
   * Sets the <code>conversionTagV3GoalMetadata</code> property.
   */
 public void setConversionTagV3GoalMetadata(ConversionTagV3GoalMetadata conversionTagV3GoalMetadata) {
    this.conversionTagV3GoalMetadata = conversionTagV3GoalMetadata;
  }

  /**
   * Sets the <code>conversionTagV3GoalMetadata</code> property.
   */
  public NullableOptimizationGoalMetadata conversionTagV3GoalMetadata(ConversionTagV3GoalMetadata conversionTagV3GoalMetadata) {
    this.conversionTagV3GoalMetadata = conversionTagV3GoalMetadata;
    return this;
  }

 /**
  * Get frequencyGoalMetadata
  * @return frequencyGoalMetadata
  */
  @JsonProperty("frequency_goal_metadata")
  public FrequencyGoalMetadata getFrequencyGoalMetadata() {
    return frequencyGoalMetadata;
  }

  /**
   * Sets the <code>frequencyGoalMetadata</code> property.
   */
 public void setFrequencyGoalMetadata(FrequencyGoalMetadata frequencyGoalMetadata) {
    this.frequencyGoalMetadata = frequencyGoalMetadata;
  }

  /**
   * Sets the <code>frequencyGoalMetadata</code> property.
   */
  public NullableOptimizationGoalMetadata frequencyGoalMetadata(FrequencyGoalMetadata frequencyGoalMetadata) {
    this.frequencyGoalMetadata = frequencyGoalMetadata;
    return this;
  }

 /**
  * Get scrollupGoalMetadata
  * @return scrollupGoalMetadata
  */
  @JsonProperty("scrollup_goal_metadata")
  public ScrollupGoalMetadata getScrollupGoalMetadata() {
    return scrollupGoalMetadata;
  }

  /**
   * Sets the <code>scrollupGoalMetadata</code> property.
   */
 public void setScrollupGoalMetadata(ScrollupGoalMetadata scrollupGoalMetadata) {
    this.scrollupGoalMetadata = scrollupGoalMetadata;
  }

  /**
   * Sets the <code>scrollupGoalMetadata</code> property.
   */
  public NullableOptimizationGoalMetadata scrollupGoalMetadata(ScrollupGoalMetadata scrollupGoalMetadata) {
    this.scrollupGoalMetadata = scrollupGoalMetadata;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

