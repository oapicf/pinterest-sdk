# Org.OpenAPITools.Model.LeadForm

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**HasAcceptedTerms** | **bool** | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO | 
**Id** | **string** | The ID of this lead form | 
**Questions** | [**List&lt;LeadFormQuestion&gt;**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. | 
**AdAccountId** | **string** | The Ad Account ID that this lead form belongs to. | [optional] [readonly] 
**CompletionMessage** | **string** | A message for people who complete the form to let them know what happens next. | 
**CreatedTime** | **int** | Lead form creation time. Unix timestamp in seconds. | [optional] [readonly] 
**DisclosureLanguage** | **string** | Additional disclosure language to be included in the lead form. | [optional] 
**Name** | **string** | Internal name of the lead form. | 
**PolicyLinks** | [**List&lt;LeadFormPolicyLink&gt;**](LeadFormPolicyLink.md) | List of additional policy links to be displayed on the lead form. | [optional] 
**PrivacyPolicyLink** | **string** | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. | 
**Status** | **LeadFormStatus** |  | [optional] 
**UpdatedTime** | **int** | Last update time. Unix timestamp in seconds. | [optional] [readonly] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

