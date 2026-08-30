package models

type AuthRespondInvitesBodyItem struct {

	Action AuthRespondInviteAction `json:"action"`

	// Unique identifier of an invite.
	InviteId string `json:"invite_id" validate:"regexp=^\\d+$"`
}
