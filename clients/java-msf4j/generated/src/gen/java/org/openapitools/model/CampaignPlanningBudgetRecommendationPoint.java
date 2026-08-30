package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CampaignPlanningEstimationType;
import org.openapitools.model.CampaignPlanningPointEstimate;

/**
 * A point estimation containing the estimate data and estimation type for a budget recommendation.
 */
@ApiModel(description = "A point estimation containing the estimate data and estimation type for a budget recommendation.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignPlanningBudgetRecommendationPoint   {
  @JsonProperty("estimation_type")
  private CampaignPlanningEstimationType estimationType;

  @JsonProperty("point_estimate")
  private CampaignPlanningPointEstimate pointEstimate;

  public CampaignPlanningBudgetRecommendationPoint estimationType(CampaignPlanningEstimationType estimationType) {
    this.estimationType = estimationType;
    return this;
  }

   /**
   * Estimation type for this point.
   * @return estimationType
  **/
  @ApiModelProperty(value = "Estimation type for this point.")
  public CampaignPlanningEstimationType getEstimationType() {
    return estimationType;
  }

  public void setEstimationType(CampaignPlanningEstimationType estimationType) {
    this.estimationType = estimationType;
  }

  public CampaignPlanningBudgetRecommendationPoint pointEstimate(CampaignPlanningPointEstimate pointEstimate) {
    this.pointEstimate = pointEstimate;
    return this;
  }

   /**
   * Point estimate data.
   * @return pointEstimate
  **/
  @ApiModelProperty(value = "Point estimate data.")
  public CampaignPlanningPointEstimate getPointEstimate() {
    return pointEstimate;
  }

  public void setPointEstimate(CampaignPlanningPointEstimate pointEstimate) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

