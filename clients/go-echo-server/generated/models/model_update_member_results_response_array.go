package models

type UpdateMemberResultsResponseArray struct {

	// List of members with updated business access role.
	Items []UpdateMemberResult `json:"items,omitempty"`
}
