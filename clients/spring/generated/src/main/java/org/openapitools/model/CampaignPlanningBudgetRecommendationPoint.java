package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.CampaignPlanningEstimationType;
import org.openapitools.model.CampaignPlanningPointEstimate;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A point estimation containing the estimate data and estimation type for a budget recommendation.
 */

@Schema(name = "CampaignPlanningBudgetRecommendationPoint", description = "A point estimation containing the estimate data and estimation type for a budget recommendation.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignPlanningBudgetRecommendationPoint {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CampaignPlanningEstimationType estimationType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CampaignPlanningPointEstimate pointEstimate;

  public CampaignPlanningBudgetRecommendationPoint estimationType(@Nullable CampaignPlanningEstimationType estimationType) {
    this.estimationType = estimationType;
    return this;
  }

  /**
   * Estimation type for this point.
   * @return estimationType
   */
  @Valid 
  @Schema(name = "estimation_type", description = "Estimation type for this point.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimation_type")
  public @Nullable CampaignPlanningEstimationType getEstimationType() {
    return estimationType;
  }

  @JsonProperty("estimation_type")
  public void setEstimationType(@Nullable CampaignPlanningEstimationType estimationType) {
    this.estimationType = estimationType;
  }

  public CampaignPlanningBudgetRecommendationPoint pointEstimate(@Nullable CampaignPlanningPointEstimate pointEstimate) {
    this.pointEstimate = pointEstimate;
    return this;
  }

  /**
   * Point estimate data.
   * @return pointEstimate
   */
  @Valid 
  @Schema(name = "point_estimate", description = "Point estimate data.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("point_estimate")
  public @Nullable CampaignPlanningPointEstimate getPointEstimate() {
    return pointEstimate;
  }

  @JsonProperty("point_estimate")
  public void setPointEstimate(@Nullable CampaignPlanningPointEstimate pointEstimate) {
    this.pointEstimate = pointEstimate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignPlanningBudgetRecommendationPoint campaignPlanningBudgetRecommendationPoint = (CampaignPlanningBudgetRecommendationPoint) o;
    return Objects.equals(this.estimationType, campaignPlanningBudgetRecommendationPoint.estimationType) &&
        Objects.equals(this.pointEstimate, campaignPlanningBudgetRecommendationPoint.pointEstimate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimationType, pointEstimate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignPlanningBudgetRecommendationPoint {\n");
    sb.append("    estimationType: ").append(toIndentedString(estimationType)).append("\n");
    sb.append("    pointEstimate: ").append(toIndentedString(pointEstimate)).append("\n");
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

