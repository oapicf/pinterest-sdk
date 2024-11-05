

# QuizPinData

This field includes all quiz data including questions, options, and results.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**questions** | [**Seq&lt;QuizPinQuestion&gt;**](QuizPinQuestion.md) |  |  [optional]
**results** | [**Seq&lt;QuizPinResult&gt;**](QuizPinResult.md) |  |  [optional]
**tieBreakerType** | [**TieBreakerType**](#TieBreakerType) | Quiz ad tie breaker type, default is RANDOM |  [optional]
**tieBreakerCustomResult** | [**QuizPinResult**](QuizPinResult.md) |  |  [optional]


## Enum: TieBreakerType
Allowed values: [RANDOM, CUSTOM]




