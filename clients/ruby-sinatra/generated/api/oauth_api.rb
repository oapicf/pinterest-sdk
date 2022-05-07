require 'json'


MyApp.add_route('POST', '/v5/oauth/token', {
  "resourcePath" => "/Oauth",
  "summary" => "Generate OAuth access token",
  "nickname" => "oauth/token",
  "responseClass" => "OauthAccessTokenResponse",
  "endpoint" => "/oauth/token",
  "notes" => "Generate an OAuth access token by using an authorization code or a refresh token.  See <a href='/docs/api/v5/#tag/Authentication'>Authentication</a> for more.",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

