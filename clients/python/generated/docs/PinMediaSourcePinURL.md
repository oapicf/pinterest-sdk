# PinMediaSourcePinURL

Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_affiliate_link** | **bool** | This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. | [optional] [default to False]
**source_type** | **str** |  | 

## Example

```python
from pinterestsdk.models.pin_media_source_pin_url import PinMediaSourcePinURL

# TODO update the JSON string below
json = "{}"
# create an instance of PinMediaSourcePinURL from a JSON string
pin_media_source_pin_url_instance = PinMediaSourcePinURL.from_json(json)
# print the JSON string representation of the object
print(PinMediaSourcePinURL.to_json())

# convert the object into a dict
pin_media_source_pin_url_dict = pin_media_source_pin_url_instance.to_dict()
# create an instance of PinMediaSourcePinURL from a dict
pin_media_source_pin_url_from_dict = PinMediaSourcePinURL.from_dict(pin_media_source_pin_url_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


