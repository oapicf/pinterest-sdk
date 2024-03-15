# CatalogsHotelItemResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**HotelId** | **String** | The catalog hotel id in the merchant namespace | [optional] 
**Pins** | [**Pin[]**](Pin.md) | The pins mapped to the item | [optional] 
**Attributes** | [**CatalogsHotelAttributes**](CatalogsHotelAttributes.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsHotelItemResponse = Initialize-PSOpenAPIToolsCatalogsHotelItemResponse  -CatalogType null `
 -HotelId DS0294-M `
 -Pins null `
 -Attributes null
```

- Convert the resource to JSON
```powershell
$CatalogsHotelItemResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

