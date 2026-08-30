package org.openapitools.model;

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
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Delivery estimates response for a campaign.
 **/
@ApiModel(description = "Delivery estimates response for a campaign.")
@JsonTypeName("CampaignDeliveryEstimatesResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignDeliveryEstimatesResponse   {
  private @Valid List<@Valid CampaignPlanningCurveEstimate> curves = new ArrayList<>();
  private CampaignDeliveryEstimatesDerivedMetrics derivedMetrics;
  private Integer maxPotentialSpend;

  public CampaignDeliveryEstimatesResponse() {
  }

  /**
   * Estimated curves. Each curve will pertain to a single estimation type.
   **/
  public CampaignDeliveryEstimatesResponse curves(List<@Valid CampaignPlanningCurveEstimate> curves) {
    this.curves = curves;
    return this;
  }

  
  @ApiModelProperty(value = "Estimated curves. Each curve will pertain to a single estimation type.")
  @JsonProperty("curves")
  @Valid  @Size(max=20)public List<@Valid CampaignPlanningCurveEstimate> getCurves() {
    return curves;
  }

  @JsonProperty("curves")
  public void setCurves(List<@Valid CampaignPlanningCurveEstimate> curves) {
    this.curves = curves;
  }

  public CampaignDeliveryEstimatesResponse addCurvesItem(CampaignPlanningCurveEstimate curvesItem) {
    if (this.curves == null) {
      this.curves = new ArrayList<>();
    }

    this.curves.add(curvesItem);
    return this;
  }

  public CampaignDeliveryEstimatesResponse removeCurvesItem(CampaignPlanningCurveEstimate curvesItem) {
    if (curvesItem != null && this.curves != null) {
      this.curves.remove(curvesItem);
    }

    return this;
  }
  /**
   **/
  public CampaignDeliveryEstimatesResponse derivedMetrics(CampaignDeliveryEstimatesDerivedMetrics derivedMetrics) {
    this.derivedMetrics = derivedMetrics;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("derived_metrics")
  @Valid public CampaignDeliveryEstimatesDerivedMetrics getDerivedMetrics() {
    return derivedMetrics;
  }

  @JsonProperty("derived_metrics")
  public void setDerivedMetrics(CampaignDeliveryEstimatesDerivedMetrics derivedMetrics) {
    this.derivedMetrics = derivedMetrics;
  }

  /**
   * Maximum potential spend estimate.
   **/
  public CampaignDeliveryEstimatesResponse maxPotentialSpend(Integer maxPotentialSpend) {
    this.maxPotentialSpend = maxPotentialSpend;
    return this;
  }

  
  @ApiModelProperty(example = "50000000", value = "Maximum potential spend estimate.")
  @JsonProperty("max_potential_spend")
  public Integer getMaxPotentialSpend() {
    return maxPotentialSpend;
  }

  @JsonProperty("max_potential_spend")
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
