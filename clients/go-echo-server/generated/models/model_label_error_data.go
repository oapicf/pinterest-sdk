package models

type LabelErrorData struct {

	// Label ID.
	Id string `json:"id,omitempty" validate:"regexp=^\\d+$"`

	LabelType *NullableLabelType `json:"label_type,omitempty"`

	Status *NullableLabelStatus `json:"status,omitempty"`

	// Label name. 100-character limit.
	Value string `json:"value,omitempty"`
}
