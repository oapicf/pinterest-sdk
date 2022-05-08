-module(openapi_oauth_access_token_request).

-export([encode/1]).

-export_type([openapi_oauth_access_token_request/0]).

-type openapi_oauth_access_token_request() ::
    #{ 'grant_type' := binary()
     }.

encode(#{ 'grant_type' := GrantType
        }) ->
    #{ 'grant_type' => GrantType
     }.
