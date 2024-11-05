# CatalogsCreateCreativeAssetsItem
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreativeAssetsId** | **String** | The catalog creative assets id in the merchant namespace | 
**Operation** | **String** |  | 
**Attributes** | [**CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsCreateCreativeAssetsItem = Initialize-PSOpenAPIToolsCatalogsCreateCreativeAssetsItem  -CreativeAssetsId DS0294-M `
 -Operation null `
 -Attributes null
```

- Convert the resource to JSON
```powershell
$CatalogsCreateCreativeAssetsItem | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

