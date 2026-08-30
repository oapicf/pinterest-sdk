package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AdGroupDeliveryEstimates;
import org.openapitools.server.model.BudgetDurationType;
import org.openapitools.server.model.DeliveryEstimateObjectiveType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Campaign configuration for delivery estimates.
 */
public class CampaignDeliveryEstimatesCampaign   {

    private List<@Valid AdGroupDeliveryEstimates> adGroups = new ArrayList<>();
    private BudgetDurationType budgetDurationType;
    private Integer dailySpendCap;
    private String endDate;
    private Integer lifetimeSpendCap;
    private DeliveryEstimateObjectiveType objectiveType;
    private String startDate;

    /**
     * Default constructor.
     */
    public CampaignDeliveryEstimatesCampaign() {
    // JSON-B / Jackson
    }

    /**
     * Create CampaignDeliveryEstimatesCampaign.
     *
     * @param adGroups adGroups
     * @param budgetDurationType Duration type of the budget
     * @param dailySpendCap Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required.
     * @param endDate End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME.
     * @param lifetimeSpendCap Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending.
     * @param objectiveType objectiveType
     * @param startDate Start date of the date range for an ad campaign, pattern YYYY-MM-DD.
     */
    public CampaignDeliveryEstimatesCampaign(
        List<@Valid AdGroupDeliveryEstimates> adGroups, 
        BudgetDurationType budgetDurationType, 
        Integer dailySpendCap, 
        String endDate, 
        Integer lifetimeSpendCap, 
        DeliveryEstimateObjectiveType objectiveType, 
        String startDate
    ) {
        this.adGroups = adGroups;
        this.budgetDurationType = budgetDurationType;
        this.dailySpendCap = dailySpendCap;
        this.endDate = endDate;
        this.lifetimeSpendCap = lifetimeSpendCap;
        this.objectiveType = objectiveType;
        this.startDate = startDate;
    }



    /**
     * Get adGroups
     * @return adGroups
     */
    public List<@Valid AdGroupDeliveryEstimates> getAdGroups() {
        return adGroups;
    }

    public void setAdGroups(List<@Valid AdGroupDeliveryEstimates> adGroups) {
        this.adGroups = adGroups;
    }

    /**
     * Duration type of the budget
     * @return budgetDurationType
     */
    public BudgetDurationType getBudgetDurationType() {
        return budgetDurationType;
    }

    public void setBudgetDurationType(BudgetDurationType budgetDurationType) {
        this.budgetDurationType = budgetDurationType;
    }

    /**
     * Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required.
     * @return dailySpendCap
     */
    public Integer getDailySpendCap() {
        return dailySpendCap;
    }

    public void setDailySpendCap(Integer dailySpendCap) {
        this.dailySpendCap = dailySpendCap;
    }

    /**
     * End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME.
     * @return endDate
     */
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending.
     * @return lifetimeSpendCap
     */
    public Integer getLifetimeSpendCap() {
        return lifetimeSpendCap;
    }

    public void setLifetimeSpendCap(Integer lifetimeSpendCap) {
        this.lifetimeSpendCap = lifetimeSpendCap;
    }

    /**
     * Get objectiveType
     * @return objectiveType
     */
    public DeliveryEstimateObjectiveType getObjectiveType() {
        return objectiveType;
    }

    public void setObjectiveType(DeliveryEstimateObjectiveType objectiveType) {
        this.objectiveType = objectiveType;
    }

    /**
     * Start date of the date range for an ad campaign, pattern YYYY-MM-DD.
     * @return startDate
     */
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignDeliveryEstimatesCampaign {\n");
        
        sb.append("    adGroups: ").append(toIndentedString(adGroups)).append("\n");
        sb.append("    budgetDurationType: ").append(toIndentedString(budgetDurationType)).append("\n");
        sb.append("    dailySpendCap: ").append(toIndentedString(dailySpendCap)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    lifetimeSpendCap: ").append(toIndentedString(lifetimeSpendCap)).append("\n");
        sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

