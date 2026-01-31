# CatalogsHotelItemErrorResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**Errors** | [**ItemValidationEvent[]**](ItemValidationEvent.md) | Array with the errors for the item id requested | 
**HotelId** | **String** | The catalog hotel id in the merchant namespace | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsHotelItemErrorResponse = Initialize-PSOpenAPIToolsCatalogsHotelItemErrorResponse  -CatalogType null `
 -Errors null `
 -HotelId DS0294-M
```

- Convert the resource to JSON
```powershell
$CatalogsHotelItemErrorResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

