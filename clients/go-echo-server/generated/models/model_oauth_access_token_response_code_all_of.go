package models

type OauthAccessTokenResponseCodeAllOf struct {

	RefreshToken string `json:"refresh_token"`

	RefreshTokenExpiresIn int32 `json:"refresh_token_expires_in"`
}
