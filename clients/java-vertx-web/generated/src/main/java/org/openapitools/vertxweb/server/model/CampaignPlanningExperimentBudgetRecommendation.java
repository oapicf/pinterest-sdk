package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.CampaignPlanningBudgetRecommendationPoint;

/**
 * Experimental budget recommendation for a single experiment version.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignPlanningExperimentBudgetRecommendation   {
  
  private Integer budgetRecommendation;
  private Integer lifetimeDaysRecommendation;
  private List<CampaignPlanningBudgetRecommendationPoint> pointEstimations = new ArrayList<>();
  private String versionId;

  public CampaignPlanningExperimentBudgetRecommendation () {

  }

  public CampaignPlanningExperimentBudgetRecommendation (Integer budgetRecommendation, Integer lifetimeDaysRecommendation, List<CampaignPlanningBudgetRecommendationPoint> pointEstimations, String versionId) {
    this.budgetRecommendation = budgetRecommendation;
    this.lifetimeDaysRecommendation = lifetimeDaysRecommendation;
    this.pointEstimations = pointEstimations;
    this.versionId = versionId;
  }

    
  @JsonProperty("budget_recommendation")
  public Integer getBudgetRecommendation() {
    return budgetRecommendation;
  }
  public void setBudgetRecommendation(Integer budgetRecommendation) {
    this.budgetRecommendation = budgetRecommendation;
  }

    
  @JsonProperty("lifetime_days_recommendation")
  public Integer getLifetimeDaysRecommendation() {
    return lifetimeDaysRecommendation;
  }
  public void setLifetimeDaysRecommendation(Integer lifetimeDaysRecommendation) {
    this.lifetimeDaysRecommendation = lifetimeDaysRecommendation;
  }

    
  @JsonProperty("point_estimations")
  public List<CampaignPlanningBudgetRecommendationPoint> getPointEstimations() {
    return pointEstimations;
  }
  public void setPointEstimations(List<CampaignPlanningBudgetRecommendationPoint> pointEstimations) {
    this.pointEstimations = pointEstimations;
  }

    
  @JsonProperty("version_id")
  public String getVersionId() {
    return versionId;
  }
  public void setVersionId(String versionId) {
    this.versionId = versionId;
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
    return Objects.equals(budgetRecommendation, campaignPlanningExperimentBudgetRecommendation.budgetRecommendation) &&
        Objects.equals(lifetimeDaysRecommendation, campaignPlanningExperimentBudgetRecommendation.lifetimeDaysRecommendation) &&
        Objects.equals(pointEstimations, campaignPlanningExperimentBudgetRecommendation.pointEstimations) &&
        Objects.equals(versionId, campaignPlanningExperimentBudgetRecommendation.versionId);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
