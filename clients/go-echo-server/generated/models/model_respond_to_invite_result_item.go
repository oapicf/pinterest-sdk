package models

type RespondToInviteResultItem struct {

	Exception *InviteExceptionResponse `json:"exception,omitempty"`

	// An invite object for the invite/request that was successfully accepted/declined. Will only be provided if the an invite/request is successfully created.
	Invite *BaseInviteDataResponse `json:"invite,omitempty"`
}
