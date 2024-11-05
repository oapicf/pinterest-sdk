package models

// DeletedMembersResponse - An object with a list of members that were deleted.
type DeletedMembersResponse struct {

	// List of members whose business membership have been terminated.
	DeletedMembers []string `json:"deleted_members,omitempty"`
}
