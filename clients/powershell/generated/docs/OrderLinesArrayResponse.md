# OrderLinesArrayResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**OrderLines[]**](OrderLines.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrderLinesArrayResponse = Initialize-PSOpenAPIToolsOrderLinesArrayResponse  -Items null
```

- Convert the resource to JSON
```powershell
$OrderLinesArrayResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

