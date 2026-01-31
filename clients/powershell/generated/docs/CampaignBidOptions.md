# CampaignBidOptions
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AppTypeMultipliers** | [**AppTypeMultipliers**](AppTypeMultipliers.md) |  | [optional] 
**AudienceMultipliers** | [**CampaignAudienceMultipliers**](CampaignAudienceMultipliers.md) |  | [optional] 
**PlacementMultipliers** | [**PlacementMultipliers**](PlacementMultipliers.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CampaignBidOptions = Initialize-PSOpenAPIToolsCampaignBidOptions  -AppTypeMultipliers null `
 -AudienceMultipliers null `
 -PlacementMultipliers null
```

- Convert the resource to JSON
```powershell
$CampaignBidOptions | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

