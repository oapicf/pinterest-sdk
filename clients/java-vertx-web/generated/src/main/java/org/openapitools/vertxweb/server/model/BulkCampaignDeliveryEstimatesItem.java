package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.CampaignDeliveryEstimatesDerivedMetrics;
import org.openapitools.vertxweb.server.model.CampaignPlanningAdGroupAudienceSize;
import org.openapitools.vertxweb.server.model.CampaignPlanningConversionRate;
import org.openapitools.vertxweb.server.model.CampaignPlanningCurveEstimate;
import org.openapitools.vertxweb.server.model.CampaignPlanningResponseError;

/**
 * Delivery estimate result for a single campaign within a bulk request.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BulkCampaignDeliveryEstimatesItem   {
  
  private List<CampaignPlanningAdGroupAudienceSize> adgroupAudienceSizes = new ArrayList<>();
  private Float conversionRate;
  private List<CampaignPlanningConversionRate> conversionRates = new ArrayList<>();
  private List<CampaignPlanningCurveEstimate> curves = new ArrayList<>();
  private CampaignDeliveryEstimatesDerivedMetrics derivedMetrics;
  private List<CampaignPlanningResponseError> errors = new ArrayList<>();
  private String estimateId;
  private Integer maxPotentialSpend;

  public BulkCampaignDeliveryEstimatesItem () {

  }

  public BulkCampaignDeliveryEstimatesItem (List<CampaignPlanningAdGroupAudienceSize> adgroupAudienceSizes, Float conversionRate, List<CampaignPlanningConversionRate> conversionRates, List<CampaignPlanningCurveEstimate> curves, CampaignDeliveryEstimatesDerivedMetrics derivedMetrics, List<CampaignPlanningResponseError> errors, String estimateId, Integer maxPotentialSpend) {
    this.adgroupAudienceSizes = adgroupAudienceSizes;
    this.conversionRate = conversionRate;
    this.conversionRates = conversionRates;
    this.curves = curves;
    this.derivedMetrics = derivedMetrics;
    this.errors = errors;
    this.estimateId = estimateId;
    this.maxPotentialSpend = maxPotentialSpend;
  }

    
  @JsonProperty("adgroup_audience_sizes")
  public List<CampaignPlanningAdGroupAudienceSize> getAdgroupAudienceSizes() {
    return adgroupAudienceSizes;
  }
  public void setAdgroupAudienceSizes(List<CampaignPlanningAdGroupAudienceSize> adgroupAudienceSizes) {
    this.adgroupAudienceSizes = adgroupAudienceSizes;
  }

    
  @JsonProperty("conversion_rate")
  public Float getConversionRate() {
    return conversionRate;
  }
  public void setConversionRate(Float conversionRate) {
    this.conversionRate = conversionRate;
  }

    
  @JsonProperty("conversion_rates")
  public List<CampaignPlanningConversionRate> getConversionRates() {
    return conversionRates;
  }
  public void setConversionRates(List<CampaignPlanningConversionRate> conversionRates) {
    this.conversionRates = conversionRates;
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

    
  @JsonProperty("errors")
  public List<CampaignPlanningResponseError> getErrors() {
    return errors;
  }
  public void setErrors(List<CampaignPlanningResponseError> errors) {
    this.errors = errors;
  }

    
  @JsonProperty("estimate_id")
  public String getEstimateId() {
    return estimateId;
  }
  public void setEstimateId(String estimateId) {
    this.estimateId = estimateId;
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
