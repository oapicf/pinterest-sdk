# CatalogsProductGroupUpdateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** |  | [optional] 
**Description** | **String** |  | [optional] 
**IsFeatured** | **Boolean** | boolean indicator of whether the product group is being featured or not | [optional] 
**Filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsProductGroupUpdateRequest = Initialize-PSOpenAPIToolsCatalogsProductGroupUpdateRequest  -Name null `
 -Description null `
 -IsFeatured null `
 -Filters null
```

- Convert the resource to JSON
```powershell
$CatalogsProductGroupUpdateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

