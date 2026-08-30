package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignPlanningBudgetRecommendationPoint;
import org.openapitools.model.CampaignPlanningExperimentBudgetRecommendation;



/**
 * Budget recommendation response containing recommended budget, estimated days, and point estimations.
 **/

@ApiModel(description = "Budget recommendation response containing recommended budget, estimated days, and point estimations.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignPlanningBudgetRecommendation   {
  @JsonProperty("budget_recommendation")
  private Integer budgetRecommendation;

  @JsonProperty("experiment_campaign_budget_recommendation")
  private List<CampaignPlanningExperimentBudgetRecommendation> experimentCampaignBudgetRecommendation = null;

  @JsonProperty("lifetime_days_recommendation")
  private Integer lifetimeDaysRecommendation;

  @JsonProperty("point_estimations")
  private List<CampaignPlanningBudgetRecommendationPoint> pointEstimations = null;

  /**
   * The recommended budget amount.
   **/
  public CampaignPlanningBudgetRecommendation budgetRecommendation(Integer budgetRecommendation) {
    this.budgetRecommendation = budgetRecommendation;
    return this;
  }

  
  @ApiModelProperty(example = "5000000", value = "The recommended budget amount.")
  @JsonProperty("budget_recommendation")
  public Integer getBudgetRecommendation() {
    return budgetRecommendation;
  }
  public void setBudgetRecommendation(Integer budgetRecommendation) {
    this.budgetRecommendation = budgetRecommendation;
  }

  /**
   * List of experimental budget recommendations.
   **/
  public CampaignPlanningBudgetRecommendation experimentCampaignBudgetRecommendation(List<CampaignPlanningExperimentBudgetRecommendation> experimentCampaignBudgetRecommendation) {
    this.experimentCampaignBudgetRecommendation = experimentCampaignBudgetRecommendation;
    return this;
  }

  
  @ApiModelProperty(value = "List of experimental budget recommendations.")
  @JsonProperty("experiment_campaign_budget_recommendation")
  public List<CampaignPlanningExperimentBudgetRecommendation> getExperimentCampaignBudgetRecommendation() {
    return experimentCampaignBudgetRecommendation;
  }
  public void setExperimentCampaignBudgetRecommendation(List<CampaignPlanningExperimentBudgetRecommendation> experimentCampaignBudgetRecommendation) {
    this.experimentCampaignBudgetRecommendation = experimentCampaignBudgetRecommendation;
  }

  /**
   * Recommended number of days for the campaign lifetime.
   **/
  public CampaignPlanningBudgetRecommendation lifetimeDaysRecommendation(Integer lifetimeDaysRecommendation) {
    this.lifetimeDaysRecommendation = lifetimeDaysRecommendation;
    return this;
  }

  
  @ApiModelProperty(example = "30", value = "Recommended number of days for the campaign lifetime.")
  @JsonProperty("lifetime_days_recommendation")
  public Integer getLifetimeDaysRecommendation() {
    return lifetimeDaysRecommendation;
  }
  public void setLifetimeDaysRecommendation(Integer lifetimeDaysRecommendation) {
    this.lifetimeDaysRecommendation = lifetimeDaysRecommendation;
  }

  /**
   * List of point estimations for different budget scenarios.
   **/
  public CampaignPlanningBudgetRecommendation pointEstimations(List<CampaignPlanningBudgetRecommendationPoint> pointEstimations) {
    this.pointEstimations = pointEstimations;
    return this;
  }

  
  @ApiModelProperty(value = "List of point estimations for different budget scenarios.")
  @JsonProperty("point_estimations")
  public List<CampaignPlanningBudgetRecommendationPoint> getPointEstimations() {
    return pointEstimations;
  }
  public void setPointEstimations(List<CampaignPlanningBudgetRecommendationPoint> pointEstimations) {
    this.pointEstimations = pointEstimations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignPlanningBudgetRecommendation campaignPlanningBudgetRecommendation = (CampaignPlanningBudgetRecommendation) o;
    return Objects.equals(budgetRecommendation, campaignPlanningBudgetRecommendation.budgetRecommendation) &&
        Objects.equals(experimentCampaignBudgetRecommendation, campaignPlanningBudgetRecommendation.experimentCampaignBudgetRecommendation) &&
        Objects.equals(lifetimeDaysRecommendation, campaignPlanningBudgetRecommendation.lifetimeDaysRecommendation) &&
        Objects.equals(pointEstimations, campaignPlanningBudgetRecommendation.pointEstimations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budgetRecommendation, experimentCampaignBudgetRecommendation, lifetimeDaysRecommendation, pointEstimations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignPlanningBudgetRecommendation {\n");
    
    sb.append("    budgetRecommendation: ").append(toIndentedString(budgetRecommendation)).append("\n");
    sb.append("    experimentCampaignBudgetRecommendation: ").append(toIndentedString(experimentCampaignBudgetRecommendation)).append("\n");
    sb.append("    lifetimeDaysRecommendation: ").append(toIndentedString(lifetimeDaysRecommendation)).append("\n");
    sb.append("    pointEstimations: ").append(toIndentedString(pointEstimations)).append("\n");
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

