package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows   {
  @JsonProperty("click_window_days")
  
  private Integer clickWindowDays;

  @JsonProperty("engagement_window_days")
  
  private Integer engagementWindowDays;

  @JsonProperty("view_window_days")
  
  private Integer viewWindowDays;

  public OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows clickWindowDays(Integer clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
    return this;
  }

   /**
   * Get clickWindowDays
   * @return clickWindowDays
  **/
  public Integer getClickWindowDays() {
    return clickWindowDays;
  }

  public void setClickWindowDays(Integer clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
  }

  public OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows engagementWindowDays(Integer engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
    return this;
  }

   /**
   * Get engagementWindowDays
   * @return engagementWindowDays
  **/
  public Integer getEngagementWindowDays() {
    return engagementWindowDays;
  }

  public void setEngagementWindowDays(Integer engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
  }

  public OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows viewWindowDays(Integer viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
    return this;
  }

   /**
   * Get viewWindowDays
   * @return viewWindowDays
  **/
  public Integer getViewWindowDays() {
    return viewWindowDays;
  }

  public void setViewWindowDays(Integer viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows optimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows = (OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows) o;
    return Objects.equals(clickWindowDays, optimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows.clickWindowDays) &&
        Objects.equals(engagementWindowDays, optimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows.engagementWindowDays) &&
        Objects.equals(viewWindowDays, optimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows.viewWindowDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clickWindowDays, engagementWindowDays, viewWindowDays);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows {\n");
    
    sb.append("    clickWindowDays: ").append(toIndentedString(clickWindowDays)).append("\n");
    sb.append("    engagementWindowDays: ").append(toIndentedString(engagementWindowDays)).append("\n");
    sb.append("    viewWindowDays: ").append(toIndentedString(viewWindowDays)).append("\n");
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

