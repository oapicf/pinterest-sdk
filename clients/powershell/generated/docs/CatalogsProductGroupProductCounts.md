# CatalogsProductGroupProductCounts
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**InStock** | **Decimal** |  | 
**OutOfStock** | **Decimal** |  | 
**Preorder** | **Decimal** |  | 
**Total** | **Decimal** |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsProductGroupProductCounts = Initialize-PSOpenAPIToolsCatalogsProductGroupProductCounts  -InStock null `
 -OutOfStock null `
 -Preorder null `
 -Total null
```

- Convert the resource to JSON
```powershell
$CatalogsProductGroupProductCounts | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

