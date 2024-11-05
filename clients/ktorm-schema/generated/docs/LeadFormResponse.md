
# Table `LeadFormResponse`
(mapped from: LeadFormResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**name** | name | text |  | **kotlin.String** | Internal name of the lead form. |  [optional]
**privacyPolicyLink** | privacy_policy_link | text |  | **kotlin.String** | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. |  [optional]
**hasAcceptedTerms** | has_accepted_terms | boolean |  | **kotlin.Boolean** | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s &lt;a href&#x3D;\&quot;https://policy.pinterest.com/en/lead-ad-terms\&quot;&gt;Lead Ad Terms&lt;/a&gt;. As a reminder, all advertising on Pinterest is subject to the &lt;a href&#x3D;\&quot;https://business.pinterest.com/en/pinterest-advertising-services-agreement/\&quot;&gt;Pinterest Advertising Services Agreement&lt;/a&gt; or an equivalent agreement as set forth on an IO |  [optional]
**completionMessage** | completion_message | text |  | **kotlin.String** | A message for people who complete the form to let them know what happens next. |  [optional]
**status** | status | long |  | [**LeadFormStatus**](LeadFormStatus.md) |  |  [optional] [foreignkey]
**disclosureLanguage** | disclosure_language | text |  | **kotlin.String** | Additional disclosure language to be included in the lead form. |  [optional]
**questions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LeadFormQuestion&gt;**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. |  [optional]
**policyLinks** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LeadFormCommonPolicyLinksInner&gt;**](LeadFormCommonPolicyLinksInner.md) | List of additional policy links to be displayed on the lead form. |  [optional]
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



# **Table `LeadFormResponseLeadFormCommonPolicyLinksInner`**
(mapped from: LeadFormResponseLeadFormCommonPolicyLinksInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
leadFormResponse | leadFormResponse | long | | kotlin.Long | Primary Key | *one*
leadFormCommonPolicyLinksInner | leadFormCommonPolicyLinksInner | long | | kotlin.Long | Foreign Key | *many*







