# ItemResponseOneOf
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**Attributes** | [**CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md) |  | [optional] 
**ItemId** | **String** | The catalog retail item id in the merchant namespace | [optional] 
**Pins** | [**Pin[]**](Pin.md) | The pins mapped to the item | [optional] 
**HotelId** | **String** | The catalog hotel id in the merchant namespace | [optional] 
**CreativeAssetsId** | **String** | The catalog creative assets id in the merchant namespace | [optional] 

## Examples

- Prepare the resource
```powershell
$ItemResponseOneOf = Initialize-PSOpenAPIToolsItemResponseOneOf  -CatalogType null `
 -Attributes null `
 -ItemId DS0294-M `
 -Pins null `
 -HotelId DS0294-M `
 -CreativeAssetsId DS0294-M
```

- Convert the resource to JSON
```powershell
$ItemResponseOneOf | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

