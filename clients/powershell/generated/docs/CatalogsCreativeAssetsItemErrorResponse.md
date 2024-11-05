# CatalogsCreativeAssetsItemErrorResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**CreativeAssetsId** | **String** | The catalog creative assets id in the merchant namespace | [optional] 
**Errors** | [**ItemValidationEvent[]**](ItemValidationEvent.md) | Array with the errors for the item id requested | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsCreativeAssetsItemErrorResponse = Initialize-PSOpenAPIToolsCatalogsCreativeAssetsItemErrorResponse  -CatalogType null `
 -CreativeAssetsId DS0294-M `
 -Errors null
```

- Convert the resource to JSON
```powershell
$CatalogsCreativeAssetsItemErrorResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

