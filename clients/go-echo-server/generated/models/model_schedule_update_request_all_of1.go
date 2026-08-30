package models

type ScheduleUpdateRequestAllOf1 struct {

	EntityId string `json:"entity_id,omitempty" validate:"regexp=^[C]?\\d+$"`

	// Entity type
	EntityType string `json:"entity_type,omitempty"`

	// Schedule ID.
	Id string `json:"id"`
}
