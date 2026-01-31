package models

type Label struct {

	// Label ID.
	Id string `json:"id,omitempty"`

	LabelType *LabelType `json:"label_type,omitempty"`

	// Label parent entity ID.
	ParentId string `json:"parent_id,omitempty"`

	// Label parent entity type.
	ParentType *string `json:"parent_type,omitempty"`

	Status *LabelStatus `json:"status,omitempty"`

	// Label name.
	Value string `json:"value,omitempty"`
}
