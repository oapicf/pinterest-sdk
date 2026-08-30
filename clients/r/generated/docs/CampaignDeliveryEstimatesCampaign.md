# openapi::CampaignDeliveryEstimatesCampaign

Campaign configuration for delivery estimates.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_groups** | [**array[AdGroupDeliveryEstimates]**](AdGroupDeliveryEstimates.md) |  | [Max. items: 10] [Min. items: 1] 
**budget_duration_type** | [**BudgetDurationType**](BudgetDurationType.md) | Duration type of the budget | [Enum: ] 
**daily_spend_cap** | **integer** | Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required. | [optional] 
**end_date** | **character** | End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME. | [optional] [Pattern: ^\\d{4}-\\d{2}-\\d{2}$] 
**lifetime_spend_cap** | **integer** | Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending. | [optional] 
**objective_type** | [**DeliveryEstimateObjectiveType**](DeliveryEstimateObjectiveType.md) |  | [Enum: ] 
**start_date** | **character** | Start date of the date range for an ad campaign, pattern YYYY-MM-DD. | [Pattern: ^\\d{4}-\\d{2}-\\d{2}$] 


