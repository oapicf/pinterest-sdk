package models

// ConversionAccessTokenResponse - A successful conversion access token response.
type ConversionAccessTokenResponse struct {

	AccessToken string `json:"access_token"`

	TokenType string `json:"token_type,omitempty"`
}
