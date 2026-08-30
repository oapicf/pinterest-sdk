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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BulkCampaignDeliveryEstimatesItem   {
  @JsonProperty("adgroup_audience_sizes")
  private List<@Valid CampaignPlanningAdGroupAudienceSize> adgroupAudienceSizes = null;

  @JsonProperty("conversion_rate")
  private Float conversionRate;

  @JsonProperty("conversion_rates")
  private List<@Valid CampaignPlanningConversionRate> conversionRates = null;

  @JsonProperty("curves")
  private List<@Valid CampaignPlanningCurveEstimate> curves = null;

  @JsonProperty("derived_metrics")
  private CampaignDeliveryEstimatesDerivedMetrics derivedMetrics;

  @JsonProperty("errors")
  private List<@Valid CampaignPlanningResponseError> errors = null;

  @JsonProperty("estimate_id")
  private String estimateId;

  @JsonProperty("max_potential_spend")
  private Integer maxPotentialSpend;

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
  **/
  @ApiModelProperty(value = "Range audience sizes for each ad group, in the same order as the ad groups in the request.")
  public List<@Valid CampaignPlanningAdGroupAudienceSize> getAdgroupAudienceSizes() {
    return adgroupAudienceSizes;
  }

  public void setAdgroupAudienceSizes(List<@Valid CampaignPlanningAdGroupAudienceSize> adgroupAudienceSizes) {
    this.adgroupAudienceSizes = adgroupAudienceSizes;
  }

  public BulkCampaignDeliveryEstimatesItem conversionRate(Float conversionRate) {
    this.conversionRate = conversionRate;
    return this;
  }

   /**
   * Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows.
   * @return conversionRate
  **/
  @ApiModelProperty(example = "2.32600002288818", value = "Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows.")
  public Float getConversionRate() {
    return conversionRate;
  }

  public void setConversionRate(Float conversionRate) {
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
  **/
  @ApiModelProperty(value = "Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings.")
  public List<@Valid CampaignPlanningConversionRate> getConversionRates() {
    return conversionRates;
  }

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
  **/
  @ApiModelProperty(value = "Estimated curves. Each curve will pertain to a single estimation type.")
  public List<@Valid CampaignPlanningCurveEstimate> getCurves() {
    return curves;
  }

  public void setCurves(List<@Valid CampaignPlanningCurveEstimate> curves) {
    this.curves = curves;
  }

  public BulkCampaignDeliveryEstimatesItem derivedMetrics(CampaignDeliveryEstimatesDerivedMetrics derivedMetrics) {
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
  **/
  @ApiModelProperty(value = "Errors encountered during estimation for this campaign.")
  public List<@Valid CampaignPlanningResponseError> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid CampaignPlanningResponseError> errors) {
    this.errors = errors;
  }

  public BulkCampaignDeliveryEstimatesItem estimateId(String estimateId) {
    this.estimateId = estimateId;
    return this;
  }

   /**
   * UUID used to track delivery estimates when they are generated as part of a saved campaign.
   * @return estimateId
  **/
  @ApiModelProperty(example = "db1b0d75-4386-4db3-8a85-e5725d4dff51", value = "UUID used to track delivery estimates when they are generated as part of a saved campaign.")
  public String getEstimateId() {
    return estimateId;
  }

  public void setEstimateId(String estimateId) {
    this.estimateId = estimateId;
  }

  public BulkCampaignDeliveryEstimatesItem maxPotentialSpend(Integer maxPotentialSpend) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

