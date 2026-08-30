package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CampaignDeliveryEstimatesDerivedMetrics;
import org.openapitools.server.model.CampaignPlanningCurveEstimate;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Delivery estimates response for a campaign.
 */
public class CampaignDeliveryEstimatesResponse   {

    private List<@Valid CampaignPlanningCurveEstimate> curves = new ArrayList<>();
    private CampaignDeliveryEstimatesDerivedMetrics derivedMetrics;
    private Integer maxPotentialSpend;

    /**
     * Default constructor.
     */
    public CampaignDeliveryEstimatesResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create CampaignDeliveryEstimatesResponse.
     *
     * @param curves Estimated curves. Each curve will pertain to a single estimation type.
     * @param derivedMetrics derivedMetrics
     * @param maxPotentialSpend Maximum potential spend estimate.
     */
    public CampaignDeliveryEstimatesResponse(
        List<@Valid CampaignPlanningCurveEstimate> curves, 
        CampaignDeliveryEstimatesDerivedMetrics derivedMetrics, 
        Integer maxPotentialSpend
    ) {
        this.curves = curves;
        this.derivedMetrics = derivedMetrics;
        this.maxPotentialSpend = maxPotentialSpend;
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

