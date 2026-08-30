package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CampaignPlanningEstimationType;
import org.openapitools.server.model.CampaignPlanningPointEstimate;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CampaignPlanningCurveEstimate   {

    private CampaignPlanningEstimationType estimationType;
    private List<@Valid CampaignPlanningPointEstimate> points = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CampaignPlanningCurveEstimate() {
    // JSON-B / Jackson
    }

    /**
     * Create CampaignPlanningCurveEstimate.
     *
     * @param estimationType Estimation type for campaign planning estimated curve
     * @param points The estimation points that make up the estimated curve.
     */
    public CampaignPlanningCurveEstimate(
        CampaignPlanningEstimationType estimationType, 
        List<@Valid CampaignPlanningPointEstimate> points
    ) {
        this.estimationType = estimationType;
        this.points = points;
    }



    /**
     * Estimation type for campaign planning estimated curve
     * @return estimationType
     */
    public CampaignPlanningEstimationType getEstimationType() {
        return estimationType;
    }

    public void setEstimationType(CampaignPlanningEstimationType estimationType) {
        this.estimationType = estimationType;
    }

    /**
     * The estimation points that make up the estimated curve.
     * @return points
     */
    public List<@Valid CampaignPlanningPointEstimate> getPoints() {
        return points;
    }

    public void setPoints(List<@Valid CampaignPlanningPointEstimate> points) {
        this.points = points;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignPlanningCurveEstimate {\n");
        
        sb.append("    estimationType: ").append(toIndentedString(estimationType)).append("\n");
        sb.append("    points: ").append(toIndentedString(points)).append("\n");
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

