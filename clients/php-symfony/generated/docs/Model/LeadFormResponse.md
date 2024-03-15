# LeadFormResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **string** | Internal name of the lead form. | [optional] 
**privacyPolicyLink** | **string** | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. | [optional] 
**hasAcceptedTerms** | **bool** | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad. | [optional] 
**completionMessage** | **string** | A message for people who complete the form to let them know what happens next. | [optional] 
**status** | [**OpenAPI\Server\Model\LeadFormStatus**](LeadFormStatus.md) |  | [optional] 
**disclosureLanguage** | **string** | Additional disclosure language to be included in the lead form. | [optional] 
**questions** | [**OpenAPI\Server\Model\LeadFormQuestion**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. | [optional] 
**id** | **string** | The ID of this lead form | [optional] 
**adAccountId** | **string** | The Ad Account ID that this lead form belongs to. | [optional] 
**createdTime** | **int** | Lead form creation time. Unix timestamp in seconds. | [optional] 
**updatedTime** | **int** | Last update time. Unix timestamp in seconds. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


