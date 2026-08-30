# CampaignDeliveryEstimatesCampaign
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **ad\_groups** | [**List**](AdGroupDeliveryEstimates.md) |  | [default to null] |
| **budget\_duration\_type** | [**BudgetDurationType**](BudgetDurationType.md) | Duration type of the budget | [default to null] |
| **daily\_spend\_cap** | **Integer** | Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required. | [optional] [default to null] |
| **end\_date** | **String** | End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME. | [optional] [default to null] |
| **lifetime\_spend\_cap** | **Integer** | Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending. | [optional] [default to null] |
| **objective\_type** | [**DeliveryEstimateObjectiveType**](DeliveryEstimateObjectiveType.md) |  | [default to null] |
| **start\_date** | **String** | Start date of the date range for an ad campaign, pattern YYYY-MM-DD. | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

