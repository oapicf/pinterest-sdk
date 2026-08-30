package models
// InviteType : The type of invite. MEMBER_INVITE invites a member to access your business assets. PARTNER_INVITE invites a partner to access your business assets. PARTNER_REQUEST requests access to a partner's business assets.
type InviteType string

// List of InviteType
const (
	MEMBER_INVITE InviteType = "MEMBER_INVITE"
	PARTNER_INVITE InviteType = "PARTNER_INVITE"
	PARTNER_REQUEST InviteType = "PARTNER_REQUEST"
)
