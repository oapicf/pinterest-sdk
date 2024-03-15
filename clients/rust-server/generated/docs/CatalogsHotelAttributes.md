# CatalogsHotelAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The hotel's name. | [optional] [default to None]
**link** | **String** | Link to the product page | [optional] [default to None]
**description** | **String** | Brief description of the hotel. | [optional] [default to None]
**brand** | **String** | The brand to which this hotel belongs to. | [optional] [default to None]
**latitude** | **f64** | Latitude of the hotel. | [optional] [default to None]
**longitude** | **f64** | Longitude of the hotel. | [optional] [default to None]
**neighborhood** | **Vec<String>** | A list of neighborhoods where the hotel is located | [optional] [default to None]
**address** | [***models::CatalogsHotelAddress**](CatalogsHotelAddress.md) |  | [optional] [default to None]
**custom_label_0** | **String** | Custom grouping of hotels | [optional] [default to None]
**custom_label_1** | **String** | Custom grouping of hotels | [optional] [default to None]
**custom_label_2** | **String** | Custom grouping of hotels | [optional] [default to None]
**custom_label_3** | **String** | Custom grouping of hotels | [optional] [default to None]
**custom_label_4** | **String** | Custom grouping of hotels | [optional] [default to None]
**category** | **String** | The type of property. The category can be any type of internal description desired. | [optional] [default to None]
**base_price** | **String** | Base price of the hotel room per night followed by the ISO currency code | [optional] [default to None]
**sale_price** | **String** | Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel. | [optional] [default to None]
**guest_ratings** | [***models::CatalogsHotelGuestRatings**](CatalogsHotelGuestRatings.md) |  | [optional] [default to None]
**main_image** | [***models::CatalogsHotelAttributesAllOfMainImage**](CatalogsHotelAttributes_allOf_main_image.md) |  | [optional] [default to None]
**additional_image_link** | **Vec<String>** | <p><= 2000 characters</p> <p>The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.</p> | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


