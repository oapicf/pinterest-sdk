# WWW::OpenAPIClient::Object::LeadFormCommon

## Load the model package
```perl
use WWW::OpenAPIClient::Object::LeadFormCommon;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **string** | Internal name of the lead form. | [optional] 
**privacy_policy_link** | **string** | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. | [optional] 
**has_accepted_terms** | **boolean** | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad. | [optional] 
**completion_message** | **string** | A message for people who complete the form to let them know what happens next. | [optional] 
**status** | [**LeadFormStatus**](LeadFormStatus.md) |  | [optional] 
**disclosure_language** | **string** | Additional disclosure language to be included in the lead form. | [optional] 
**questions** | [**ARRAY[LeadFormQuestion]**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


