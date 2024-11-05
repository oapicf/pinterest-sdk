package models

type AuthRespondInvitesBodyInvitesInner struct {

	Action AuthRespondInvitesBodyInvitesInnerAction `json:"action"`

	// Unique identifier of an invite.
	InviteId string `json:"invite_id" validate:"regexp=^\\\\d+$"`
}
