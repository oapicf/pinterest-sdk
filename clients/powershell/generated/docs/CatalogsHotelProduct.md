# CatalogsHotelProduct
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **String** |  | 
**Metadata** | [**CatalogsHotelProductMetadata**](CatalogsHotelProductMetadata.md) |  | 
**Pin** | [**Pin**](Pin.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsHotelProduct = Initialize-PSOpenAPIToolsCatalogsHotelProduct  -CatalogType null `
 -Metadata null `
 -Pin null
```

- Convert the resource to JSON
```powershell
$CatalogsHotelProduct | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

