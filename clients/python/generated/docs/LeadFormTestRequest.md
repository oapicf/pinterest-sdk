# LeadFormTestRequest

Request to create test data for lead data test API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**answers** | **List[str]** | Test lead answers. Should follow the creation order. | 

## Example

```python
from pinterestsdk.models.lead_form_test_request import LeadFormTestRequest

# TODO update the JSON string below
json = "{}"
# create an instance of LeadFormTestRequest from a JSON string
lead_form_test_request_instance = LeadFormTestRequest.from_json(json)
# print the JSON string representation of the object
print(LeadFormTestRequest.to_json())

# convert the object into a dict
lead_form_test_request_dict = lead_form_test_request_instance.to_dict()
# create an instance of LeadFormTestRequest from a dict
lead_form_test_request_from_dict = LeadFormTestRequest.from_dict(lead_form_test_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


