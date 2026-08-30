# AdBatchItem
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarData** | [**Ad**](Ad.md) |  | [optional] 
**Exceptions** | [**PinterestLibError**](PinterestLibError.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AdBatchItem = Initialize-PSOpenAPIToolsAdBatchItem  -VarData null `
 -Exceptions null
```

- Convert the resource to JSON
```powershell
$AdBatchItem | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

