# OAILeadFormCreateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **NSString*** | Internal name of the lead form. | 
**privacyPolicyLink** | **NSString*** | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. | 
**hasAcceptedTerms** | **NSNumber*** | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s &lt;a href&#x3D;\&quot;https://policy.pinterest.com/en/lead-ad-terms\&quot;&gt;Lead Ad Terms&lt;/a&gt;. As a reminder, all advertising on Pinterest is subject to the &lt;a href&#x3D;\&quot;https://business.pinterest.com/en/pinterest-advertising-services-agreement/\&quot;&gt;Pinterest Advertising Services Agreement&lt;/a&gt; or an equivalent agreement as set forth on an IO | 
**completionMessage** | **NSString*** | A message for people who complete the form to let them know what happens next. | 
**status** | [**OAILeadFormStatus***](OAILeadFormStatus.md) |  | [optional] 
**disclosureLanguage** | **NSString*** | Additional disclosure language to be included in the lead form. | [optional] 
**questions** | [**NSArray&lt;OAILeadFormQuestion&gt;***](OAILeadFormQuestion.md) | List of questions to be displayed on the lead form. | 
**policyLinks** | [**NSArray&lt;OAILeadFormCommonPolicyLinksInner&gt;***](OAILeadFormCommonPolicyLinksInner.md) | List of additional policy links to be displayed on the lead form. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


