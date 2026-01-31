# PinterestSdkClient::LeadFormCreateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **completion_message** | **String** | A message for people who complete the form to let them know what happens next. | [optional] |
| **disclosure_language** | **String** | Additional disclosure language to be included in the lead form. | [optional] |
| **has_accepted_terms** | **Boolean** | Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s &lt;a href&#x3D;\&quot;https://policy.pinterest.com/en/lead-ad-terms\&quot;&gt;Lead Ad Terms&lt;/a&gt;. As a reminder, all advertising on Pinterest is subject to the &lt;a href&#x3D;\&quot;https://business.pinterest.com/en/pinterest-advertising-services-agreement/\&quot;&gt;Pinterest Advertising Services Agreement&lt;/a&gt; or an equivalent agreement as set forth on an IO | [optional] |
| **name** | **String** | Internal name of the lead form. | [optional] |
| **policy_links** | [**Array&lt;LeadFormCommonPolicyLinksInner&gt;**](LeadFormCommonPolicyLinksInner.md) | List of additional policy links to be displayed on the lead form. | [optional] |
| **privacy_policy_link** | **String** | A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. | [optional] |
| **questions** | [**Array&lt;LeadFormQuestion&gt;**](LeadFormQuestion.md) | List of questions to be displayed on the lead form. | [optional] |
| **status** | [**LeadFormStatus**](LeadFormStatus.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::LeadFormCreateRequest.new(
  completion_message: Thank you for submitting. We will contact you soon.,
  disclosure_language: By entering your personal information, you agree that your data will be collected and used.,
  has_accepted_terms: false,
  name: Lead Form 3/14/2023,
  policy_links: [{label&#x3D;Copyright, link&#x3D;https://policy.pinterest.com/en/copyright}],
  privacy_policy_link: https://www.advertisername.com/privacy-policy,
  questions: [{question_type&#x3D;CUSTOM, custom_question_field_type&#x3D;CHECKBOX, custom_question_label&#x3D;What is your favorite animal?, custom_question_options&#x3D;[Dog, Cat, Bird, Turtle]}],
  status: null
)
```

