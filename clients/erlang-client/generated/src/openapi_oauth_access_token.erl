-module(openapi_oauth_access_token).

-export([encode/1]).

-export_type([openapi_oauth_access_token/0]).

-type openapi_oauth_access_token() ::
    #{ 'access_token' := binary(),
       'expires_in' := integer(),
       'refresh_token' => binary(),
       'refresh_token_expires_at' => integer(),
       'refresh_token_expires_in' => integer(),
       'response_type' => openapi_token_grant_type:openapi_token_grant_type(),
       'scope' => binary(),
       'token_type' := binary()
     }.

encode(#{ 'access_token' := AccessToken,
          'expires_in' := ExpiresIn,
          'refresh_token' := RefreshToken,
          'refresh_token_expires_at' := RefreshTokenExpiresAt,
          'refresh_token_expires_in' := RefreshTokenExpiresIn,
          'response_type' := ResponseType,
          'scope' := Scope,
          'token_type' := TokenType
        }) ->
    #{ 'access_token' => AccessToken,
       'expires_in' => ExpiresIn,
       'refresh_token' => RefreshToken,
       'refresh_token_expires_at' => RefreshTokenExpiresAt,
       'refresh_token_expires_in' => RefreshTokenExpiresIn,
       'response_type' => ResponseType,
       'scope' => Scope,
       'token_type' => TokenType
     }.
