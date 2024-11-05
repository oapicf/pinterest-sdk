package models
// InviteType : The type of invite. <br>'MEMBER_INVITE' is to invite a member to access your business assets. <br>'PARTNER INVITE' is to invite a partner to access your business assets. <br>'PARTNER_REQUEST' is to request access a partner's business assets.
type InviteType string

// List of InviteType
const (
	MEMBER_INVITE InviteType = "MEMBER_INVITE"
	PARTNER_INVITE InviteType = "PARTNER_INVITE"
	PARTNER_REQUEST InviteType = "PARTNER_REQUEST"
)
