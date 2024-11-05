package models

// CancelInvitesBody - Request body used to cancel invites
type CancelInvitesBody struct {

	// List of invite/request ids to be cancelled
	InviteIds []string `json:"invite_ids"`
}
