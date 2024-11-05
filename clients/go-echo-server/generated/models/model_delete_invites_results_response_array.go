package models

// DeleteInvitesResultsResponseArray - Response to delete invites sent to Members or Partners, if there is an exception, return the exception mapped with the invite id
type DeleteInvitesResultsResponseArray struct {

	// List of invite/Request deletion status. If there is an error, an exception object will be returned. If the invite/request was successfully cancelled, an invite object will be returned for the invite that was cancelled.
	Items []DeleteInvitesResultsResponseArrayItemsInner `json:"items,omitempty"`
}
