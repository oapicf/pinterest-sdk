# openapi::LeadForm


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **character** | The Ad Account ID that this lead form belongs to. | [optional] [readonly] [Pattern: ^\\d+$] 
**completion_message** | **character** | A message for people who complete the form to let them know what happens next. | 
**created_time** | **integer** | Lead form creation time. Unix timestamp in seconds. | [optional] [readonly] 
**disclosure_language** | **character** | Additional disclosure language to be included in the lead form. | [optional] 
**has_accepted_terms** | **character** | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO | 
**id** | **character** | The ID of this lead form | [Pattern: ^\\d+$] 
**name** | **character** | Internal name of the lead form. | 
**policy_links** | [**array[LeadFormPolicyLink]**](LeadFormPolicyLink.md) | List of additional policy links to be displayed on the lead form. | [optional] [Max. items: 3] [Min. items: 0] 
**privacy_policy_link** | **character** | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. | 
**questions** | [**array[LeadFormQuestion]**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. | [Max. items: 10] [Min. items: 0] 
**status** | [**LeadFormStatus**](LeadFormStatus.md) |  | [optional] [Enum: ] 
**updated_time** | **integer** | Last update time. Unix timestamp in seconds. | [optional] [readonly] 


