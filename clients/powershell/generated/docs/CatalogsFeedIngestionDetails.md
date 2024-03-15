# CatalogsFeedIngestionDetails
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Errors** | [**CatalogsFeedIngestionErrors**](CatalogsFeedIngestionErrors.md) |  | 
**Info** | [**CatalogsFeedIngestionInfo**](CatalogsFeedIngestionInfo.md) |  | 
**Warnings** | [**CatalogsFeedIngestionWarnings**](CatalogsFeedIngestionWarnings.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsFeedIngestionDetails = Initialize-PSOpenAPIToolsCatalogsFeedIngestionDetails  -Errors null `
 -Info null `
 -Warnings null
```

- Convert the resource to JSON
```powershell
$CatalogsFeedIngestionDetails | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

