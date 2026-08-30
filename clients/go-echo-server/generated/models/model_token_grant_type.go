package models
// TokenGrantType : The type of OAuth grant being requested.
type TokenGrantType string

// List of TokenGrantType
const (
	AUTHORIZATION_CODE TokenGrantType = "authorization_code"
	REFRESH_TOKEN TokenGrantType = "refresh_token"
	CLIENT_CREDENTIALS TokenGrantType = "client_credentials"
)
