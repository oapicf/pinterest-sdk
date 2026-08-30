package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignPlanningBudgetRecommendationPoint;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Experimental budget recommendation for a single experiment version.
 **/
@ApiModel(description = "Experimental budget recommendation for a single experiment version.")
@JsonTypeName("CampaignPlanningExperimentBudgetRecommendation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignPlanningExperimentBudgetRecommendation   {
  private Integer budgetRecommendation;
  private Integer lifetimeDaysRecommendation;
  private @Valid List<@Valid CampaignPlanningBudgetRecommendationPoint> pointEstimations = new ArrayList<>();
  private String versionId;

  public CampaignPlanningExperimentBudgetRecommendation() {
  }

  /**
   * Recommended budget for this experiment version.
   **/
  public CampaignPlanningExperimentBudgetRecommendation budgetRecommendation(Integer budgetRecommendation) {
    this.budgetRecommendation = budgetRecommendation;
    return this;
  }

  
  @ApiModelProperty(example = "5500000", value = "Recommended budget for this experiment version.")
  @JsonProperty("budget_recommendation")
  public Integer getBudgetRecommendation() {
    return budgetRecommendation;
  }

  @JsonProperty("budget_recommendation")
  public void setBudgetRecommendation(Integer budgetRecommendation) {
    this.budgetRecommendation = budgetRecommendation;
  }

  /**
   * Recommended lifetime days for this experiment.
   **/
  public CampaignPlanningExperimentBudgetRecommendation lifetimeDaysRecommendation(Integer lifetimeDaysRecommendation) {
    this.lifetimeDaysRecommendation = lifetimeDaysRecommendation;
    return this;
  }

  
  @ApiModelProperty(example = "35", value = "Recommended lifetime days for this experiment.")
  @JsonProperty("lifetime_days_recommendation")
  public Integer getLifetimeDaysRecommendation() {
    return lifetimeDaysRecommendation;
  }

  @JsonProperty("lifetime_days_recommendation")
  public void setLifetimeDaysRecommendation(Integer lifetimeDaysRecommendation) {
    this.lifetimeDaysRecommendation = lifetimeDaysRecommendation;
  }

  /**
   * Point estimations for this experiment version.
   **/
  public CampaignPlanningExperimentBudgetRecommendation pointEstimations(List<@Valid CampaignPlanningBudgetRecommendationPoint> pointEstimations) {
    this.pointEstimations = pointEstimations;
    return this;
  }

  
  @ApiModelProperty(value = "Point estimations for this experiment version.")
  @JsonProperty("point_estimations")
  @Valid public List<@Valid CampaignPlanningBudgetRecommendationPoint> getPointEstimations() {
    return pointEstimations;
  }

  @JsonProperty("point_estimations")
  public void setPointEstimations(List<@Valid CampaignPlanningBudgetRecommendationPoint> pointEstimations) {
    this.pointEstimations = pointEstimations;
  }

  public CampaignPlanningExperimentBudgetRecommendation addPointEstimationsItem(CampaignPlanningBudgetRecommendationPoint pointEstimationsItem) {
    if (this.pointEstimations == null) {
      this.pointEstimations = new ArrayList<>();
    }

    this.pointEstimations.add(pointEstimationsItem);
    return this;
  }

  public CampaignPlanningExperimentBudgetRecommendation removePointEstimationsItem(CampaignPlanningBudgetRecommendationPoint pointEstimationsItem) {
    if (pointEstimationsItem != null && this.pointEstimations != null) {
      this.pointEstimations.remove(pointEstimationsItem);
    }

    return this;
  }
  /**
   * Version identifier for the experiment.
   **/
  public CampaignPlanningExperimentBudgetRecommendation versionId(String versionId) {
    this.versionId = versionId;
    return this;
  }

  
  @ApiModelProperty(value = "Version identifier for the experiment.")
  @JsonProperty("version_id")
  public String getVersionId() {
    return versionId;
  }

  @JsonProperty("version_id")
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
