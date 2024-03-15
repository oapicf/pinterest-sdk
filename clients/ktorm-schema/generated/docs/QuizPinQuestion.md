
# Table `QuizPinQuestion`
(mapped from: QuizPinQuestion)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**questionId** | question_id | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**questionText** | question_text | text |  | **kotlin.String** |  |  [optional]
**options** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;QuizPinOption&gt;**](QuizPinOption.md) |  |  [optional]




# **Table `QuizPinQuestionQuizPinOption`**
(mapped from: QuizPinQuestionQuizPinOption)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
quizPinQuestion | quizPinQuestion | long | | kotlin.Long | Primary Key | *one*
quizPinOption | quizPinOption | long | | kotlin.Long | Foreign Key | *many*



