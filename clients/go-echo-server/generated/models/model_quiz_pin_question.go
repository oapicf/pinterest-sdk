package models

// QuizPinQuestion - A specific quiz inquiry.
type QuizPinQuestion struct {

	QuestionId float32 `json:"question_id,omitempty"`

	QuestionText string `json:"question_text,omitempty"`

	Options []QuizPinOption `json:"options,omitempty"`
}
