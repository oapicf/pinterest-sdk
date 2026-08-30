package models

type AssetAccessRequestError struct {

	// Error code associated with the error in requesting asset access.
	Code int32 `json:"code,omitempty"`

	Messages []string `json:"messages,omitempty"`
}
