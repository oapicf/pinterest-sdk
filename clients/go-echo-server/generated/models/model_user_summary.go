package models

type UserSummary struct {

	// Always \"user\"
	Type string `json:"type,omitempty"`

	// Username
	Username string `json:"username,omitempty"`
}
