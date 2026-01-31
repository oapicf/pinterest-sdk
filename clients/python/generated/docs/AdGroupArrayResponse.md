# AdGroupArrayResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[AdGroupArrayResponseElement]**](AdGroupArrayResponseElement.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.ad_group_array_response import AdGroupArrayResponse

# TODO update the JSON string below
json = "{}"
# create an instance of AdGroupArrayResponse from a JSON string
ad_group_array_response_instance = AdGroupArrayResponse.from_json(json)
# print the JSON string representation of the object
print(AdGroupArrayResponse.to_json())

# convert the object into a dict
ad_group_array_response_dict = ad_group_array_response_instance.to_dict()
# create an instance of AdGroupArrayResponse from a dict
ad_group_array_response_from_dict = AdGroupArrayResponse.from_dict(ad_group_array_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


