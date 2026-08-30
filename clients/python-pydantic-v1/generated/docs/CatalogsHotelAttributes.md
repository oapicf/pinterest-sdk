# CatalogsHotelAttributes


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | [**CatalogsHotelAddress**](CatalogsHotelAddress.md) | Hotel address | [optional] 
**base_price** | **str** | Base price of the hotel room per night followed by the ISO currency code | [optional] 
**brand** | **str** | The brand to which this hotel belongs to. | [optional] 
**category** | **str** | The type of property. The category can be any type of internal description desired. | [optional] 
**custom_label_0** | **str** | Custom grouping of hotels | [optional] 
**custom_label_1** | **str** | Custom grouping of hotels | [optional] 
**custom_label_2** | **str** | Custom grouping of hotels | [optional] 
**custom_label_3** | **str** | Custom grouping of hotels | [optional] 
**custom_label_4** | **str** | Custom grouping of hotels | [optional] 
**description** | **str** | Brief description of the hotel. | [optional] 
**guest_ratings** | [**CatalogsHotelGuestRatings**](CatalogsHotelGuestRatings.md) | If specified, you must provide all properties | [optional] 
**latitude** | **float** | Latitude of the hotel. | [optional] 
**link** | **str** | Link to the product page | [optional] 
**longitude** | **float** | Longitude of the hotel. | [optional] 
**name** | **str** | The hotel&#39;s name. | [optional] 
**neighborhood** | **List[str]** | A list of neighborhoods where the hotel is located | [optional] 
**sale_price** | **str** | Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel. | [optional] 
**additional_image_link** | **List[str]** | &lt;&#x3D; 2000 characters. The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://. | [optional] 
**ai_disclosures** | [**List[CatalogsAiContentDisclosure]**](CatalogsAiContentDisclosure.md) | AI content disclosures for individual assets (main_image.link or additional_image_link) on this hotel item. Each entry declares which disclosure types apply to a single asset URL. | [optional] 
**main_image** | [**CatalogsHotelMainImage**](CatalogsHotelMainImage.md) | The main hotel image | [optional] 

## Example

```python
from openapi_client.models.catalogs_hotel_attributes import CatalogsHotelAttributes

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsHotelAttributes from a JSON string
catalogs_hotel_attributes_instance = CatalogsHotelAttributes.from_json(json)
# print the JSON string representation of the object
print CatalogsHotelAttributes.to_json()

# convert the object into a dict
catalogs_hotel_attributes_dict = catalogs_hotel_attributes_instance.to_dict()
# create an instance of CatalogsHotelAttributes from a dict
catalogs_hotel_attributes_from_dict = CatalogsHotelAttributes.from_dict(catalogs_hotel_attributes_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


