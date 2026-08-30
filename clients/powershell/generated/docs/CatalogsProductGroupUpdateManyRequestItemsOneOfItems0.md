# CatalogsProductGroupUpdateManyRequestItemsOneOfItems0
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | **String** |  | [optional] 
**Filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | [optional] 
**IsFeatured** | **Boolean** | boolean indicator of whether the product group is being featured or not | [optional] 
**Name** | **String** |  | [optional] 
**Id** | **String** | ID of the product group. | 

## Examples

- Prepare the resource
```powershell
$CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 = Initialize-PSOpenAPIToolsCatalogsProductGroupUpdateManyRequestItemsOneOfItems0  -Description null `
 -Filters null `
 -IsFeatured null `
 -Name null `
 -Id null
```

- Convert the resource to JSON
```powershell
$CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

