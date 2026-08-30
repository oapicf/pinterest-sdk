package models

// CancelInviteResultUser - Metadata of the member/partner that has access to the asset.
type CancelInviteResultUser struct {

	// Email of the business member/partner.
	Email string `json:"email,omitempty"`

	// Unique identifier of the business member/partner.
	Id string `json:"id,omitempty"`

	// Username of the business member/partner.
	Username string `json:"username,omitempty"`
}
