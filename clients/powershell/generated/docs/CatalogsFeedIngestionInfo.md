# CatalogsFeedIngestionInfo
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**INSTOCK** | **Int32** | The number of ingested products that are in stock. | [optional] 
**OUTOFSTOCK** | **Int32** | The number of ingested products that are in out of stock. | [optional] 
**PREORDER** | **Int32** | The number of ingested products that are in preorder. | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsFeedIngestionInfo = Initialize-PSOpenAPIToolsCatalogsFeedIngestionInfo  -INSTOCK null `
 -OUTOFSTOCK null `
 -PREORDER null
```

- Convert the resource to JSON
```powershell
$CatalogsFeedIngestionInfo | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

