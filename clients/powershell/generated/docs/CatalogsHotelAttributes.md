# CatalogsHotelAttributes
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** | The hotel&#39;s name. | [optional] 
**Link** | **String** | Link to the product page | [optional] 
**Description** | **String** | Brief description of the hotel. | [optional] 
**Brand** | **String** | The brand to which this hotel belongs to. | [optional] 
**Latitude** | **Decimal** | Latitude of the hotel. | [optional] 
**Longitude** | **Decimal** | Longitude of the hotel. | [optional] 
**Neighborhood** | **String[]** | A list of neighborhoods where the hotel is located | [optional] 
**Address** | [**CatalogsHotelAddress**](CatalogsHotelAddress.md) |  | [optional] 
**CustomLabel0** | **String** | Custom grouping of hotels | [optional] 
**CustomLabel1** | **String** | Custom grouping of hotels | [optional] 
**CustomLabel2** | **String** | Custom grouping of hotels | [optional] 
**CustomLabel3** | **String** | Custom grouping of hotels | [optional] 
**CustomLabel4** | **String** | Custom grouping of hotels | [optional] 
**Category** | **String** | The type of property. The category can be any type of internal description desired. | [optional] 
**BasePrice** | **String** | Base price of the hotel room per night followed by the ISO currency code | [optional] 
**SalePrice** | **String** | Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel. | [optional] 
**GuestRatings** | [**CatalogsHotelGuestRatings**](CatalogsHotelGuestRatings.md) |  | [optional] 
**MainImage** | [**CatalogsHotelAttributesAllOfMainImage**](CatalogsHotelAttributesAllOfMainImage.md) |  | [optional] 
**AdditionalImageLink** | **String[]** | &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.&lt;/p&gt; | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsHotelAttributes = Initialize-PSOpenAPIToolsCatalogsHotelAttributes  -Name null `
 -Link null `
 -Description null `
 -Brand null `
 -Latitude null `
 -Longitude null `
 -Neighborhood null `
 -Address null `
 -CustomLabel0 null `
 -CustomLabel1 null `
 -CustomLabel2 null `
 -CustomLabel3 null `
 -CustomLabel4 null `
 -Category null `
 -BasePrice 100 USD `
 -SalePrice 90 USD `
 -GuestRatings null `
 -MainImage null `
 -AdditionalImageLink [&quot;https://scene.example.com/image/image_v2.jpg&quot;,&quot;https://scene.example.com/image/image_v3.jpg&quot;]
```

- Convert the resource to JSON
```powershell
$CatalogsHotelAttributes | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

