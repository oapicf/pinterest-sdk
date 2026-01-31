
# Table `OauthAccessTokenResponseCode`
(mapped from: OauthAccessTokenResponseCode)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**accessToken** | access_token | text NOT NULL |  | **kotlin.String** |  | 
**expiresIn** | expires_in | int NOT NULL |  | **kotlin.Int** |  | 
**scope** | scope | text NOT NULL |  | **kotlin.String** |  | 
**tokenType** | token_type | text NOT NULL |  | **kotlin.String** |  | 
**refreshToken** | refresh_token | text |  | **kotlin.String** |  |  [optional]
**refreshTokenExpiresAt** | refresh_token_expires_at | int |  | **kotlin.Int** |  |  [optional]
**refreshTokenExpiresIn** | refresh_token_expires_in | int |  | **kotlin.Int** |  |  [optional]
**responseType** | response_type | text |  | [**response_type**](#ResponseType) |  |  [optional]










