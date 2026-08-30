package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignPlanningBudgetRecommendationPoint;
import org.openapitools.model.CampaignPlanningExperimentBudgetRecommendation;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Budget recommendation response containing recommended budget, estimated days, and point estimations.
 */

@Schema(name = "CampaignPlanningBudgetRecommendation", description = "Budget recommendation response containing recommended budget, estimated days, and point estimations.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignPlanningBudgetRecommendation {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer budgetRecommendation;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid CampaignPlanningExperimentBudgetRecommendation> experimentCampaignBudgetRecommendation = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer lifetimeDaysRecommendation;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid CampaignPlanningBudgetRecommendationPoint> pointEstimations = new ArrayList<>();

  public CampaignPlanningBudgetRecommendation budgetRecommendation(@Nullable Integer budgetRecommendation) {
    this.budgetRecommendation = budgetRecommendation;
    return this;
  }

  /**
   * The recommended budget amount.
   * @return budgetRecommendation
   */
  
  @Schema(name = "budget_recommendation", example = "5000000", description = "The recommended budget amount.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("budget_recommendation")
  public @Nullable Integer getBudgetRecommendation() {
    return budgetRecommendation;
  }

  @JsonProperty("budget_recommendation")
  public void setBudgetRecommendation(@Nullable Integer budgetRecommendation) {
    this.budgetRecommendation = budgetRecommendation;
  }

  public CampaignPlanningBudgetRecommendation experimentCampaignBudgetRecommendation(List<@Valid CampaignPlanningExperimentBudgetRecommendation> experimentCampaignBudgetRecommendation) {
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
  @Valid 
  @Schema(name = "experiment_campaign_budget_recommendation", description = "List of experimental budget recommendations.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("experiment_campaign_budget_recommendation")
  public List<@Valid CampaignPlanningExperimentBudgetRecommendation> getExperimentCampaignBudgetRecommendation() {
    return experimentCampaignBudgetRecommendation;
  }

  @JsonProperty("experiment_campaign_budget_recommendation")
  public void setExperimentCampaignBudgetRecommendation(List<@Valid CampaignPlanningExperimentBudgetRecommendation> experimentCampaignBudgetRecommendation) {
    this.experimentCampaignBudgetRecommendation = experimentCampaignBudgetRecommendation;
  }

  public CampaignPlanningBudgetRecommendation lifetimeDaysRecommendation(@Nullable Integer lifetimeDaysRecommendation) {
    this.lifetimeDaysRecommendation = lifetimeDaysRecommendation;
    return this;
  }

  /**
   * Recommended number of days for the campaign lifetime.
   * @return lifetimeDaysRecommendation
   */
  
  @Schema(name = "lifetime_days_recommendation", example = "30", description = "Recommended number of days for the campaign lifetime.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lifetime_days_recommendation")
  public @Nullable Integer getLifetimeDaysRecommendation() {
    return lifetimeDaysRecommendation;
  }

  @JsonProperty("lifetime_days_recommendation")
  public void setLifetimeDaysRecommendation(@Nullable Integer lifetimeDaysRecommendation) {
    this.lifetimeDaysRecommendation = lifetimeDaysRecommendation;
  }

  public CampaignPlanningBudgetRecommendation pointEstimations(List<@Valid CampaignPlanningBudgetRecommendationPoint> pointEstimations) {
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
  @Valid 
  @Schema(name = "point_estimations", description = "List of point estimations for different budget scenarios.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("point_estimations")
  public List<@Valid CampaignPlanningBudgetRecommendationPoint> getPointEstimations() {
    return pointEstimations;
  }

  @JsonProperty("point_estimations")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

