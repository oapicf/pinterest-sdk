# LeadFormPolicyLink


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label** | **str** | Policy label for an additional policy link. | [optional] 
**link** | **str** | Policy link for an additional policy link. | [optional] 

## Example

```python
from pinterestsdk.models.lead_form_policy_link import LeadFormPolicyLink

# TODO update the JSON string below
json = "{}"
# create an instance of LeadFormPolicyLink from a JSON string
lead_form_policy_link_instance = LeadFormPolicyLink.from_json(json)
# print the JSON string representation of the object
print(LeadFormPolicyLink.to_json())

# convert the object into a dict
lead_form_policy_link_dict = lead_form_policy_link_instance.to_dict()
# create an instance of LeadFormPolicyLink from a dict
lead_form_policy_link_from_dict = LeadFormPolicyLink.from_dict(lead_form_policy_link_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


