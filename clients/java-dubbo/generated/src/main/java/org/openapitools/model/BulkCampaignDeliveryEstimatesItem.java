package org.openapitools.model;

import org.openapitools.model.CampaignDeliveryEstimatesDerivedMetrics;
import org.openapitools.model.CampaignPlanningAdGroupAudienceSize;
import org.openapitools.model.CampaignPlanningConversionRate;
import org.openapitools.model.CampaignPlanningCurveEstimate;
import org.openapitools.model.CampaignPlanningResponseError;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Delivery estimate result for a single campaign within a bulk request.
 */
public class BulkCampaignDeliveryEstimatesItem implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Range audience sizes for each ad group, in the same order as the ad groups in the request.
   */
  @JsonProperty("adgroup_audience_sizes")
  private List<CampaignPlanningAdGroupAudienceSize> adgroupAudienceSizes = new ArrayList<>();

  /**
   * Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows.
   */
  @JsonProperty("conversion_rate")
  private Float conversionRate;

  /**
   * Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings.
   */
  @JsonProperty("conversion_rates")
  private List<CampaignPlanningConversionRate> conversionRates = new ArrayList<>();

  /**
   * Estimated curves. Each curve will pertain to a single estimation type.
   */
  @JsonProperty("curves")
  private List<CampaignPlanningCurveEstimate> curves = new ArrayList<>();

  @JsonProperty("derived_metrics")
  private CampaignDeliveryEstimatesDerivedMetrics derivedMetrics;

  /**
   * Errors encountered during estimation for this campaign.
   */
  @JsonProperty("errors")
  private List<CampaignPlanningResponseError> errors = new ArrayList<>();

  /**
   * UUID used to track delivery estimates when they are generated as part of a saved campaign.
   */
  @JsonProperty("estimate_id")
  private String estimateId;

  /**
   * Maximum potential spend estimate.
   */
  @JsonProperty("max_potential_spend")
  private Integer maxPotentialSpend;

  /**
   * Range audience sizes for each ad group, in the same order as the ad groups in the request.
   * @return adgroupAudienceSizes
   */
  public List<CampaignPlanningAdGroupAudienceSize> getAdgroupAudienceSizes() {
    return adgroupAudienceSizes;
  }

  public void setAdgroupAudienceSizes(List<CampaignPlanningAdGroupAudienceSize> adgroupAudienceSizes) {
    this.adgroupAudienceSizes = adgroupAudienceSizes;
  }

  /**
   * Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows.
   * @return conversionRate
   */
  public Float getConversionRate() {
    return conversionRate;
  }

  public void setConversionRate(Float conversionRate) {
    this.conversionRate = conversionRate;
  }

  /**
   * Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings.
   * @return conversionRates
   */
  public List<CampaignPlanningConversionRate> getConversionRates() {
    return conversionRates;
  }

  public void setConversionRates(List<CampaignPlanningConversionRate> conversionRates) {
    this.conversionRates = conversionRates;
  }

  /**
   * Estimated curves. Each curve will pertain to a single estimation type.
   * @return curves
   */
  public List<CampaignPlanningCurveEstimate> getCurves() {
    return curves;
  }

  public void setCurves(List<CampaignPlanningCurveEstimate> curves) {
    this.curves = curves;
  }

  /**
   * 
   * @return derivedMetrics
   */
  public CampaignDeliveryEstimatesDerivedMetrics getDerivedMetrics() {
    return derivedMetrics;
  }

  public void setDerivedMetrics(CampaignDeliveryEstimatesDerivedMetrics derivedMetrics) {
    this.derivedMetrics = derivedMetrics;
  }

  /**
   * Errors encountered during estimation for this campaign.
   * @return errors
   */
  public List<CampaignPlanningResponseError> getErrors() {
    return errors;
  }

  public void setErrors(List<CampaignPlanningResponseError> errors) {
    this.errors = errors;
  }

  /**
   * UUID used to track delivery estimates when they are generated as part of a saved campaign.
   * @return estimateId
   */
  public String getEstimateId() {
    return estimateId;
  }

  public void setEstimateId(String estimateId) {
    this.estimateId = estimateId;
  }

  /**
   * Maximum potential spend estimate.
   * @return maxPotentialSpend
   */
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
