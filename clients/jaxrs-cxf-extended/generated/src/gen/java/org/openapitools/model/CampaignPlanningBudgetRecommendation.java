package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignPlanningBudgetRecommendationPoint;
import org.openapitools.model.CampaignPlanningExperimentBudgetRecommendation;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Budget recommendation response containing recommended budget, estimated days, and point estimations.
 */
@ApiModel(description="Budget recommendation response containing recommended budget, estimated days, and point estimations.")

public class CampaignPlanningBudgetRecommendation  {
  
 /**
  * The recommended budget amount.
  */
  @ApiModelProperty(example = "5000000", value = "The recommended budget amount.")
  private Integer budgetRecommendation;

 /**
  * List of experimental budget recommendations.
  */
  @ApiModelProperty(value = "List of experimental budget recommendations.")
  @Valid
  private List<@Valid CampaignPlanningExperimentBudgetRecommendation> experimentCampaignBudgetRecommendation = new ArrayList<>();

 /**
  * Recommended number of days for the campaign lifetime.
  */
  @ApiModelProperty(example = "30", value = "Recommended number of days for the campaign lifetime.")
  private Integer lifetimeDaysRecommendation;

 /**
  * List of point estimations for different budget scenarios.
  */
  @ApiModelProperty(value = "List of point estimations for different budget scenarios.")
  @Valid
  private List<@Valid CampaignPlanningBudgetRecommendationPoint> pointEstimations = new ArrayList<>();
 /**
  * The recommended budget amount.
  * @return budgetRecommendation
  */
  @JsonProperty("budget_recommendation")
  public Integer getBudgetRecommendation() {
    return budgetRecommendation;
  }

  /**
   * Sets the <code>budgetRecommendation</code> property.
   */
 public void setBudgetRecommendation(Integer budgetRecommendation) {
    this.budgetRecommendation = budgetRecommendation;
  }

  /**
   * Sets the <code>budgetRecommendation</code> property.
   */
  public CampaignPlanningBudgetRecommendation budgetRecommendation(Integer budgetRecommendation) {
    this.budgetRecommendation = budgetRecommendation;
    return this;
  }

 /**
  * List of experimental budget recommendations.
  * @return experimentCampaignBudgetRecommendation
  */
  @JsonProperty("experiment_campaign_budget_recommendation")
  public List<@Valid CampaignPlanningExperimentBudgetRecommendation> getExperimentCampaignBudgetRecommendation() {
    return experimentCampaignBudgetRecommendation;
  }

  /**
   * Sets the <code>experimentCampaignBudgetRecommendation</code> property.
   */
 public void setExperimentCampaignBudgetRecommendation(List<@Valid CampaignPlanningExperimentBudgetRecommendation> experimentCampaignBudgetRecommendation) {
    this.experimentCampaignBudgetRecommendation = experimentCampaignBudgetRecommendation;
  }

  /**
   * Sets the <code>experimentCampaignBudgetRecommendation</code> property.
   */
  public CampaignPlanningBudgetRecommendation experimentCampaignBudgetRecommendation(List<@Valid CampaignPlanningExperimentBudgetRecommendation> experimentCampaignBudgetRecommendation) {
    this.experimentCampaignBudgetRecommendation = experimentCampaignBudgetRecommendation;
    return this;
  }

  /**
   * Adds a new item to the <code>experimentCampaignBudgetRecommendation</code> list.
   */
  public CampaignPlanningBudgetRecommendation addExperimentCampaignBudgetRecommendationItem(CampaignPlanningExperimentBudgetRecommendation experimentCampaignBudgetRecommendationItem) {
    this.experimentCampaignBudgetRecommendation.add(experimentCampaignBudgetRecommendationItem);
    return this;
  }

 /**
  * Recommended number of days for the campaign lifetime.
  * @return lifetimeDaysRecommendation
  */
  @JsonProperty("lifetime_days_recommendation")
  public Integer getLifetimeDaysRecommendation() {
    return lifetimeDaysRecommendation;
  }

  /**
   * Sets the <code>lifetimeDaysRecommendation</code> property.
   */
 public void setLifetimeDaysRecommendation(Integer lifetimeDaysRecommendation) {
    this.lifetimeDaysRecommendation = lifetimeDaysRecommendation;
  }

  /**
   * Sets the <code>lifetimeDaysRecommendation</code> property.
   */
  public CampaignPlanningBudgetRecommendation lifetimeDaysRecommendation(Integer lifetimeDaysRecommendation) {
    this.lifetimeDaysRecommendation = lifetimeDaysRecommendation;
    return this;
  }

 /**
  * List of point estimations for different budget scenarios.
  * @return pointEstimations
  */
  @JsonProperty("point_estimations")
  public List<@Valid CampaignPlanningBudgetRecommendationPoint> getPointEstimations() {
    return pointEstimations;
  }

  /**
   * Sets the <code>pointEstimations</code> property.
   */
 public void setPointEstimations(List<@Valid CampaignPlanningBudgetRecommendationPoint> pointEstimations) {
    this.pointEstimations = pointEstimations;
  }

  /**
   * Sets the <code>pointEstimations</code> property.
   */
  public CampaignPlanningBudgetRecommendation pointEstimations(List<@Valid CampaignPlanningBudgetRecommendationPoint> pointEstimations) {
    this.pointEstimations = pointEstimations;
    return this;
  }

  /**
   * Adds a new item to the <code>pointEstimations</code> list.
   */
  public CampaignPlanningBudgetRecommendation addPointEstimationsItem(CampaignPlanningBudgetRecommendationPoint pointEstimationsItem) {
    this.pointEstimations.add(pointEstimationsItem);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

