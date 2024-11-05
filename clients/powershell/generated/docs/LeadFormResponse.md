# LeadFormResponse
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
**Id** | **String** | The ID of this lead form | [optional] 
**AdAccountId** | **String** | The Ad Account ID that this lead form belongs to. | [optional] 
**CreatedTime** | **Int32** | Lead form creation time. Unix timestamp in seconds. | [optional] 
**UpdatedTime** | **Int32** | Last update time. Unix timestamp in seconds. | [optional] 

## Examples

- Prepare the resource
```powershell
$LeadFormResponse = Initialize-PSOpenAPIToolsLeadFormResponse  -Name Lead Form 3/14/2023 `
 -PrivacyPolicyLink https://www.advertisername.com/privacy-policy `
 -HasAcceptedTerms false `
 -CompletionMessage Thank you for submitting. We will contact you soon. `
 -Status null `
 -DisclosureLanguage By entering your personal information, you agree that your data will be collected and used. `
 -Questions [{question_type&#x3D;CUSTOM, custom_question_field_type&#x3D;CHECKBOX, custom_question_label&#x3D;What is your favorite animal?, custom_question_options&#x3D;[Dog, Cat, Bird, Turtle]}] `
 -PolicyLinks [{label&#x3D;Copyright, link&#x3D;https://policy.pinterest.com/en/copyright}] `
 -Id 7765300871171 `
 -AdAccountId 549755885175 `
 -CreatedTime 1451431341 `
 -UpdatedTime 1451431341
```

- Convert the resource to JSON
```powershell
$LeadFormResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

