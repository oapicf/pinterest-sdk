-module(openapi_oauth_access_token_request_code).

-export([encode/1]).

-export_type([openapi_oauth_access_token_request_code/0]).

-type openapi_oauth_access_token_request_code() ::
    #{ 'grant_type' := binary(),
       'code' := binary(),
       'redirect_uri' := binary()
     }.

encode(#{ 'grant_type' := GrantType,
          'code' := Code,
          'redirect_uri' := RedirectUri
        }) ->
    #{ 'grant_type' => GrantType,
       'code' => Code,
       'redirect_uri' => RedirectUri
     }.
