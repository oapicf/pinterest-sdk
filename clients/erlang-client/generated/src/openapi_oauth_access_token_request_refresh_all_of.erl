-module(openapi_oauth_access_token_request_refresh_all_of).

-export([encode/1]).

-export_type([openapi_oauth_access_token_request_refresh_all_of/0]).

-type openapi_oauth_access_token_request_refresh_all_of() ::
    #{ 'refresh_token' := binary(),
       'scope' => binary()
     }.

encode(#{ 'refresh_token' := RefreshToken,
          'scope' := Scope
        }) ->
    #{ 'refresh_token' => RefreshToken,
       'scope' => Scope
     }.
