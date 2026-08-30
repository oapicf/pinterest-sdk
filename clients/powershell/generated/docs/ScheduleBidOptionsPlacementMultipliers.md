# ScheduleBidOptionsPlacementMultipliers
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Browse** | **Double** | Browse (home-feed and related surfaces) | [optional] 
**RelatedPins** | **Double** | Related-Pins placement | [optional] 
**Search** | **Double** | Search placement | [optional] 

## Examples

- Prepare the resource
```powershell
$ScheduleBidOptionsPlacementMultipliers = Initialize-PSOpenAPIToolsScheduleBidOptionsPlacementMultipliers  -Browse null `
 -RelatedPins null `
 -Search null
```

- Convert the resource to JSON
```powershell
$ScheduleBidOptionsPlacementMultipliers | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

