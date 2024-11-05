# LeadFormCommon
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** | Internal name of the lead form. | [optional] 
**PrivacyPolicyLink** | **String** | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. | [optional] 
**HasAcceptedTerms** | **Boolean** | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s &lt;a href&#x3D;&quot;&quot;https://policy.pinterest.com/en/lead-ad-terms&quot;&quot;&gt;Lead Ad Terms&lt;/a&gt;. As a reminder, all advertising on Pinterest is subject to the &lt;a href&#x3D;&quot;&quot;https://business.pinterest.com/en/pinterest-advertising-services-agreement/&quot;&quot;&gt;Pinterest Advertising Services Agreement&lt;/a&gt; or an equivalent agreement as set forth on an IO | [optional] 
**CompletionMessage** | **String** | A message for people who complete the form to let them know what happens next. | [optional] 
**Status** | [**LeadFormStatus**](LeadFormStatus.md) |  | [optional] 
**DisclosureLanguage** | **String** | Additional disclosure language to be included in the lead form. | [optional] 
**Questions** | [**LeadFormQuestion[]**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. | [optional] 
**PolicyLinks** | [**LeadFormCommonPolicyLinksInner[]**](LeadFormCommonPolicyLinksInner.md) | List of additional policy links to be displayed on the lead form. | [optional] 

## Examples

- Prepare the resource
```powershell
$LeadFormCommon = Initialize-PSOpenAPIToolsLeadFormCommon  -Name Lead Form 3/14/2023 `
 -PrivacyPolicyLink https://www.advertisername.com/privacy-policy `
 -HasAcceptedTerms false `
 -CompletionMessage Thank you for submitting. We will contact you soon. `
 -Status null `
 -DisclosureLanguage By entering your personal information, you agree that your data will be collected and used. `
 -Questions [{&quot;question_type&quot;:&quot;CUSTOM&quot;,&quot;custom_question_field_type&quot;:&quot;CHECKBOX&quot;,&quot;custom_question_label&quot;:&quot;What is your favorite animal?&quot;,&quot;custom_question_options&quot;:[&quot;Dog&quot;,&quot;Cat&quot;,&quot;Bird&quot;,&quot;Turtle&quot;]}] `
 -PolicyLinks [{&quot;label&quot;:&quot;Copyright&quot;,&quot;link&quot;:&quot;https://policy.pinterest.com/en/copyright&quot;}]
```

- Convert the resource to JSON
```powershell
$LeadFormCommon | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

