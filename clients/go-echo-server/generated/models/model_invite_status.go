package models
// InviteStatus : The current status of an invite or request.
type InviteStatus string

// List of InviteStatus
const (
	PENDING InviteStatus = "PENDING"
	ACCEPTED InviteStatus = "ACCEPTED"
	DECLINED InviteStatus = "DECLINED"
	CANCELLED InviteStatus = "CANCELLED"
	EXPIRED InviteStatus = "EXPIRED"
)
