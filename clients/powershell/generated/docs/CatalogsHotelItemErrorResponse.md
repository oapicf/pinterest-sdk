# CatalogsHotelItemErrorResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**HotelId** | **String** | The catalog hotel id in the merchant namespace | [optional] 
**Errors** | [**ItemValidationEvent[]**](ItemValidationEvent.md) | Array with the errors for the item id requested | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsHotelItemErrorResponse = Initialize-PSOpenAPIToolsCatalogsHotelItemErrorResponse  -CatalogType null `
 -HotelId DS0294-M `
 -Errors null
```

- Convert the resource to JSON
```powershell
$CatalogsHotelItemErrorResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

