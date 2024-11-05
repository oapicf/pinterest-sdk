

# QuizPinData

This field includes all quiz data including questions, options, and results.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**questions** | [**List&lt;QuizPinQuestion&gt;**](QuizPinQuestion.md) |  |  [optional] |
|**results** | [**List&lt;QuizPinResult&gt;**](QuizPinResult.md) |  |  [optional] |
|**tieBreakerType** | [**TieBreakerTypeEnum**](#TieBreakerTypeEnum) | Quiz ad tie breaker type, default is RANDOM |  [optional] |
|**tieBreakerCustomResult** | [**QuizPinResult**](QuizPinResult.md) |  |  [optional] |



## Enum: TieBreakerTypeEnum

| Name | Value |
|---- | -----|
| RANDOM | &quot;RANDOM&quot; |
| CUSTOM | &quot;CUSTOM&quot; |



