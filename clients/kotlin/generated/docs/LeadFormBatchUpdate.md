
# LeadFormBatchUpdate

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | The ID of this lead form |  |
| **completionMessage** | **kotlin.String** | A message for people who complete the form to let them know what happens next. |  [optional] |
| **disclosureLanguage** | **kotlin.String** | Additional disclosure language to be included in the lead form. |  [optional] |
| **hasAcceptedTerms** | **kotlin.Boolean** | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO |  [optional] |
| **name** | **kotlin.String** | Internal name of the lead form. |  [optional] |
| **policyLinks** | [**kotlin.collections.List&lt;LeadFormPolicyLink&gt;**](LeadFormPolicyLink.md) | List of additional policy links to be displayed on the lead form. |  [optional] |
| **privacyPolicyLink** | **kotlin.String** | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. |  [optional] |
| **questions** | [**kotlin.collections.List&lt;LeadFormQuestion&gt;**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. |  [optional] |
| **status** | [**LeadFormStatus**](LeadFormStatus.md) |  |  [optional] |



