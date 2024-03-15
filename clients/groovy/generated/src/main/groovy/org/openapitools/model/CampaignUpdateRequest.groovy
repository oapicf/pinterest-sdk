package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdCommonTrackingUrls;
import org.openapitools.model.CampaignSummaryStatus;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.ObjectiveType;

@Canonical
class CampaignUpdateRequest {
    /* Campaign ID. */
    String id
    /* Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. */
    String adAccountId
    /* Campaign name. */
    String name
    
    EntityStatus status
    /* Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time. */
    Integer lifetimeSpendCap
    /* Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time. */
    Integer dailySpendCap
    /* Order line ID that appears on the invoice. */
    String orderLineId
    
    AdCommonTrackingUrls trackingUrls
    /* Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. */
    Integer startTime
    /* Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. */
    Integer endTime
    
    CampaignSummaryStatus summaryStatus
    /* Determine if a campaign has flexible daily budgets setup. */
    Boolean isFlexibleDailyBudgets
    /* When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account. */
    Integer defaultAdGroupBudgetInMicroCurrency
    /* Specifies whether the campaign was created in the automated campaign flow */
    Boolean isAutomatedCampaign
    /* Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared. */
    Boolean isCampaignBudgetOptimization
    
    ObjectiveType objectiveType
}
