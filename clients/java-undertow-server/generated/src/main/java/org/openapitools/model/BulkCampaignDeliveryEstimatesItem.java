/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
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
import org.openapitools.model.CampaignPlanningAdGroupAudienceSize;
import org.openapitools.model.CampaignPlanningConversionRate;
import org.openapitools.model.CampaignPlanningCurveEstimate;
import org.openapitools.model.CampaignPlanningResponseError;



/**
 * Delivery estimate result for a single campaign within a bulk request.
 */

@ApiModel(description = "Delivery estimate result for a single campaign within a bulk request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BulkCampaignDeliveryEstimatesItem   {
  
  private List<CampaignPlanningAdGroupAudienceSize> adgroupAudienceSizes = new ArrayList<>();
  private Float conversionRate;
  private List<CampaignPlanningConversionRate> conversionRates = new ArrayList<>();
  private List<CampaignPlanningCurveEstimate> curves = new ArrayList<>();
  private CampaignDeliveryEstimatesDerivedMetrics derivedMetrics;
  private List<CampaignPlanningResponseError> errors = new ArrayList<>();
  private String estimateId;
  private Integer maxPotentialSpend;

  /**
   * Range audience sizes for each ad group, in the same order as the ad groups in the request.
   */
  public BulkCampaignDeliveryEstimatesItem adgroupAudienceSizes(List<CampaignPlanningAdGroupAudienceSize> adgroupAudienceSizes) {
    this.adgroupAudienceSizes = adgroupAudienceSizes;
    return this;
  }

  
  @ApiModelProperty(value = "Range audience sizes for each ad group, in the same order as the ad groups in the request.")
  @JsonProperty("adgroup_audience_sizes")
  public List<CampaignPlanningAdGroupAudienceSize> getAdgroupAudienceSizes() {
    return adgroupAudienceSizes;
  }
  public void setAdgroupAudienceSizes(List<CampaignPlanningAdGroupAudienceSize> adgroupAudienceSizes) {
    this.adgroupAudienceSizes = adgroupAudienceSizes;
  }

  /**
   * Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows.
   */
  public BulkCampaignDeliveryEstimatesItem conversionRate(Float conversionRate) {
    this.conversionRate = conversionRate;
    return this;
  }

  
  @ApiModelProperty(example = "2.32600002288818", value = "Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows.")
  @JsonProperty("conversion_rate")
  public Float getConversionRate() {
    return conversionRate;
  }
  public void setConversionRate(Float conversionRate) {
    this.conversionRate = conversionRate;
  }

  /**
   * Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings.
   */
  public BulkCampaignDeliveryEstimatesItem conversionRates(List<CampaignPlanningConversionRate> conversionRates) {
    this.conversionRates = conversionRates;
    return this;
  }

  
  @ApiModelProperty(value = "Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings.")
  @JsonProperty("conversion_rates")
  public List<CampaignPlanningConversionRate> getConversionRates() {
    return conversionRates;
  }
  public void setConversionRates(List<CampaignPlanningConversionRate> conversionRates) {
    this.conversionRates = conversionRates;
  }

  /**
   * Estimated curves. Each curve will pertain to a single estimation type.
   */
  public BulkCampaignDeliveryEstimatesItem curves(List<CampaignPlanningCurveEstimate> curves) {
    this.curves = curves;
    return this;
  }

  
  @ApiModelProperty(value = "Estimated curves. Each curve will pertain to a single estimation type.")
  @JsonProperty("curves")
  public List<CampaignPlanningCurveEstimate> getCurves() {
    return curves;
  }
  public void setCurves(List<CampaignPlanningCurveEstimate> curves) {
    this.curves = curves;
  }

  /**
   */
  public BulkCampaignDeliveryEstimatesItem derivedMetrics(CampaignDeliveryEstimatesDerivedMetrics derivedMetrics) {
    this.derivedMetrics = derivedMetrics;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("derived_metrics")
  public CampaignDeliveryEstimatesDerivedMetrics getDerivedMetrics() {
    return derivedMetrics;
  }
  public void setDerivedMetrics(CampaignDeliveryEstimatesDerivedMetrics derivedMetrics) {
    this.derivedMetrics = derivedMetrics;
  }

  /**
   * Errors encountered during estimation for this campaign.
   */
  public BulkCampaignDeliveryEstimatesItem errors(List<CampaignPlanningResponseError> errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(value = "Errors encountered during estimation for this campaign.")
  @JsonProperty("errors")
  public List<CampaignPlanningResponseError> getErrors() {
    return errors;
  }
  public void setErrors(List<CampaignPlanningResponseError> errors) {
    this.errors = errors;
  }

  /**
   * UUID used to track delivery estimates when they are generated as part of a saved campaign.
   */
  public BulkCampaignDeliveryEstimatesItem estimateId(String estimateId) {
    this.estimateId = estimateId;
    return this;
  }

  
  @ApiModelProperty(example = "db1b0d75-4386-4db3-8a85-e5725d4dff51", value = "UUID used to track delivery estimates when they are generated as part of a saved campaign.")
  @JsonProperty("estimate_id")
  public String getEstimateId() {
    return estimateId;
  }
  public void setEstimateId(String estimateId) {
    this.estimateId = estimateId;
  }

  /**
   * Maximum potential spend estimate.
   */
  public BulkCampaignDeliveryEstimatesItem maxPotentialSpend(Integer maxPotentialSpend) {
    this.maxPotentialSpend = maxPotentialSpend;
    return this;
  }

  
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
    BulkCampaignDeliveryEstimatesItem bulkCampaignDeliveryEstimatesItem = (BulkCampaignDeliveryEstimatesItem) o;
    return Objects.equals(adgroupAudienceSizes, bulkCampaignDeliveryEstimatesItem.adgroupAudienceSizes) &&
        Objects.equals(conversionRate, bulkCampaignDeliveryEstimatesItem.conversionRate) &&
        Objects.equals(conversionRates, bulkCampaignDeliveryEstimatesItem.conversionRates) &&
        Objects.equals(curves, bulkCampaignDeliveryEstimatesItem.curves) &&
        Objects.equals(derivedMetrics, bulkCampaignDeliveryEstimatesItem.derivedMetrics) &&
        Objects.equals(errors, bulkCampaignDeliveryEstimatesItem.errors) &&
        Objects.equals(estimateId, bulkCampaignDeliveryEstimatesItem.estimateId) &&
        Objects.equals(maxPotentialSpend, bulkCampaignDeliveryEstimatesItem.maxPotentialSpend);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

