package models
// BusinessRoleForInvite : The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
type BusinessRoleForInvite string

// List of BusinessRoleForInvite
const (
	EMPLOYEE BusinessRoleForInvite = "EMPLOYEE"
	BIZ_ADMIN BusinessRoleForInvite = "BIZ_ADMIN"
	PARTNER BusinessRoleForInvite = "PARTNER"
)
