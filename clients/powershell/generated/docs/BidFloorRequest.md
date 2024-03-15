# BidFloorRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BidFloorSpecs** | [**BidFloorSpec[]**](BidFloorSpec.md) |  | 
**TargetingSpec** | [**TargetingSpec**](TargetingSpec.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$BidFloorRequest = Initialize-PSOpenAPIToolsBidFloorRequest  -BidFloorSpecs null `
 -TargetingSpec null
```

- Convert the resource to JSON
```powershell
$BidFloorRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

