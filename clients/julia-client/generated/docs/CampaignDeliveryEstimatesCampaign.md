# CampaignDeliveryEstimatesCampaign


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`ad_groups`** | [**`Vector{AdGroupDeliveryEstimates}`**](AdGroupDeliveryEstimates.md) |  | [default to nothing]
**`budget_duration_type`** | [**`*BudgetDurationType`**](BudgetDurationType.md) | Duration type of the budget | [default to nothing]
**`daily_spend_cap`** | **`Int64`** | Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required. | [optional] [default to nothing]
**`end_date`** | **`String`** | End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME. | [optional] [default to nothing]
**`lifetime_spend_cap`** | **`Int64`** | Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending. | [optional] [default to nothing]
**`objective_type`** | [**`*DeliveryEstimateObjectiveType`**](DeliveryEstimateObjectiveType.md) |  | [default to nothing]
**`start_date`** | **`String`** | Start date of the date range for an ad campaign, pattern YYYY-MM-DD. | [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


