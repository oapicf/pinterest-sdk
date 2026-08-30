# ProductTagsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ProductTags** | [**ProductTagItem[]**](ProductTagItem.md) | List of product tags on the pin. | 

## Examples

- Prepare the resource
```powershell
$ProductTagsResponse = Initialize-PSOpenAPIToolsProductTagsResponse  -ProductTags null
```

- Convert the resource to JSON
```powershell
$ProductTagsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

