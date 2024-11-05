package models

type CreateInvitesResultsResponseArrayItemsInner struct {

	Exception *InviteExceptionResponse `json:"exception,omitempty"`

	Invite *CreateInvitesResultsResponseArrayItemsInnerInvite `json:"invite,omitempty"`
}
