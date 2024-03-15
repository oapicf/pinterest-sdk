-module(openapi_oauth_access_token_response).

-export([encode/1]).

-export_type([openapi_oauth_access_token_response/0]).

-type openapi_oauth_access_token_response() ::
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
