package models

// DeleteBusinessMembershipMember - Single instance of a business member to be removed from the business.
type DeleteBusinessMembershipMember struct {

	BusinessRole BusinessRoleForMembers `json:"business_role"`

	// Unique identifier of the member
	MemberId string `json:"member_id" validate:"regexp=^\\d+$"`
}
