package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.OptimizationGoalMetadataConversionTagV3GoalMetadata;
import com.prokarma.pkmst.model.OptimizationGoalMetadataFrequencyGoalMetadata;
import com.prokarma.pkmst.model.OptimizationGoalMetadataScrollupGoalMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * OptimizationGoalMetadata
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class OptimizationGoalMetadata   {
  @JsonProperty("conversion_tag_v3_goal_metadata")
  private OptimizationGoalMetadataConversionTagV3GoalMetadata conversionTagV3GoalMetadata;

  @JsonProperty("frequency_goal_metadata")
  private OptimizationGoalMetadataFrequencyGoalMetadata frequencyGoalMetadata;

  @JsonProperty("scrollup_goal_metadata")
  private OptimizationGoalMetadataScrollupGoalMetadata scrollupGoalMetadata;

  public OptimizationGoalMetadata conversionTagV3GoalMetadata(OptimizationGoalMetadataConversionTagV3GoalMetadata conversionTagV3GoalMetadata) {
    this.conversionTagV3GoalMetadata = conversionTagV3GoalMetadata;
    return this;
  }

   /**
   * Get conversionTagV3GoalMetadata
   * @return conversionTagV3GoalMetadata
  **/
  @ApiModelProperty(value = "")
  public OptimizationGoalMetadataConversionTagV3GoalMetadata getConversionTagV3GoalMetadata() {
    return conversionTagV3GoalMetadata;
  }

  public void setConversionTagV3GoalMetadata(OptimizationGoalMetadataConversionTagV3GoalMetadata conversionTagV3GoalMetadata) {
    this.conversionTagV3GoalMetadata = conversionTagV3GoalMetadata;
  }

  public OptimizationGoalMetadata frequencyGoalMetadata(OptimizationGoalMetadataFrequencyGoalMetadata frequencyGoalMetadata) {
    this.frequencyGoalMetadata = frequencyGoalMetadata;
    return this;
  }

   /**
   * Get frequencyGoalMetadata
   * @return frequencyGoalMetadata
  **/
  @ApiModelProperty(value = "")
  public OptimizationGoalMetadataFrequencyGoalMetadata getFrequencyGoalMetadata() {
    return frequencyGoalMetadata;
  }

  public void setFrequencyGoalMetadata(OptimizationGoalMetadataFrequencyGoalMetadata frequencyGoalMetadata) {
    this.frequencyGoalMetadata = frequencyGoalMetadata;
  }

  public OptimizationGoalMetadata scrollupGoalMetadata(OptimizationGoalMetadataScrollupGoalMetadata scrollupGoalMetadata) {
    this.scrollupGoalMetadata = scrollupGoalMetadata;
    return this;
  }

   /**
   * Get scrollupGoalMetadata
   * @return scrollupGoalMetadata
  **/
  @ApiModelProperty(value = "")
  public OptimizationGoalMetadataScrollupGoalMetadata getScrollupGoalMetadata() {
    return scrollupGoalMetadata;
  }

  public void setScrollupGoalMetadata(OptimizationGoalMetadataScrollupGoalMetadata scrollupGoalMetadata) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

