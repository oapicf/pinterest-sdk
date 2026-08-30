package models

type ScheduleUpdateRequest struct {

	EntityId string `json:"entity_id,omitempty" validate:"regexp=^[C]?\\d+$"`

	// Entity type
	EntityType string `json:"entity_type,omitempty"`

	// Schedule ID.
	Id string `json:"id"`

	DeltaValue ScheduleCommonDeltaValue `json:"delta_value,omitempty"`

	// Schedule end time. Unix timestamp in seconds.
	EndTimestamp int32 `json:"end_timestamp,omitempty"`

	Name string `json:"name,omitempty"`

	ScheduleAction ScheduleAction `json:"schedule_action,omitempty"`

	ScheduleStatus ScheduleStatus `json:"schedule_status,omitempty"`

	ScheduleType ScheduleType `json:"schedule_type,omitempty"`

	// Schedule start time. Unix timestamp in seconds.
	StartTimestamp int32 `json:"start_timestamp,omitempty"`
}
