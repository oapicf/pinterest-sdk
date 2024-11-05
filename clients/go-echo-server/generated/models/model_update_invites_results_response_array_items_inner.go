package models

type UpdateInvitesResultsResponseArrayItemsInner struct {

	Exception *InviteExceptionResponse `json:"exception,omitempty"`

	Invite *InviteBusinessRoleBinding `json:"invite,omitempty"`
}
