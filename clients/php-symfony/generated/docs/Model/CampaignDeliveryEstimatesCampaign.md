# CampaignDeliveryEstimatesCampaign

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroups** | [**OpenAPI\Server\Model\AdGroupDeliveryEstimates**](AdGroupDeliveryEstimates.md) |  | 
**budgetDurationType** | [**OpenAPI\Server\Model\BudgetDurationType**](BudgetDurationType.md) | Duration type of the budget | 
**dailySpendCap** | **int** | Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required. | [optional] 
**endDate** | **string** | End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME. | [optional] 
**lifetimeSpendCap** | **int** | Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending. | [optional] 
**objectiveType** | [**OpenAPI\Server\Model\DeliveryEstimateObjectiveType**](DeliveryEstimateObjectiveType.md) |  | 
**startDate** | **string** | Start date of the date range for an ad campaign, pattern YYYY-MM-DD. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


