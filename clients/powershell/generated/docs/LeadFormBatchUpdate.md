# LeadFormBatchUpdate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CompletionMessage** | **String** | A message for people who complete the form to let them know what happens next. | [optional] 
**DisclosureLanguage** | **String** | Additional disclosure language to be included in the lead form. | [optional] 
**HasAcceptedTerms** | **Boolean** | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO | [optional] 
**Id** | **String** | The ID of this lead form | 
**Name** | **String** | Internal name of the lead form. | [optional] 
**PolicyLinks** | [**LeadFormPolicyLink[]**](LeadFormPolicyLink.md) | List of additional policy links to be displayed on the lead form. | [optional] 
**PrivacyPolicyLink** | **String** | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. | [optional] 
**Questions** | [**LeadFormQuestion[]**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. | [optional] 
**Status** | [**LeadFormStatus**](LeadFormStatus.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$LeadFormBatchUpdate = Initialize-PSOpenAPIToolsLeadFormBatchUpdate  -CompletionMessage Thank you for submitting. We will contact you soon. `
 -DisclosureLanguage By entering your personal information, you agree that your data will be collected and used. `
 -HasAcceptedTerms false `
 -Id null `
 -Name Lead Form 3/14/2023 `
 -PolicyLinks [{&quot;label&quot;:&quot;Copyright&quot;,&quot;link&quot;:&quot;https://policy.pinterest.com/en/copyright&quot;}] `
 -PrivacyPolicyLink https://www.advertisername.com/privacy-policy `
 -Questions [{&quot;question_type&quot;:&quot;CUSTOM&quot;,&quot;custom_question_field_type&quot;:&quot;CHECKBOX&quot;,&quot;custom_question_label&quot;:&quot;What is your favorite animal?&quot;,&quot;custom_question_options&quot;:[&quot;Dog&quot;,&quot;Cat&quot;,&quot;Bird&quot;,&quot;Turtle&quot;]}] `
 -Status null
```

- Convert the resource to JSON
```powershell
$LeadFormBatchUpdate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

