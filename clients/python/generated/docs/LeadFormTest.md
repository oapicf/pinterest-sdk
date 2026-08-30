# LeadFormTest

Lead form test action: submit sample answers and receive the resulting subscription id.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subscription_id** | **str** | Subscription ID. | [optional] [readonly] 

## Example

```python
from pinterestsdk.models.lead_form_test import LeadFormTest

# TODO update the JSON string below
json = "{}"
# create an instance of LeadFormTest from a JSON string
lead_form_test_instance = LeadFormTest.from_json(json)
# print the JSON string representation of the object
print(LeadFormTest.to_json())

# convert the object into a dict
lead_form_test_dict = lead_form_test_instance.to_dict()
# create an instance of LeadFormTest from a dict
lead_form_test_from_dict = LeadFormTest.from_dict(lead_form_test_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


