package models

type UpdateBusinessMembershipsResponse struct {

	// List of members with updated business access role.
	Items []BusinessMembershipMember `json:"items,omitempty"`
}
