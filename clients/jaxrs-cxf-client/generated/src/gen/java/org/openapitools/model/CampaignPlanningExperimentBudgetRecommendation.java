package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignPlanningBudgetRecommendationPoint;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Experimental budget recommendation for a single experiment version.
 */
@ApiModel(description="Experimental budget recommendation for a single experiment version.")

public class CampaignPlanningExperimentBudgetRecommendation  {
  
 /**
  * Recommended budget for this experiment version.
  */
  @ApiModelProperty(example = "5500000", value = "Recommended budget for this experiment version.")

  private Integer budgetRecommendation;

 /**
  * Recommended lifetime days for this experiment.
  */
  @ApiModelProperty(example = "35", value = "Recommended lifetime days for this experiment.")

  private Integer lifetimeDaysRecommendation;

 /**
  * Point estimations for this experiment version.
  */
  @ApiModelProperty(value = "Point estimations for this experiment version.")

  private List<CampaignPlanningBudgetRecommendationPoint> pointEstimations = new ArrayList<>();

 /**
  * Version identifier for the experiment.
  */
  @ApiModelProperty(value = "Version identifier for the experiment.")

  private String versionId;
 /**
   * Recommended budget for this experiment version.
   * @return budgetRecommendation
  **/
  @JsonProperty("budget_recommendation")
  public Integer getBudgetRecommendation() {
    return budgetRecommendation;
  }

  public void setBudgetRecommendation(Integer budgetRecommendation) {
    this.budgetRecommendation = budgetRecommendation;
  }

  public CampaignPlanningExperimentBudgetRecommendation budgetRecommendation(Integer budgetRecommendation) {
    this.budgetRecommendation = budgetRecommendation;
    return this;
  }

 /**
   * Recommended lifetime days for this experiment.
   * @return lifetimeDaysRecommendation
  **/
  @JsonProperty("lifetime_days_recommendation")
  public Integer getLifetimeDaysRecommendation() {
    return lifetimeDaysRecommendation;
  }

  public void setLifetimeDaysRecommendation(Integer lifetimeDaysRecommendation) {
    this.lifetimeDaysRecommendation = lifetimeDaysRecommendation;
  }

  public CampaignPlanningExperimentBudgetRecommendation lifetimeDaysRecommendation(Integer lifetimeDaysRecommendation) {
    this.lifetimeDaysRecommendation = lifetimeDaysRecommendation;
    return this;
  }

 /**
   * Point estimations for this experiment version.
   * @return pointEstimations
  **/
  @JsonProperty("point_estimations")
  public List<CampaignPlanningBudgetRecommendationPoint> getPointEstimations() {
    return pointEstimations;
  }

  public void setPointEstimations(List<CampaignPlanningBudgetRecommendationPoint> pointEstimations) {
    this.pointEstimations = pointEstimations;
  }

  public CampaignPlanningExperimentBudgetRecommendation pointEstimations(List<CampaignPlanningBudgetRecommendationPoint> pointEstimations) {
    this.pointEstimations = pointEstimations;
    return this;
  }

  public CampaignPlanningExperimentBudgetRecommendation addPointEstimationsItem(CampaignPlanningBudgetRecommendationPoint pointEstimationsItem) {
    this.pointEstimations.add(pointEstimationsItem);
    return this;
  }

 /**
   * Version identifier for the experiment.
   * @return versionId
  **/
  @JsonProperty("version_id")
  public String getVersionId() {
    return versionId;
  }

  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }

  public CampaignPlanningExperimentBudgetRecommendation versionId(String versionId) {
    this.versionId = versionId;
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
    CampaignPlanningExperimentBudgetRecommendation campaignPlanningExperimentBudgetRecommendation = (CampaignPlanningExperimentBudgetRecommendation) o;
    return Objects.equals(this.budgetRecommendation, campaignPlanningExperimentBudgetRecommendation.budgetRecommendation) &&
        Objects.equals(this.lifetimeDaysRecommendation, campaignPlanningExperimentBudgetRecommendation.lifetimeDaysRecommendation) &&
        Objects.equals(this.pointEstimations, campaignPlanningExperimentBudgetRecommendation.pointEstimations) &&
        Objects.equals(this.versionId, campaignPlanningExperimentBudgetRecommendation.versionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budgetRecommendation, lifetimeDaysRecommendation, pointEstimations, versionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignPlanningExperimentBudgetRecommendation {\n");
    
    sb.append("    budgetRecommendation: ").append(toIndentedString(budgetRecommendation)).append("\n");
    sb.append("    lifetimeDaysRecommendation: ").append(toIndentedString(lifetimeDaysRecommendation)).append("\n");
    sb.append("    pointEstimations: ").append(toIndentedString(pointEstimations)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
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

