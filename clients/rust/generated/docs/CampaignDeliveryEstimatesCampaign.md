# CampaignDeliveryEstimatesCampaign

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_groups** | [**Vec<models::AdGroupDeliveryEstimates>**](AdGroupDeliveryEstimates.md) |  | 
**budget_duration_type** | [**models::BudgetDurationType**](BudgetDurationType.md) | Duration type of the budget | 
**daily_spend_cap** | Option<**i32**> | Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required. | [optional]
**end_date** | Option<**String**> | End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME. | [optional]
**lifetime_spend_cap** | Option<**i32**> | Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending. | [optional]
**objective_type** | [**models::DeliveryEstimateObjectiveType**](DeliveryEstimateObjectiveType.md) |  | 
**start_date** | **String** | Start date of the date range for an ad campaign, pattern YYYY-MM-DD. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


