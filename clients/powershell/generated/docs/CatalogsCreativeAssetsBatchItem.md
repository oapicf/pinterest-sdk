# CatalogsCreativeAssetsBatchItem
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attributes** | [**CatalogsUpdatableCreativeAssetsAttributes**](CatalogsUpdatableCreativeAssetsAttributes.md) |  | 
**CreativeAssetsId** | **String** | The catalog creative assets id in the merchant namespace | 
**Operation** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsCreativeAssetsBatchItem = Initialize-PSOpenAPIToolsCatalogsCreativeAssetsBatchItem  -Attributes null `
 -CreativeAssetsId DS0294-M `
 -Operation null
```

- Convert the resource to JSON
```powershell
$CatalogsCreativeAssetsBatchItem | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

