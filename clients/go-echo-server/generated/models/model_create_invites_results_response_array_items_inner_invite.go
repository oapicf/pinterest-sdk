package models

// CreateInvitesResultsResponseArrayItemsInnerInvite - An invite object if the invite/request was successfully created. Will only be provided if the an invite/request is successfully created.
type CreateInvitesResultsResponseArrayItemsInnerInvite struct {

	// Unique identifier of the invite/request.
	Id string `json:"id,omitempty" validate:"regexp=^\\\\d+$"`

	// Metadata for the member/partner that was sent the invite/request.
	User BusinessAccessUserSummary `json:"user,omitempty"`
}
