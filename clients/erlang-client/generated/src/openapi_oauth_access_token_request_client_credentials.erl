-module(openapi_oauth_access_token_request_client_credentials).

-export([encode/1]).

-export_type([openapi_oauth_access_token_request_client_credentials/0]).

-type openapi_oauth_access_token_request_client_credentials() ::
    #{ 'scope' := binary(),
       'grant_type' := binary()
     }.

encode(#{ 'scope' := Scope,
          'grant_type' := GrantType
        }) ->
    #{ 'scope' => Scope,
       'grant_type' => GrantType
     }.
