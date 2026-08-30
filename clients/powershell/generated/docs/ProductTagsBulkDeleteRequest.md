# ProductTagsBulkDeleteRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ProductTags** | [**ProductTagItem[]**](ProductTagItem.md) | List of product tags to delete. | 

## Examples

- Prepare the resource
```powershell
$ProductTagsBulkDeleteRequest = Initialize-PSOpenAPIToolsProductTagsBulkDeleteRequest  -ProductTags null
```

- Convert the resource to JSON
```powershell
$ProductTagsBulkDeleteRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

