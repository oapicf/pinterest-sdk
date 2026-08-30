# CampaignDeliveryEstimatesCampaign

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroups** | [**AdGroupDeliveryEstimates**](AdGroupDeliveryEstimates.md) |  | [default to null]
**budgetDurationType** | [***BudgetDurationType**](BudgetDurationType.md) | Duration type of the budget | [default to null]
**dailySpendCap** | **Int!** | Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required. | [optional] [default to null]
**endDate** | **String!** | End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME. | [optional] [default to null]
**lifetimeSpendCap** | **Int!** | Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending. | [optional] [default to null]
**objectiveType** | [***DeliveryEstimateObjectiveType**](DeliveryEstimateObjectiveType.md) |  | [default to null]
**startDate** | **String!** | Start date of the date range for an ad campaign, pattern YYYY-MM-DD. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


