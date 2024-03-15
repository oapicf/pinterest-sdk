package models

// QuizPinData - This field includes all quiz data including questions, options, and results.
type QuizPinData struct {

	Questions []QuizPinQuestion `json:"questions,omitempty"`

	Results []QuizPinResult `json:"results,omitempty"`
}
