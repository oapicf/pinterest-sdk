
# Table `LeadFormCommon`
(mapped from: LeadFormCommon)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**name** | name | text |  | **kotlin.String** | Internal name of the lead form. |  [optional]
**privacyPolicyLink** | privacy_policy_link | text |  | **kotlin.String** | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. |  [optional]
**hasAcceptedTerms** | has_accepted_terms | boolean |  | **kotlin.Boolean** | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad. |  [optional]
**completionMessage** | completion_message | text |  | **kotlin.String** | A message for people who complete the form to let them know what happens next. |  [optional]
**status** | status | long |  | [**LeadFormStatus**](LeadFormStatus.md) |  |  [optional] [foreignkey]
**disclosureLanguage** | disclosure_language | text |  | **kotlin.String** | Additional disclosure language to be included in the lead form. |  [optional]
**questions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LeadFormQuestion&gt;**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. |  [optional]








# **Table `LeadFormCommonLeadFormQuestion`**
(mapped from: LeadFormCommonLeadFormQuestion)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
leadFormCommon | leadFormCommon | long | | kotlin.Long | Primary Key | *one*
leadFormQuestion | leadFormQuestion | long | | kotlin.Long | Foreign Key | *many*



