package models
// TokenTypeHint : The type of token to revoke.
type TokenTypeHint string

// List of TokenTypeHint
const (
	ACCESS_TOKEN TokenTypeHint = "access_token"
	REFRESH_TOKEN TokenTypeHint = "refresh_token"
)
