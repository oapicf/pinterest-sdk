# ItemResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**ItemId** | **String** | The catalog item id in the merchant namespace | [optional] 
**Pins** | [**Pin[]**](Pin.md) | The pins mapped to the item | [optional] 
**Attributes** | [**CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md) |  | [optional] 
**HotelId** | **String** | The catalog hotel id in the merchant namespace | [optional] 
**CreativeAssetsId** | **String** | The catalog creative assets id in the merchant namespace | [optional] 
**Errors** | [**ItemValidationEvent[]**](ItemValidationEvent.md) | Array with the errors for the item id requested | [optional] 

## Examples

- Prepare the resource
```powershell
$ItemResponse = Initialize-PSOpenAPIToolsItemResponse  -CatalogType null `
 -ItemId DS0294-M `
 -Pins null `
 -Attributes null `
 -HotelId DS0294-M `
 -CreativeAssetsId DS0294-M `
 -Errors null
```

- Convert the resource to JSON
```powershell
$ItemResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

