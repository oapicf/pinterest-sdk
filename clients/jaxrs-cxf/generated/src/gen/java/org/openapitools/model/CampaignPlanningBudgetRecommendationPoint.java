package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.CampaignPlanningEstimationType;
import org.openapitools.model.CampaignPlanningPointEstimate;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A point estimation containing the estimate data and estimation type for a budget recommendation.
 */
@ApiModel(description="A point estimation containing the estimate data and estimation type for a budget recommendation.")

public class CampaignPlanningBudgetRecommendationPoint  {
  
 /**
  * Estimation type for this point.
  */
  @ApiModelProperty(value = "Estimation type for this point.")

  @Valid

  private CampaignPlanningEstimationType estimationType;

 /**
  * Point estimate data.
  */
  @ApiModelProperty(value = "Point estimate data.")

  @Valid

  private CampaignPlanningPointEstimate pointEstimate;
 /**
   * Estimation type for this point.
   * @return estimationType
  **/
  @JsonProperty("estimation_type")
  public CampaignPlanningEstimationType getEstimationType() {
    return estimationType;
  }

  public void setEstimationType(CampaignPlanningEstimationType estimationType) {
    this.estimationType = estimationType;
  }

  public CampaignPlanningBudgetRecommendationPoint estimationType(CampaignPlanningEstimationType estimationType) {
    this.estimationType = estimationType;
    return this;
  }

 /**
   * Point estimate data.
   * @return pointEstimate
  **/
  @JsonProperty("point_estimate")
  public CampaignPlanningPointEstimate getPointEstimate() {
    return pointEstimate;
  }

  public void setPointEstimate(CampaignPlanningPointEstimate pointEstimate) {
    this.pointEstimate = pointEstimate;
  }

  public CampaignPlanningBudgetRecommendationPoint pointEstimate(CampaignPlanningPointEstimate pointEstimate) {
    this.pointEstimate = pointEstimate;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

