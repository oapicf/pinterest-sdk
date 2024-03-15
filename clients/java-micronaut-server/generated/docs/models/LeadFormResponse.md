

# LeadFormResponse

The class is defined in **[LeadFormResponse.java](../../src/main/java/org/openapitools/model/LeadFormResponse.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | `String` | Internal name of the lead form. |  [optional property]
**privacyPolicyLink** | `String` | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. |  [optional property]
**hasAcceptedTerms** | `Boolean` | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad. |  [optional property]
**completionMessage** | `String` | A message for people who complete the form to let them know what happens next. |  [optional property]
**status** | `LeadFormStatus` |  |  [optional property]
**disclosureLanguage** | `String` | Additional disclosure language to be included in the lead form. |  [optional property]
**questions** | [`List&lt;LeadFormQuestion&gt;`](LeadFormQuestion.md) | List of questions to be displayed on the lead form. |  [optional property]
**id** | `String` | The ID of this lead form |  [optional property]
**adAccountId** | `String` | The Ad Account ID that this lead form belongs to. |  [optional property]
**createdTime** | `Integer` | Lead form creation time. Unix timestamp in seconds. |  [optional property]
**updatedTime** | `Integer` | Last update time. Unix timestamp in seconds. |  [optional property]













