# CatalogsHotelBatchRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogId** | **String** | Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog | [optional] 
**CatalogType** | **String** |  | 
**Country** | [**Country**](Country.md) |  | 
**Items** | [**CatalogsHotelBatchItem[]**](CatalogsHotelBatchItem.md) | Array with catalogs item operations | 
**Language** | **String** | We recommend using the CatalogsLocale values. | 

## Examples

- Prepare the resource
```powershell
$CatalogsHotelBatchRequest = Initialize-PSOpenAPIToolsCatalogsHotelBatchRequest  -CatalogId 2680059592705 `
 -CatalogType null `
 -Country null `
 -Items null `
 -Language null
```

- Convert the resource to JSON
```powershell
$CatalogsHotelBatchRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

