# LeadFormTestResponse

Response for lead data test API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subscription_id** | **str** | Subscription ID. | [optional] 

## Example

```python
from pinterestsdk.models.lead_form_test_response import LeadFormTestResponse

# TODO update the JSON string below
json = "{}"
# create an instance of LeadFormTestResponse from a JSON string
lead_form_test_response_instance = LeadFormTestResponse.from_json(json)
# print the JSON string representation of the object
print(LeadFormTestResponse.to_json())

# convert the object into a dict
lead_form_test_response_dict = lead_form_test_response_instance.to_dict()
# create an instance of LeadFormTestResponse from a dict
lead_form_test_response_from_dict = LeadFormTestResponse.from_dict(lead_form_test_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


