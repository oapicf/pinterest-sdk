package models

// ConversionAccessToken - A successful conversion access token response.
type ConversionAccessToken struct {

	AccessToken string `json:"access_token"`

	TokenType string `json:"token_type,omitempty"`
}
