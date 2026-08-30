# AdUpdateRequestAllOf1


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The ID of this ad. | 
**pin_id** | **str** | Pin ID. This field may only be updated for draft ads. | [optional] 

## Example

```python
from pinterestsdk.models.ad_update_request_all_of1 import AdUpdateRequestAllOf1

# TODO update the JSON string below
json = "{}"
# create an instance of AdUpdateRequestAllOf1 from a JSON string
ad_update_request_all_of1_instance = AdUpdateRequestAllOf1.from_json(json)
# print the JSON string representation of the object
print(AdUpdateRequestAllOf1.to_json())

# convert the object into a dict
ad_update_request_all_of1_dict = ad_update_request_all_of1_instance.to_dict()
# create an instance of AdUpdateRequestAllOf1 from a dict
ad_update_request_all_of1_from_dict = AdUpdateRequestAllOf1.from_dict(ad_update_request_all_of1_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


