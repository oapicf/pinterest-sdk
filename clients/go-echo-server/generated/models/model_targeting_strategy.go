package models

type TargetingStrategy string

// List of TargetingStrategy
const (
	CHOOSE_YOUR_OWN TargetingStrategy = "CHOOSE_YOUR_OWN"
	FIND_NEW_CUSTOMERS TargetingStrategy = "FIND_NEW_CUSTOMERS"
	RECONNECT_WITH_USERS TargetingStrategy = "RECONNECT_WITH_USERS"
)
