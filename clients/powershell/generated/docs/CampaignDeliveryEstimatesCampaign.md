# CampaignDeliveryEstimatesCampaign
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdGroups** | [**AdGroupDeliveryEstimates[]**](AdGroupDeliveryEstimates.md) |  | 
**BudgetDurationType** | [**BudgetDurationType**](BudgetDurationType.md) | Duration type of the budget | 
**DailySpendCap** | **Int32** | Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required. | [optional] 
**EndDate** | **String** | End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME. | [optional] 
**LifetimeSpendCap** | **Int32** | Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending. | [optional] 
**ObjectiveType** | [**DeliveryEstimateObjectiveType**](DeliveryEstimateObjectiveType.md) |  | 
**StartDate** | **String** | Start date of the date range for an ad campaign, pattern YYYY-MM-DD. | 

## Examples

- Prepare the resource
```powershell
$CampaignDeliveryEstimatesCampaign = Initialize-PSOpenAPIToolsCampaignDeliveryEstimatesCampaign  -AdGroups null `
 -BudgetDurationType FIXED_DAILY `
 -DailySpendCap 50000000 `
 -EndDate null `
 -LifetimeSpendCap 500000000 `
 -ObjectiveType null `
 -StartDate null
```

- Convert the resource to JSON
```powershell
$CampaignDeliveryEstimatesCampaign | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

