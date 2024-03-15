# catalogs_hotel_attributes_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **char \*** | The hotel&#39;s name. | [optional] 
**link** | **char \*** | Link to the product page | [optional] 
**description** | **char \*** | Brief description of the hotel. | [optional] 
**brand** | **char \*** | The brand to which this hotel belongs to. | [optional] 
**latitude** | **double** | Latitude of the hotel. | [optional] 
**longitude** | **double** | Longitude of the hotel. | [optional] 
**neighborhood** | **list_t \*** | A list of neighborhoods where the hotel is located | [optional] 
**address** | [**catalogs_hotel_address_t**](catalogs_hotel_address.md) \* |  | [optional] 
**custom_label_0** | **char \*** | Custom grouping of hotels | [optional] 
**custom_label_1** | **char \*** | Custom grouping of hotels | [optional] 
**custom_label_2** | **char \*** | Custom grouping of hotels | [optional] 
**custom_label_3** | **char \*** | Custom grouping of hotels | [optional] 
**custom_label_4** | **char \*** | Custom grouping of hotels | [optional] 
**category** | **char \*** | The type of property. The category can be any type of internal description desired. | [optional] 
**base_price** | **char \*** | Base price of the hotel room per night followed by the ISO currency code | [optional] 
**sale_price** | **char \*** | Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel. | [optional] 
**guest_ratings** | [**catalogs_hotel_guest_ratings_t**](catalogs_hotel_guest_ratings.md) \* |  | [optional] 
**main_image** | [**catalogs_hotel_attributes_all_of_main_image_t**](catalogs_hotel_attributes_all_of_main_image.md) \* |  | [optional] 
**additional_image_link** | **list_t \*** | &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.&lt;/p&gt; | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


