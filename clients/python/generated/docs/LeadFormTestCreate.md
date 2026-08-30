# LeadFormTestCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**answers** | **List[str]** | Test lead answers. Should follow the creation order. | 

## Example

```python
from pinterestsdk.models.lead_form_test_create import LeadFormTestCreate

# TODO update the JSON string below
json = "{}"
# create an instance of LeadFormTestCreate from a JSON string
lead_form_test_create_instance = LeadFormTestCreate.from_json(json)
# print the JSON string representation of the object
print(LeadFormTestCreate.to_json())

# convert the object into a dict
lead_form_test_create_dict = lead_form_test_create_instance.to_dict()
# create an instance of LeadFormTestCreate from a dict
lead_form_test_create_from_dict = LeadFormTestCreate.from_dict(lead_form_test_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


