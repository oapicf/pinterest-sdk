package models

type AdAccountOwner struct {

	// The owning account's user ID.
	Id string `json:"id,omitempty"`

	// Public username for the user account
	Username string `json:"username,omitempty"`
}
