package models

// CreateMembershipOrPartnershipInvitesBody - Body to be used on path to send Members or Partners Invite or Request
type CreateMembershipOrPartnershipInvitesBody struct {

	BusinessRole BusinessRoleForInvite `json:"business_role"`

	InviteType InviteType `json:"invite_type"`

	// A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE
	Members []string `json:"members,omitempty"`

	// A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST
	Partners []string `json:"partners,omitempty"`
}
