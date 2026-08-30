# BookClosed
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ConversionMetricsReady** | **Boolean** | Are conversion metrics ready? | 
**NonConversionMetricsReady** | **Boolean** | Are non-conversion metrics ready? | 

## Examples

- Prepare the resource
```powershell
$BookClosed = Initialize-PSOpenAPIToolsBookClosed  -ConversionMetricsReady false `
 -NonConversionMetricsReady false
```

- Convert the resource to JSON
```powershell
$BookClosed | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

