# CatalogsProductGroupFiltersRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AnyOf** | [**CatalogsProductGroupFilterKeys[]**](CatalogsProductGroupFilterKeys.md) |  | 
**AllOf** | [**CatalogsProductGroupFilterKeys[]**](CatalogsProductGroupFilterKeys.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsProductGroupFiltersRequest = Initialize-PSOpenAPIToolsCatalogsProductGroupFiltersRequest  -AnyOf null `
 -AllOf null
```

- Convert the resource to JSON
```powershell
$CatalogsProductGroupFiltersRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

