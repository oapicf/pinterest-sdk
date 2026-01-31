# LeadFormArrayResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[LeadFormArrayResponseItemsInner]**](LeadFormArrayResponseItemsInner.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.lead_form_array_response import LeadFormArrayResponse

# TODO update the JSON string below
json = "{}"
# create an instance of LeadFormArrayResponse from a JSON string
lead_form_array_response_instance = LeadFormArrayResponse.from_json(json)
# print the JSON string representation of the object
print(LeadFormArrayResponse.to_json())

# convert the object into a dict
lead_form_array_response_dict = lead_form_array_response_instance.to_dict()
# create an instance of LeadFormArrayResponse from a dict
lead_form_array_response_from_dict = LeadFormArrayResponse.from_dict(lead_form_array_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


