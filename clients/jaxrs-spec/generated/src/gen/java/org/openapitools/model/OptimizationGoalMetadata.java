package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OptimizationGoalMetadataConversionTagV3GoalMetadata;
import org.openapitools.model.OptimizationGoalMetadataFrequencyGoalMetadata;
import org.openapitools.model.OptimizationGoalMetadataScrollupGoalMetadata;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("OptimizationGoalMetadata")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class OptimizationGoalMetadata   {
  private @Valid OptimizationGoalMetadataConversionTagV3GoalMetadata conversionTagV3GoalMetadata;
  private @Valid OptimizationGoalMetadataFrequencyGoalMetadata frequencyGoalMetadata;
  private @Valid OptimizationGoalMetadataScrollupGoalMetadata scrollupGoalMetadata;

  /**
   **/
  public OptimizationGoalMetadata conversionTagV3GoalMetadata(OptimizationGoalMetadataConversionTagV3GoalMetadata conversionTagV3GoalMetadata) {
    this.conversionTagV3GoalMetadata = conversionTagV3GoalMetadata;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("conversion_tag_v3_goal_metadata")
  public OptimizationGoalMetadataConversionTagV3GoalMetadata getConversionTagV3GoalMetadata() {
    return conversionTagV3GoalMetadata;
  }

  @JsonProperty("conversion_tag_v3_goal_metadata")
  public void setConversionTagV3GoalMetadata(OptimizationGoalMetadataConversionTagV3GoalMetadata conversionTagV3GoalMetadata) {
    this.conversionTagV3GoalMetadata = conversionTagV3GoalMetadata;
  }

  /**
   **/
  public OptimizationGoalMetadata frequencyGoalMetadata(OptimizationGoalMetadataFrequencyGoalMetadata frequencyGoalMetadata) {
    this.frequencyGoalMetadata = frequencyGoalMetadata;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("frequency_goal_metadata")
  public OptimizationGoalMetadataFrequencyGoalMetadata getFrequencyGoalMetadata() {
    return frequencyGoalMetadata;
  }

  @JsonProperty("frequency_goal_metadata")
  public void setFrequencyGoalMetadata(OptimizationGoalMetadataFrequencyGoalMetadata frequencyGoalMetadata) {
    this.frequencyGoalMetadata = frequencyGoalMetadata;
  }

  /**
   **/
  public OptimizationGoalMetadata scrollupGoalMetadata(OptimizationGoalMetadataScrollupGoalMetadata scrollupGoalMetadata) {
    this.scrollupGoalMetadata = scrollupGoalMetadata;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scrollup_goal_metadata")
  public OptimizationGoalMetadataScrollupGoalMetadata getScrollupGoalMetadata() {
    return scrollupGoalMetadata;
  }

  @JsonProperty("scrollup_goal_metadata")
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

