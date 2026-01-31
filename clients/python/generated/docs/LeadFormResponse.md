# LeadFormResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completion_message** | **str** | A message for people who complete the form to let them know what happens next. | [optional] 
**disclosure_language** | **str** | Additional disclosure language to be included in the lead form. | [optional] 
**has_accepted_terms** | **bool** | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s &lt;a href&#x3D;\&quot;https://policy.pinterest.com/en/lead-ad-terms\&quot;&gt;Lead Ad Terms&lt;/a&gt;. As a reminder, all advertising on Pinterest is subject to the &lt;a href&#x3D;\&quot;https://business.pinterest.com/en/pinterest-advertising-services-agreement/\&quot;&gt;Pinterest Advertising Services Agreement&lt;/a&gt; or an equivalent agreement as set forth on an IO | [optional] 
**name** | **str** | Internal name of the lead form. | [optional] 
**policy_links** | [**List[LeadFormCommonPolicyLinksInner]**](LeadFormCommonPolicyLinksInner.md) | List of additional policy links to be displayed on the lead form. | [optional] 
**privacy_policy_link** | **str** | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. | [optional] 
**questions** | [**List[LeadFormQuestion]**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. | [optional] 
**status** | [**LeadFormStatus**](LeadFormStatus.md) |  | [optional] 
**ad_account_id** | **str** | The Ad Account ID that this lead form belongs to. | [optional] 
**created_time** | **int** | Lead form creation time. Unix timestamp in seconds. | [optional] 
**id** | **str** | The ID of this lead form | [optional] 
**updated_time** | **int** | Last update time. Unix timestamp in seconds. | [optional] 

## Example

```python
from pinterestsdk.models.lead_form_response import LeadFormResponse

# TODO update the JSON string below
json = "{}"
# create an instance of LeadFormResponse from a JSON string
lead_form_response_instance = LeadFormResponse.from_json(json)
# print the JSON string representation of the object
print(LeadFormResponse.to_json())

# convert the object into a dict
lead_form_response_dict = lead_form_response_instance.to_dict()
# create an instance of LeadFormResponse from a dict
lead_form_response_from_dict = LeadFormResponse.from_dict(lead_form_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


