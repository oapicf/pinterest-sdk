# LeadForm
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **String** | The Ad Account ID that this lead form belongs to. | [optional] [readonly] 
**CompletionMessage** | **String** | A message for people who complete the form to let them know what happens next. | 
**CreatedTime** | **Int32** | Lead form creation time. Unix timestamp in seconds. | [optional] [readonly] 
**DisclosureLanguage** | **String** | Additional disclosure language to be included in the lead form. | [optional] 
**HasAcceptedTerms** | **Boolean** | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO | 
**Id** | **String** | The ID of this lead form | 
**Name** | **String** | Internal name of the lead form. | 
**PolicyLinks** | [**LeadFormPolicyLink[]**](LeadFormPolicyLink.md) | List of additional policy links to be displayed on the lead form. | [optional] 
**PrivacyPolicyLink** | **String** | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. | 
**Questions** | [**LeadFormQuestion[]**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. | 
**Status** | [**LeadFormStatus**](LeadFormStatus.md) |  | [optional] 
**UpdatedTime** | **Int32** | Last update time. Unix timestamp in seconds. | [optional] [readonly] 

## Examples

- Prepare the resource
```powershell
$LeadForm = Initialize-PSOpenAPIToolsLeadForm  -AdAccountId null `
 -CompletionMessage Thank you for submitting. We will contact you soon. `
 -CreatedTime null `
 -DisclosureLanguage By entering your personal information, you agree that your data will be collected and used. `
 -HasAcceptedTerms false `
 -Id null `
 -Name Lead Form 3/14/2023 `
 -PolicyLinks [{&quot;label&quot;:&quot;Copyright&quot;,&quot;link&quot;:&quot;https://policy.pinterest.com/en/copyright&quot;}] `
 -PrivacyPolicyLink https://www.advertisername.com/privacy-policy `
 -Questions [{&quot;question_type&quot;:&quot;CUSTOM&quot;,&quot;custom_question_field_type&quot;:&quot;CHECKBOX&quot;,&quot;custom_question_label&quot;:&quot;What is your favorite animal?&quot;,&quot;custom_question_options&quot;:[&quot;Dog&quot;,&quot;Cat&quot;,&quot;Bird&quot;,&quot;Turtle&quot;]}] `
 -Status null `
 -UpdatedTime null
```

- Convert the resource to JSON
```powershell
$LeadForm | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

