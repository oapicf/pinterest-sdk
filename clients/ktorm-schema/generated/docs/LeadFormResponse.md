
# Table `LeadFormResponse`
(mapped from: LeadFormResponse)

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
**id** | id | text PRIMARY KEY |  | **kotlin.String** | The ID of this lead form |  [optional]
**adAccountId** | ad_account_id | text |  | **kotlin.String** | The Ad Account ID that this lead form belongs to. |  [optional]
**createdTime** | created_time | int |  | **kotlin.Int** | Lead form creation time. Unix timestamp in seconds. |  [optional]
**updatedTime** | updated_time | int |  | **kotlin.Int** | Last update time. Unix timestamp in seconds. |  [optional]








# **Table `LeadFormResponseLeadFormQuestion`**
(mapped from: LeadFormResponseLeadFormQuestion)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
leadFormResponse | leadFormResponse | long | | kotlin.Long | Primary Key | *one*
leadFormQuestion | leadFormQuestion | long | | kotlin.Long | Foreign Key | *many*







