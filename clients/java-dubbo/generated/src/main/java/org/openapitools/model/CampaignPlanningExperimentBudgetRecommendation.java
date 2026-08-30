package org.openapitools.model;

import org.openapitools.model.CampaignPlanningBudgetRecommendationPoint;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Experimental budget recommendation for a single experiment version.
 */
public class CampaignPlanningExperimentBudgetRecommendation implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Recommended budget for this experiment version.
   */
  @JsonProperty("budget_recommendation")
  private Integer budgetRecommendation;

  /**
   * Recommended lifetime days for this experiment.
   */
  @JsonProperty("lifetime_days_recommendation")
  private Integer lifetimeDaysRecommendation;

  /**
   * Point estimations for this experiment version.
   */
  @JsonProperty("point_estimations")
  private List<CampaignPlanningBudgetRecommendationPoint> pointEstimations = new ArrayList<>();

  /**
   * Version identifier for the experiment.
   */
  @JsonProperty("version_id")
  private String versionId;

  /**
   * Recommended budget for this experiment version.
   * @return budgetRecommendation
   */
  public Integer getBudgetRecommendation() {
    return budgetRecommendation;
  }

  public void setBudgetRecommendation(Integer budgetRecommendation) {
    this.budgetRecommendation = budgetRecommendation;
  }

  /**
   * Recommended lifetime days for this experiment.
   * @return lifetimeDaysRecommendation
   */
  public Integer getLifetimeDaysRecommendation() {
    return lifetimeDaysRecommendation;
  }

  public void setLifetimeDaysRecommendation(Integer lifetimeDaysRecommendation) {
    this.lifetimeDaysRecommendation = lifetimeDaysRecommendation;
  }

  /**
   * Point estimations for this experiment version.
   * @return pointEstimations
   */
  public List<CampaignPlanningBudgetRecommendationPoint> getPointEstimations() {
    return pointEstimations;
  }

  public void setPointEstimations(List<CampaignPlanningBudgetRecommendationPoint> pointEstimations) {
    this.pointEstimations = pointEstimations;
  }

  /**
   * Version identifier for the experiment.
   * @return versionId
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
