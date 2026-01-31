package models

type OauthAccessTokenRequestCode struct {

	Code string `json:"code"`

	RedirectUri string `json:"redirect_uri"`

	GrantType string `json:"grant_type"`
}
