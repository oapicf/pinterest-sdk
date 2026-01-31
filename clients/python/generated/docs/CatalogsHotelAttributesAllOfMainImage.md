# CatalogsHotelAttributesAllOfMainImage

The main hotel image

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**link** | **str** | &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your hotel. The URL of your main_image.link must be accessible by the Pinterest user-agent, and send the accurate image. Please make sure there is no template or placeholder image at the link. Must start with http:// or https://.&lt;/p&gt; | [optional] 
**tag** | **List[str]** | Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image | [optional] 

## Example

```python
from pinterestsdk.models.catalogs_hotel_attributes_all_of_main_image import CatalogsHotelAttributesAllOfMainImage

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsHotelAttributesAllOfMainImage from a JSON string
catalogs_hotel_attributes_all_of_main_image_instance = CatalogsHotelAttributesAllOfMainImage.from_json(json)
# print the JSON string representation of the object
print(CatalogsHotelAttributesAllOfMainImage.to_json())

# convert the object into a dict
catalogs_hotel_attributes_all_of_main_image_dict = catalogs_hotel_attributes_all_of_main_image_instance.to_dict()
# create an instance of CatalogsHotelAttributesAllOfMainImage from a dict
catalogs_hotel_attributes_all_of_main_image_from_dict = CatalogsHotelAttributesAllOfMainImage.from_dict(catalogs_hotel_attributes_all_of_main_image_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


