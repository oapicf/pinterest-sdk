# AdArrayResponseElement


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**AdResponse**](AdResponse.md) |  | [optional] 
**exceptions** | [**Exception**](Exception.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.ad_array_response_element import AdArrayResponseElement

# TODO update the JSON string below
json = "{}"
# create an instance of AdArrayResponseElement from a JSON string
ad_array_response_element_instance = AdArrayResponseElement.from_json(json)
# print the JSON string representation of the object
print(AdArrayResponseElement.to_json())

# convert the object into a dict
ad_array_response_element_dict = ad_array_response_element_instance.to_dict()
# create an instance of AdArrayResponseElement from a dict
ad_array_response_element_from_dict = AdArrayResponseElement.from_dict(ad_array_response_element_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


