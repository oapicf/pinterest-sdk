package models

// SchedulesCreate200ResponseInnerData - Created/updated resource on success or error details on failure
type SchedulesCreate200ResponseInnerData struct {

	DeltaValue ScheduleDeltaValue `json:"delta_value,omitempty"`

	// Schedule end time. Unix timestamp in seconds.
	EndTimestamp int32 `json:"end_timestamp,omitempty"`

	// entity ID.
	EntityId string `json:"entity_id"`

	// Specify the entity_type to get summary information
	EntityType AdAccountEntityType `json:"entity_type,omitempty"`

	// Schedule name.
	Name string `json:"name,omitempty"`

	// The schedule action.
	ScheduleAction ScheduleAction `json:"schedule_action,omitempty"`

	// Schedule ID.
	ScheduleId string `json:"schedule_id"`

	// Schedule status.
	ScheduleStatus ScheduleStatus `json:"schedule_status,omitempty"`

	// The schedule type.
	ScheduleType ScheduleType `json:"schedule_type,omitempty"`

	// Schedule start time. Unix timestamp in seconds.
	StartTimestamp int32 `json:"start_timestamp,omitempty"`

	Id string `json:"id"`

	Exceptions PinterestLibError `json:"exceptions"`
}
