package models

type CreateAssetAccessRequestResponse struct {

	// A list of errors associated with the asset access requests. Will be returned if there is an error.
	Exceptions *[]CreateAssetAccessRequestErrorMessageInner `json:"exceptions,omitempty"`

	Invites *map[string]string `json:"invites,omitempty"`
}
