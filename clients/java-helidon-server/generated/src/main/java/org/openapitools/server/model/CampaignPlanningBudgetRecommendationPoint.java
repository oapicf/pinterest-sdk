package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.CampaignPlanningEstimationType;
import org.openapitools.server.model.CampaignPlanningPointEstimate;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * A point estimation containing the estimate data and estimation type for a budget recommendation.
 */
public class CampaignPlanningBudgetRecommendationPoint   {

    private CampaignPlanningEstimationType estimationType;
    private CampaignPlanningPointEstimate pointEstimate;

    /**
     * Default constructor.
     */
    public CampaignPlanningBudgetRecommendationPoint() {
    // JSON-B / Jackson
    }

    /**
     * Create CampaignPlanningBudgetRecommendationPoint.
     *
     * @param estimationType Estimation type for this point.
     * @param pointEstimate Point estimate data.
     */
    public CampaignPlanningBudgetRecommendationPoint(
        CampaignPlanningEstimationType estimationType, 
        CampaignPlanningPointEstimate pointEstimate
    ) {
        this.estimationType = estimationType;
        this.pointEstimate = pointEstimate;
    }



    /**
     * Estimation type for this point.
     * @return estimationType
     */
    public CampaignPlanningEstimationType getEstimationType() {
        return estimationType;
    }

    public void setEstimationType(CampaignPlanningEstimationType estimationType) {
        this.estimationType = estimationType;
    }

    /**
     * Point estimate data.
     * @return pointEstimate
     */
    public CampaignPlanningPointEstimate getPointEstimate() {
        return pointEstimate;
    }

    public void setPointEstimate(CampaignPlanningPointEstimate pointEstimate) {
        this.pointEstimate = pointEstimate;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignPlanningBudgetRecommendationPoint {\n");
        
        sb.append("    estimationType: ").append(toIndentedString(estimationType)).append("\n");
        sb.append("    pointEstimate: ").append(toIndentedString(pointEstimate)).append("\n");
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

