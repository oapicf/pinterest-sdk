package org.openapitools.model;

import org.openapitools.model.CampaignPlanningEstimationType;
import org.openapitools.model.CampaignPlanningPointEstimate;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * A point estimation containing the estimate data and estimation type for a budget recommendation.
 */
public class CampaignPlanningBudgetRecommendationPoint implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Estimation type for this point.
   */
  @JsonProperty("estimation_type")
  private CampaignPlanningEstimationType estimationType;

  /**
   * Point estimate data.
   */
  @JsonProperty("point_estimate")
  private CampaignPlanningPointEstimate pointEstimate;

  /**
   * Estimation type for this point.
   * @return estimationType
   */
  public CampaignPlanningEstimationType getEstimationType() {
    return estimationType;
  }

  public void setEstimationType(CampaignPlanningEstimationType estimationType) {
    this.estimationType = estimationType;
  }

  /**
   * Point estimate data.
   * @return pointEstimate
   */
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
    return Objects.equals(this.estimationType, campaignPlanningBudgetRecommendationPoint.estimationType) &&
        Objects.equals(this.pointEstimate, campaignPlanningBudgetRecommendationPoint.pointEstimate);
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
