# CatalogsHotelBatchRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**Country** | [**Country**](Country.md) |  | 
**Language** | [**Language**](Language.md) |  | 
**Items** | [**CatalogsHotelBatchItem[]**](CatalogsHotelBatchItem.md) | Array with catalogs item operations | 
**CatalogId** | **String** | Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsHotelBatchRequest = Initialize-PSOpenAPIToolsCatalogsHotelBatchRequest  -CatalogType null `
 -Country null `
 -Language null `
 -Items null `
 -CatalogId 2680059592705
```

- Convert the resource to JSON
```powershell
$CatalogsHotelBatchRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

