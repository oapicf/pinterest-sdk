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
import org.openapitools.model.CampaignPlanningAdGroupAudienceSize;
import org.openapitools.model.CampaignPlanningConversionRate;
import org.openapitools.model.CampaignPlanningCurveEstimate;
import org.openapitools.model.CampaignPlanningResponseError;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Delivery estimate result for a single campaign within a bulk request.
 */

@Schema(name = "BulkCampaignDeliveryEstimatesItem", description = "Delivery estimate result for a single campaign within a bulk request.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BulkCampaignDeliveryEstimatesItem {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid CampaignPlanningAdGroupAudienceSize> adgroupAudienceSizes = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Float conversionRate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid CampaignPlanningConversionRate> conversionRates = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid CampaignPlanningCurveEstimate> curves = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CampaignDeliveryEstimatesDerivedMetrics derivedMetrics;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid CampaignPlanningResponseError> errors = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String estimateId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer maxPotentialSpend;

  public BulkCampaignDeliveryEstimatesItem adgroupAudienceSizes(List<@Valid CampaignPlanningAdGroupAudienceSize> adgroupAudienceSizes) {
    this.adgroupAudienceSizes = adgroupAudienceSizes;
    return this;
  }

  public BulkCampaignDeliveryEstimatesItem addAdgroupAudienceSizesItem(CampaignPlanningAdGroupAudienceSize adgroupAudienceSizesItem) {
    if (this.adgroupAudienceSizes == null) {
      this.adgroupAudienceSizes = new ArrayList<>();
    }
    this.adgroupAudienceSizes.add(adgroupAudienceSizesItem);
    return this;
  }

  /**
   * Range audience sizes for each ad group, in the same order as the ad groups in the request.
   * @return adgroupAudienceSizes
   */
  @Valid 
  @Schema(name = "adgroup_audience_sizes", description = "Range audience sizes for each ad group, in the same order as the ad groups in the request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adgroup_audience_sizes")
  public List<@Valid CampaignPlanningAdGroupAudienceSize> getAdgroupAudienceSizes() {
    return adgroupAudienceSizes;
  }

  @JsonProperty("adgroup_audience_sizes")
  public void setAdgroupAudienceSizes(List<@Valid CampaignPlanningAdGroupAudienceSize> adgroupAudienceSizes) {
    this.adgroupAudienceSizes = adgroupAudienceSizes;
  }

  public BulkCampaignDeliveryEstimatesItem conversionRate(@Nullable Float conversionRate) {
    this.conversionRate = conversionRate;
    return this;
  }

  /**
   * Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows.
   * @return conversionRate
   */
  
  @Schema(name = "conversion_rate", example = "2.32600002288818", description = "Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conversion_rate")
  public @Nullable Float getConversionRate() {
    return conversionRate;
  }

  @JsonProperty("conversion_rate")
  public void setConversionRate(@Nullable Float conversionRate) {
    this.conversionRate = conversionRate;
  }

  public BulkCampaignDeliveryEstimatesItem conversionRates(List<@Valid CampaignPlanningConversionRate> conversionRates) {
    this.conversionRates = conversionRates;
    return this;
  }

  public BulkCampaignDeliveryEstimatesItem addConversionRatesItem(CampaignPlanningConversionRate conversionRatesItem) {
    if (this.conversionRates == null) {
      this.conversionRates = new ArrayList<>();
    }
    this.conversionRates.add(conversionRatesItem);
    return this;
  }

  /**
   * Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings.
   * @return conversionRates
   */
  @Valid 
  @Schema(name = "conversion_rates", description = "Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conversion_rates")
  public List<@Valid CampaignPlanningConversionRate> getConversionRates() {
    return conversionRates;
  }

  @JsonProperty("conversion_rates")
  public void setConversionRates(List<@Valid CampaignPlanningConversionRate> conversionRates) {
    this.conversionRates = conversionRates;
  }

  public BulkCampaignDeliveryEstimatesItem curves(List<@Valid CampaignPlanningCurveEstimate> curves) {
    this.curves = curves;
    return this;
  }

  public BulkCampaignDeliveryEstimatesItem addCurvesItem(CampaignPlanningCurveEstimate curvesItem) {
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

  public BulkCampaignDeliveryEstimatesItem derivedMetrics(@Nullable CampaignDeliveryEstimatesDerivedMetrics derivedMetrics) {
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

  public BulkCampaignDeliveryEstimatesItem errors(List<@Valid CampaignPlanningResponseError> errors) {
    this.errors = errors;
    return this;
  }

  public BulkCampaignDeliveryEstimatesItem addErrorsItem(CampaignPlanningResponseError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Errors encountered during estimation for this campaign.
   * @return errors
   */
  @Valid 
  @Schema(name = "errors", description = "Errors encountered during estimation for this campaign.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errors")
  public List<@Valid CampaignPlanningResponseError> getErrors() {
    return errors;
  }

  @JsonProperty("errors")
  public void setErrors(List<@Valid CampaignPlanningResponseError> errors) {
    this.errors = errors;
  }

  public BulkCampaignDeliveryEstimatesItem estimateId(@Nullable String estimateId) {
    this.estimateId = estimateId;
    return this;
  }

  /**
   * UUID used to track delivery estimates when they are generated as part of a saved campaign.
   * @return estimateId
   */
  
  @Schema(name = "estimate_id", example = "db1b0d75-4386-4db3-8a85-e5725d4dff51", description = "UUID used to track delivery estimates when they are generated as part of a saved campaign.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimate_id")
  public @Nullable String getEstimateId() {
    return estimateId;
  }

  @JsonProperty("estimate_id")
  public void setEstimateId(@Nullable String estimateId) {
    this.estimateId = estimateId;
  }

  public BulkCampaignDeliveryEstimatesItem maxPotentialSpend(@Nullable Integer maxPotentialSpend) {
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
    BulkCampaignDeliveryEstimatesItem bulkCampaignDeliveryEstimatesItem = (BulkCampaignDeliveryEstimatesItem) o;
    return Objects.equals(this.adgroupAudienceSizes, bulkCampaignDeliveryEstimatesItem.adgroupAudienceSizes) &&
        Objects.equals(this.conversionRate, bulkCampaignDeliveryEstimatesItem.conversionRate) &&
        Objects.equals(this.conversionRates, bulkCampaignDeliveryEstimatesItem.conversionRates) &&
        Objects.equals(this.curves, bulkCampaignDeliveryEstimatesItem.curves) &&
        Objects.equals(this.derivedMetrics, bulkCampaignDeliveryEstimatesItem.derivedMetrics) &&
        Objects.equals(this.errors, bulkCampaignDeliveryEstimatesItem.errors) &&
        Objects.equals(this.estimateId, bulkCampaignDeliveryEstimatesItem.estimateId) &&
        Objects.equals(this.maxPotentialSpend, bulkCampaignDeliveryEstimatesItem.maxPotentialSpend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adgroupAudienceSizes, conversionRate, conversionRates, curves, derivedMetrics, errors, estimateId, maxPotentialSpend);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkCampaignDeliveryEstimatesItem {\n");
    sb.append("    adgroupAudienceSizes: ").append(toIndentedString(adgroupAudienceSizes)).append("\n");
    sb.append("    conversionRate: ").append(toIndentedString(conversionRate)).append("\n");
    sb.append("    conversionRates: ").append(toIndentedString(conversionRates)).append("\n");
    sb.append("    curves: ").append(toIndentedString(curves)).append("\n");
    sb.append("    derivedMetrics: ").append(toIndentedString(derivedMetrics)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    estimateId: ").append(toIndentedString(estimateId)).append("\n");
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

