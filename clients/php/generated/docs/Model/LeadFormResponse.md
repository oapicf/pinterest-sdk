# # LeadFormResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **string** | Internal name of the lead form. | [optional]
**privacy_policy_link** | **string** | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. | [optional]
**has_accepted_terms** | **bool** | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad. | [optional]
**completion_message** | **string** | A message for people who complete the form to let them know what happens next. | [optional]
**status** | [**\OpenAPI\Client\Model\LeadFormStatus**](LeadFormStatus.md) |  | [optional]
**disclosure_language** | **string** | Additional disclosure language to be included in the lead form. | [optional]
**questions** | [**\OpenAPI\Client\Model\LeadFormQuestion[]**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. | [optional]
**id** | **string** | The ID of this lead form | [optional]
**ad_account_id** | **string** | The Ad Account ID that this lead form belongs to. | [optional]
**created_time** | **int** | Lead form creation time. Unix timestamp in seconds. | [optional]
**updated_time** | **int** | Last update time. Unix timestamp in seconds. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
