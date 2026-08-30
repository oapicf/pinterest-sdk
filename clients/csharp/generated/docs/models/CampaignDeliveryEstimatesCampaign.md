# Org.OpenAPITools.Model.CampaignDeliveryEstimatesCampaign
Campaign configuration for delivery estimates.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdGroups** | [**List&lt;AdGroupDeliveryEstimates&gt;**](AdGroupDeliveryEstimates.md) |  | 
**BudgetDurationType** | **BudgetDurationType** | Duration type of the budget | 
**ObjectiveType** | **DeliveryEstimateObjectiveType** |  | 
**StartDate** | **string** | Start date of the date range for an ad campaign, pattern YYYY-MM-DD. | 
**DailySpendCap** | **int** | Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required. | [optional] 
**EndDate** | **string** | End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME. | [optional] 
**LifetimeSpendCap** | **int** | Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending. | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

