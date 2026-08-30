package models

type CreateAssetAccessRequestResponse struct {

	// A list of errors associated with the asset access requests. Will be returned if there is an error.
	Exceptions []AssetAccessRequestError `json:"exceptions,omitempty"`

	// An object mapping each partner id to the asset access request id. Only one request id is returned per partner.
	Invites map[string]string `json:"invites,omitempty"`
}
