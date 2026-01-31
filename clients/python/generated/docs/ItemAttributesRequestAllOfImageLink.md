# ItemAttributesRequestAllOfImageLink

<p><= 2000 characters</p> <p>The links to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://.</p>

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------

## Example

```python
from pinterestsdk.models.item_attributes_request_all_of_image_link import ItemAttributesRequestAllOfImageLink

# TODO update the JSON string below
json = "{}"
# create an instance of ItemAttributesRequestAllOfImageLink from a JSON string
item_attributes_request_all_of_image_link_instance = ItemAttributesRequestAllOfImageLink.from_json(json)
# print the JSON string representation of the object
print(ItemAttributesRequestAllOfImageLink.to_json())

# convert the object into a dict
item_attributes_request_all_of_image_link_dict = item_attributes_request_all_of_image_link_instance.to_dict()
# create an instance of ItemAttributesRequestAllOfImageLink from a dict
item_attributes_request_all_of_image_link_from_dict = ItemAttributesRequestAllOfImageLink.from_dict(item_attributes_request_all_of_image_link_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


