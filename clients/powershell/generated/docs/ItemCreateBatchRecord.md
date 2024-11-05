# ItemCreateBatchRecord
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemId** | **String** | The catalog item id in the merchant namespace | [optional] 
**Attributes** | [**ItemAttributesRequest**](ItemAttributesRequest.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ItemCreateBatchRecord = Initialize-PSOpenAPIToolsItemCreateBatchRecord  -ItemId DS0294-M `
 -Attributes null
```

- Convert the resource to JSON
```powershell
$ItemCreateBatchRecord | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

