# AdPreviewCreateFromImage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**image_url** | **str** | Image URL. | 
**title** | **str** | Title displayed below ad. | 

## Example

```python
from pinterestsdk.models.ad_preview_create_from_image import AdPreviewCreateFromImage

# TODO update the JSON string below
json = "{}"
# create an instance of AdPreviewCreateFromImage from a JSON string
ad_preview_create_from_image_instance = AdPreviewCreateFromImage.from_json(json)
# print the JSON string representation of the object
print(AdPreviewCreateFromImage.to_json())

# convert the object into a dict
ad_preview_create_from_image_dict = ad_preview_create_from_image_instance.to_dict()
# create an instance of AdPreviewCreateFromImage from a dict
ad_preview_create_from_image_from_dict = AdPreviewCreateFromImage.from_dict(ad_preview_create_from_image_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


