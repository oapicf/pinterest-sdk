package models
// ScheduleStatus : Schedule status
type ScheduleStatus string

// List of ScheduleStatus
const (
	DRAFT ScheduleStatus = "DRAFT"
	CREATED ScheduleStatus = "CREATED"
	SCHEDULED ScheduleStatus = "SCHEDULED"
	ACTIVE ScheduleStatus = "ACTIVE"
	COMPLETED ScheduleStatus = "COMPLETED"
	FAILED ScheduleStatus = "FAILED"
	CANCELED ScheduleStatus = "CANCELED"
)
