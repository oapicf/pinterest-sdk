package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.CampaignPlanningBudgetRecommendationPoint;
import com.prokarma.pkmst.model.CampaignPlanningExperimentBudgetRecommendation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Budget recommendation response containing recommended budget, estimated days, and point estimations.
 */
@ApiModel(description = "Budget recommendation response containing recommended budget, estimated days, and point estimations.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignPlanningBudgetRecommendation   {
  @JsonProperty("budget_recommendation")
  private Integer budgetRecommendation;

  @JsonProperty("experiment_campaign_budget_recommendation")
  
  private List<CampaignPlanningExperimentBudgetRecommendation> experimentCampaignBudgetRecommendation = null;

  @JsonProperty("lifetime_days_recommendation")
  private Integer lifetimeDaysRecommendation;

  @JsonProperty("point_estimations")
  
  private List<CampaignPlanningBudgetRecommendationPoint> pointEstimations = null;

  public CampaignPlanningBudgetRecommendation budgetRecommendation(Integer budgetRecommendation) {
    this.budgetRecommendation = budgetRecommendation;
    return this;
  }

  /**
   * The recommended budget amount.
   * @return budgetRecommendation
   */
  @ApiModelProperty(example = "5000000", value = "The recommended budget amount.")
  public Integer getBudgetRecommendation() {
    return budgetRecommendation;
  }

  public void setBudgetRecommendation(Integer budgetRecommendation) {
    this.budgetRecommendation = budgetRecommendation;
  }

  public CampaignPlanningBudgetRecommendation experimentCampaignBudgetRecommendation(List<CampaignPlanningExperimentBudgetRecommendation> experimentCampaignBudgetRecommendation) {
    this.experimentCampaignBudgetRecommendation = experimentCampaignBudgetRecommendation;
    return this;
  }

  public CampaignPlanningBudgetRecommendation addExperimentCampaignBudgetRecommendationItem(CampaignPlanningExperimentBudgetRecommendation experimentCampaignBudgetRecommendationItem) {
    if (this.experimentCampaignBudgetRecommendation == null) {
      this.experimentCampaignBudgetRecommendation = new ArrayList<>();
    }
    this.experimentCampaignBudgetRecommendation.add(experimentCampaignBudgetRecommendationItem);
    return this;
  }

  /**
   * List of experimental budget recommendations.
   * @return experimentCampaignBudgetRecommendation
   */
  @ApiModelProperty(value = "List of experimental budget recommendations.")
  public List<CampaignPlanningExperimentBudgetRecommendation> getExperimentCampaignBudgetRecommendation() {
    return experimentCampaignBudgetRecommendation;
  }

  public void setExperimentCampaignBudgetRecommendation(List<CampaignPlanningExperimentBudgetRecommendation> experimentCampaignBudgetRecommendation) {
    this.experimentCampaignBudgetRecommendation = experimentCampaignBudgetRecommendation;
  }

  public CampaignPlanningBudgetRecommendation lifetimeDaysRecommendation(Integer lifetimeDaysRecommendation) {
    this.lifetimeDaysRecommendation = lifetimeDaysRecommendation;
    return this;
  }

  /**
   * Recommended number of days for the campaign lifetime.
   * @return lifetimeDaysRecommendation
   */
  @ApiModelProperty(example = "30", value = "Recommended number of days for the campaign lifetime.")
  public Integer getLifetimeDaysRecommendation() {
    return lifetimeDaysRecommendation;
  }

  public void setLifetimeDaysRecommendation(Integer lifetimeDaysRecommendation) {
    this.lifetimeDaysRecommendation = lifetimeDaysRecommendation;
  }

  public CampaignPlanningBudgetRecommendation pointEstimations(List<CampaignPlanningBudgetRecommendationPoint> pointEstimations) {
    this.pointEstimations = pointEstimations;
    return this;
  }

  public CampaignPlanningBudgetRecommendation addPointEstimationsItem(CampaignPlanningBudgetRecommendationPoint pointEstimationsItem) {
    if (this.pointEstimations == null) {
      this.pointEstimations = new ArrayList<>();
    }
    this.pointEstimations.add(pointEstimationsItem);
    return this;
  }

  /**
   * List of point estimations for different budget scenarios.
   * @return pointEstimations
   */
  @ApiModelProperty(value = "List of point estimations for different budget scenarios.")
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
    return Objects.equals(this.budgetRecommendation, campaignPlanningBudgetRecommendation.budgetRecommendation) &&
        Objects.equals(this.experimentCampaignBudgetRecommendation, campaignPlanningBudgetRecommendation.experimentCampaignBudgetRecommendation) &&
        Objects.equals(this.lifetimeDaysRecommendation, campaignPlanningBudgetRecommendation.lifetimeDaysRecommendation) &&
        Objects.equals(this.pointEstimations, campaignPlanningBudgetRecommendation.pointEstimations);
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

