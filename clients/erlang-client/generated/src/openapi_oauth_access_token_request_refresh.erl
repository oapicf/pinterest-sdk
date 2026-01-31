-module(openapi_oauth_access_token_request_refresh).

-export([encode/1]).

-export_type([openapi_oauth_access_token_request_refresh/0]).

-type openapi_oauth_access_token_request_refresh() ::
    #{ 'refresh_token' := binary(),
       'scope' => binary(),
       'grant_type' := binary()
     }.

encode(#{ 'refresh_token' := RefreshToken,
          'scope' := Scope,
          'grant_type' := GrantType
        }) ->
    #{ 'refresh_token' => RefreshToken,
       'scope' => Scope,
       'grant_type' => GrantType
     }.
