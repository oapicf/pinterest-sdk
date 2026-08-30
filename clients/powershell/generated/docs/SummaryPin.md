# SummaryPin
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AltText** | **String** |  | [optional] 
**Description** | **String** |  | [optional] 
**Id** | **String** |  | 
**Link** | **String** |  | [optional] 
**Media** | [**PinMedia**](PinMedia.md) |  | [optional] [readonly] 
**Title** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$SummaryPin = Initialize-PSOpenAPIToolsSummaryPin  -AltText null `
 -Description null `
 -Id null `
 -Link null `
 -Media null `
 -Title null
```

- Convert the resource to JSON
```powershell
$SummaryPin | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

