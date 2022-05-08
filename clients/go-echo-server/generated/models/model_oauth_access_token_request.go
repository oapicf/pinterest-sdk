package models

// OauthAccessTokenRequest - Describes the valid schema for possible OAuth access token requests.
type OauthAccessTokenRequest struct {

	GrantType string `json:"grant_type"`
}
