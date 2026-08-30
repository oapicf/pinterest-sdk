# ScheduleBidOptions
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AgeBucketMultipliers** | [**ScheduleAgeBucketMultipliers**](ScheduleAgeBucketMultipliers.md) |  | [optional] 
**AppTypeMultipliers** | [**ScheduleAppTypeMultipliers**](ScheduleAppTypeMultipliers.md) |  | [optional] 
**AudienceMultipliers** | [**ScheduleAudienceMultipliers**](ScheduleAudienceMultipliers.md) |  | [optional] 
**GenderMultipliers** | [**ScheduleBidOptionsGenderMultipliers**](ScheduleBidOptionsGenderMultipliers.md) |  | [optional] 
**PlacementMultipliers** | [**ScheduleBidOptionsPlacementMultipliers**](ScheduleBidOptionsPlacementMultipliers.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ScheduleBidOptions = Initialize-PSOpenAPIToolsScheduleBidOptions  -AgeBucketMultipliers null `
 -AppTypeMultipliers null `
 -AudienceMultipliers null `
 -GenderMultipliers null `
 -PlacementMultipliers null
```

- Convert the resource to JSON
```powershell
$ScheduleBidOptions | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

