# BidFloor
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BidFloors** | **Int32[]** | A list of bid floors in micro currency. For example, [100000, 200000] | [optional] 
**Type** | **String** | Always the string &#39;bidfloor&#39; | [optional] [default to "bidfloor"]

## Examples

- Prepare the resource
```powershell
$BidFloor = Initialize-PSOpenAPIToolsBidFloor  -BidFloors [100000,200000] `
 -Type bidfloor
```

- Convert the resource to JSON
```powershell
$BidFloor | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

