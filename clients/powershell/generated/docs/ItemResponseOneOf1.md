# ItemResponseOneOf1
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**Errors** | [**ItemValidationEvent[]**](ItemValidationEvent.md) |  | 
**ItemId** | **String** | The catalog item id in the merchant namespace | [optional] 
**HotelId** | **String** | The catalog hotel id in the merchant namespace | [optional] 
**CreativeAssetsId** | **String** | The catalog creative assets id in the merchant namespace | [optional] 

## Examples

- Prepare the resource
```powershell
$ItemResponseOneOf1 = Initialize-PSOpenAPIToolsItemResponseOneOf1  -CatalogType null `
 -Errors null `
 -ItemId DS0294-M `
 -HotelId DS0294-M `
 -CreativeAssetsId DS0294-M
```

- Convert the resource to JSON
```powershell
$ItemResponseOneOf1 | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

