package models

type ScheduleCreateRequestAllOf1 struct {

	EntityId string `json:"entity_id" validate:"regexp=^[C]?\\d+$"`

	// Entity type
	EntityType string `json:"entity_type"`
}
