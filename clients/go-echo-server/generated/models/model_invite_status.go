package models
// InviteStatus : The current status of the invite.
type InviteStatus string

// List of InviteStatus
const (
	PENDING InviteStatus = "PENDING"
	ACCEPTED InviteStatus = "ACCEPTED"
	DECLINED InviteStatus = "DECLINED"
	CANCELLED InviteStatus = "CANCELLED"
	EXPIRED InviteStatus = "EXPIRED"
)
