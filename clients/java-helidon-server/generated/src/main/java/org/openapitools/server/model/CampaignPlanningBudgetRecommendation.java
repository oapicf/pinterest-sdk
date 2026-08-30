package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CampaignPlanningBudgetRecommendationPoint;
import org.openapitools.server.model.CampaignPlanningExperimentBudgetRecommendation;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Budget recommendation response containing recommended budget, estimated days, and point estimations.
 */
public class CampaignPlanningBudgetRecommendation   {

    private Integer budgetRecommendation;
    private List<@Valid CampaignPlanningExperimentBudgetRecommendation> experimentCampaignBudgetRecommendation = new ArrayList<>();
    private Integer lifetimeDaysRecommendation;
    private List<@Valid CampaignPlanningBudgetRecommendationPoint> pointEstimations = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CampaignPlanningBudgetRecommendation() {
    // JSON-B / Jackson
    }

    /**
     * Create CampaignPlanningBudgetRecommendation.
     *
     * @param budgetRecommendation The recommended budget amount.
     * @param experimentCampaignBudgetRecommendation List of experimental budget recommendations.
     * @param lifetimeDaysRecommendation Recommended number of days for the campaign lifetime.
     * @param pointEstimations List of point estimations for different budget scenarios.
     */
    public CampaignPlanningBudgetRecommendation(
        Integer budgetRecommendation, 
        List<@Valid CampaignPlanningExperimentBudgetRecommendation> experimentCampaignBudgetRecommendation, 
        Integer lifetimeDaysRecommendation, 
        List<@Valid CampaignPlanningBudgetRecommendationPoint> pointEstimations
    ) {
        this.budgetRecommendation = budgetRecommendation;
        this.experimentCampaignBudgetRecommendation = experimentCampaignBudgetRecommendation;
        this.lifetimeDaysRecommendation = lifetimeDaysRecommendation;
        this.pointEstimations = pointEstimations;
    }



    /**
     * The recommended budget amount.
     * @return budgetRecommendation
     */
    public Integer getBudgetRecommendation() {
        return budgetRecommendation;
    }

    public void setBudgetRecommendation(Integer budgetRecommendation) {
        this.budgetRecommendation = budgetRecommendation;
    }

    /**
     * List of experimental budget recommendations.
     * @return experimentCampaignBudgetRecommendation
     */
    public List<@Valid CampaignPlanningExperimentBudgetRecommendation> getExperimentCampaignBudgetRecommendation() {
        return experimentCampaignBudgetRecommendation;
    }

    public void setExperimentCampaignBudgetRecommendation(List<@Valid CampaignPlanningExperimentBudgetRecommendation> experimentCampaignBudgetRecommendation) {
        this.experimentCampaignBudgetRecommendation = experimentCampaignBudgetRecommendation;
    }

    /**
     * Recommended number of days for the campaign lifetime.
     * @return lifetimeDaysRecommendation
     */
    public Integer getLifetimeDaysRecommendation() {
        return lifetimeDaysRecommendation;
    }

    public void setLifetimeDaysRecommendation(Integer lifetimeDaysRecommendation) {
        this.lifetimeDaysRecommendation = lifetimeDaysRecommendation;
    }

    /**
     * List of point estimations for different budget scenarios.
     * @return pointEstimations
     */
    public List<@Valid CampaignPlanningBudgetRecommendationPoint> getPointEstimations() {
        return pointEstimations;
    }

    public void setPointEstimations(List<@Valid CampaignPlanningBudgetRecommendationPoint> pointEstimations) {
        this.pointEstimations = pointEstimations;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignPlanningBudgetRecommendation {\n");
        
        sb.append("    budgetRecommendation: ").append(toIndentedString(budgetRecommendation)).append("\n");
        sb.append("    experimentCampaignBudgetRecommendation: ").append(toIndentedString(experimentCampaignBudgetRecommendation)).append("\n");
        sb.append("    lifetimeDaysRecommendation: ").append(toIndentedString(lifetimeDaysRecommendation)).append("\n");
        sb.append("    pointEstimations: ").append(toIndentedString(pointEstimations)).append("\n");
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

