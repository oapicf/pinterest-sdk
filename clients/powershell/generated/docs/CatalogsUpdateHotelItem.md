# CatalogsUpdateHotelItem
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**HotelId** | **String** | The catalog hotel item id in the merchant namespace | 
**Operation** | **String** |  | 
**Attributes** | [**CatalogsUpdatableHotelAttributes**](CatalogsUpdatableHotelAttributes.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsUpdateHotelItem = Initialize-PSOpenAPIToolsCatalogsUpdateHotelItem  -HotelId DS0294-M `
 -Operation null `
 -Attributes null
```

- Convert the resource to JSON
```powershell
$CatalogsUpdateHotelItem | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

