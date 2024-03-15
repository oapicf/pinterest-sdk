# CatalogsDeleteHotelItem
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**HotelId** | **String** | The catalog hotel id in the merchant namespace | 
**Operation** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsDeleteHotelItem = Initialize-PSOpenAPIToolsCatalogsDeleteHotelItem  -HotelId DS0294-M `
 -Operation null
```

- Convert the resource to JSON
```powershell
$CatalogsDeleteHotelItem | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

