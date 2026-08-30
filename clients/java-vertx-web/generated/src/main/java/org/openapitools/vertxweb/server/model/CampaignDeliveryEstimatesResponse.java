package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.CampaignDeliveryEstimatesDerivedMetrics;
import org.openapitools.vertxweb.server.model.CampaignPlanningCurveEstimate;

/**
 * Delivery estimates response for a campaign.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignDeliveryEstimatesResponse   {
  
  private List<CampaignPlanningCurveEstimate> curves = new ArrayList<>();
  private CampaignDeliveryEstimatesDerivedMetrics derivedMetrics;
  private Integer maxPotentialSpend;

  public CampaignDeliveryEstimatesResponse () {

  }

  public CampaignDeliveryEstimatesResponse (List<CampaignPlanningCurveEstimate> curves, CampaignDeliveryEstimatesDerivedMetrics derivedMetrics, Integer maxPotentialSpend) {
    this.curves = curves;
    this.derivedMetrics = derivedMetrics;
    this.maxPotentialSpend = maxPotentialSpend;
  }

    
  @JsonProperty("curves")
  public List<CampaignPlanningCurveEstimate> getCurves() {
    return curves;
  }
  public void setCurves(List<CampaignPlanningCurveEstimate> curves) {
    this.curves = curves;
  }

    
  @JsonProperty("derived_metrics")
  public CampaignDeliveryEstimatesDerivedMetrics getDerivedMetrics() {
    return derivedMetrics;
  }
  public void setDerivedMetrics(CampaignDeliveryEstimatesDerivedMetrics derivedMetrics) {
    this.derivedMetrics = derivedMetrics;
  }

    
  @JsonProperty("max_potential_spend")
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
    return Objects.equals(curves, campaignDeliveryEstimatesResponse.curves) &&
        Objects.equals(derivedMetrics, campaignDeliveryEstimatesResponse.derivedMetrics) &&
        Objects.equals(maxPotentialSpend, campaignDeliveryEstimatesResponse.maxPotentialSpend);
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
