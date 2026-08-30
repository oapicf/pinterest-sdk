
# CampaignDeliveryEstimatesCampaign

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **adGroups** | [**kotlin.collections.List&lt;AdGroupDeliveryEstimates&gt;**](AdGroupDeliveryEstimates.md) |  |  |
| **budgetDurationType** | [**BudgetDurationType**](BudgetDurationType.md) | Duration type of the budget |  |
| **objectiveType** | [**DeliveryEstimateObjectiveType**](DeliveryEstimateObjectiveType.md) |  |  |
| **startDate** | **kotlin.String** | Start date of the date range for an ad campaign, pattern YYYY-MM-DD. |  |
| **dailySpendCap** | **kotlin.Int** | Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required. |  [optional] |
| **endDate** | **kotlin.String** | End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME. |  [optional] |
| **lifetimeSpendCap** | **kotlin.Int** | Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending. |  [optional] |



