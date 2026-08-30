package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ConversionTagV3GoalMetadata;
import org.openapitools.vertxweb.server.model.FrequencyGoalMetadata;
import org.openapitools.vertxweb.server.model.ScrollupGoalMetadata;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OptimizationGoalMetadata   {
  
  private ConversionTagV3GoalMetadata conversionTagV3GoalMetadata;
  private FrequencyGoalMetadata frequencyGoalMetadata;
  private ScrollupGoalMetadata scrollupGoalMetadata;

  public OptimizationGoalMetadata () {

  }

  public OptimizationGoalMetadata (ConversionTagV3GoalMetadata conversionTagV3GoalMetadata, FrequencyGoalMetadata frequencyGoalMetadata, ScrollupGoalMetadata scrollupGoalMetadata) {
    this.conversionTagV3GoalMetadata = conversionTagV3GoalMetadata;
    this.frequencyGoalMetadata = frequencyGoalMetadata;
    this.scrollupGoalMetadata = scrollupGoalMetadata;
  }

    
  @JsonProperty("conversion_tag_v3_goal_metadata")
  public ConversionTagV3GoalMetadata getConversionTagV3GoalMetadata() {
    return conversionTagV3GoalMetadata;
  }
  public void setConversionTagV3GoalMetadata(ConversionTagV3GoalMetadata conversionTagV3GoalMetadata) {
    this.conversionTagV3GoalMetadata = conversionTagV3GoalMetadata;
  }

    
  @JsonProperty("frequency_goal_metadata")
  public FrequencyGoalMetadata getFrequencyGoalMetadata() {
    return frequencyGoalMetadata;
  }
  public void setFrequencyGoalMetadata(FrequencyGoalMetadata frequencyGoalMetadata) {
    this.frequencyGoalMetadata = frequencyGoalMetadata;
  }

    
  @JsonProperty("scrollup_goal_metadata")
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
    OptimizationGoalMetadata optimizationGoalMetadata = (OptimizationGoalMetadata) o;
    return Objects.equals(conversionTagV3GoalMetadata, optimizationGoalMetadata.conversionTagV3GoalMetadata) &&
        Objects.equals(frequencyGoalMetadata, optimizationGoalMetadata.frequencyGoalMetadata) &&
        Objects.equals(scrollupGoalMetadata, optimizationGoalMetadata.scrollupGoalMetadata);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
