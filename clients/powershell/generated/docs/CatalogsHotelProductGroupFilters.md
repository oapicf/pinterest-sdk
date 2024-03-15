# CatalogsHotelProductGroupFilters
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AnyOf** | [**CatalogsHotelProductGroupFilterKeys[]**](CatalogsHotelProductGroupFilterKeys.md) |  | 
**AllOf** | [**CatalogsHotelProductGroupFilterKeys[]**](CatalogsHotelProductGroupFilterKeys.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsHotelProductGroupFilters = Initialize-PSOpenAPIToolsCatalogsHotelProductGroupFilters  -AnyOf null `
 -AllOf null
```

- Convert the resource to JSON
```powershell
$CatalogsHotelProductGroupFilters | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

