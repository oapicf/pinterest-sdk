# AdGroupArrayResponseElement


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**AdGroupResponse**](AdGroupResponse.md) |  | [optional] 
**exceptions** | [**List[Exception]**](Exception.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.ad_group_array_response_element import AdGroupArrayResponseElement

# TODO update the JSON string below
json = "{}"
# create an instance of AdGroupArrayResponseElement from a JSON string
ad_group_array_response_element_instance = AdGroupArrayResponseElement.from_json(json)
# print the JSON string representation of the object
print(AdGroupArrayResponseElement.to_json())

# convert the object into a dict
ad_group_array_response_element_dict = ad_group_array_response_element_instance.to_dict()
# create an instance of AdGroupArrayResponseElement from a dict
ad_group_array_response_element_from_dict = AdGroupArrayResponseElement.from_dict(ad_group_array_response_element_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


