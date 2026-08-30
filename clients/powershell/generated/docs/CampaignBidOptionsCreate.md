# CampaignBidOptionsCreate
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

## Examples

- Prepare the resource
```powershell
$CampaignBidOptionsCreate = Initialize-PSOpenAPIToolsCampaignBidOptionsCreate  -AgeBucketMultipliers null `
 -AppTypeMultipliers null `
 -AudienceMultipliers null `
 -FreqBidMultiplierTimeWindow null `
 -FrequencyMultipliers null `
 -GenderMultipliers null `
 -PlacementMultipliers null
```

- Convert the resource to JSON
```powershell
$CampaignBidOptionsCreate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

