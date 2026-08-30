

# CampaignDeliveryEstimatesCampaign

Campaign configuration for delivery estimates.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**adGroups** | [**List&lt;AdGroupDeliveryEstimates&gt;**](AdGroupDeliveryEstimates.md) |  |  |
|**budgetDurationType** | **BudgetDurationType** | Duration type of the budget |  |
|**dailySpendCap** | **Integer** | Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required. |  [optional] |
|**endDate** | **String** | End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME. |  [optional] |
|**lifetimeSpendCap** | **Integer** | Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending. |  [optional] |
|**objectiveType** | **DeliveryEstimateObjectiveType** |  |  |
|**startDate** | **String** | Start date of the date range for an ad campaign, pattern YYYY-MM-DD. |  |



