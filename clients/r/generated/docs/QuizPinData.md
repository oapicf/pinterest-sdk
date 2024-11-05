# openapi::QuizPinData

This field includes all quiz data including questions, options, and results.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**questions** | [**array[QuizPinQuestion]**](QuizPinQuestion.md) |  | [optional] 
**results** | [**array[QuizPinResult]**](QuizPinResult.md) |  | [optional] 
**tie_breaker_type** | **character** | Quiz ad tie breaker type, default is RANDOM | [optional] [Enum: [RANDOM, CUSTOM]] 
**tie_breaker_custom_result** | [**QuizPinResult**](QuizPinResult.md) |  | [optional] 


