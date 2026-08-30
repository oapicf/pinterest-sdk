# catalogs_hotel_attributes_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | [**catalogs_hotel_address_t**](catalogs_hotel_address.md) \* | Hotel address | [optional] 
**base_price** | **char \*** | Base price of the hotel room per night followed by the ISO currency code | [optional] 
**brand** | **char \*** | The brand to which this hotel belongs to. | [optional] 
**category** | **char \*** | The type of property. The category can be any type of internal description desired. | [optional] 
**custom_label_0** | **char \*** | Custom grouping of hotels | [optional] 
**custom_label_1** | **char \*** | Custom grouping of hotels | [optional] 
**custom_label_2** | **char \*** | Custom grouping of hotels | [optional] 
**custom_label_3** | **char \*** | Custom grouping of hotels | [optional] 
**custom_label_4** | **char \*** | Custom grouping of hotels | [optional] 
**description** | **char \*** | Brief description of the hotel. | [optional] 
**guest_ratings** | [**catalogs_hotel_guest_ratings_t**](catalogs_hotel_guest_ratings.md) \* | If specified, you must provide all properties | [optional] 
**latitude** | **double** | Latitude of the hotel. | [optional] 
**link** | **char \*** | Link to the product page | [optional] 
**longitude** | **double** | Longitude of the hotel. | [optional] 
**name** | **char \*** | The hotel&#39;s name. | [optional] 
**neighborhood** | **list_t \*** | A list of neighborhoods where the hotel is located | [optional] 
**sale_price** | **char \*** | Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel. | [optional] 
**additional_image_link** | **list_t \*** | &lt;&#x3D; 2000 characters. The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://. | [optional] 
**ai_disclosures** | [**list_t**](catalogs_ai_content_disclosure.md) \* | AI content disclosures for individual assets (main_image.link or additional_image_link) on this hotel item. Each entry declares which disclosure types apply to a single asset URL. | [optional] 
**main_image** | [**catalogs_hotel_main_image_t**](catalogs_hotel_main_image.md) \* | The main hotel image | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


