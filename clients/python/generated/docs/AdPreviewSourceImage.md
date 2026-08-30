# AdPreviewSourceImage

Ad preview source from an image URL.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**image_url** | **str** | Image URL. | 
**promotion_id** | **str** | Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion. | [optional] 
**title** | **str** | Title displayed below ad. | 

## Example

```python
from pinterestsdk.models.ad_preview_source_image import AdPreviewSourceImage

# TODO update the JSON string below
json = "{}"
# create an instance of AdPreviewSourceImage from a JSON string
ad_preview_source_image_instance = AdPreviewSourceImage.from_json(json)
# print the JSON string representation of the object
print(AdPreviewSourceImage.to_json())

# convert the object into a dict
ad_preview_source_image_dict = ad_preview_source_image_instance.to_dict()
# create an instance of AdPreviewSourceImage from a dict
ad_preview_source_image_from_dict = AdPreviewSourceImage.from_dict(ad_preview_source_image_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


