require 'json'


MyApp.add_route('POST', '/v5/oauth/conversion_token', {
  "resourcePath" => "/Oauth",
  "summary" => "Generate OAuth access token for conversion API",
  "nickname" => "oauth/conversion_token",
  "responseClass" => "ConversionAccessToken",
  "endpoint" => "/oauth/conversion_token",
  "notes" => "Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v5/oauth/token', {
  "resourcePath" => "/Oauth",
  "summary" => "Generate OAuth access token",
  "nickname" => "oauth/token",
  "responseClass" => "OauthAccessToken",
  "endpoint" => "/oauth/token",
  "notes" => "Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).  **Note:** If your app was created **before September 25, 2025**, make sure to set the `continuous_refresh` parameter to `true` to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token. ",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v5/oauth/token/revoke', {
  "resourcePath" => "/Oauth",
  "summary" => "Revoke a token",
  "nickname" => "token/revoke",
  "responseClass" => "void",
  "endpoint" => "/oauth/token/revoke",
  "notes" => "Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

