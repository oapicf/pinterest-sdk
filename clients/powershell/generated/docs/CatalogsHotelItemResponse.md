# CatalogsHotelItemResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attributes** | [**CatalogsHotelAttributes**](CatalogsHotelAttributes.md) |  | [optional] 
**CatalogType** | **String** |  | 
**HotelId** | **String** | The catalog hotel id in the merchant namespace | [optional] 
**ItemResponseKind** | **String** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 
**Pins** | [**Pin[]**](Pin.md) | The pins mapped to the item | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsHotelItemResponse = Initialize-PSOpenAPIToolsCatalogsHotelItemResponse  -Attributes null `
 -CatalogType null `
 -HotelId DS0294-M `
 -ItemResponseKind null `
 -Pins null
```

- Convert the resource to JSON
```powershell
$CatalogsHotelItemResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

