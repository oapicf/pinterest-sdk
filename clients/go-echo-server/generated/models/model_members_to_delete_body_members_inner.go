package models

type MembersToDeleteBodyMembersInner struct {

	// Unique identifier of the member
	MemberId string `json:"member_id" validate:"regexp=^\\\\d+$"`

	BusinessRole BusinessRoleForMembers `json:"business_role"`
}
