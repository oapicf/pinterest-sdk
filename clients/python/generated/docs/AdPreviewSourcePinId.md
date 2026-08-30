# AdPreviewSourcePinId

Ad preview source from an existing Pin.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creative_type** | [**AdPinPreviewCreativeType**](AdPinPreviewCreativeType.md) | Creative type of the ad preview. | [optional] 
**pin_id** | **str** | Pin ID. | 

## Example

```python
from pinterestsdk.models.ad_preview_source_pin_id import AdPreviewSourcePinId

# TODO update the JSON string below
json = "{}"
# create an instance of AdPreviewSourcePinId from a JSON string
ad_preview_source_pin_id_instance = AdPreviewSourcePinId.from_json(json)
# print the JSON string representation of the object
print(AdPreviewSourcePinId.to_json())

# convert the object into a dict
ad_preview_source_pin_id_dict = ad_preview_source_pin_id_instance.to_dict()
# create an instance of AdPreviewSourcePinId from a dict
ad_preview_source_pin_id_from_dict = AdPreviewSourcePinId.from_dict(ad_preview_source_pin_id_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


