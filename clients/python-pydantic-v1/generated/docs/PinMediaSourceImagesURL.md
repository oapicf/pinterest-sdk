# PinMediaSourceImagesURL

Multiple URL-based images media source

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **int** |  | [optional] 
**items** | [**List[PinMediaSourceImagesURLItem]**](PinMediaSourceImagesURLItem.md) | Array with image objects. | 
**source_type** | **str** | The source type of the media. | 

## Example

```python
from openapi_client.models.pin_media_source_images_url import PinMediaSourceImagesURL

# TODO update the JSON string below
json = "{}"
# create an instance of PinMediaSourceImagesURL from a JSON string
pin_media_source_images_url_instance = PinMediaSourceImagesURL.from_json(json)
# print the JSON string representation of the object
print PinMediaSourceImagesURL.to_json()

# convert the object into a dict
pin_media_source_images_url_dict = pin_media_source_images_url_instance.to_dict()
# create an instance of PinMediaSourceImagesURL from a dict
pin_media_source_images_url_from_dict = PinMediaSourceImagesURL.from_dict(pin_media_source_images_url_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


