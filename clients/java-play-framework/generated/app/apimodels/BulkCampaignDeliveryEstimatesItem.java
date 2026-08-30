package apimodels;

import apimodels.CampaignDeliveryEstimatesDerivedMetrics;
import apimodels.CampaignPlanningAdGroupAudienceSize;
import apimodels.CampaignPlanningConversionRate;
import apimodels.CampaignPlanningCurveEstimate;
import apimodels.CampaignPlanningResponseError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Delivery estimate result for a single campaign within a bulk request.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BulkCampaignDeliveryEstimatesItem   {
  @JsonProperty("adgroup_audience_sizes")
  @Valid

  private List<@Valid CampaignPlanningAdGroupAudienceSize> adgroupAudienceSizes = null;

  @JsonProperty("conversion_rate")
  
  private Float conversionRate;

  @JsonProperty("conversion_rates")
  @Valid

  private List<@Valid CampaignPlanningConversionRate> conversionRates = null;

  @JsonProperty("curves")
  @Size(max=20)
@Valid

  private List<@Valid CampaignPlanningCurveEstimate> curves = null;

  @JsonProperty("derived_metrics")
  @Valid

  private CampaignDeliveryEstimatesDerivedMetrics derivedMetrics;

  @JsonProperty("errors")
  @Valid

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

  @SuppressWarnings("StringBufferReplaceableByString")
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

