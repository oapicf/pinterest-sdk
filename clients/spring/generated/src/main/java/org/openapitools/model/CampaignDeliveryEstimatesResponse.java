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
import org.springframework.lang.Nullable;
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
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignDeliveryEstimatesResponse {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid CampaignPlanningCurveEstimate> curves = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CampaignDeliveryEstimatesDerivedMetrics derivedMetrics;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer maxPotentialSpend;

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

  @JsonProperty("curves")
  public void setCurves(List<@Valid CampaignPlanningCurveEstimate> curves) {
    this.curves = curves;
  }

  public CampaignDeliveryEstimatesResponse derivedMetrics(@Nullable CampaignDeliveryEstimatesDerivedMetrics derivedMetrics) {
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
  public @Nullable CampaignDeliveryEstimatesDerivedMetrics getDerivedMetrics() {
    return derivedMetrics;
  }

  @JsonProperty("derived_metrics")
  public void setDerivedMetrics(@Nullable CampaignDeliveryEstimatesDerivedMetrics derivedMetrics) {
    this.derivedMetrics = derivedMetrics;
  }

  public CampaignDeliveryEstimatesResponse maxPotentialSpend(@Nullable Integer maxPotentialSpend) {
    this.maxPotentialSpend = maxPotentialSpend;
    return this;
  }

  /**
   * Maximum potential spend estimate.
   * @return maxPotentialSpend
   */
  
  @Schema(name = "max_potential_spend", example = "50000000", description = "Maximum potential spend estimate.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max_potential_spend")
  public @Nullable Integer getMaxPotentialSpend() {
    return maxPotentialSpend;
  }

  @JsonProperty("max_potential_spend")
  public void setMaxPotentialSpend(@Nullable Integer maxPotentialSpend) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

