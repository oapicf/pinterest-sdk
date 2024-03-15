package models

type LeadFormQuestion struct {

	QuestionType LeadFormQuestionType `json:"question_type,omitempty"`

	CustomQuestionFieldType *LeadFormQuestionFieldType `json:"custom_question_field_type,omitempty"`

	// Question label for a custom question.
	CustomQuestionLabel *string `json:"custom_question_label,omitempty"`

	// Question options for a custom question.
	CustomQuestionOptions *[]string `json:"custom_question_options,omitempty"`
}
