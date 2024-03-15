
# Table `LeadFormQuestion`
(mapped from: LeadFormQuestion)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**questionType** | question_type | long |  | [**LeadFormQuestionType**](LeadFormQuestionType.md) |  |  [optional] [foreignkey]
**customQuestionFieldType** | custom_question_field_type | long |  | [**LeadFormQuestionFieldType**](LeadFormQuestionFieldType.md) |  |  [optional] [foreignkey]
**customQuestionLabel** | custom_question_label | text |  | **kotlin.String** | Question label for a custom question. |  [optional]
**customQuestionOptions** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Question options for a custom question. |  [optional]





# **Table `LeadFormQuestionCustomQuestionOptions`**
(mapped from: LeadFormQuestionCustomQuestionOptions)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
leadFormQuestion | leadFormQuestion | long | | kotlin.Long | Primary Key | *one*
customQuestionOptions | customQuestionOptions | text | | kotlin.String | Foreign Key | *many*



