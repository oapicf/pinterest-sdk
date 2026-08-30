package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignPlanningEstimationType;
import org.openapitools.model.CampaignPlanningPointEstimate;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("CampaignPlanningCurveEstimate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignPlanningCurveEstimate   {
  private CampaignPlanningEstimationType estimationType;
  private @Valid List<@Valid CampaignPlanningPointEstimate> points = new ArrayList<>();

  public CampaignPlanningCurveEstimate() {
  }

  /**
   * Estimation type for campaign planning estimated curve
   **/
  public CampaignPlanningCurveEstimate estimationType(CampaignPlanningEstimationType estimationType) {
    this.estimationType = estimationType;
    return this;
  }

  
  @ApiModelProperty(example = "IMPRESSION", value = "Estimation type for campaign planning estimated curve")
  @JsonProperty("estimation_type")
  public CampaignPlanningEstimationType getEstimationType() {
    return estimationType;
  }

  @JsonProperty("estimation_type")
  public void setEstimationType(CampaignPlanningEstimationType estimationType) {
    this.estimationType = estimationType;
  }

  /**
   * The estimation points that make up the estimated curve.
   **/
  public CampaignPlanningCurveEstimate points(List<@Valid CampaignPlanningPointEstimate> points) {
    this.points = points;
    return this;
  }

  
  @ApiModelProperty(value = "The estimation points that make up the estimated curve.")
  @JsonProperty("points")
  @Valid  @Size(max=100)public List<@Valid CampaignPlanningPointEstimate> getPoints() {
    return points;
  }

  @JsonProperty("points")
  public void setPoints(List<@Valid CampaignPlanningPointEstimate> points) {
    this.points = points;
  }

  public CampaignPlanningCurveEstimate addPointsItem(CampaignPlanningPointEstimate pointsItem) {
    if (this.points == null) {
      this.points = new ArrayList<>();
    }

    this.points.add(pointsItem);
    return this;
  }

  public CampaignPlanningCurveEstimate removePointsItem(CampaignPlanningPointEstimate pointsItem) {
    if (pointsItem != null && this.points != null) {
      this.points.remove(pointsItem);
    }

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
