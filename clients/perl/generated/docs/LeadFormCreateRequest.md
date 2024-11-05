# WWW::OpenAPIClient::Object::LeadFormCreateRequest

## Load the model package
```perl
use WWW::OpenAPIClient::Object::LeadFormCreateRequest;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **string** | Internal name of the lead form. | 
**privacy_policy_link** | **string** | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. | 
**has_accepted_terms** | **boolean** | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s &lt;a href&#x3D;\&quot;https://policy.pinterest.com/en/lead-ad-terms\&quot;&gt;Lead Ad Terms&lt;/a&gt;. As a reminder, all advertising on Pinterest is subject to the &lt;a href&#x3D;\&quot;https://business.pinterest.com/en/pinterest-advertising-services-agreement/\&quot;&gt;Pinterest Advertising Services Agreement&lt;/a&gt; or an equivalent agreement as set forth on an IO | 
**completion_message** | **string** | A message for people who complete the form to let them know what happens next. | 
**status** | [**LeadFormStatus**](LeadFormStatus.md) |  | [optional] 
**disclosure_language** | **string** | Additional disclosure language to be included in the lead form. | [optional] 
**questions** | [**ARRAY[LeadFormQuestion]**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. | 
**policy_links** | [**ARRAY[LeadFormCommonPolicyLinksInner]**](LeadFormCommonPolicyLinksInner.md) | List of additional policy links to be displayed on the lead form. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


