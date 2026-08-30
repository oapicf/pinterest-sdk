package models
// ScheduleType : The schedule type
type ScheduleType string

// List of ScheduleType
const (
	CAMPAIGN_BUDGET_CHANGE ScheduleType = "CAMPAIGN_BUDGET_CHANGE"
	CAMPAIGN_BID_MULTIPLIERS ScheduleType = "CAMPAIGN_BID_MULTIPLIERS"
)
