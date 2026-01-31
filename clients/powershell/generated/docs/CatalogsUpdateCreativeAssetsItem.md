# CatalogsUpdateCreativeAssetsItem
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attributes** | [**CatalogsUpdatableCreativeAssetsAttributes**](CatalogsUpdatableCreativeAssetsAttributes.md) |  | 
**CreativeAssetsId** | **String** | The catalog creative assets item id in the merchant namespace | 
**Operation** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsUpdateCreativeAssetsItem = Initialize-PSOpenAPIToolsCatalogsUpdateCreativeAssetsItem  -Attributes null `
 -CreativeAssetsId DS0294-M `
 -Operation null
```

- Convert the resource to JSON
```powershell
$CatalogsUpdateCreativeAssetsItem | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

