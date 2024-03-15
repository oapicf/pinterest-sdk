# SummaryPin
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Media** | [**SummaryPinMedia**](SummaryPinMedia.md) |  | [optional] 
**AltText** | **String** |  | [optional] 
**Link** | **String** |  | [optional] 
**Title** | **String** |  | [optional] 
**Description** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$SummaryPin = Initialize-PSOpenAPIToolsSummaryPin  -Media null `
 -AltText null `
 -Link https://www.pinterest.com/ `
 -Title null `
 -Description null
```

- Convert the resource to JSON
```powershell
$SummaryPin | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

