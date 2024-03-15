# CatalogsProductGroupFilters
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AnyOf** | [**CatalogsProductGroupFilterKeys[]**](CatalogsProductGroupFilterKeys.md) |  | 
**AllOf** | [**CatalogsProductGroupFilterKeys[]**](CatalogsProductGroupFilterKeys.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsProductGroupFilters = Initialize-PSOpenAPIToolsCatalogsProductGroupFilters  -AnyOf null `
 -AllOf null
```

- Convert the resource to JSON
```powershell
$CatalogsProductGroupFilters | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

