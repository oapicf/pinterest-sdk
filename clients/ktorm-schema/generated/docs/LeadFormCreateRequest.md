
# Table `LeadFormCreateRequest`
(mapped from: LeadFormCreateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**name** | name | text NOT NULL |  | **kotlin.String** | Internal name of the lead form. | 
**privacyPolicyLink** | privacy_policy_link | text NOT NULL |  | **kotlin.String** | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. | 
**hasAcceptedTerms** | has_accepted_terms | boolean NOT NULL |  | **kotlin.Boolean** | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s &lt;a href&#x3D;\&quot;https://policy.pinterest.com/en/lead-ad-terms\&quot;&gt;Lead Ad Terms&lt;/a&gt;. As a reminder, all advertising on Pinterest is subject to the &lt;a href&#x3D;\&quot;https://business.pinterest.com/en/pinterest-advertising-services-agreement/\&quot;&gt;Pinterest Advertising Services Agreement&lt;/a&gt; or an equivalent agreement as set forth on an IO | 
**completionMessage** | completion_message | text NOT NULL |  | **kotlin.String** | A message for people who complete the form to let them know what happens next. | 
**questions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LeadFormQuestion&gt;**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. | 
**status** | status | long |  | [**LeadFormStatus**](LeadFormStatus.md) |  |  [optional] [foreignkey]
**disclosureLanguage** | disclosure_language | text |  | **kotlin.String** | Additional disclosure language to be included in the lead form. |  [optional]
**policyLinks** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LeadFormCommonPolicyLinksInner&gt;**](LeadFormCommonPolicyLinksInner.md) | List of additional policy links to be displayed on the lead form. |  [optional]






# **Table `LeadFormCreateRequestLeadFormQuestion`**
(mapped from: LeadFormCreateRequestLeadFormQuestion)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
leadFormCreateRequest | leadFormCreateRequest | long | | kotlin.Long | Primary Key | *one*
leadFormQuestion | leadFormQuestion | long | | kotlin.Long | Foreign Key | *many*





# **Table `LeadFormCreateRequestLeadFormCommonPolicyLinksInner`**
(mapped from: LeadFormCreateRequestLeadFormCommonPolicyLinksInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
leadFormCreateRequest | leadFormCreateRequest | long | | kotlin.Long | Primary Key | *one*
leadFormCommonPolicyLinksInner | leadFormCommonPolicyLinksInner | long | | kotlin.Long | Foreign Key | *many*



