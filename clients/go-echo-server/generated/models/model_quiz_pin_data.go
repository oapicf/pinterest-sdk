package models

// QuizPinData - This field includes all quiz data including questions, options, and results.
type QuizPinData struct {

	Questions []QuizPinQuestion `json:"questions,omitempty"`

	Results []QuizPinResult `json:"results,omitempty"`

	// Quiz ad tie breaker type, default is RANDOM
	TieBreakerType string `json:"tie_breaker_type,omitempty"`

	TieBreakerCustomResult *QuizPinResult `json:"tie_breaker_custom_result,omitempty"`
}
