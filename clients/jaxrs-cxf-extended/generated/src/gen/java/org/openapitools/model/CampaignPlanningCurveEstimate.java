package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignPlanningEstimationType;
import org.openapitools.model.CampaignPlanningPointEstimate;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CampaignPlanningCurveEstimate  {
  
 /**
  * Estimation type for campaign planning estimated curve
  */
  @ApiModelProperty(example = "IMPRESSION", value = "Estimation type for campaign planning estimated curve")
  @Valid
  private CampaignPlanningEstimationType estimationType;

 /**
  * The estimation points that make up the estimated curve.
  */
  @ApiModelProperty(value = "The estimation points that make up the estimated curve.")
  @Valid
  private List<@Valid CampaignPlanningPointEstimate> points = new ArrayList<>();
 /**
  * Estimation type for campaign planning estimated curve
  * @return estimationType
  */
  @JsonProperty("estimation_type")
  public CampaignPlanningEstimationType getEstimationType() {
    return estimationType;
  }

  /**
   * Sets the <code>estimationType</code> property.
   */
 public void setEstimationType(CampaignPlanningEstimationType estimationType) {
    this.estimationType = estimationType;
  }

  /**
   * Sets the <code>estimationType</code> property.
   */
  public CampaignPlanningCurveEstimate estimationType(CampaignPlanningEstimationType estimationType) {
    this.estimationType = estimationType;
    return this;
  }

 /**
  * The estimation points that make up the estimated curve.
  * @return points
  */
  @JsonProperty("points")
 @Size(max=100)  public List<@Valid CampaignPlanningPointEstimate> getPoints() {
    return points;
  }

  /**
   * Sets the <code>points</code> property.
   */
 public void setPoints(List<@Valid CampaignPlanningPointEstimate> points) {
    this.points = points;
  }

  /**
   * Sets the <code>points</code> property.
   */
  public CampaignPlanningCurveEstimate points(List<@Valid CampaignPlanningPointEstimate> points) {
    this.points = points;
    return this;
  }

  /**
   * Adds a new item to the <code>points</code> list.
   */
  public CampaignPlanningCurveEstimate addPointsItem(CampaignPlanningPointEstimate pointsItem) {
    this.points.add(pointsItem);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

