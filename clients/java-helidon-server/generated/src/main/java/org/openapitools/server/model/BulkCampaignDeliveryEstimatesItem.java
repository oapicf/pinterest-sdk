package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CampaignDeliveryEstimatesDerivedMetrics;
import org.openapitools.server.model.CampaignPlanningAdGroupAudienceSize;
import org.openapitools.server.model.CampaignPlanningConversionRate;
import org.openapitools.server.model.CampaignPlanningCurveEstimate;
import org.openapitools.server.model.CampaignPlanningResponseError;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Delivery estimate result for a single campaign within a bulk request.
 */
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
     * Default constructor.
     */
    public BulkCampaignDeliveryEstimatesItem() {
    // JSON-B / Jackson
    }

    /**
     * Create BulkCampaignDeliveryEstimatesItem.
     *
     * @param adgroupAudienceSizes Range audience sizes for each ad group, in the same order as the ad groups in the request.
     * @param conversionRate Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows.
     * @param conversionRates Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings.
     * @param curves Estimated curves. Each curve will pertain to a single estimation type.
     * @param derivedMetrics derivedMetrics
     * @param errors Errors encountered during estimation for this campaign.
     * @param estimateId UUID used to track delivery estimates when they are generated as part of a saved campaign.
     * @param maxPotentialSpend Maximum potential spend estimate.
     */
    public BulkCampaignDeliveryEstimatesItem(
        List<@Valid CampaignPlanningAdGroupAudienceSize> adgroupAudienceSizes, 
        Float conversionRate, 
        List<@Valid CampaignPlanningConversionRate> conversionRates, 
        List<@Valid CampaignPlanningCurveEstimate> curves, 
        CampaignDeliveryEstimatesDerivedMetrics derivedMetrics, 
        List<@Valid CampaignPlanningResponseError> errors, 
        String estimateId, 
        Integer maxPotentialSpend
    ) {
        this.adgroupAudienceSizes = adgroupAudienceSizes;
        this.conversionRate = conversionRate;
        this.conversionRates = conversionRates;
        this.curves = curves;
        this.derivedMetrics = derivedMetrics;
        this.errors = errors;
        this.estimateId = estimateId;
        this.maxPotentialSpend = maxPotentialSpend;
    }



    /**
     * Range audience sizes for each ad group, in the same order as the ad groups in the request.
     * @return adgroupAudienceSizes
     */
    public List<@Valid CampaignPlanningAdGroupAudienceSize> getAdgroupAudienceSizes() {
        return adgroupAudienceSizes;
    }

    public void setAdgroupAudienceSizes(List<@Valid CampaignPlanningAdGroupAudienceSize> adgroupAudienceSizes) {
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
    public List<@Valid CampaignPlanningConversionRate> getConversionRates() {
        return conversionRates;
    }

    public void setConversionRates(List<@Valid CampaignPlanningConversionRate> conversionRates) {
        this.conversionRates = conversionRates;
    }

    /**
     * Estimated curves. Each curve will pertain to a single estimation type.
     * @return curves
     */
    public List<@Valid CampaignPlanningCurveEstimate> getCurves() {
        return curves;
    }

    public void setCurves(List<@Valid CampaignPlanningCurveEstimate> curves) {
        this.curves = curves;
    }

    /**
     * Get derivedMetrics
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
    public List<@Valid CampaignPlanningResponseError> getErrors() {
        return errors;
    }

    public void setErrors(List<@Valid CampaignPlanningResponseError> errors) {
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

    /**
      * Create a string representation of this pojo.
    **/
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

