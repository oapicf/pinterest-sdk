package org.openapitools.model;

import org.openapitools.model.ConversionTagV3GoalMetadata;
import org.openapitools.model.FrequencyGoalMetadata;
import org.openapitools.model.ScrollupGoalMetadata;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class NullableOptimizationGoalMetadata implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("conversion_tag_v3_goal_metadata")
  private ConversionTagV3GoalMetadata conversionTagV3GoalMetadata;

  @JsonProperty("frequency_goal_metadata")
  private FrequencyGoalMetadata frequencyGoalMetadata;

  @JsonProperty("scrollup_goal_metadata")
  private ScrollupGoalMetadata scrollupGoalMetadata;

  /**
   * 
   * @return conversionTagV3GoalMetadata
   */
  public ConversionTagV3GoalMetadata getConversionTagV3GoalMetadata() {
    return conversionTagV3GoalMetadata;
  }

  public void setConversionTagV3GoalMetadata(ConversionTagV3GoalMetadata conversionTagV3GoalMetadata) {
    this.conversionTagV3GoalMetadata = conversionTagV3GoalMetadata;
  }

  /**
   * 
   * @return frequencyGoalMetadata
   */
  public FrequencyGoalMetadata getFrequencyGoalMetadata() {
    return frequencyGoalMetadata;
  }

  public void setFrequencyGoalMetadata(FrequencyGoalMetadata frequencyGoalMetadata) {
    this.frequencyGoalMetadata = frequencyGoalMetadata;
  }

  /**
   * 
   * @return scrollupGoalMetadata
   */
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
