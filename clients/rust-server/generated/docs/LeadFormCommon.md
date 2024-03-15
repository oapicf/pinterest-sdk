# LeadFormCommon

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Internal name of the lead form. | [optional] [default to None]
**privacy_policy_link** | **String** | A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language. | [optional] [default to None]
**has_accepted_terms** | **bool** | Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad. | [optional] [default to None]
**completion_message** | **String** | A message for people who complete the form to let them know what happens next. | [optional] [default to None]
**status** | [***models::LeadFormStatus**](LeadFormStatus.md) |  | [optional] [default to None]
**disclosure_language** | **String** | Additional disclosure language to be included in the lead form. | [optional] [default to None]
**questions** | [**Vec<models::LeadFormQuestion>**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


