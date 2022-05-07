-module(openapi_oauth_access_token_request_code_all_of).

-export([encode/1]).

-export_type([openapi_oauth_access_token_request_code_all_of/0]).

-type openapi_oauth_access_token_request_code_all_of() ::
    #{ 'code' := binary(),
       'redirect_uri' := binary()
     }.

encode(#{ 'code' := Code,
          'redirect_uri' := RedirectUri
        }) ->
    #{ 'code' => Code,
       'redirect_uri' => RedirectUri
     }.
