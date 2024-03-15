
# LeadFormResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | Internal name of the lead form. |  [optional]
**privacyPolicyLink** | **kotlin.String** | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. |  [optional]
**hasAcceptedTerms** | **kotlin.Boolean** | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad. |  [optional]
**completionMessage** | **kotlin.String** | A message for people who complete the form to let them know what happens next. |  [optional]
**status** | [**LeadFormStatus**](LeadFormStatus.md) |  |  [optional]
**disclosureLanguage** | **kotlin.String** | Additional disclosure language to be included in the lead form. |  [optional]
**questions** | [**kotlin.collections.List&lt;LeadFormQuestion&gt;**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. |  [optional]
**id** | **kotlin.String** | The ID of this lead form |  [optional]
**adAccountId** | **kotlin.String** | The Ad Account ID that this lead form belongs to. |  [optional]
**createdTime** | **kotlin.Int** | Lead form creation time. Unix timestamp in seconds. |  [optional]
**updatedTime** | **kotlin.Int** | Last update time. Unix timestamp in seconds. |  [optional]



