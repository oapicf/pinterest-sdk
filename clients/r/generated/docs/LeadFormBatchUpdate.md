# openapi::LeadFormBatchUpdate


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completion_message** | **character** | A message for people who complete the form to let them know what happens next. | [optional] 
**disclosure_language** | **character** | Additional disclosure language to be included in the lead form. | [optional] 
**has_accepted_terms** | **character** | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO | [optional] 
**id** | **character** | The ID of this lead form | [Pattern: ^\\d+$] 
**name** | **character** | Internal name of the lead form. | [optional] 
**policy_links** | [**array[LeadFormPolicyLink]**](LeadFormPolicyLink.md) | List of additional policy links to be displayed on the lead form. | [optional] [Max. items: 3] [Min. items: 0] 
**privacy_policy_link** | **character** | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. | [optional] 
**questions** | [**array[LeadFormQuestion]**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. | [optional] [Max. items: 10] [Min. items: 0] 
**status** | [**LeadFormStatus**](LeadFormStatus.md) |  | [optional] [Enum: ] 


