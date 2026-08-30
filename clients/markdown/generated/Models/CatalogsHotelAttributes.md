# CatalogsHotelAttributes
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **address** | [**CatalogsHotelAddress**](CatalogsHotelAddress.md) | Hotel address | [optional] [default to null] |
| **base\_price** | **String** | Base price of the hotel room per night followed by the ISO currency code | [optional] [default to null] |
| **brand** | **String** | The brand to which this hotel belongs to. | [optional] [default to null] |
| **category** | **String** | The type of property. The category can be any type of internal description desired. | [optional] [default to null] |
| **custom\_label\_0** | **String** | Custom grouping of hotels | [optional] [default to null] |
| **custom\_label\_1** | **String** | Custom grouping of hotels | [optional] [default to null] |
| **custom\_label\_2** | **String** | Custom grouping of hotels | [optional] [default to null] |
| **custom\_label\_3** | **String** | Custom grouping of hotels | [optional] [default to null] |
| **custom\_label\_4** | **String** | Custom grouping of hotels | [optional] [default to null] |
| **description** | **String** | Brief description of the hotel. | [optional] [default to null] |
| **guest\_ratings** | [**CatalogsHotelGuestRatings**](CatalogsHotelGuestRatings.md) | If specified, you must provide all properties | [optional] [default to null] |
| **latitude** | **BigDecimal** | Latitude of the hotel. | [optional] [default to null] |
| **link** | **String** | Link to the product page | [optional] [default to null] |
| **longitude** | **BigDecimal** | Longitude of the hotel. | [optional] [default to null] |
| **name** | **String** | The hotel&#39;s name. | [optional] [default to null] |
| **neighborhood** | **List** | A list of neighborhoods where the hotel is located | [optional] [default to null] |
| **sale\_price** | **String** | Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel. | [optional] [default to null] |
| **additional\_image\_link** | **List** | &lt;&#x3D; 2000 characters. The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://. | [optional] [default to null] |
| **ai\_disclosures** | [**List**](CatalogsAiContentDisclosure.md) | AI content disclosures for individual assets (main_image.link or additional_image_link) on this hotel item. Each entry declares which disclosure types apply to a single asset URL. | [optional] [default to null] |
| **main\_image** | [**CatalogsHotelMainImage**](CatalogsHotelMainImage.md) | The main hotel image | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

