package models

type FollowUser struct {

	// Always 'user'
	Type string `json:"type,omitempty"`

	// Username
	Username string `json:"username,omitempty"`
}
