package models

// SummaryPin - Summarized pin information
type SummaryPin struct {

	Media PinMedia `json:"media,omitempty"`

	AltText *string `json:"alt_text,omitempty"`

	Link *string `json:"link,omitempty"`

	Title *string `json:"title,omitempty"`

	Description *string `json:"description,omitempty"`
}
