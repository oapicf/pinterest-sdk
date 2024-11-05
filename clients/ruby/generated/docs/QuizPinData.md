# PinterestSdkClient::QuizPinData

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **questions** | [**Array&lt;QuizPinQuestion&gt;**](QuizPinQuestion.md) |  | [optional] |
| **results** | [**Array&lt;QuizPinResult&gt;**](QuizPinResult.md) |  | [optional] |
| **tie_breaker_type** | **String** | Quiz ad tie breaker type, default is RANDOM | [optional] |
| **tie_breaker_custom_result** | [**QuizPinResult**](QuizPinResult.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::QuizPinData.new(
  questions: null,
  results: null,
  tie_breaker_type: null,
  tie_breaker_custom_result: null
)
```

