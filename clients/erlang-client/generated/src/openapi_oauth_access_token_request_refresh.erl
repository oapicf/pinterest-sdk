-module(openapi_oauth_access_token_request_refresh).

-export([encode/1]).

-export_type([openapi_oauth_access_token_request_refresh/0]).

-type openapi_oauth_access_token_request_refresh() ::
    #{ 'grant_type' := binary(),
       'refresh_token' := binary(),
       'scope' => binary(),
       'refresh_on' => boolean()
     }.

encode(#{ 'grant_type' := GrantType,
          'refresh_token' := RefreshToken,
          'scope' := Scope,
          'refresh_on' := RefreshOn
        }) ->
    #{ 'grant_type' => GrantType,
       'refresh_token' => RefreshToken,
       'scope' => Scope,
       'refresh_on' => RefreshOn
     }.
