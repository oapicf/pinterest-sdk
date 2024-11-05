
# Table `QuizPinData`
(mapped from: QuizPinData)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**questions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;QuizPinQuestion&gt;**](QuizPinQuestion.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;QuizPinResult&gt;**](QuizPinResult.md) |  |  [optional]
**tieBreakerType** | tie_breaker_type | text |  | [**tie_breaker_type**](#TieBreakerType) | Quiz ad tie breaker type, default is RANDOM |  [optional]
**tieBreakerCustomResult** | tie_breaker_custom_result | long |  | [**QuizPinResult**](QuizPinResult.md) |  |  [optional] [foreignkey]


# **Table `QuizPinDataQuizPinQuestion`**
(mapped from: QuizPinDataQuizPinQuestion)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
quizPinData | quizPinData | long | | kotlin.Long | Primary Key | *one*
quizPinQuestion | quizPinQuestion | long | | kotlin.Long | Foreign Key | *many*



# **Table `QuizPinDataQuizPinResult`**
(mapped from: QuizPinDataQuizPinResult)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
quizPinData | quizPinData | long | | kotlin.Long | Primary Key | *one*
quizPinResult | quizPinResult | long | | kotlin.Long | Foreign Key | *many*





