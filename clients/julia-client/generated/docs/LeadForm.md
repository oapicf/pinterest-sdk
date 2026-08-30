# LeadForm


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`ad_account_id`** | **`String`** | The Ad Account ID that this lead form belongs to. | [optional] [readonly] [default to nothing]
**`completion_message`** | **`String`** | A message for people who complete the form to let them know what happens next. | [default to nothing]
**`created_time`** | **`Int64`** | Lead form creation time. Unix timestamp in seconds. | [optional] [readonly] [default to nothing]
**`disclosure_language`** | **`String`** | Additional disclosure language to be included in the lead form. | [optional] [default to nothing]
**`has_accepted_terms`** | **`Bool`** | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO | [default to nothing]
**`id`** | **`String`** | The ID of this lead form | [default to nothing]
**`name`** | **`String`** | Internal name of the lead form. | [default to nothing]
**`policy_links`** | [**`Vector{LeadFormPolicyLink}`**](LeadFormPolicyLink.md) | List of additional policy links to be displayed on the lead form. | [optional] [default to nothing]
**`privacy_policy_link`** | **`String`** | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. | [default to nothing]
**`questions`** | [**`Vector{LeadFormQuestion}`**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. | [default to nothing]
**`status`** | [**`*LeadFormStatus`**](LeadFormStatus.md) |  | [optional] [default to nothing]
**`updated_time`** | **`Int64`** | Last update time. Unix timestamp in seconds. | [optional] [readonly] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


