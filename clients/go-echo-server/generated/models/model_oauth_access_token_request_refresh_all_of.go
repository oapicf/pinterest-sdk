package models

type OauthAccessTokenRequestRefreshAllOf struct {

	RefreshToken string `json:"refresh_token"`

	Scope string `json:"scope,omitempty"`
}
