package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CampaignPlanningBudgetRecommendationPoint;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Experimental budget recommendation for a single experiment version.
 */
public class CampaignPlanningExperimentBudgetRecommendation   {

    private Integer budgetRecommendation;
    private Integer lifetimeDaysRecommendation;
    private List<@Valid CampaignPlanningBudgetRecommendationPoint> pointEstimations = new ArrayList<>();
    private String versionId;

    /**
     * Default constructor.
     */
    public CampaignPlanningExperimentBudgetRecommendation() {
    // JSON-B / Jackson
    }

    /**
     * Create CampaignPlanningExperimentBudgetRecommendation.
     *
     * @param budgetRecommendation Recommended budget for this experiment version.
     * @param lifetimeDaysRecommendation Recommended lifetime days for this experiment.
     * @param pointEstimations Point estimations for this experiment version.
     * @param versionId Version identifier for the experiment.
     */
    public CampaignPlanningExperimentBudgetRecommendation(
        Integer budgetRecommendation, 
        Integer lifetimeDaysRecommendation, 
        List<@Valid CampaignPlanningBudgetRecommendationPoint> pointEstimations, 
        String versionId
    ) {
        this.budgetRecommendation = budgetRecommendation;
        this.lifetimeDaysRecommendation = lifetimeDaysRecommendation;
        this.pointEstimations = pointEstimations;
        this.versionId = versionId;
    }



    /**
     * Recommended budget for this experiment version.
     * @return budgetRecommendation
     */
    public Integer getBudgetRecommendation() {
        return budgetRecommendation;
    }

    public void setBudgetRecommendation(Integer budgetRecommendation) {
        this.budgetRecommendation = budgetRecommendation;
    }

    /**
     * Recommended lifetime days for this experiment.
     * @return lifetimeDaysRecommendation
     */
    public Integer getLifetimeDaysRecommendation() {
        return lifetimeDaysRecommendation;
    }

    public void setLifetimeDaysRecommendation(Integer lifetimeDaysRecommendation) {
        this.lifetimeDaysRecommendation = lifetimeDaysRecommendation;
    }

    /**
     * Point estimations for this experiment version.
     * @return pointEstimations
     */
    public List<@Valid CampaignPlanningBudgetRecommendationPoint> getPointEstimations() {
        return pointEstimations;
    }

    public void setPointEstimations(List<@Valid CampaignPlanningBudgetRecommendationPoint> pointEstimations) {
        this.pointEstimations = pointEstimations;
    }

    /**
     * Version identifier for the experiment.
     * @return versionId
     */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignPlanningExperimentBudgetRecommendation {\n");
        
        sb.append("    budgetRecommendation: ").append(toIndentedString(budgetRecommendation)).append("\n");
        sb.append("    lifetimeDaysRecommendation: ").append(toIndentedString(lifetimeDaysRecommendation)).append("\n");
        sb.append("    pointEstimations: ").append(toIndentedString(pointEstimations)).append("\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
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

