-module(openapi_oauth_access_token_response_integration_refresh).

-export([encode/1]).

-export_type([openapi_oauth_access_token_response_integration_refresh/0]).

-type openapi_oauth_access_token_response_integration_refresh() ::
    #{ 'refresh_token' := binary(),
       'refresh_token_expires_in' := integer(),
       'access_token' := binary(),
       'expires_in' := integer(),
       'response_type' => binary(),
       'scope' := binary(),
       'token_type' := binary()
     }.

encode(#{ 'refresh_token' := RefreshToken,
          'refresh_token_expires_in' := RefreshTokenExpiresIn,
          'access_token' := AccessToken,
          'expires_in' := ExpiresIn,
          'response_type' := ResponseType,
          'scope' := Scope,
          'token_type' := TokenType
        }) ->
    #{ 'refresh_token' => RefreshToken,
       'refresh_token_expires_in' => RefreshTokenExpiresIn,
       'access_token' => AccessToken,
       'expires_in' => ExpiresIn,
       'response_type' => ResponseType,
       'scope' => Scope,
       'token_type' => TokenType
     }.
