package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignDeliveryEstimatesDerivedMetrics;
import org.openapitools.model.CampaignPlanningCurveEstimate;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Delivery estimates response for a campaign.
 */

@Schema(name = "CampaignDeliveryEstimatesResponse", description = "Delivery estimates response for a campaign.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignDeliveryEstimatesResponse {

  @Valid
  private List<@Valid CampaignPlanningCurveEstimate> curves = new ArrayList<>();

  private CampaignDeliveryEstimatesDerivedMetrics derivedMetrics;

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
   */
  @Valid @Size(max = 20) 
  @Schema(name = "curves", description = "Estimated curves. Each curve will pertain to a single estimation type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("curves")
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
   */
  @Valid 
  @Schema(name = "derived_metrics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("derived_metrics")
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
   */
  
  @Schema(name = "max_potential_spend", example = "50000000", description = "Maximum potential spend estimate.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

