# CatalogsCreativeAssetsItemResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attributes** | [**CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md) |  | [optional] 
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**CreativeAssetsId** | **String** | The catalog creative assets id in the merchant namespace | [optional] 
**Pins** | [**Pin[]**](Pin.md) | The pins mapped to the item | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsCreativeAssetsItemResponse = Initialize-PSOpenAPIToolsCatalogsCreativeAssetsItemResponse  -Attributes null `
 -CatalogType null `
 -CreativeAssetsId DS0294-M `
 -Pins null
```

- Convert the resource to JSON
```powershell
$CatalogsCreativeAssetsItemResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

