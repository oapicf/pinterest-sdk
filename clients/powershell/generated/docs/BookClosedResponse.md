# BookClosedResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ConversionMetricsReady** | **Boolean** | Are conversion metrics ready? | [optional] 
**NonConversionMetricsReady** | **Boolean** | Are non-conversion metrics ready? | [optional] 

## Examples

- Prepare the resource
```powershell
$BookClosedResponse = Initialize-PSOpenAPIToolsBookClosedResponse  -ConversionMetricsReady false `
 -NonConversionMetricsReady false
```

- Convert the resource to JSON
```powershell
$BookClosedResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

