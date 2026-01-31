# ItemCreateBatchRecord
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attributes** | [**ItemAttributesRequest**](ItemAttributesRequest.md) |  | [optional] 
**ItemId** | **String** | The catalog item id in the merchant namespace | [optional] 

## Examples

- Prepare the resource
```powershell
$ItemCreateBatchRecord = Initialize-PSOpenAPIToolsItemCreateBatchRecord  -Attributes null `
 -ItemId DS0294-M
```

- Convert the resource to JSON
```powershell
$ItemCreateBatchRecord | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

