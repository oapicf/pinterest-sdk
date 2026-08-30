package models

// LabeledEntitiesCreate - Resource create operation model.
type LabeledEntitiesCreate struct {

	// Entity IDs to apply label to.
	EntityIds []string `json:"entity_ids"`
}
