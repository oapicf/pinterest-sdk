-module(openapi_oauth_access_token_response).

-export([encode/1]).

-export_type([openapi_oauth_access_token_response/0]).

-type openapi_oauth_access_token_response() ::
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
