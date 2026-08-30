package models

type Label struct {

	// Label ID.
	Id string `json:"id" validate:"regexp=^\\d+$"`

	LabelType *NullableLabelType `json:"label_type"`

	Status *NullableLabelStatus `json:"status,omitempty"`

	// Label name. 100-character limit.
	Value string `json:"value"`
}
