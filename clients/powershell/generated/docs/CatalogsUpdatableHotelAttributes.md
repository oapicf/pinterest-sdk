# CatalogsUpdatableHotelAttributes
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Address** | [**CatalogsHotelAddress**](CatalogsHotelAddress.md) |  | [optional] 
**BasePrice** | **String** | Base price of the hotel room per night followed by the ISO currency code | [optional] 
**Brand** | **String** | The brand to which this hotel belongs to. | [optional] 
**Category** | **String** | The type of property. The category can be any type of internal description desired. | [optional] 
**CustomLabel0** | **String** | Custom grouping of hotels | [optional] 
**CustomLabel1** | **String** | Custom grouping of hotels | [optional] 
**CustomLabel2** | **String** | Custom grouping of hotels | [optional] 
**CustomLabel3** | **String** | Custom grouping of hotels | [optional] 
**CustomLabel4** | **String** | Custom grouping of hotels | [optional] 
**Description** | **String** | Brief description of the hotel. | [optional] 
**GuestRatings** | [**CatalogsHotelGuestRatings**](CatalogsHotelGuestRatings.md) |  | [optional] 
**Latitude** | **Decimal** | Latitude of the hotel. | [optional] 
**Link** | **String** | Link to the product page | [optional] 
**Longitude** | **Decimal** | Longitude of the hotel. | [optional] 
**Name** | **String** | The hotel&#39;s name. | [optional] 
**Neighborhood** | **String[]** | A list of neighborhoods where the hotel is located | [optional] 
**SalePrice** | **String** | Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel. | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsUpdatableHotelAttributes = Initialize-PSOpenAPIToolsCatalogsUpdatableHotelAttributes  -Address null `
 -BasePrice 100 USD `
 -Brand null `
 -Category null `
 -CustomLabel0 null `
 -CustomLabel1 null `
 -CustomLabel2 null `
 -CustomLabel3 null `
 -CustomLabel4 null `
 -Description null `
 -GuestRatings null `
 -Latitude null `
 -Link null `
 -Longitude null `
 -Name null `
 -Neighborhood null `
 -SalePrice 90 USD
```

- Convert the resource to JSON
```powershell
$CatalogsUpdatableHotelAttributes | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

