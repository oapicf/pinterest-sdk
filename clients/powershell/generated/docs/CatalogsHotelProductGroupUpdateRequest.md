# CatalogsHotelProductGroupUpdateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **String** |  | [optional] 
**Description** | **String** |  | [optional] 
**Filters** | [**CatalogsHotelProductGroupFilters**](CatalogsHotelProductGroupFilters.md) |  | [optional] 
**Name** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsHotelProductGroupUpdateRequest = Initialize-PSOpenAPIToolsCatalogsHotelProductGroupUpdateRequest  -CatalogType null `
 -Description null `
 -Filters null `
 -Name null
```

- Convert the resource to JSON
```powershell
$CatalogsHotelProductGroupUpdateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

