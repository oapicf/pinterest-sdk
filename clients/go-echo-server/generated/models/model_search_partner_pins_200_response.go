package models

type SearchPartnerPins200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []SummaryPin `json:"items"`
}
