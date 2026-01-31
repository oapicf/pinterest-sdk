# LeadFormCommonPolicyLinksInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label** | **str** | Policy label for an additional policy link. | [optional] 
**link** | **str** | Policy link for an additional policy link. | [optional] 

## Example

```python
from pinterestsdk.models.lead_form_common_policy_links_inner import LeadFormCommonPolicyLinksInner

# TODO update the JSON string below
json = "{}"
# create an instance of LeadFormCommonPolicyLinksInner from a JSON string
lead_form_common_policy_links_inner_instance = LeadFormCommonPolicyLinksInner.from_json(json)
# print the JSON string representation of the object
print(LeadFormCommonPolicyLinksInner.to_json())

# convert the object into a dict
lead_form_common_policy_links_inner_dict = lead_form_common_policy_links_inner_instance.to_dict()
# create an instance of LeadFormCommonPolicyLinksInner from a dict
lead_form_common_policy_links_inner_from_dict = LeadFormCommonPolicyLinksInner.from_dict(lead_form_common_policy_links_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


