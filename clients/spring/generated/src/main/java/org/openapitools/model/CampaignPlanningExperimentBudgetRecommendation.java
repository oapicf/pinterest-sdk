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
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Experimental budget recommendation for a single experiment version.
 */

@Schema(name = "CampaignPlanningExperimentBudgetRecommendation", description = "Experimental budget recommendation for a single experiment version.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignPlanningExperimentBudgetRecommendation {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer budgetRecommendation;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer lifetimeDaysRecommendation;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid CampaignPlanningBudgetRecommendationPoint> pointEstimations = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String versionId;

  public CampaignPlanningExperimentBudgetRecommendation budgetRecommendation(@Nullable Integer budgetRecommendation) {
    this.budgetRecommendation = budgetRecommendation;
    return this;
  }

  /**
   * Recommended budget for this experiment version.
   * @return budgetRecommendation
   */
  
  @Schema(name = "budget_recommendation", example = "5500000", description = "Recommended budget for this experiment version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("budget_recommendation")
  public @Nullable Integer getBudgetRecommendation() {
    return budgetRecommendation;
  }

  @JsonProperty("budget_recommendation")
  public void setBudgetRecommendation(@Nullable Integer budgetRecommendation) {
    this.budgetRecommendation = budgetRecommendation;
  }

  public CampaignPlanningExperimentBudgetRecommendation lifetimeDaysRecommendation(@Nullable Integer lifetimeDaysRecommendation) {
    this.lifetimeDaysRecommendation = lifetimeDaysRecommendation;
    return this;
  }

  /**
   * Recommended lifetime days for this experiment.
   * @return lifetimeDaysRecommendation
   */
  
  @Schema(name = "lifetime_days_recommendation", example = "35", description = "Recommended lifetime days for this experiment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lifetime_days_recommendation")
  public @Nullable Integer getLifetimeDaysRecommendation() {
    return lifetimeDaysRecommendation;
  }

  @JsonProperty("lifetime_days_recommendation")
  public void setLifetimeDaysRecommendation(@Nullable Integer lifetimeDaysRecommendation) {
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
   */
  @Valid 
  @Schema(name = "point_estimations", description = "Point estimations for this experiment version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("point_estimations")
  public List<@Valid CampaignPlanningBudgetRecommendationPoint> getPointEstimations() {
    return pointEstimations;
  }

  @JsonProperty("point_estimations")
  public void setPointEstimations(List<@Valid CampaignPlanningBudgetRecommendationPoint> pointEstimations) {
    this.pointEstimations = pointEstimations;
  }

  public CampaignPlanningExperimentBudgetRecommendation versionId(@Nullable String versionId) {
    this.versionId = versionId;
    return this;
  }

  /**
   * Version identifier for the experiment.
   * @return versionId
   */
  
  @Schema(name = "version_id", description = "Version identifier for the experiment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version_id")
  public @Nullable String getVersionId() {
    return versionId;
  }

  @JsonProperty("version_id")
  public void setVersionId(@Nullable String versionId) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

