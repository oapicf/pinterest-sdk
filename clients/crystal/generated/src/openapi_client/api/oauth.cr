require "json"

module OpenAPIClient
  module Api
  class Oauth
    def initialize(@conn : Connection); end

    # Generate OAuth access token for conversion API Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.
    def conversion_token() : Response(OpenAPIClient::ConversionAccessToken)
      @conn.request(OpenAPIClient::ConversionAccessToken,
        method: :POST,
        path: "/oauth/conversion_token",
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Generate OAuth access token Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).  **Note:** If your app was created **before September 25, 2025**, make sure to set the &#x60;continuous_refresh&#x60; parameter to &#x60;true&#x60; to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token. 
    def token(code : String? = nil, continuous_refresh : String? = nil, grant_type : OpenAPIClient::TokenGrantType? = nil, redirect_uri : String? = nil, refresh_token : String? = nil, scope : String? = nil) : Response(OpenAPIClient::OauthAccessToken)
      @conn.request(OpenAPIClient::OauthAccessToken,
        method: :POST,
        path: "/oauth/token",
        form: Hash(String, Crest::ParamsValue){ "code" => code, "continuous_refresh" => continuous_refresh, "grant_type" => grant_type, "redirect_uri" => redirect_uri, "refresh_token" => refresh_token, "scope" => scope },
        accept: %w[application/json],
        auth: %w[basic])
    end

    # Revoke a token Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.
    def token_revoke(token : String? = nil, token_type_hint : OpenAPIClient::TokenTypeHint? = nil) : Response(Nil)
      @conn.request(Nil,
        method: :POST,
        path: "/oauth/token/revoke",
        form: Hash(String, Crest::ParamsValue){ "token" => token, "token_type_hint" => token_type_hint },
        accept: %w[application/json],
        auth: %w[basic])
    end
  end
  end

end
