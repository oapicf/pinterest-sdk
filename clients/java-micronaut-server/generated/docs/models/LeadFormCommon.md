

# LeadFormCommon

Creation fields

The class is defined in **[LeadFormCommon.java](../../src/main/java/org/openapitools/model/LeadFormCommon.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | `String` | Internal name of the lead form. |  [optional property]
**privacyPolicyLink** | `String` | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. |  [optional property]
**hasAcceptedTerms** | `Boolean` | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s &lt;a href&#x3D;\&quot;https://policy.pinterest.com/en/lead-ad-terms\&quot;&gt;Lead Ad Terms&lt;/a&gt;. As a reminder, all advertising on Pinterest is subject to the &lt;a href&#x3D;\&quot;https://business.pinterest.com/en/pinterest-advertising-services-agreement/\&quot;&gt;Pinterest Advertising Services Agreement&lt;/a&gt; or an equivalent agreement as set forth on an IO |  [optional property]
**completionMessage** | `String` | A message for people who complete the form to let them know what happens next. |  [optional property]
**status** | `LeadFormStatus` |  |  [optional property]
**disclosureLanguage** | `String` | Additional disclosure language to be included in the lead form. |  [optional property]
**questions** | [`List&lt;LeadFormQuestion&gt;`](LeadFormQuestion.md) | List of questions to be displayed on the lead form. |  [optional property]
**policyLinks** | [`List&lt;LeadFormCommonPolicyLinksInner&gt;`](LeadFormCommonPolicyLinksInner.md) | List of additional policy links to be displayed on the lead form. |  [optional property]










