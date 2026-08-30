package models

// DeleteBusinessMembershipBody - List of members with role to delete.
type DeleteBusinessMembershipBody struct {

	Members []DeleteBusinessMembershipMember `json:"members"`
}
