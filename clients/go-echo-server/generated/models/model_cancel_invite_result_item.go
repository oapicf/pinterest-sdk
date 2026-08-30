package models

type CancelInviteResultItem struct {

	Exception *CancelInviteException `json:"exception,omitempty"`

	Invite *CancelInviteResult `json:"invite,omitempty"`
}
