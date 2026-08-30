package models

// CancelInvitesRequest - An object with the list of invite/request ids to cancel.
type CancelInvitesRequest struct {

	// A list of invite/request ids to cancel.
	InviteIds []string `json:"invite_ids"`
}
