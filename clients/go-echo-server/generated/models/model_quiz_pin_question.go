package models

// QuizPinQuestion - A specific quiz inquiry.
type QuizPinQuestion struct {

	Options []QuizPinOption `json:"options,omitempty"`

	QuestionId float32 `json:"question_id,omitempty"`

	QuestionText string `json:"question_text,omitempty"`
}
