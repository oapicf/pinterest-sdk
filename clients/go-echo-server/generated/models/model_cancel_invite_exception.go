package models

// CancelInviteException - An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
type CancelInviteException struct {

	InviteId string `json:"invite_id,omitempty" validate:"regexp=^\\d+$"`

	Message string `json:"message,omitempty"`
}
