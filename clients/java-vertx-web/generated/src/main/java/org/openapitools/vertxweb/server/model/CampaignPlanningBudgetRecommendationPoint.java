package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.CampaignPlanningEstimationType;
import org.openapitools.vertxweb.server.model.CampaignPlanningPointEstimate;

/**
 * A point estimation containing the estimate data and estimation type for a budget recommendation.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignPlanningBudgetRecommendationPoint   {
  
  private CampaignPlanningEstimationType estimationType;
  private CampaignPlanningPointEstimate pointEstimate;

  public CampaignPlanningBudgetRecommendationPoint () {

  }

  public CampaignPlanningBudgetRecommendationPoint (CampaignPlanningEstimationType estimationType, CampaignPlanningPointEstimate pointEstimate) {
    this.estimationType = estimationType;
    this.pointEstimate = pointEstimate;
  }

    
  @JsonProperty("estimation_type")
  public CampaignPlanningEstimationType getEstimationType() {
    return estimationType;
  }
  public void setEstimationType(CampaignPlanningEstimationType estimationType) {
    this.estimationType = estimationType;
  }

    
  @JsonProperty("point_estimate")
  public CampaignPlanningPointEstimate getPointEstimate() {
    return pointEstimate;
  }
  public void setPointEstimate(CampaignPlanningPointEstimate pointEstimate) {
    this.pointEstimate = pointEstimate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignPlanningBudgetRecommendationPoint campaignPlanningBudgetRecommendationPoint = (CampaignPlanningBudgetRecommendationPoint) o;
    return Objects.equals(estimationType, campaignPlanningBudgetRecommendationPoint.estimationType) &&
        Objects.equals(pointEstimate, campaignPlanningBudgetRecommendationPoint.pointEstimate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimationType, pointEstimate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignPlanningBudgetRecommendationPoint {\n");
    
    sb.append("    estimationType: ").append(toIndentedString(estimationType)).append("\n");
    sb.append("    pointEstimate: ").append(toIndentedString(pointEstimate)).append("\n");
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
