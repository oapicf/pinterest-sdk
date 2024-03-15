# lead_form_response_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **char \*** | Internal name of the lead form. | [optional] 
**privacy_policy_link** | **char \*** | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. | [optional] 
**has_accepted_terms** | **int** | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad. | [optional] 
**completion_message** | **char \*** | A message for people who complete the form to let them know what happens next. | [optional] 
**status** | **lead_form_status_t \*** |  | [optional] 
**disclosure_language** | **char \*** | Additional disclosure language to be included in the lead form. | [optional] 
**questions** | [**list_t**](lead_form_question.md) \* | List of questions to be displayed on the lead form. | [optional] 
**id** | **char \*** | The ID of this lead form | [optional] 
**ad_account_id** | **char \*** | The Ad Account ID that this lead form belongs to. | [optional] 
**created_time** | **int** | Lead form creation time. Unix timestamp in seconds. | [optional] 
**updated_time** | **int** | Last update time. Unix timestamp in seconds. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


