# PerformancePlusCampaignSettings
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BoostProspectingAdGroupBid** | **Boolean** | Whether to boost prospecting ad group bid. | [optional] 
**PinnerListExclusions** | **String[]** | List of campaign-level exclusion pinner list IDs. | [optional] 

## Examples

- Prepare the resource
```powershell
$PerformancePlusCampaignSettings = Initialize-PSOpenAPIToolsPerformancePlusCampaignSettings  -BoostProspectingAdGroupBid null `
 -PinnerListExclusions null
```

- Convert the resource to JSON
```powershell
$PerformancePlusCampaignSettings | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

