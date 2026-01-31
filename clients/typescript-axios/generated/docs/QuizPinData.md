# QuizPinData

This field includes all quiz data including questions, options, and results.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**questions** | [**Array&lt;QuizPinQuestion&gt;**](QuizPinQuestion.md) |  | [optional] [default to undefined]
**results** | [**Array&lt;QuizPinResult&gt;**](QuizPinResult.md) |  | [optional] [default to undefined]
**tie_breaker_custom_result** | [**QuizPinResult**](QuizPinResult.md) |  | [optional] [default to undefined]
**tie_breaker_type** | **string** | Quiz ad tie breaker type, default is RANDOM | [optional] [default to undefined]

## Example

```typescript
import { QuizPinData } from './api';

const instance: QuizPinData = {
    questions,
    results,
    tie_breaker_custom_result,
    tie_breaker_type,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
