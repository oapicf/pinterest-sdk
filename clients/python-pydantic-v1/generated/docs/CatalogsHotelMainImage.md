# CatalogsHotelMainImage

The main hotel image

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**link** | **str** | &lt;&#x3D; 2000 characters. The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Must start with http:// or https://. | [optional] 
**tag** | **List[str]** | Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image | [optional] 

## Example

```python
from openapi_client.models.catalogs_hotel_main_image import CatalogsHotelMainImage

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsHotelMainImage from a JSON string
catalogs_hotel_main_image_instance = CatalogsHotelMainImage.from_json(json)
# print the JSON string representation of the object
print CatalogsHotelMainImage.to_json()

# convert the object into a dict
catalogs_hotel_main_image_dict = catalogs_hotel_main_image_instance.to_dict()
# create an instance of CatalogsHotelMainImage from a dict
catalogs_hotel_main_image_from_dict = CatalogsHotelMainImage.from_dict(catalogs_hotel_main_image_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


