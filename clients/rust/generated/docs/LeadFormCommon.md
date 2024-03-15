# LeadFormCommon

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | Option<**String**> | Internal name of the lead form. | [optional]
**privacy_policy_link** | Option<**String**> | A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language. | [optional]
**has_accepted_terms** | Option<**bool**> | Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad. | [optional]
**completion_message** | Option<**String**> | A message for people who complete the form to let them know what happens next. | [optional]
**status** | Option<[**models::LeadFormStatus**](LeadFormStatus.md)> |  | [optional]
**disclosure_language** | Option<**String**> | Additional disclosure language to be included in the lead form. | [optional]
**questions** | Option<[**Vec<models::LeadFormQuestion>**](LeadFormQuestion.md)> | List of questions to be displayed on the lead form. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


