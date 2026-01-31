# CatalogsUpsertCreativeAssetsItem
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attributes** | [**CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md) |  | 
**CreativeAssetsId** | **String** | The catalog creative assets id in the merchant namespace | 
**Operation** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsUpsertCreativeAssetsItem = Initialize-PSOpenAPIToolsCatalogsUpsertCreativeAssetsItem  -Attributes null `
 -CreativeAssetsId DS0294-M `
 -Operation null
```

- Convert the resource to JSON
```powershell
$CatalogsUpsertCreativeAssetsItem | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

