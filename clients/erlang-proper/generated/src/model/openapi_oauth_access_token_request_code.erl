-module(openapi_oauth_access_token_request_code).

-include("openapi.hrl").

-export([openapi_oauth_access_token_request_code/0]).

-export([openapi_oauth_access_token_request_code/1]).

-export_type([openapi_oauth_access_token_request_code/0]).

-type openapi_oauth_access_token_request_code() ::
  [ {'code', binary() }
  | {'redirect_uri', binary() }
  | {'grant_type', binary() }
  ].


openapi_oauth_access_token_request_code() ->
    openapi_oauth_access_token_request_code([]).

openapi_oauth_access_token_request_code(Fields) ->
  Default = [ {'code', binary() }
            , {'redirect_uri', binary() }
            , {'grant_type', elements([<<"authorization_code">>, <<"refresh_token">>, <<"client_credentials">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

