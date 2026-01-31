package models

type MembersToDeleteBodyMembersInner struct {

	BusinessRole BusinessRoleForMembers `json:"business_role"`

	// Unique identifier of the member
	MemberId string `json:"member_id" validate:"regexp=^\\\\d+$"`
}
