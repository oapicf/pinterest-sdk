# LeadFormResponse

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
**id** | Option<**String**> | The ID of this lead form | [optional]
**ad_account_id** | Option<**String**> | The Ad Account ID that this lead form belongs to. | [optional]
**created_time** | Option<**i32**> | Lead form creation time. Unix timestamp in seconds. | [optional]
**updated_time** | Option<**i32**> | Last update time. Unix timestamp in seconds. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


