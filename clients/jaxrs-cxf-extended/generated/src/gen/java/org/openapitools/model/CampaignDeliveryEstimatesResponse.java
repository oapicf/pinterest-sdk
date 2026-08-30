package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignDeliveryEstimatesDerivedMetrics;
import org.openapitools.model.CampaignPlanningCurveEstimate;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
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
  @Valid
  private List<@Valid CampaignPlanningCurveEstimate> curves = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private CampaignDeliveryEstimatesDerivedMetrics derivedMetrics;

 /**
  * Maximum potential spend estimate.
  */
  @ApiModelProperty(example = "50000000", value = "Maximum potential spend estimate.")
  private Integer maxPotentialSpend;
 /**
  * Estimated curves. Each curve will pertain to a single estimation type.
  * @return curves
  */
  @JsonProperty("curves")
 @Size(max=20)  public List<@Valid CampaignPlanningCurveEstimate> getCurves() {
    return curves;
  }

  /**
   * Sets the <code>curves</code> property.
   */
 public void setCurves(List<@Valid CampaignPlanningCurveEstimate> curves) {
    this.curves = curves;
  }

  /**
   * Sets the <code>curves</code> property.
   */
  public CampaignDeliveryEstimatesResponse curves(List<@Valid CampaignPlanningCurveEstimate> curves) {
    this.curves = curves;
    return this;
  }

  /**
   * Adds a new item to the <code>curves</code> list.
   */
  public CampaignDeliveryEstimatesResponse addCurvesItem(CampaignPlanningCurveEstimate curvesItem) {
    this.curves.add(curvesItem);
    return this;
  }

 /**
  * Get derivedMetrics
  * @return derivedMetrics
  */
  @JsonProperty("derived_metrics")
  public CampaignDeliveryEstimatesDerivedMetrics getDerivedMetrics() {
    return derivedMetrics;
  }

  /**
   * Sets the <code>derivedMetrics</code> property.
   */
 public void setDerivedMetrics(CampaignDeliveryEstimatesDerivedMetrics derivedMetrics) {
    this.derivedMetrics = derivedMetrics;
  }

  /**
   * Sets the <code>derivedMetrics</code> property.
   */
  public CampaignDeliveryEstimatesResponse derivedMetrics(CampaignDeliveryEstimatesDerivedMetrics derivedMetrics) {
    this.derivedMetrics = derivedMetrics;
    return this;
  }

 /**
  * Maximum potential spend estimate.
  * @return maxPotentialSpend
  */
  @JsonProperty("max_potential_spend")
  public Integer getMaxPotentialSpend() {
    return maxPotentialSpend;
  }

  /**
   * Sets the <code>maxPotentialSpend</code> property.
   */
 public void setMaxPotentialSpend(Integer maxPotentialSpend) {
    this.maxPotentialSpend = maxPotentialSpend;
  }

  /**
   * Sets the <code>maxPotentialSpend</code> property.
   */
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

