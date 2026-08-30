# CAMPAIGN_DELIVERY_ESTIMATES_CAMPAIGN

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_groups** | [**LIST [AD_GROUP_DELIVERY_ESTIMATES]**](AdGroupDeliveryEstimates.md) |  | [default to null]
**budget_duration_type** | [**BUDGET_DURATION_TYPE**](BudgetDurationType.md) | Duration type of the budget | [default to null]
**daily_spend_cap** | **INTEGER_32** | Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required. | [optional] [default to null]
**end_date** | [**STRING_32**](STRING_32.md) | End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME. | [optional] [default to null]
**lifetime_spend_cap** | **INTEGER_32** | Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending. | [optional] [default to null]
**objective_type** | [**DELIVERY_ESTIMATE_OBJECTIVE_TYPE**](DeliveryEstimateObjectiveType.md) |  | [default to null]
**start_date** | [**STRING_32**](STRING_32.md) | Start date of the date range for an ad campaign, pattern YYYY-MM-DD. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


