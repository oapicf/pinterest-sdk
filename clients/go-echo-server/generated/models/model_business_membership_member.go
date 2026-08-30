package models

// BusinessMembershipMember - A business member identified by `member_id` with their `business_role` in the business.
type BusinessMembershipMember struct {

	BusinessRole BusinessRoleForMembers `json:"business_role"`

	// Unique identifier of the member.
	MemberId string `json:"member_id" validate:"regexp=^\\d+$"`
}
