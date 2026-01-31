# AdArrayResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[AdArrayResponseElement]**](AdArrayResponseElement.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.ad_array_response import AdArrayResponse

# TODO update the JSON string below
json = "{}"
# create an instance of AdArrayResponse from a JSON string
ad_array_response_instance = AdArrayResponse.from_json(json)
# print the JSON string representation of the object
print(AdArrayResponse.to_json())

# convert the object into a dict
ad_array_response_dict = ad_array_response_instance.to_dict()
# create an instance of AdArrayResponse from a dict
ad_array_response_from_dict = AdArrayResponse.from_dict(ad_array_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


