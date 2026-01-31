-module(openapi_oauth_access_token_response_client_credentials).

-export([encode/1]).

-export_type([openapi_oauth_access_token_response_client_credentials/0]).

-type openapi_oauth_access_token_response_client_credentials() ::
    #{ 'access_token' := binary(),
       'expires_in' := integer(),
       'response_type' => binary(),
       'scope' := binary(),
       'token_type' := binary()
     }.

encode(#{ 'access_token' := AccessToken,
          'expires_in' := ExpiresIn,
          'response_type' := ResponseType,
          'scope' := Scope,
          'token_type' := TokenType
        }) ->
    #{ 'access_token' => AccessToken,
       'expires_in' => ExpiresIn,
       'response_type' => ResponseType,
       'scope' => Scope,
       'token_type' => TokenType
     }.
