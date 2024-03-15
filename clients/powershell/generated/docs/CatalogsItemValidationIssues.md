# CatalogsItemValidationIssues
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemNumber** | **Int32** | Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation. | 
**ItemId** | **String** | The merchant-created unique ID that represents the product. | 
**Errors** | [**CatalogsItemValidationErrors**](CatalogsItemValidationErrors.md) |  | 
**Warnings** | [**CatalogsItemValidationWarnings**](CatalogsItemValidationWarnings.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsItemValidationIssues = Initialize-PSOpenAPIToolsCatalogsItemValidationIssues  -ItemNumber 0 `
 -ItemId DS0294-L `
 -Errors null `
 -Warnings null
```

- Convert the resource to JSON
```powershell
$CatalogsItemValidationIssues | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

