package models

type SearchPartnerPins200Response struct {

	Items []SummaryPin `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
