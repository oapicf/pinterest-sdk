package models

// QuizPinData - This field includes all quiz data including questions, options, and results.
type QuizPinData struct {

	Questions []QuizPinQuestion `json:"questions,omitempty"`

	Results []QuizPinResult `json:"results,omitempty"`

	TieBreakerCustomResult *QuizPinResult `json:"tie_breaker_custom_result,omitempty"`

	TieBreakerType TieBreakerType `json:"tie_breaker_type,omitempty"`
}
