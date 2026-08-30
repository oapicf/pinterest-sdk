package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignPlanningEstimationType;
import org.openapitools.model.CampaignPlanningPointEstimate;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignPlanningCurveEstimate   {
  @JsonProperty("estimation_type")
  private CampaignPlanningEstimationType estimationType;

  @JsonProperty("points")
  private List<CampaignPlanningPointEstimate> points = null;

  /**
   * Estimation type for campaign planning estimated curve
   **/
  public CampaignPlanningCurveEstimate estimationType(CampaignPlanningEstimationType estimationType) {
    this.estimationType = estimationType;
    return this;
  }

  
  @ApiModelProperty(example = "IMPRESSION", value = "Estimation type for campaign planning estimated curve")
  @JsonProperty("estimation_type")
  public CampaignPlanningEstimationType getEstimationType() {
    return estimationType;
  }
  public void setEstimationType(CampaignPlanningEstimationType estimationType) {
    this.estimationType = estimationType;
  }

  /**
   * The estimation points that make up the estimated curve.
   **/
  public CampaignPlanningCurveEstimate points(List<CampaignPlanningPointEstimate> points) {
    this.points = points;
    return this;
  }

  
  @ApiModelProperty(value = "The estimation points that make up the estimated curve.")
  @JsonProperty("points")
  public List<CampaignPlanningPointEstimate> getPoints() {
    return points;
  }
  public void setPoints(List<CampaignPlanningPointEstimate> points) {
    this.points = points;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignPlanningCurveEstimate campaignPlanningCurveEstimate = (CampaignPlanningCurveEstimate) o;
    return Objects.equals(estimationType, campaignPlanningCurveEstimate.estimationType) &&
        Objects.equals(points, campaignPlanningCurveEstimate.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimationType, points);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignPlanningCurveEstimate {\n");
    
    sb.append("    estimationType: ").append(toIndentedString(estimationType)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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

