-module(openapi_oauth_access_token_request_code).

-export([encode/1]).

-export_type([openapi_oauth_access_token_request_code/0]).

-type openapi_oauth_access_token_request_code() ::
    #{ 'code' := binary(),
       'redirect_uri' := binary(),
       'grant_type' := binary()
     }.

encode(#{ 'code' := Code,
          'redirect_uri' := RedirectUri,
          'grant_type' := GrantType
        }) ->
    #{ 'code' => Code,
       'redirect_uri' => RedirectUri,
       'grant_type' => GrantType
     }.
