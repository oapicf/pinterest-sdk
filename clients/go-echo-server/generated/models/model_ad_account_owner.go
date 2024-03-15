package models

type AdAccountOwner struct {

	// Public username for the user account
	Username string `json:"username,omitempty"`

	// The owning account's user ID.
	Id string `json:"id,omitempty"`
}
