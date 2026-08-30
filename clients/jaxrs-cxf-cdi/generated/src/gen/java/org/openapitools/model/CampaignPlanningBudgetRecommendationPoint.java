package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CampaignPlanningEstimationType;
import org.openapitools.model.CampaignPlanningPointEstimate;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * A point estimation containing the estimate data and estimation type for a budget recommendation.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "A point estimation containing the estimate data and estimation type for a budget recommendation.")
public class CampaignPlanningBudgetRecommendationPoint   {
  
  private CampaignPlanningEstimationType estimationType;

  private CampaignPlanningPointEstimate pointEstimate;

  /**
   * Estimation type for this point.
   **/
  public CampaignPlanningBudgetRecommendationPoint estimationType(CampaignPlanningEstimationType estimationType) {
    this.estimationType = estimationType;
    return this;
  }

  
  @ApiModelProperty(value = "Estimation type for this point.")
  @JsonProperty("estimation_type")
  public CampaignPlanningEstimationType getEstimationType() {
    return estimationType;
  }
  public void setEstimationType(CampaignPlanningEstimationType estimationType) {
    this.estimationType = estimationType;
  }


  /**
   * Point estimate data.
   **/
  public CampaignPlanningBudgetRecommendationPoint pointEstimate(CampaignPlanningPointEstimate pointEstimate) {
    this.pointEstimate = pointEstimate;
    return this;
  }

  
  @ApiModelProperty(value = "Point estimate data.")
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

