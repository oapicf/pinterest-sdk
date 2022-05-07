-module(openapi_oauth_access_token_request_refresh).

-export([encode/1]).

-export_type([openapi_oauth_access_token_request_refresh/0]).

-type openapi_oauth_access_token_request_refresh() ::
    #{ 'grant_type' := binary(),
       'refresh_token' := binary(),
       'scope' => binary()
     }.

encode(#{ 'grant_type' := GrantType,
          'refresh_token' := RefreshToken,
          'scope' := Scope
        }) ->
    #{ 'grant_type' => GrantType,
       'refresh_token' => RefreshToken,
       'scope' => Scope
     }.
