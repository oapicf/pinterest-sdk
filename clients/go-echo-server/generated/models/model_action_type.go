package models
// ActionType : Ad group billable event type.
type ActionType string

// List of ActionType
const (
	CLICKTHROUGH ActionType = "CLICKTHROUGH"
	IMPRESSION ActionType = "IMPRESSION"
	VIDEO_V_50_MRC ActionType = "VIDEO_V_50_MRC"
	BILLABLE_ENGAGEMENT ActionType = "BILLABLE_ENGAGEMENT"
)
