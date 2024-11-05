package models

// DeleteInvitesResultsResponseArrayItemsInnerException - An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
type DeleteInvitesResultsResponseArrayItemsInnerException struct {

	// Unique identifier of an invite.
	InviteId string `json:"invite_id,omitempty" validate:"regexp=^\\\\d+$"`

	// Error message associated with the error in performing the action on the invite/request.
	Message string `json:"message,omitempty"`
}
