
# Table `AdCommon_quiz_pin_data`
(mapped from: AdCommonQuizPinData)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**questions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;QuizPinQuestion&gt;**](QuizPinQuestion.md) |  |  [optional]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;QuizPinResult&gt;**](QuizPinResult.md) |  |  [optional]


# **Table `AdCommonQuizPinDataQuizPinQuestion`**
(mapped from: AdCommonQuizPinDataQuizPinQuestion)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adCommonQuizPinData | adCommonQuizPinData | long | | kotlin.Long | Primary Key | *one*
quizPinQuestion | quizPinQuestion | long | | kotlin.Long | Foreign Key | *many*



# **Table `AdCommonQuizPinDataQuizPinResult`**
(mapped from: AdCommonQuizPinDataQuizPinResult)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adCommonQuizPinData | adCommonQuizPinData | long | | kotlin.Long | Primary Key | *one*
quizPinResult | quizPinResult | long | | kotlin.Long | Foreign Key | *many*



