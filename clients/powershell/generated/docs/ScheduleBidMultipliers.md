# ScheduleBidMultipliers
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AgeBucketMultipliers** | [**BidOptionsAgeBucketMultipliers**](BidOptionsAgeBucketMultipliers.md) |  | [optional] 
**AppTypeMultipliers** | [**BidOptionsAppTypeMultipliers**](BidOptionsAppTypeMultipliers.md) |  | [optional] 
**AudienceMultipliers** | [**BidOptionsAudienceMultipliers[]**](BidOptionsAudienceMultipliers.md) |  | [optional] 
**GenderMultipliers** | [**BidOptionsGenderMultipliers**](BidOptionsGenderMultipliers.md) |  | [optional] 
**PlacementMultipliers** | [**BidOptionsPlacementMultipliers**](BidOptionsPlacementMultipliers.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ScheduleBidMultipliers = Initialize-PSOpenAPIToolsScheduleBidMultipliers  -AgeBucketMultipliers null `
 -AppTypeMultipliers null `
 -AudienceMultipliers null `
 -GenderMultipliers null `
 -PlacementMultipliers null
```

- Convert the resource to JSON
```powershell
$ScheduleBidMultipliers | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

