package models

type DeleteInvitesResultsResponseArrayItemsInner struct {

	Exception *DeleteInvitesResultsResponseArrayItemsInnerException `json:"exception,omitempty"`

	Invite *BaseInviteDataResponse `json:"invite,omitempty"`
}
