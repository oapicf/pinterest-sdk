# CatalogsHotelAttributes

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | Option<**String**> | The hotel's name. | [optional]
**link** | Option<**String**> | Link to the product page | [optional]
**description** | Option<**String**> | Brief description of the hotel. | [optional]
**brand** | Option<**String**> | The brand to which this hotel belongs to. | [optional]
**latitude** | Option<**f64**> | Latitude of the hotel. | [optional]
**longitude** | Option<**f64**> | Longitude of the hotel. | [optional]
**neighborhood** | Option<**Vec<String>**> | A list of neighborhoods where the hotel is located | [optional]
**address** | Option<[**models::CatalogsHotelAddress**](CatalogsHotelAddress.md)> |  | [optional]
**custom_label_0** | Option<**String**> | Custom grouping of hotels | [optional]
**custom_label_1** | Option<**String**> | Custom grouping of hotels | [optional]
**custom_label_2** | Option<**String**> | Custom grouping of hotels | [optional]
**custom_label_3** | Option<**String**> | Custom grouping of hotels | [optional]
**custom_label_4** | Option<**String**> | Custom grouping of hotels | [optional]
**category** | Option<**String**> | The type of property. The category can be any type of internal description desired. | [optional]
**base_price** | Option<**String**> | Base price of the hotel room per night followed by the ISO currency code | [optional]
**sale_price** | Option<**String**> | Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel. | [optional]
**guest_ratings** | Option<[**models::CatalogsHotelGuestRatings**](CatalogsHotelGuestRatings.md)> |  | [optional]
**main_image** | Option<[**models::CatalogsHotelAttributesAllOfMainImage**](CatalogsHotelAttributes_allOf_main_image.md)> |  | [optional]
**additional_image_link** | Option<**Vec<String>**> | <p><= 2000 characters</p> <p>The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.</p> | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


