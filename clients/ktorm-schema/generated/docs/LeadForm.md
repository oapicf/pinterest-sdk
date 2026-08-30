
# Table `LeadForm`
(mapped from: LeadForm)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**completionMessage** | completion_message | text NOT NULL |  | **kotlin.String** | A message for people who complete the form to let them know what happens next. | 
**hasAcceptedTerms** | has_accepted_terms | boolean NOT NULL |  | **kotlin.Boolean** | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO | 
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | The ID of this lead form | 
**name** | name | text NOT NULL |  | **kotlin.String** | Internal name of the lead form. | 
**privacyPolicyLink** | privacy_policy_link | text NOT NULL |  | **kotlin.String** | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. | 
**questions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LeadFormQuestion&gt;**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. | 
**adAccountId** | ad_account_id | text |  | **kotlin.String** | The Ad Account ID that this lead form belongs to. |  [optional] [readonly]
**createdTime** | created_time | int |  | **kotlin.Int** | Lead form creation time. Unix timestamp in seconds. |  [optional] [readonly]
**disclosureLanguage** | disclosure_language | text |  | **kotlin.String** | Additional disclosure language to be included in the lead form. |  [optional]
**policyLinks** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LeadFormPolicyLink&gt;**](LeadFormPolicyLink.md) | List of additional policy links to be displayed on the lead form. |  [optional]
**status** | status | long |  | [**LeadFormStatus**](LeadFormStatus.md) |  |  [optional] [foreignkey]
**updatedTime** | updated_time | int |  | **kotlin.Int** | Last update time. Unix timestamp in seconds. |  [optional] [readonly]







# **Table `LeadFormLeadFormQuestion`**
(mapped from: LeadFormLeadFormQuestion)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
leadForm | leadForm | long | | kotlin.Long | Primary Key | *one*
leadFormQuestion | leadFormQuestion | long | | kotlin.Long | Foreign Key | *many*






# **Table `LeadFormLeadFormPolicyLink`**
(mapped from: LeadFormLeadFormPolicyLink)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
leadForm | leadForm | long | | kotlin.Long | Primary Key | *one*
leadFormPolicyLink | leadFormPolicyLink | long | | kotlin.Long | Foreign Key | *many*





