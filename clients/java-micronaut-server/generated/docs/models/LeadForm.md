

# LeadForm

The class is defined in **[LeadForm.java](../../src/main/java/org/openapitools/model/LeadForm.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | `String` | The Ad Account ID that this lead form belongs to. |  [optional property] [readonly property]
**completionMessage** | `String` | A message for people who complete the form to let them know what happens next. | 
**createdTime** | `Integer` | Lead form creation time. Unix timestamp in seconds. |  [optional property] [readonly property]
**disclosureLanguage** | `String` | Additional disclosure language to be included in the lead form. |  [optional property]
**hasAcceptedTerms** | `Boolean` | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO | 
**id** | `String` | The ID of this lead form | 
**name** | `String` | Internal name of the lead form. | 
**policyLinks** | [`List&lt;LeadFormPolicyLink&gt;`](LeadFormPolicyLink.md) | List of additional policy links to be displayed on the lead form. |  [optional property]
**privacyPolicyLink** | `String` | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. | 
**questions** | [`List&lt;LeadFormQuestion&gt;`](LeadFormQuestion.md) | List of questions to be displayed on the lead form. | 
**status** | `LeadFormStatus` |  |  [optional property]
**updatedTime** | `Integer` | Last update time. Unix timestamp in seconds. |  [optional property] [readonly property]














