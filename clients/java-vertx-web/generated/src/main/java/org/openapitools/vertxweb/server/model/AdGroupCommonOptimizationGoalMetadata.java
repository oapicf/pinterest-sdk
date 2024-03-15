package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.OptimizationGoalMetadataConversionTagV3GoalMetadata;
import org.openapitools.vertxweb.server.model.OptimizationGoalMetadataFrequencyGoalMetadata;
import org.openapitools.vertxweb.server.model.OptimizationGoalMetadataScrollupGoalMetadata;

/**
 * Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdGroupCommonOptimizationGoalMetadata   {
  
  private OptimizationGoalMetadataConversionTagV3GoalMetadata conversionTagV3GoalMetadata;
  private OptimizationGoalMetadataFrequencyGoalMetadata frequencyGoalMetadata;
  private OptimizationGoalMetadataScrollupGoalMetadata scrollupGoalMetadata;

  public AdGroupCommonOptimizationGoalMetadata () {

  }

  public AdGroupCommonOptimizationGoalMetadata (OptimizationGoalMetadataConversionTagV3GoalMetadata conversionTagV3GoalMetadata, OptimizationGoalMetadataFrequencyGoalMetadata frequencyGoalMetadata, OptimizationGoalMetadataScrollupGoalMetadata scrollupGoalMetadata) {
    this.conversionTagV3GoalMetadata = conversionTagV3GoalMetadata;
    this.frequencyGoalMetadata = frequencyGoalMetadata;
    this.scrollupGoalMetadata = scrollupGoalMetadata;
  }

    
  @JsonProperty("conversion_tag_v3_goal_metadata")
  public OptimizationGoalMetadataConversionTagV3GoalMetadata getConversionTagV3GoalMetadata() {
    return conversionTagV3GoalMetadata;
  }
  public void setConversionTagV3GoalMetadata(OptimizationGoalMetadataConversionTagV3GoalMetadata conversionTagV3GoalMetadata) {
    this.conversionTagV3GoalMetadata = conversionTagV3GoalMetadata;
  }

    
  @JsonProperty("frequency_goal_metadata")
  public OptimizationGoalMetadataFrequencyGoalMetadata getFrequencyGoalMetadata() {
    return frequencyGoalMetadata;
  }
  public void setFrequencyGoalMetadata(OptimizationGoalMetadataFrequencyGoalMetadata frequencyGoalMetadata) {
    this.frequencyGoalMetadata = frequencyGoalMetadata;
  }

    
  @JsonProperty("scrollup_goal_metadata")
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
    AdGroupCommonOptimizationGoalMetadata adGroupCommonOptimizationGoalMetadata = (AdGroupCommonOptimizationGoalMetadata) o;
    return Objects.equals(conversionTagV3GoalMetadata, adGroupCommonOptimizationGoalMetadata.conversionTagV3GoalMetadata) &&
        Objects.equals(frequencyGoalMetadata, adGroupCommonOptimizationGoalMetadata.frequencyGoalMetadata) &&
        Objects.equals(scrollupGoalMetadata, adGroupCommonOptimizationGoalMetadata.scrollupGoalMetadata);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
