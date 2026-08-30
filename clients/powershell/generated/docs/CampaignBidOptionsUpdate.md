# CampaignBidOptionsUpdate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AgeBucketMultipliers** | [**AgeBucketMultipliers**](AgeBucketMultipliers.md) | Age bucket multipliers for bid adjustments. | [optional] 
**AppTypeMultipliers** | [**AppTypeMultipliers**](AppTypeMultipliers.md) | App type multipliers for bid adjustments. | [optional] 
**AudienceMultipliers** | [**CampaignAudienceMultipliers**](CampaignAudienceMultipliers.md) | Audience multipliers for bid adjustments. | [optional] 
**FreqBidMultiplierTimeWindow** | [**FreqBidMultiplierTimeWindow**](FreqBidMultiplierTimeWindow.md) | The time window for frequency bid multipliers. | [optional] 
**FrequencyMultipliers** | [**FrequencyMultipliers**](FrequencyMultipliers.md) | Frequency multipliers for bid adjustments. | [optional] 
**GenderMultipliers** | [**GenderMultipliers**](GenderMultipliers.md) | Gender multipliers for bid adjustments. | [optional] 
**PlacementMultipliers** | [**PlacementMultipliers**](PlacementMultipliers.md) | Placement multipliers for bid adjustments. | [optional] 
**UpdateMask** | [**CampaignBidOptionsUpdateMaskItems[]**](CampaignBidOptionsUpdateMaskItems.md) | List of fields to update. Only the fields in the list will be updated. | 

## Examples

- Prepare the resource
```powershell
$CampaignBidOptionsUpdate = Initialize-PSOpenAPIToolsCampaignBidOptionsUpdate  -AgeBucketMultipliers null `
 -AppTypeMultipliers null `
 -AudienceMultipliers null `
 -FreqBidMultiplierTimeWindow null `
 -FrequencyMultipliers null `
 -GenderMultipliers null `
 -PlacementMultipliers null `
 -UpdateMask null
```

- Convert the resource to JSON
```powershell
$CampaignBidOptionsUpdate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

