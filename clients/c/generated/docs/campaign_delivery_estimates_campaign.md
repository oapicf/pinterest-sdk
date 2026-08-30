# campaign_delivery_estimates_campaign_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_groups** | [**list_t**](ad_group_delivery_estimates.md) \* |  | 
**budget_duration_type** | **budget_duration_type_t \*** | Duration type of the budget | 
**daily_spend_cap** | **int** | Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required. | [optional] 
**end_date** | **char \*** | End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME. | [optional] 
**lifetime_spend_cap** | **int** | Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending. | [optional] 
**objective_type** | **delivery_estimate_objective_type_t \*** |  | 
**start_date** | **char \*** | Start date of the date range for an ad campaign, pattern YYYY-MM-DD. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


