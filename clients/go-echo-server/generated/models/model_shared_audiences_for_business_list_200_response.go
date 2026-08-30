package models

type SharedAudiencesForBusinessList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []Audience `json:"items"`
}
