# BidFloorCreate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BidFloorSpecs** | [**BidFloorSpec[]**](BidFloorSpec.md) | List of bid floor specifications. | 
**TargetingSpec** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) | Ad group targeting specification defining the ad group target audience. | [optional] 

## Examples

- Prepare the resource
```powershell
$BidFloorCreate = Initialize-PSOpenAPIToolsBidFloorCreate  -BidFloorSpecs null `
 -TargetingSpec null
```

- Convert the resource to JSON
```powershell
$BidFloorCreate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

