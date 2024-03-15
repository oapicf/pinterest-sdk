# CatalogsFeedProductCounts
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Original** | **Int32** | The number of products in the feed file. | [optional] 
**Ingested** | **Int32** | The number of products successfully ingested from the feed file. | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsFeedProductCounts = Initialize-PSOpenAPIToolsCatalogsFeedProductCounts  -Original null `
 -Ingested null
```

- Convert the resource to JSON
```powershell
$CatalogsFeedProductCounts | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

