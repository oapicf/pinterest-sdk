package models

// SummaryPin - Summarized pin information
type SummaryPin struct {

	AltText *string `json:"alt_text,omitempty"`

	Description *string `json:"description,omitempty"`

	Id string `json:"id" validate:"regexp=^\\d+$"`

	Link *string `json:"link,omitempty"`

	Media PinMedia `json:"media,omitempty"`

	Title *string `json:"title,omitempty"`
}
