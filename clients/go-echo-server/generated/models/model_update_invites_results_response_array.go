package models

type UpdateInvitesResultsResponseArray struct {

	// List of invite/Request action status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.
	Items []UpdateInvitesResultsResponseArrayItemsInner `json:"items,omitempty"`
}
