

# QuizPinData

This field includes all quiz data including questions, options, and results.

The class is defined in **[QuizPinData.java](../../src/main/java/org/openapitools/model/QuizPinData.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**questions** | [`List&lt;QuizPinQuestion&gt;`](QuizPinQuestion.md) |  |  [optional property]
**results** | [`List&lt;QuizPinResult&gt;`](QuizPinResult.md) |  |  [optional property]
**tieBreakerType** | [**TieBreakerTypeEnum**](#TieBreakerTypeEnum) | Quiz ad tie breaker type, default is RANDOM |  [optional property]
**tieBreakerCustomResult** | [`QuizPinResult`](QuizPinResult.md) |  |  [optional property]



## TieBreakerTypeEnum

Name | Value
---- | -----
RANDOM | `"RANDOM"`
CUSTOM | `"CUSTOM"`



