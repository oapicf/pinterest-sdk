package models

type LabelUpdateItem struct {

	// Label ID.
	Id string `json:"id" validate:"regexp=^\\d+$"`

	Status LabelStatus `json:"status,omitempty"`

	// Label name. 100-character limit.
	Value string `json:"value,omitempty"`
}
