# CatalogsCreativeAssetsBatchItem
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreativeAssetsId** | **String** | The catalog creative assets id in the merchant namespace | 
**Operation** | **String** |  | 
**Attributes** | [**CatalogsUpdatableCreativeAssetsAttributes**](CatalogsUpdatableCreativeAssetsAttributes.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsCreativeAssetsBatchItem = Initialize-PSOpenAPIToolsCatalogsCreativeAssetsBatchItem  -CreativeAssetsId DS0294-M `
 -Operation null `
 -Attributes null
```

- Convert the resource to JSON
```powershell
$CatalogsCreativeAssetsBatchItem | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

