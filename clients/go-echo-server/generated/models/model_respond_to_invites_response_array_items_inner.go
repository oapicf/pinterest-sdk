package models

type RespondToInvitesResponseArrayItemsInner struct {

	Exception *InviteExceptionResponse `json:"exception,omitempty"`

	Invite *BaseInviteDataResponse `json:"invite,omitempty"`
}
