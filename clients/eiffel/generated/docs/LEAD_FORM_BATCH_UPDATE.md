# LEAD_FORM_BATCH_UPDATE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completion_message** | [**STRING_32**](STRING_32.md) | A message for people who complete the form to let them know what happens next. | [optional] [default to null]
**disclosure_language** | [**STRING_32**](STRING_32.md) | Additional disclosure language to be included in the lead form. | [optional] [default to null]
**has_accepted_terms** | **BOOLEAN** | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO | [optional] [default to null]
**id** | [**STRING_32**](STRING_32.md) | The ID of this lead form | [default to null]
**name** | [**STRING_32**](STRING_32.md) | Internal name of the lead form. | [optional] [default to null]
**policy_links** | [**LIST [LEAD_FORM_POLICY_LINK]**](LeadFormPolicyLink.md) | List of additional policy links to be displayed on the lead form. | [optional] [default to null]
**privacy_policy_link** | [**STRING_32**](STRING_32.md) | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. | [optional] [default to null]
**questions** | [**LIST [LEAD_FORM_QUESTION]**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. | [optional] [default to null]
**status** | [**LEAD_FORM_STATUS**](LeadFormStatus.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


