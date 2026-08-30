package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AdGroupDeliveryEstimates;
import org.openapitools.model.BudgetDurationType;
import org.openapitools.model.DeliveryEstimateObjectiveType;

@Canonical
class CampaignDeliveryEstimatesCampaign {
    
    List<AdGroupDeliveryEstimates> adGroups = new ArrayList<>()
    /* Duration type of the budget */
    BudgetDurationType budgetDurationType
    /* Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required. */
    Integer dailySpendCap
    /* End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME. */
    String endDate
    /* Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending. */
    Integer lifetimeSpendCap
    
    DeliveryEstimateObjectiveType objectiveType
    /* Start date of the date range for an ad campaign, pattern YYYY-MM-DD. */
    String startDate
}
