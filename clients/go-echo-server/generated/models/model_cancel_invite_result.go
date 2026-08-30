package models

type CancelInviteResult struct {

	Id string `json:"id,omitempty" validate:"regexp=^\\d+$"`

	InviteData InviteDataResponse `json:"invite_data,omitempty"`

	IsReceivedInvite bool `json:"is_received_invite,omitempty"`

	User CancelInviteResultUser `json:"user,omitempty"`
}
