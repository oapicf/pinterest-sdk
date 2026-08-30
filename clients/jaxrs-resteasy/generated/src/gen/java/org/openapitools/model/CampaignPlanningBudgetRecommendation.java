package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignPlanningBudgetRecommendationPoint;
import org.openapitools.model.CampaignPlanningExperimentBudgetRecommendation;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Budget recommendation response containing recommended budget, estimated days, and point estimations.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignPlanningBudgetRecommendation   {
  
  private Integer budgetRecommendation;
  private List<@Valid CampaignPlanningExperimentBudgetRecommendation> experimentCampaignBudgetRecommendation = new ArrayList<>();
  private Integer lifetimeDaysRecommendation;
  private List<@Valid CampaignPlanningBudgetRecommendationPoint> pointEstimations = new ArrayList<>();

  /**
   * The recommended budget amount.
   **/
  
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
  
  @ApiModelProperty(value = "List of experimental budget recommendations.")
  @JsonProperty("experiment_campaign_budget_recommendation")
  @Valid
  public List<@Valid CampaignPlanningExperimentBudgetRecommendation> getExperimentCampaignBudgetRecommendation() {
    return experimentCampaignBudgetRecommendation;
  }
  public void setExperimentCampaignBudgetRecommendation(List<@Valid CampaignPlanningExperimentBudgetRecommendation> experimentCampaignBudgetRecommendation) {
    this.experimentCampaignBudgetRecommendation = experimentCampaignBudgetRecommendation;
  }

  /**
   * Recommended number of days for the campaign lifetime.
   **/
  
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
  
  @ApiModelProperty(value = "List of point estimations for different budget scenarios.")
  @JsonProperty("point_estimations")
  @Valid
  public List<@Valid CampaignPlanningBudgetRecommendationPoint> getPointEstimations() {
    return pointEstimations;
  }
  public void setPointEstimations(List<@Valid CampaignPlanningBudgetRecommendationPoint> pointEstimations) {
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

