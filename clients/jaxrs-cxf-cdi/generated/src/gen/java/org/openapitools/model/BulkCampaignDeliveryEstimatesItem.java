package org.openapitools.model;

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
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Delivery estimate result for a single campaign within a bulk request.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Delivery estimate result for a single campaign within a bulk request.")
public class BulkCampaignDeliveryEstimatesItem   {
  
  private List<@Valid CampaignPlanningAdGroupAudienceSize> adgroupAudienceSizes = new ArrayList<>();

  private Float conversionRate;

  private List<@Valid CampaignPlanningConversionRate> conversionRates = new ArrayList<>();

  private List<@Valid CampaignPlanningCurveEstimate> curves = new ArrayList<>();

  private CampaignDeliveryEstimatesDerivedMetrics derivedMetrics;

  private List<@Valid CampaignPlanningResponseError> errors = new ArrayList<>();

  private String estimateId;

  private Integer maxPotentialSpend;

  /**
   * Range audience sizes for each ad group, in the same order as the ad groups in the request.
   **/
  public BulkCampaignDeliveryEstimatesItem adgroupAudienceSizes(List<@Valid CampaignPlanningAdGroupAudienceSize> adgroupAudienceSizes) {
    this.adgroupAudienceSizes = adgroupAudienceSizes;
    return this;
  }

  
  @ApiModelProperty(value = "Range audience sizes for each ad group, in the same order as the ad groups in the request.")
  @JsonProperty("adgroup_audience_sizes")
  public List<@Valid CampaignPlanningAdGroupAudienceSize> getAdgroupAudienceSizes() {
    return adgroupAudienceSizes;
  }
  public void setAdgroupAudienceSizes(List<@Valid CampaignPlanningAdGroupAudienceSize> adgroupAudienceSizes) {
    this.adgroupAudienceSizes = adgroupAudienceSizes;
  }

  public BulkCampaignDeliveryEstimatesItem addAdgroupAudienceSizesItem(CampaignPlanningAdGroupAudienceSize adgroupAudienceSizesItem) {
    if (this.adgroupAudienceSizes == null) {
      this.adgroupAudienceSizes = new ArrayList<>();
    }
    this.adgroupAudienceSizes.add(adgroupAudienceSizesItem);
    return this;
  }


  /**
   * Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows.
   **/
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
   **/
  public BulkCampaignDeliveryEstimatesItem conversionRates(List<@Valid CampaignPlanningConversionRate> conversionRates) {
    this.conversionRates = conversionRates;
    return this;
  }

  
  @ApiModelProperty(value = "Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings.")
  @JsonProperty("conversion_rates")
  public List<@Valid CampaignPlanningConversionRate> getConversionRates() {
    return conversionRates;
  }
  public void setConversionRates(List<@Valid CampaignPlanningConversionRate> conversionRates) {
    this.conversionRates = conversionRates;
  }

  public BulkCampaignDeliveryEstimatesItem addConversionRatesItem(CampaignPlanningConversionRate conversionRatesItem) {
    if (this.conversionRates == null) {
      this.conversionRates = new ArrayList<>();
    }
    this.conversionRates.add(conversionRatesItem);
    return this;
  }


  /**
   * Estimated curves. Each curve will pertain to a single estimation type.
   **/
  public BulkCampaignDeliveryEstimatesItem curves(List<@Valid CampaignPlanningCurveEstimate> curves) {
    this.curves = curves;
    return this;
  }

  
  @ApiModelProperty(value = "Estimated curves. Each curve will pertain to a single estimation type.")
  @JsonProperty("curves")
 @Size(max=20)  public List<@Valid CampaignPlanningCurveEstimate> getCurves() {
    return curves;
  }
  public void setCurves(List<@Valid CampaignPlanningCurveEstimate> curves) {
    this.curves = curves;
  }

  public BulkCampaignDeliveryEstimatesItem addCurvesItem(CampaignPlanningCurveEstimate curvesItem) {
    if (this.curves == null) {
      this.curves = new ArrayList<>();
    }
    this.curves.add(curvesItem);
    return this;
  }


  /**
   **/
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
   **/
  public BulkCampaignDeliveryEstimatesItem errors(List<@Valid CampaignPlanningResponseError> errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(value = "Errors encountered during estimation for this campaign.")
  @JsonProperty("errors")
  public List<@Valid CampaignPlanningResponseError> getErrors() {
    return errors;
  }
  public void setErrors(List<@Valid CampaignPlanningResponseError> errors) {
    this.errors = errors;
  }

  public BulkCampaignDeliveryEstimatesItem addErrorsItem(CampaignPlanningResponseError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }


  /**
   * UUID used to track delivery estimates when they are generated as part of a saved campaign.
   **/
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
   **/
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

