
# Table `LeadFormCreate`
(mapped from: LeadFormCreate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**completionMessage** | completion_message | text NOT NULL |  | **kotlin.String** | A message for people who complete the form to let them know what happens next. | 
**hasAcceptedTerms** | has_accepted_terms | boolean NOT NULL |  | **kotlin.Boolean** | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO | 
**name** | name | text NOT NULL |  | **kotlin.String** | Internal name of the lead form. | 
**privacyPolicyLink** | privacy_policy_link | text NOT NULL |  | **kotlin.String** | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. | 
**questions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LeadFormQuestion&gt;**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. | 
**disclosureLanguage** | disclosure_language | text |  | **kotlin.String** | Additional disclosure language to be included in the lead form. |  [optional]
**policyLinks** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LeadFormPolicyLink&gt;**](LeadFormPolicyLink.md) | List of additional policy links to be displayed on the lead form. |  [optional]
**status** | status | long |  | [**LeadFormStatus**](LeadFormStatus.md) |  |  [optional] [foreignkey]






# **Table `LeadFormCreateLeadFormQuestion`**
(mapped from: LeadFormCreateLeadFormQuestion)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
leadFormCreate | leadFormCreate | long | | kotlin.Long | Primary Key | *one*
leadFormQuestion | leadFormQuestion | long | | kotlin.Long | Foreign Key | *many*




# **Table `LeadFormCreateLeadFormPolicyLink`**
(mapped from: LeadFormCreateLeadFormPolicyLink)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
leadFormCreate | leadFormCreate | long | | kotlin.Long | Primary Key | *one*
leadFormPolicyLink | leadFormPolicyLink | long | | kotlin.Long | Foreign Key | *many*




