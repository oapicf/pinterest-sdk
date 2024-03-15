# LEAD_FORM_COMMON

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | [**STRING_32**](STRING_32.md) | Internal name of the lead form. | [optional] [default to null]
**privacy_policy_link** | [**STRING_32**](STRING_32.md) | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. | [optional] [default to null]
**has_accepted_terms** | **BOOLEAN** | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad. | [optional] [default to null]
**completion_message** | [**STRING_32**](STRING_32.md) | A message for people who complete the form to let them know what happens next. | [optional] [default to null]
**status** | [**LEAD_FORM_STATUS**](LeadFormStatus.md) |  | [optional] [default to null]
**disclosure_language** | [**STRING_32**](STRING_32.md) | Additional disclosure language to be included in the lead form. | [optional] [default to null]
**questions** | [**LIST [LEAD_FORM_QUESTION]**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


