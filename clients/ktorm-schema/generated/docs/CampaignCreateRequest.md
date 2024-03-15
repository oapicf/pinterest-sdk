
# Table `CampaignCreateRequest`
(mapped from: CampaignCreateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**adAccountId** | ad_account_id | text NOT NULL |  | **kotlin.String** | Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. | 
**name** | name | text NOT NULL |  | **kotlin.String** | Campaign name. | 
**objectiveType** | objective_type | long NOT NULL |  | [**ObjectiveType**](ObjectiveType.md) |  |  [foreignkey]
**status** | status | long |  | [**EntityStatus**](EntityStatus.md) |  |  [optional] [foreignkey]
**lifetimeSpendCap** | lifetime_spend_cap | int |  | **kotlin.Int** | Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time. |  [optional]
**dailySpendCap** | daily_spend_cap | int |  | **kotlin.Int** | Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time. |  [optional]
**orderLineId** | order_line_id | text |  | **kotlin.String** | Order line ID that appears on the invoice. |  [optional]
**trackingUrls** | tracking_urls | long |  | [**AdCommonTrackingUrls**](AdCommonTrackingUrls.md) |  |  [optional] [foreignkey]
**startTime** | start_time | int |  | **kotlin.Int** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. |  [optional]
**endTime** | end_time | int |  | **kotlin.Int** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. |  [optional]
**summaryStatus** | summary_status | long |  | [**CampaignSummaryStatus**](CampaignSummaryStatus.md) |  |  [optional] [foreignkey]
**isFlexibleDailyBudgets** | is_flexible_daily_budgets | boolean |  | **kotlin.Boolean** | Determine if a campaign has flexible daily budgets setup. |  [optional]
**defaultAdGroupBudgetInMicroCurrency** | default_ad_group_budget_in_micro_currency | int |  | **kotlin.Int** | When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account. |  [optional]
**isAutomatedCampaign** | is_automated_campaign | boolean |  | **kotlin.Boolean** | Specifies whether the campaign was created in the automated campaign flow |  [optional]
















