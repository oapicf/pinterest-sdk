package models

// UpdateMemberBusinessRoleBody - Single instance of a business member to have its role updated
type UpdateMemberBusinessRoleBody struct {

	BusinessRole BusinessRoleForMembers `json:"business_role"`

	// Unique identifier of the member
	MemberId string `json:"member_id" validate:"regexp=^\\\\d+$"`
}
