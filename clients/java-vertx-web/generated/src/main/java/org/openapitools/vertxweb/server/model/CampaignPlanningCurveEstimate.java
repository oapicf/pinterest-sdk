package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.CampaignPlanningEstimationType;
import org.openapitools.vertxweb.server.model.CampaignPlanningPointEstimate;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignPlanningCurveEstimate   {
  
  private CampaignPlanningEstimationType estimationType;
  private List<CampaignPlanningPointEstimate> points = new ArrayList<>();

  public CampaignPlanningCurveEstimate () {

  }

  public CampaignPlanningCurveEstimate (CampaignPlanningEstimationType estimationType, List<CampaignPlanningPointEstimate> points) {
    this.estimationType = estimationType;
    this.points = points;
  }

    
  @JsonProperty("estimation_type")
  public CampaignPlanningEstimationType getEstimationType() {
    return estimationType;
  }
  public void setEstimationType(CampaignPlanningEstimationType estimationType) {
    this.estimationType = estimationType;
  }

    
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
