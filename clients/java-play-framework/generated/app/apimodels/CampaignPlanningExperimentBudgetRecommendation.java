package apimodels;

import apimodels.CampaignPlanningBudgetRecommendationPoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Experimental budget recommendation for a single experiment version.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CampaignPlanningExperimentBudgetRecommendation   {
  @JsonProperty("budget_recommendation")
  
  private Integer budgetRecommendation;

  @JsonProperty("lifetime_days_recommendation")
  
  private Integer lifetimeDaysRecommendation;

  @JsonProperty("point_estimations")
  @Valid

  private List<@Valid CampaignPlanningBudgetRecommendationPoint> pointEstimations = null;

  @JsonProperty("version_id")
  
  private String versionId;

  public CampaignPlanningExperimentBudgetRecommendation budgetRecommendation(Integer budgetRecommendation) {
    this.budgetRecommendation = budgetRecommendation;
    return this;
  }

   /**
   * Recommended budget for this experiment version.
   * @return budgetRecommendation
  **/
  public Integer getBudgetRecommendation() {
    return budgetRecommendation;
  }

  public void setBudgetRecommendation(Integer budgetRecommendation) {
    this.budgetRecommendation = budgetRecommendation;
  }

  public CampaignPlanningExperimentBudgetRecommendation lifetimeDaysRecommendation(Integer lifetimeDaysRecommendation) {
    this.lifetimeDaysRecommendation = lifetimeDaysRecommendation;
    return this;
  }

   /**
   * Recommended lifetime days for this experiment.
   * @return lifetimeDaysRecommendation
  **/
  public Integer getLifetimeDaysRecommendation() {
    return lifetimeDaysRecommendation;
  }

  public void setLifetimeDaysRecommendation(Integer lifetimeDaysRecommendation) {
    this.lifetimeDaysRecommendation = lifetimeDaysRecommendation;
  }

  public CampaignPlanningExperimentBudgetRecommendation pointEstimations(List<@Valid CampaignPlanningBudgetRecommendationPoint> pointEstimations) {
    this.pointEstimations = pointEstimations;
    return this;
  }

  public CampaignPlanningExperimentBudgetRecommendation addPointEstimationsItem(CampaignPlanningBudgetRecommendationPoint pointEstimationsItem) {
    if (this.pointEstimations == null) {
      this.pointEstimations = new ArrayList<>();
    }
    this.pointEstimations.add(pointEstimationsItem);
    return this;
  }

   /**
   * Point estimations for this experiment version.
   * @return pointEstimations
  **/
  public List<@Valid CampaignPlanningBudgetRecommendationPoint> getPointEstimations() {
    return pointEstimations;
  }

  public void setPointEstimations(List<@Valid CampaignPlanningBudgetRecommendationPoint> pointEstimations) {
    this.pointEstimations = pointEstimations;
  }

  public CampaignPlanningExperimentBudgetRecommendation versionId(String versionId) {
    this.versionId = versionId;
    return this;
  }

   /**
   * Version identifier for the experiment.
   * @return versionId
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

