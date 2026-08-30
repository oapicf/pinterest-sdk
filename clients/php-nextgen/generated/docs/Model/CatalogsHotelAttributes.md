# CatalogsHotelAttributes

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | [**\OpenAPI\Client\Model\CatalogsHotelAddress**](CatalogsHotelAddress.md) | Hotel address | [optional]
**base_price** | **string** | Base price of the hotel room per night followed by the ISO currency code | [optional]
**brand** | **string** | The brand to which this hotel belongs to. | [optional]
**category** | **string** | The type of property. The category can be any type of internal description desired. | [optional]
**custom_label_0** | **string** | Custom grouping of hotels | [optional]
**custom_label_1** | **string** | Custom grouping of hotels | [optional]
**custom_label_2** | **string** | Custom grouping of hotels | [optional]
**custom_label_3** | **string** | Custom grouping of hotels | [optional]
**custom_label_4** | **string** | Custom grouping of hotels | [optional]
**description** | **string** | Brief description of the hotel. | [optional]
**guest_ratings** | [**\OpenAPI\Client\Model\CatalogsHotelGuestRatings**](CatalogsHotelGuestRatings.md) | If specified, you must provide all properties | [optional]
**latitude** | **float** | Latitude of the hotel. | [optional]
**link** | **string** | Link to the product page | [optional]
**longitude** | **float** | Longitude of the hotel. | [optional]
**name** | **string** | The hotel&#39;s name. | [optional]
**neighborhood** | **string[]** | A list of neighborhoods where the hotel is located | [optional]
**sale_price** | **string** | Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel. | [optional]
**additional_image_link** | **string[]** | &lt;&#x3D; 2000 characters. The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://. | [optional]
**ai_disclosures** | [**\OpenAPI\Client\Model\CatalogsAiContentDisclosure[]**](CatalogsAiContentDisclosure.md) | AI content disclosures for individual assets (main_image.link or additional_image_link) on this hotel item. Each entry declares which disclosure types apply to a single asset URL. | [optional]
**main_image** | [**\OpenAPI\Client\Model\CatalogsHotelMainImage**](CatalogsHotelMainImage.md) | The main hotel image | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
