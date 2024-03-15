# PinterestSdkClient::LeadFormQuestion

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **question_type** | [**LeadFormQuestionType**](LeadFormQuestionType.md) |  | [optional] |
| **custom_question_field_type** | [**LeadFormQuestionFieldType**](LeadFormQuestionFieldType.md) |  | [optional] |
| **custom_question_label** | **String** | Question label for a custom question. | [optional] |
| **custom_question_options** | **Array&lt;String&gt;** | Question options for a custom question. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::LeadFormQuestion.new(
  question_type: null,
  custom_question_field_type: null,
  custom_question_label: null,
  custom_question_options: null
)
```

