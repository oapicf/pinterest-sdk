package models

// CreateAssetInvitesRequest - Request body for updating asset roles for existing invites.
type CreateAssetInvitesRequest struct {

	Invites []CreateAssetInvitesRequestItem `json:"invites"`
}
