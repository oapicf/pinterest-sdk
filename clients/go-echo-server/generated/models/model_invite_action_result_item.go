package models

// InviteActionResultItem - An item representing the result of an invite/request action. Contains either an exception (on error) or an invite binding (on success).
type InviteActionResultItem struct {

	Exception *InviteExceptionResponse `json:"exception,omitempty"`

	Invite *InviteBusinessRoleBinding `json:"invite,omitempty"`
}
