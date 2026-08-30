package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignDeliveryEstimatesDerivedMetrics;
import org.openapitools.model.CampaignPlanningAdGroupAudienceSize;
import org.openapitools.model.CampaignPlanningConversionRate;
import org.openapitools.model.CampaignPlanningCurveEstimate;
import org.openapitools.model.CampaignPlanningResponseError;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Delivery estimate result for a single campaign within a bulk request.
 */
@ApiModel(description="Delivery estimate result for a single campaign within a bulk request.")

public class BulkCampaignDeliveryEstimatesItem  {
  
 /**
  * Range audience sizes for each ad group, in the same order as the ad groups in the request.
  */
  @ApiModelProperty(value = "Range audience sizes for each ad group, in the same order as the ad groups in the request.")

  @Valid

  private List<@Valid CampaignPlanningAdGroupAudienceSize> adgroupAudienceSizes = new ArrayList<>();

 /**
  * Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows.
  */
  @ApiModelProperty(example = "2.32600002288818", value = "Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows.")

  private Float conversionRate;

 /**
  * Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings.
  */
  @ApiModelProperty(value = "Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings.")

  @Valid

  private List<@Valid CampaignPlanningConversionRate> conversionRates = new ArrayList<>();

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
  * Errors encountered during estimation for this campaign.
  */
  @ApiModelProperty(value = "Errors encountered during estimation for this campaign.")

  @Valid

  private List<@Valid CampaignPlanningResponseError> errors = new ArrayList<>();

 /**
  * UUID used to track delivery estimates when they are generated as part of a saved campaign.
  */
  @ApiModelProperty(example = "db1b0d75-4386-4db3-8a85-e5725d4dff51", value = "UUID used to track delivery estimates when they are generated as part of a saved campaign.")

  private String estimateId;

 /**
  * Maximum potential spend estimate.
  */
  @ApiModelProperty(example = "50000000", value = "Maximum potential spend estimate.")

  private Integer maxPotentialSpend;
 /**
   * Range audience sizes for each ad group, in the same order as the ad groups in the request.
   * @return adgroupAudienceSizes
  **/
  @JsonProperty("adgroup_audience_sizes")
  public List<@Valid CampaignPlanningAdGroupAudienceSize> getAdgroupAudienceSizes() {
    return adgroupAudienceSizes;
  }

  public void setAdgroupAudienceSizes(List<@Valid CampaignPlanningAdGroupAudienceSize> adgroupAudienceSizes) {
    this.adgroupAudienceSizes = adgroupAudienceSizes;
  }

  public BulkCampaignDeliveryEstimatesItem adgroupAudienceSizes(List<@Valid CampaignPlanningAdGroupAudienceSize> adgroupAudienceSizes) {
    this.adgroupAudienceSizes = adgroupAudienceSizes;
    return this;
  }

  public BulkCampaignDeliveryEstimatesItem addAdgroupAudienceSizesItem(CampaignPlanningAdGroupAudienceSize adgroupAudienceSizesItem) {
    this.adgroupAudienceSizes.add(adgroupAudienceSizesItem);
    return this;
  }

 /**
   * Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows.
   * @return conversionRate
  **/
  @JsonProperty("conversion_rate")
  public Float getConversionRate() {
    return conversionRate;
  }

  public void setConversionRate(Float conversionRate) {
    this.conversionRate = conversionRate;
  }

  public BulkCampaignDeliveryEstimatesItem conversionRate(Float conversionRate) {
    this.conversionRate = conversionRate;
    return this;
  }

 /**
   * Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings.
   * @return conversionRates
  **/
  @JsonProperty("conversion_rates")
  public List<@Valid CampaignPlanningConversionRate> getConversionRates() {
    return conversionRates;
  }

  public void setConversionRates(List<@Valid CampaignPlanningConversionRate> conversionRates) {
    this.conversionRates = conversionRates;
  }

  public BulkCampaignDeliveryEstimatesItem conversionRates(List<@Valid CampaignPlanningConversionRate> conversionRates) {
    this.conversionRates = conversionRates;
    return this;
  }

  public BulkCampaignDeliveryEstimatesItem addConversionRatesItem(CampaignPlanningConversionRate conversionRatesItem) {
    this.conversionRates.add(conversionRatesItem);
    return this;
  }

 /**
   * Estimated curves. Each curve will pertain to a single estimation type.
   * @return curves
  **/
  @JsonProperty("curves")
 @Size(max=20)  public List<@Valid CampaignPlanningCurveEstimate> getCurves() {
    return curves;
  }

  public void setCurves(List<@Valid CampaignPlanningCurveEstimate> curves) {
    this.curves = curves;
  }

  public BulkCampaignDeliveryEstimatesItem curves(List<@Valid CampaignPlanningCurveEstimate> curves) {
    this.curves = curves;
    return this;
  }

  public BulkCampaignDeliveryEstimatesItem addCurvesItem(CampaignPlanningCurveEstimate curvesItem) {
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

  public BulkCampaignDeliveryEstimatesItem derivedMetrics(CampaignDeliveryEstimatesDerivedMetrics derivedMetrics) {
    this.derivedMetrics = derivedMetrics;
    return this;
  }

 /**
   * Errors encountered during estimation for this campaign.
   * @return errors
  **/
  @JsonProperty("errors")
  public List<@Valid CampaignPlanningResponseError> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid CampaignPlanningResponseError> errors) {
    this.errors = errors;
  }

  public BulkCampaignDeliveryEstimatesItem errors(List<@Valid CampaignPlanningResponseError> errors) {
    this.errors = errors;
    return this;
  }

  public BulkCampaignDeliveryEstimatesItem addErrorsItem(CampaignPlanningResponseError errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

 /**
   * UUID used to track delivery estimates when they are generated as part of a saved campaign.
   * @return estimateId
  **/
  @JsonProperty("estimate_id")
  public String getEstimateId() {
    return estimateId;
  }

  public void setEstimateId(String estimateId) {
    this.estimateId = estimateId;
  }

  public BulkCampaignDeliveryEstimatesItem estimateId(String estimateId) {
    this.estimateId = estimateId;
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

  public BulkCampaignDeliveryEstimatesItem maxPotentialSpend(Integer maxPotentialSpend) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

