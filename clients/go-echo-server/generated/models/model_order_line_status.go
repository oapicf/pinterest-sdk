package models
// OrderLineStatus : Order Line Status
type OrderLineStatus string

// List of OrderLineStatus
const (
	ACTIVE OrderLineStatus = "ACTIVE"
	PAUSED OrderLineStatus = "PAUSED"
	DELETED OrderLineStatus = "DELETED"
)
