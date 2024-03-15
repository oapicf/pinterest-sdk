# PinterestSdkClient::LeadFormCommon

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** | Internal name of the lead form. | [optional] |
| **privacy_policy_link** | **String** | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. | [optional] |
| **has_accepted_terms** | **Boolean** | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad. | [optional] |
| **completion_message** | **String** | A message for people who complete the form to let them know what happens next. | [optional] |
| **status** | [**LeadFormStatus**](LeadFormStatus.md) |  | [optional] |
| **disclosure_language** | **String** | Additional disclosure language to be included in the lead form. | [optional] |
| **questions** | [**Array&lt;LeadFormQuestion&gt;**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::LeadFormCommon.new(
  name: Lead Form 3/14/2023,
  privacy_policy_link: https://www.advertisername.com/privacy-policy,
  has_accepted_terms: false,
  completion_message: Thank you for submitting. We will contact you soon.,
  status: null,
  disclosure_language: By entering your personal information, you agree that your data will be collected and used.,
  questions: [{&quot;question_type&quot;:&quot;CUSTOM&quot;,&quot;custom_question_field_type&quot;:&quot;CHECKBOX&quot;,&quot;custom_question_label&quot;:&quot;What is your favorite animal?&quot;,&quot;custom_question_options&quot;:[&quot;Dog&quot;,&quot;Cat&quot;,&quot;Bird&quot;,&quot;Turtle&quot;]}]
)
```

