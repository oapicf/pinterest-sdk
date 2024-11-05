package models

// OauthAccessTokenRequestCode - A request to exchange an authorization code for an access token.
type OauthAccessTokenRequestCode struct {

	GrantType string `json:"grant_type"`

	Code string `json:"code"`

	RedirectUri string `json:"redirect_uri"`
}
