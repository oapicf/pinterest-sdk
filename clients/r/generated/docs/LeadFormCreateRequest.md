# openapi::LeadFormCreateRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **character** | Internal name of the lead form. | 
**privacy_policy_link** | **character** | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. | 
**has_accepted_terms** | **character** | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s &lt;a href&#x3D;\&quot;https://policy.pinterest.com/en/lead-ad-terms\&quot;&gt;Lead Ad Terms&lt;/a&gt;. As a reminder, all advertising on Pinterest is subject to the &lt;a href&#x3D;\&quot;https://business.pinterest.com/en/pinterest-advertising-services-agreement/\&quot;&gt;Pinterest Advertising Services Agreement&lt;/a&gt; or an equivalent agreement as set forth on an IO | 
**completion_message** | **character** | A message for people who complete the form to let them know what happens next. | 
**status** | [**LeadFormStatus**](LeadFormStatus.md) |  | [optional] [Enum: ] 
**disclosure_language** | **character** | Additional disclosure language to be included in the lead form. | [optional] 
**questions** | [**array[LeadFormQuestion]**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. | [Max. items: 10] [Min. items: 0] 
**policy_links** | [**array[LeadFormCommonPolicyLinksInner]**](LeadFormCommon_policy_links_inner.md) | List of additional policy links to be displayed on the lead form. | [optional] [Max. items: 3] [Min. items: 0] 


