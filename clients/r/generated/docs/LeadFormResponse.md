# openapi::LeadFormResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **character** | Internal name of the lead form. | [optional] 
**privacy_policy_link** | **character** | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. | [optional] 
**has_accepted_terms** | **character** | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad. | [optional] 
**completion_message** | **character** | A message for people who complete the form to let them know what happens next. | [optional] 
**status** | [**LeadFormStatus**](LeadFormStatus.md) |  | [optional] [Enum: ] 
**disclosure_language** | **character** | Additional disclosure language to be included in the lead form. | [optional] 
**questions** | [**array[LeadFormQuestion]**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. | [optional] [Max. items: 10] [Min. items: 0] 
**id** | **character** | The ID of this lead form | [optional] [Pattern: ^\\d+$] 
**ad_account_id** | **character** | The Ad Account ID that this lead form belongs to. | [optional] [Pattern: ^\\d+$] 
**created_time** | **integer** | Lead form creation time. Unix timestamp in seconds. | [optional] 
**updated_time** | **integer** | Last update time. Unix timestamp in seconds. | [optional] 


