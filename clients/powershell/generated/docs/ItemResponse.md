# ItemResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attributes** | [**CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md) |  | [optional] 
**CatalogType** | **String** |  | 
**ItemId** | **String** | The catalog item id in the merchant namespace | [optional] 
**ItemResponseKind** | **String** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 
**Pins** | [**Pin[]**](Pin.md) | The pins mapped to the item | [optional] 
**HotelId** | **String** | The catalog hotel id in the merchant namespace | [optional] 
**CreativeAssetsId** | **String** | The catalog creative assets id in the merchant namespace | [optional] 
**Errors** | [**ItemValidationEvent[]**](ItemValidationEvent.md) | Array with the errors for the item id requested | 

## Examples

- Prepare the resource
```powershell
$ItemResponse = Initialize-PSOpenAPIToolsItemResponse  -Attributes null `
 -CatalogType null `
 -ItemId DS0294-M `
 -ItemResponseKind null `
 -Pins null `
 -HotelId DS0294-M `
 -CreativeAssetsId DS0294-M `
 -Errors null
```

- Convert the resource to JSON
```powershell
$ItemResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

