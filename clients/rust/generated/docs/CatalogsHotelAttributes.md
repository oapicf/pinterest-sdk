# CatalogsHotelAttributes

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | Option<[**models::CatalogsHotelAddress**](CatalogsHotelAddress.md)> | Hotel address | [optional]
**base_price** | Option<**String**> | Base price of the hotel room per night followed by the ISO currency code | [optional]
**brand** | Option<**String**> | The brand to which this hotel belongs to. | [optional]
**category** | Option<**String**> | The type of property. The category can be any type of internal description desired. | [optional]
**custom_label_0** | Option<**String**> | Custom grouping of hotels | [optional]
**custom_label_1** | Option<**String**> | Custom grouping of hotels | [optional]
**custom_label_2** | Option<**String**> | Custom grouping of hotels | [optional]
**custom_label_3** | Option<**String**> | Custom grouping of hotels | [optional]
**custom_label_4** | Option<**String**> | Custom grouping of hotels | [optional]
**description** | Option<**String**> | Brief description of the hotel. | [optional]
**guest_ratings** | Option<[**models::CatalogsHotelGuestRatings**](CatalogsHotelGuestRatings.md)> | If specified, you must provide all properties | [optional]
**latitude** | Option<**f64**> | Latitude of the hotel. | [optional]
**link** | Option<**String**> | Link to the product page | [optional]
**longitude** | Option<**f64**> | Longitude of the hotel. | [optional]
**name** | Option<**String**> | The hotel's name. | [optional]
**neighborhood** | Option<**Vec<String>**> | A list of neighborhoods where the hotel is located | [optional]
**sale_price** | Option<**String**> | Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel. | [optional]
**additional_image_link** | Option<**Vec<String>**> | <= 2000 characters. The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://. | [optional]
**ai_disclosures** | Option<[**Vec<models::CatalogsAiContentDisclosure>**](CatalogsAiContentDisclosure.md)> | AI content disclosures for individual assets (main_image.link or additional_image_link) on this hotel item. Each entry declares which disclosure types apply to a single asset URL. | [optional]
**main_image** | Option<[**models::CatalogsHotelMainImage**](CatalogsHotelMainImage.md)> | The main hotel image | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


