# PinMediaSourceImageURL

Image URL-based media source.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_standard** | **bool** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to True]
**source_type** | **str** | The source type of the media. | 
**url** | **str** |  | 

## Example

```python
from pinterestsdk.models.pin_media_source_image_url import PinMediaSourceImageURL

# TODO update the JSON string below
json = "{}"
# create an instance of PinMediaSourceImageURL from a JSON string
pin_media_source_image_url_instance = PinMediaSourceImageURL.from_json(json)
# print the JSON string representation of the object
print(PinMediaSourceImageURL.to_json())

# convert the object into a dict
pin_media_source_image_url_dict = pin_media_source_image_url_instance.to_dict()
# create an instance of PinMediaSourceImageURL from a dict
pin_media_source_image_url_from_dict = PinMediaSourceImageURL.from_dict(pin_media_source_image_url_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


