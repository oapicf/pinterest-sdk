package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignDeliveryEstimatesDerivedMetrics;
import org.openapitools.model.CampaignPlanningCurveEstimate;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Delivery estimates response for a campaign.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-08-30T09:54:43.403996865Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignDeliveryEstimatesResponse   {
  
  private List<@Valid CampaignPlanningCurveEstimate> curves = new ArrayList<>();
  private CampaignDeliveryEstimatesDerivedMetrics derivedMetrics;
  private Integer maxPotentialSpend;

  /**
   * Estimated curves. Each curve will pertain to a single estimation type.
   **/
  
  @ApiModelProperty(value = "Estimated curves. Each curve will pertain to a single estimation type.")
  @JsonProperty("curves")
 @Size(max=20)  public List<@Valid CampaignPlanningCurveEstimate> getCurves() {
    return curves;
  }
  public void setCurves(List<@Valid CampaignPlanningCurveEstimate> curves) {
    this.curves = curves;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("derived_metrics")
  public CampaignDeliveryEstimatesDerivedMetrics getDerivedMetrics() {
    return derivedMetrics;
  }
  public void setDerivedMetrics(CampaignDeliveryEstimatesDerivedMetrics derivedMetrics) {
    this.derivedMetrics = derivedMetrics;
  }

  /**
   * Maximum potential spend estimate.
   **/
  
  @ApiModelProperty(example = "50000000", value = "Maximum potential spend estimate.")
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

