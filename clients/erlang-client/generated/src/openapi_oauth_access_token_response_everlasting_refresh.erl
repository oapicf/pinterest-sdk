-module(openapi_oauth_access_token_response_everlasting_refresh).

-export([encode/1]).

-export_type([openapi_oauth_access_token_response_everlasting_refresh/0]).

-type openapi_oauth_access_token_response_everlasting_refresh() ::
    #{ 'response_type' => binary(),
       'access_token' := binary(),
       'token_type' := binary(),
       'expires_in' := integer(),
       'scope' := binary(),
       'refresh_token' := binary(),
       'refresh_token_expires_in' := integer(),
       'refresh_token_expires_at' := integer()
     }.

encode(#{ 'response_type' := ResponseType,
          'access_token' := AccessToken,
          'token_type' := TokenType,
          'expires_in' := ExpiresIn,
          'scope' := Scope,
          'refresh_token' := RefreshToken,
          'refresh_token_expires_in' := RefreshTokenExpiresIn,
          'refresh_token_expires_at' := RefreshTokenExpiresAt
        }) ->
    #{ 'response_type' => ResponseType,
       'access_token' => AccessToken,
       'token_type' => TokenType,
       'expires_in' => ExpiresIn,
       'scope' => Scope,
       'refresh_token' => RefreshToken,
       'refresh_token_expires_in' => RefreshTokenExpiresIn,
       'refresh_token_expires_at' => RefreshTokenExpiresAt
     }.
