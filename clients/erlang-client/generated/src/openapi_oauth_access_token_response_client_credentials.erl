-module(openapi_oauth_access_token_response_client_credentials).

-export([encode/1]).

-export_type([openapi_oauth_access_token_response_client_credentials/0]).

-type openapi_oauth_access_token_response_client_credentials() ::
    #{ 'response_type' => binary(),
       'access_token' := binary(),
       'token_type' := binary(),
       'expires_in' := integer(),
       'scope' := binary()
     }.

encode(#{ 'response_type' := ResponseType,
          'access_token' := AccessToken,
          'token_type' := TokenType,
          'expires_in' := ExpiresIn,
          'scope' := Scope
        }) ->
    #{ 'response_type' => ResponseType,
       'access_token' => AccessToken,
       'token_type' => TokenType,
       'expires_in' => ExpiresIn,
       'scope' => Scope
     }.
