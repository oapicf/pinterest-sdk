package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.OptimizationGoalMetadataConversionTagV3GoalMetadata;
import org.openapitools.model.OptimizationGoalMetadataFrequencyGoalMetadata;
import org.openapitools.model.OptimizationGoalMetadataScrollupGoalMetadata;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
 */
@ApiModel(description="Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.")

public class AdGroupCommonOptimizationGoalMetadata  {
  
  @ApiModelProperty(value = "")
  @Valid
  private OptimizationGoalMetadataConversionTagV3GoalMetadata conversionTagV3GoalMetadata;

  @ApiModelProperty(value = "")
  @Valid
  private OptimizationGoalMetadataFrequencyGoalMetadata frequencyGoalMetadata;

  @ApiModelProperty(value = "")
  @Valid
  private OptimizationGoalMetadataScrollupGoalMetadata scrollupGoalMetadata;
 /**
  * Get conversionTagV3GoalMetadata
  * @return conversionTagV3GoalMetadata
  */
  @JsonProperty("conversion_tag_v3_goal_metadata")
  public OptimizationGoalMetadataConversionTagV3GoalMetadata getConversionTagV3GoalMetadata() {
    return conversionTagV3GoalMetadata;
  }

  /**
   * Sets the <code>conversionTagV3GoalMetadata</code> property.
   */
 public void setConversionTagV3GoalMetadata(OptimizationGoalMetadataConversionTagV3GoalMetadata conversionTagV3GoalMetadata) {
    this.conversionTagV3GoalMetadata = conversionTagV3GoalMetadata;
  }

  /**
   * Sets the <code>conversionTagV3GoalMetadata</code> property.
   */
  public AdGroupCommonOptimizationGoalMetadata conversionTagV3GoalMetadata(OptimizationGoalMetadataConversionTagV3GoalMetadata conversionTagV3GoalMetadata) {
    this.conversionTagV3GoalMetadata = conversionTagV3GoalMetadata;
    return this;
  }

 /**
  * Get frequencyGoalMetadata
  * @return frequencyGoalMetadata
  */
  @JsonProperty("frequency_goal_metadata")
  public OptimizationGoalMetadataFrequencyGoalMetadata getFrequencyGoalMetadata() {
    return frequencyGoalMetadata;
  }

  /**
   * Sets the <code>frequencyGoalMetadata</code> property.
   */
 public void setFrequencyGoalMetadata(OptimizationGoalMetadataFrequencyGoalMetadata frequencyGoalMetadata) {
    this.frequencyGoalMetadata = frequencyGoalMetadata;
  }

  /**
   * Sets the <code>frequencyGoalMetadata</code> property.
   */
  public AdGroupCommonOptimizationGoalMetadata frequencyGoalMetadata(OptimizationGoalMetadataFrequencyGoalMetadata frequencyGoalMetadata) {
    this.frequencyGoalMetadata = frequencyGoalMetadata;
    return this;
  }

 /**
  * Get scrollupGoalMetadata
  * @return scrollupGoalMetadata
  */
  @JsonProperty("scrollup_goal_metadata")
  public OptimizationGoalMetadataScrollupGoalMetadata getScrollupGoalMetadata() {
    return scrollupGoalMetadata;
  }

  /**
   * Sets the <code>scrollupGoalMetadata</code> property.
   */
 public void setScrollupGoalMetadata(OptimizationGoalMetadataScrollupGoalMetadata scrollupGoalMetadata) {
    this.scrollupGoalMetadata = scrollupGoalMetadata;
  }

  /**
   * Sets the <code>scrollupGoalMetadata</code> property.
   */
  public AdGroupCommonOptimizationGoalMetadata scrollupGoalMetadata(OptimizationGoalMetadataScrollupGoalMetadata scrollupGoalMetadata) {
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
    AdGroupCommonOptimizationGoalMetadata adGroupCommonOptimizationGoalMetadata = (AdGroupCommonOptimizationGoalMetadata) o;
    return Objects.equals(this.conversionTagV3GoalMetadata, adGroupCommonOptimizationGoalMetadata.conversionTagV3GoalMetadata) &&
        Objects.equals(this.frequencyGoalMetadata, adGroupCommonOptimizationGoalMetadata.frequencyGoalMetadata) &&
        Objects.equals(this.scrollupGoalMetadata, adGroupCommonOptimizationGoalMetadata.scrollupGoalMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionTagV3GoalMetadata, frequencyGoalMetadata, scrollupGoalMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupCommonOptimizationGoalMetadata {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

