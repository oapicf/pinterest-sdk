# LeadFormCreate

Resource create operation model.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completion_message** | **str** | A message for people who complete the form to let them know what happens next. | 
**disclosure_language** | **str** | Additional disclosure language to be included in the lead form. | [optional] 
**has_accepted_terms** | **bool** | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO | 
**name** | **str** | Internal name of the lead form. | 
**policy_links** | [**List[LeadFormPolicyLink]**](LeadFormPolicyLink.md) | List of additional policy links to be displayed on the lead form. | [optional] 
**privacy_policy_link** | **str** | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. | 
**questions** | [**List[LeadFormQuestion]**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. | 
**status** | [**LeadFormStatus**](LeadFormStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.lead_form_create import LeadFormCreate

# TODO update the JSON string below
json = "{}"
# create an instance of LeadFormCreate from a JSON string
lead_form_create_instance = LeadFormCreate.from_json(json)
# print the JSON string representation of the object
print LeadFormCreate.to_json()

# convert the object into a dict
lead_form_create_dict = lead_form_create_instance.to_dict()
# create an instance of LeadFormCreate from a dict
lead_form_create_from_dict = LeadFormCreate.from_dict(lead_form_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


