package models

type UserSummary struct {

	// Username
	Username string `json:"username,omitempty"`

	// Always \"user\"
	Type string `json:"type,omitempty"`
}
