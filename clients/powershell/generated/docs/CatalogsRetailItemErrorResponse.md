# CatalogsRetailItemErrorResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**Errors** | [**ItemValidationEvent[]**](ItemValidationEvent.md) | Array with the errors for the item id requested | 
**ItemId** | **String** | The catalog item id in the merchant namespace | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsRetailItemErrorResponse = Initialize-PSOpenAPIToolsCatalogsRetailItemErrorResponse  -CatalogType null `
 -Errors null `
 -ItemId DS0294-M
```

- Convert the resource to JSON
```powershell
$CatalogsRetailItemErrorResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

