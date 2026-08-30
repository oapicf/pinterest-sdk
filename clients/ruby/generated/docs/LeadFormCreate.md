# PinterestSdkClient::LeadFormCreate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **completion_message** | **String** | A message for people who complete the form to let them know what happens next. |  |
| **disclosure_language** | **String** | Additional disclosure language to be included in the lead form. | [optional] |
| **has_accepted_terms** | **Boolean** | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO |  |
| **name** | **String** | Internal name of the lead form. |  |
| **policy_links** | [**Array&lt;LeadFormPolicyLink&gt;**](LeadFormPolicyLink.md) | List of additional policy links to be displayed on the lead form. | [optional] |
| **privacy_policy_link** | **String** | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. |  |
| **questions** | [**Array&lt;LeadFormQuestion&gt;**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. |  |
| **status** | [**LeadFormStatus**](LeadFormStatus.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::LeadFormCreate.new(
  completion_message: Thank you for submitting. We will contact you soon.,
  disclosure_language: By entering your personal information, you agree that your data will be collected and used.,
  has_accepted_terms: false,
  name: Lead Form 3/14/2023,
  policy_links: [{&quot;label&quot;:&quot;Copyright&quot;,&quot;link&quot;:&quot;https://policy.pinterest.com/en/copyright&quot;}],
  privacy_policy_link: https://www.advertisername.com/privacy-policy,
  questions: [{&quot;question_type&quot;:&quot;CUSTOM&quot;,&quot;custom_question_field_type&quot;:&quot;CHECKBOX&quot;,&quot;custom_question_label&quot;:&quot;What is your favorite animal?&quot;,&quot;custom_question_options&quot;:[&quot;Dog&quot;,&quot;Cat&quot;,&quot;Bird&quot;,&quot;Turtle&quot;]}],
  status: null
)
```

