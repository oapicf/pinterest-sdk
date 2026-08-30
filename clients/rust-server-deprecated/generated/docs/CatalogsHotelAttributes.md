# CatalogsHotelAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | [***models::CatalogsHotelAddress**](CatalogsHotelAddress.md) | Hotel address | [optional] [default to None]
**base_price** | **swagger::Nullable<String>** | Base price of the hotel room per night followed by the ISO currency code | [optional] [default to None]
**brand** | **swagger::Nullable<String>** | The brand to which this hotel belongs to. | [optional] [default to None]
**category** | **swagger::Nullable<String>** | The type of property. The category can be any type of internal description desired. | [optional] [default to None]
**custom_label_0** | **swagger::Nullable<String>** | Custom grouping of hotels | [optional] [default to None]
**custom_label_1** | **swagger::Nullable<String>** | Custom grouping of hotels | [optional] [default to None]
**custom_label_2** | **swagger::Nullable<String>** | Custom grouping of hotels | [optional] [default to None]
**custom_label_3** | **swagger::Nullable<String>** | Custom grouping of hotels | [optional] [default to None]
**custom_label_4** | **swagger::Nullable<String>** | Custom grouping of hotels | [optional] [default to None]
**description** | **swagger::Nullable<String>** | Brief description of the hotel. | [optional] [default to None]
**guest_ratings** | [***models::CatalogsHotelGuestRatings**](CatalogsHotelGuestRatings.md) | If specified, you must provide all properties | [optional] [default to None]
**latitude** | **f64** | Latitude of the hotel. | [optional] [default to None]
**link** | **swagger::Nullable<String>** | Link to the product page | [optional] [default to None]
**longitude** | **swagger::Nullable<f64>** | Longitude of the hotel. | [optional] [default to None]
**name** | **swagger::Nullable<String>** | The hotel's name. | [optional] [default to None]
**neighborhood** | **swagger::Nullable<Vec<String>>** | A list of neighborhoods where the hotel is located | [optional] [default to None]
**sale_price** | **swagger::Nullable<String>** | Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel. | [optional] [default to None]
**additional_image_link** | **swagger::Nullable<Vec<String>>** | <= 2000 characters. The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://. | [optional] [default to None]
**ai_disclosures** | [**Vec<models::CatalogsAiContentDisclosure>**](CatalogsAiContentDisclosure.md) | AI content disclosures for individual assets (main_image.link or additional_image_link) on this hotel item. Each entry declares which disclosure types apply to a single asset URL. | [optional] [default to None]
**main_image** | [***models::CatalogsHotelMainImage**](CatalogsHotelMainImage.md) | The main hotel image | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


