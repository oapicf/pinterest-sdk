# CatalogsFeedValidationDetails
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Errors** | [**CatalogsFeedValidationErrors**](CatalogsFeedValidationErrors.md) |  | 
**Warnings** | [**CatalogsFeedValidationWarnings**](CatalogsFeedValidationWarnings.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsFeedValidationDetails = Initialize-PSOpenAPIToolsCatalogsFeedValidationDetails  -Errors null `
 -Warnings null
```

- Convert the resource to JSON
```powershell
$CatalogsFeedValidationDetails | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

