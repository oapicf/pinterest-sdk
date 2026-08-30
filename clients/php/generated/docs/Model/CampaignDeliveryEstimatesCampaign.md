# CampaignDeliveryEstimatesCampaign

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_groups** | [**\OpenAPI\Client\Model\AdGroupDeliveryEstimates[]**](AdGroupDeliveryEstimates.md) |  |
**budget_duration_type** | [**\OpenAPI\Client\Model\BudgetDurationType**](BudgetDurationType.md) | Duration type of the budget |
**daily_spend_cap** | **int** | Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required. | [optional]
**end_date** | **string** | End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME. | [optional]
**lifetime_spend_cap** | **int** | Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending. | [optional]
**objective_type** | [**\OpenAPI\Client\Model\DeliveryEstimateObjectiveType**](DeliveryEstimateObjectiveType.md) |  |
**start_date** | **string** | Start date of the date range for an ad campaign, pattern YYYY-MM-DD. |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
