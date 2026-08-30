# PinterestSdkClient::QuizPinData

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **questions** | [**Array&lt;QuizPinQuestion&gt;**](QuizPinQuestion.md) |  | [optional] |
| **results** | [**Array&lt;QuizPinResult&gt;**](QuizPinResult.md) |  | [optional] |
| **tie_breaker_custom_result** | [**QuizPinResult**](QuizPinResult.md) |  | [optional] |
| **tie_breaker_type** | [**TieBreakerType**](TieBreakerType.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::QuizPinData.new(
  questions: null,
  results: null,
  tie_breaker_custom_result: null,
  tie_breaker_type: null
)
```

