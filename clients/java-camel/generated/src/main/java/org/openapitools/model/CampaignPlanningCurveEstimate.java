package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignPlanningEstimationType;
import org.openapitools.model.CampaignPlanningPointEstimate;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CampaignPlanningCurveEstimate
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignPlanningCurveEstimate {

  private CampaignPlanningEstimationType estimationType;

  @Valid
  private List<@Valid CampaignPlanningPointEstimate> points = new ArrayList<>();

  public CampaignPlanningCurveEstimate estimationType(CampaignPlanningEstimationType estimationType) {
    this.estimationType = estimationType;
    return this;
  }

  /**
   * Estimation type for campaign planning estimated curve
   * @return estimationType
   */
  @Valid 
  @Schema(name = "estimation_type", example = "IMPRESSION", description = "Estimation type for campaign planning estimated curve", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimation_type")
  public CampaignPlanningEstimationType getEstimationType() {
    return estimationType;
  }

  public void setEstimationType(CampaignPlanningEstimationType estimationType) {
    this.estimationType = estimationType;
  }

  public CampaignPlanningCurveEstimate points(List<@Valid CampaignPlanningPointEstimate> points) {
    this.points = points;
    return this;
  }

  public CampaignPlanningCurveEstimate addPointsItem(CampaignPlanningPointEstimate pointsItem) {
    if (this.points == null) {
      this.points = new ArrayList<>();
    }
    this.points.add(pointsItem);
    return this;
  }

  /**
   * The estimation points that make up the estimated curve.
   * @return points
   */
  @Valid @Size(max = 100) 
  @Schema(name = "points", description = "The estimation points that make up the estimated curve.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("points")
  public List<@Valid CampaignPlanningPointEstimate> getPoints() {
    return points;
  }

  public void setPoints(List<@Valid CampaignPlanningPointEstimate> points) {
    this.points = points;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignPlanningCurveEstimate campaignPlanningCurveEstimate = (CampaignPlanningCurveEstimate) o;
    return Objects.equals(this.estimationType, campaignPlanningCurveEstimate.estimationType) &&
        Objects.equals(this.points, campaignPlanningCurveEstimate.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimationType, points);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignPlanningCurveEstimate {\n");
    sb.append("    estimationType: ").append(toIndentedString(estimationType)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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

