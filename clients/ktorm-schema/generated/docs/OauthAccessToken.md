
# Table `OauthAccessToken`
(mapped from: OauthAccessToken)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**accessToken** | access_token | text NOT NULL |  | **kotlin.String** |  |  [readonly]
**expiresIn** | expires_in | int NOT NULL |  | **kotlin.Int** |  |  [readonly]
**tokenType** | token_type | text NOT NULL |  | **kotlin.String** |  |  [readonly]
**refreshToken** | refresh_token | text |  | **kotlin.String** |  |  [optional]
**refreshTokenExpiresAt** | refresh_token_expires_at | int |  | **kotlin.Int** |  |  [optional] [readonly]
**refreshTokenExpiresIn** | refresh_token_expires_in | int |  | **kotlin.Int** |  |  [optional] [readonly]
**responseType** | response_type | long |  | [**TokenGrantType**](TokenGrantType.md) |  |  [optional] [readonly] [foreignkey]
**scope** | scope | text |  | **kotlin.String** |  |  [optional]










