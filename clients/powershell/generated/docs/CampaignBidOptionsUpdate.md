# CampaignBidOptionsUpdate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AppTypeMultipliers** | [**AppTypeMultipliers**](AppTypeMultipliers.md) |  | [optional] 
**AudienceMultipliers** | [**CampaignAudienceMultipliers**](CampaignAudienceMultipliers.md) |  | [optional] 
**PlacementMultipliers** | [**PlacementMultipliers**](PlacementMultipliers.md) |  | [optional] 
**UpdateMask** | **String[]** | List of fields to update, only the fields in the list will be updated. | 

## Examples

- Prepare the resource
```powershell
$CampaignBidOptionsUpdate = Initialize-PSOpenAPIToolsCampaignBidOptionsUpdate  -AppTypeMultipliers null `
 -AudienceMultipliers null `
 -PlacementMultipliers null `
 -UpdateMask null
```

- Convert the resource to JSON
```powershell
$CampaignBidOptionsUpdate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

