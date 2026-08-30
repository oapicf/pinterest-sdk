package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignDeliveryEstimatesDerivedMetrics;
import org.openapitools.model.CampaignPlanningCurveEstimate;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Delivery estimates response for a campaign.
 */
@ApiModel(description="Delivery estimates response for a campaign.")

public class CampaignDeliveryEstimatesResponse  {
  
 /**
  * Estimated curves. Each curve will pertain to a single estimation type.
  */
  @ApiModelProperty(value = "Estimated curves. Each curve will pertain to a single estimation type.")

  private List<CampaignPlanningCurveEstimate> curves = new ArrayList<>();

  @ApiModelProperty(value = "")

  private CampaignDeliveryEstimatesDerivedMetrics derivedMetrics;

 /**
  * Maximum potential spend estimate.
  */
  @ApiModelProperty(example = "50000000", value = "Maximum potential spend estimate.")

  private Integer maxPotentialSpend;
 /**
   * Estimated curves. Each curve will pertain to a single estimation type.
   * @return curves
  **/
  @JsonProperty("curves")
  public List<CampaignPlanningCurveEstimate> getCurves() {
    return curves;
  }

  public void setCurves(List<CampaignPlanningCurveEstimate> curves) {
    this.curves = curves;
  }

  public CampaignDeliveryEstimatesResponse curves(List<CampaignPlanningCurveEstimate> curves) {
    this.curves = curves;
    return this;
  }

  public CampaignDeliveryEstimatesResponse addCurvesItem(CampaignPlanningCurveEstimate curvesItem) {
    this.curves.add(curvesItem);
    return this;
  }

 /**
   * Get derivedMetrics
   * @return derivedMetrics
  **/
  @JsonProperty("derived_metrics")
  public CampaignDeliveryEstimatesDerivedMetrics getDerivedMetrics() {
    return derivedMetrics;
  }

  public void setDerivedMetrics(CampaignDeliveryEstimatesDerivedMetrics derivedMetrics) {
    this.derivedMetrics = derivedMetrics;
  }

  public CampaignDeliveryEstimatesResponse derivedMetrics(CampaignDeliveryEstimatesDerivedMetrics derivedMetrics) {
    this.derivedMetrics = derivedMetrics;
    return this;
  }

 /**
   * Maximum potential spend estimate.
   * @return maxPotentialSpend
  **/
  @JsonProperty("max_potential_spend")
  public Integer getMaxPotentialSpend() {
    return maxPotentialSpend;
  }

  public void setMaxPotentialSpend(Integer maxPotentialSpend) {
    this.maxPotentialSpend = maxPotentialSpend;
  }

  public CampaignDeliveryEstimatesResponse maxPotentialSpend(Integer maxPotentialSpend) {
    this.maxPotentialSpend = maxPotentialSpend;
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
    CampaignDeliveryEstimatesResponse campaignDeliveryEstimatesResponse = (CampaignDeliveryEstimatesResponse) o;
    return Objects.equals(this.curves, campaignDeliveryEstimatesResponse.curves) &&
        Objects.equals(this.derivedMetrics, campaignDeliveryEstimatesResponse.derivedMetrics) &&
        Objects.equals(this.maxPotentialSpend, campaignDeliveryEstimatesResponse.maxPotentialSpend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(curves, derivedMetrics, maxPotentialSpend);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignDeliveryEstimatesResponse {\n");
    
    sb.append("    curves: ").append(toIndentedString(curves)).append("\n");
    sb.append("    derivedMetrics: ").append(toIndentedString(derivedMetrics)).append("\n");
    sb.append("    maxPotentialSpend: ").append(toIndentedString(maxPotentialSpend)).append("\n");
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

