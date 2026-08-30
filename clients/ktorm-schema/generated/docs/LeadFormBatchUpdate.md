
# Table `LeadFormBatchUpdate`
(mapped from: LeadFormBatchUpdate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | The ID of this lead form | 
**completionMessage** | completion_message | text |  | **kotlin.String** | A message for people who complete the form to let them know what happens next. |  [optional]
**disclosureLanguage** | disclosure_language | text |  | **kotlin.String** | Additional disclosure language to be included in the lead form. |  [optional]
**hasAcceptedTerms** | has_accepted_terms | boolean |  | **kotlin.Boolean** | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO |  [optional]
**name** | name | text |  | **kotlin.String** | Internal name of the lead form. |  [optional]
**policyLinks** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LeadFormPolicyLink&gt;**](LeadFormPolicyLink.md) | List of additional policy links to be displayed on the lead form. |  [optional]
**privacyPolicyLink** | privacy_policy_link | text |  | **kotlin.String** | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. |  [optional]
**questions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LeadFormQuestion&gt;**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. |  [optional]
**status** | status | long |  | [**LeadFormStatus**](LeadFormStatus.md) |  |  [optional] [foreignkey]







# **Table `LeadFormBatchUpdateLeadFormPolicyLink`**
(mapped from: LeadFormBatchUpdateLeadFormPolicyLink)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
leadFormBatchUpdate | leadFormBatchUpdate | long | | kotlin.Long | Primary Key | *one*
leadFormPolicyLink | leadFormPolicyLink | long | | kotlin.Long | Foreign Key | *many*




# **Table `LeadFormBatchUpdateLeadFormQuestion`**
(mapped from: LeadFormBatchUpdateLeadFormQuestion)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
leadFormBatchUpdate | leadFormBatchUpdate | long | | kotlin.Long | Primary Key | *one*
leadFormQuestion | leadFormQuestion | long | | kotlin.Long | Foreign Key | *many*




