package models

// AdCommonQuizPinData - Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
type AdCommonQuizPinData struct {

	Questions []QuizPinQuestion `json:"questions,omitempty"`

	Results []QuizPinResult `json:"results,omitempty"`
}
