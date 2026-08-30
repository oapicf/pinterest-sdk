package models

type EntityLabel struct {

	// Entity ID to apply label to.
	EntityId string `json:"entity_id"`

	EntityType *LabelParentType `json:"entity_type,omitempty"`

	// Label ID.
	LabelId string `json:"label_id"`

	Status *EntityLabelStatus `json:"status,omitempty"`
}
