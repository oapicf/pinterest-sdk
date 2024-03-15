# WWW::OpenAPIClient::Object::CatalogsHotelAttributes

## Load the model package
```perl
use WWW::OpenAPIClient::Object::CatalogsHotelAttributes;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **string** | The hotel&#39;s name. | [optional] 
**link** | **string** | Link to the product page | [optional] 
**description** | **string** | Brief description of the hotel. | [optional] 
**brand** | **string** | The brand to which this hotel belongs to. | [optional] 
**latitude** | **double** | Latitude of the hotel. | [optional] 
**longitude** | **double** | Longitude of the hotel. | [optional] 
**neighborhood** | **ARRAY[string]** | A list of neighborhoods where the hotel is located | [optional] 
**address** | [**CatalogsHotelAddress**](CatalogsHotelAddress.md) |  | [optional] 
**custom_label_0** | **string** | Custom grouping of hotels | [optional] 
**custom_label_1** | **string** | Custom grouping of hotels | [optional] 
**custom_label_2** | **string** | Custom grouping of hotels | [optional] 
**custom_label_3** | **string** | Custom grouping of hotels | [optional] 
**custom_label_4** | **string** | Custom grouping of hotels | [optional] 
**category** | **string** | The type of property. The category can be any type of internal description desired. | [optional] 
**base_price** | **string** | Base price of the hotel room per night followed by the ISO currency code | [optional] 
**sale_price** | **string** | Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel. | [optional] 
**guest_ratings** | [**CatalogsHotelGuestRatings**](CatalogsHotelGuestRatings.md) |  | [optional] 
**main_image** | [**CatalogsHotelAttributesAllOfMainImage**](CatalogsHotelAttributesAllOfMainImage.md) |  | [optional] 
**additional_image_link** | **ARRAY[string]** | &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.&lt;/p&gt; | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


