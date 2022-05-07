-module(openapi_oauth_access_token_response_code).

-export([encode/1]).

-export_type([openapi_oauth_access_token_response_code/0]).

-type openapi_oauth_access_token_response_code() ::
    #{ 'response_type' => binary(),
       'access_token' := binary(),
       'token_type' := binary(),
       'expires_in' := integer(),
       'scope' := binary(),
       'refresh_token' := binary(),
       'refresh_token_expires_in' := integer()
     }.

encode(#{ 'response_type' := ResponseType,
          'access_token' := AccessToken,
          'token_type' := TokenType,
          'expires_in' := ExpiresIn,
          'scope' := Scope,
          'refresh_token' := RefreshToken,
          'refresh_token_expires_in' := RefreshTokenExpiresIn
        }) ->
    #{ 'response_type' => ResponseType,
       'access_token' => AccessToken,
       'token_type' => TokenType,
       'expires_in' => ExpiresIn,
       'scope' => Scope,
       'refresh_token' => RefreshToken,
       'refresh_token_expires_in' => RefreshTokenExpiresIn
     }.
