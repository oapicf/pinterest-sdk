package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignDeliveryEstimatesDerivedMetrics;
import org.openapitools.model.CampaignPlanningCurveEstimate;

/**
 * Delivery estimates response for a campaign.
 */
@ApiModel(description = "Delivery estimates response for a campaign.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignDeliveryEstimatesResponse   {
  @JsonProperty("curves")
  private List<@Valid CampaignPlanningCurveEstimate> curves = null;

  @JsonProperty("derived_metrics")
  private CampaignDeliveryEstimatesDerivedMetrics derivedMetrics;

  @JsonProperty("max_potential_spend")
  private Integer maxPotentialSpend;

  public CampaignDeliveryEstimatesResponse curves(List<@Valid CampaignPlanningCurveEstimate> curves) {
    this.curves = curves;
    return this;
  }

  public CampaignDeliveryEstimatesResponse addCurvesItem(CampaignPlanningCurveEstimate curvesItem) {
    if (this.curves == null) {
      this.curves = new ArrayList<>();
    }
    this.curves.add(curvesItem);
    return this;
  }

   /**
   * Estimated curves. Each curve will pertain to a single estimation type.
   * @return curves
  **/
  @ApiModelProperty(value = "Estimated curves. Each curve will pertain to a single estimation type.")
  public List<@Valid CampaignPlanningCurveEstimate> getCurves() {
    return curves;
  }

  public void setCurves(List<@Valid CampaignPlanningCurveEstimate> curves) {
    this.curves = curves;
  }

  public CampaignDeliveryEstimatesResponse derivedMetrics(CampaignDeliveryEstimatesDerivedMetrics derivedMetrics) {
    this.derivedMetrics = derivedMetrics;
    return this;
  }

   /**
   * Get derivedMetrics
   * @return derivedMetrics
  **/
  @ApiModelProperty(value = "")
  public CampaignDeliveryEstimatesDerivedMetrics getDerivedMetrics() {
    return derivedMetrics;
  }

  public void setDerivedMetrics(CampaignDeliveryEstimatesDerivedMetrics derivedMetrics) {
    this.derivedMetrics = derivedMetrics;
  }

  public CampaignDeliveryEstimatesResponse maxPotentialSpend(Integer maxPotentialSpend) {
    this.maxPotentialSpend = maxPotentialSpend;
    return this;
  }

   /**
   * Maximum potential spend estimate.
   * @return maxPotentialSpend
  **/
  @ApiModelProperty(example = "50000000", value = "Maximum potential spend estimate.")
  public Integer getMaxPotentialSpend() {
    return maxPotentialSpend;
  }

  public void setMaxPotentialSpend(Integer maxPotentialSpend) {
    this.maxPotentialSpend = maxPotentialSpend;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

