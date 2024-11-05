-module(openapi_oauth_access_token_request_client_credentials).

-include("openapi.hrl").

-export([openapi_oauth_access_token_request_client_credentials/0]).

-export([openapi_oauth_access_token_request_client_credentials/1]).

-export_type([openapi_oauth_access_token_request_client_credentials/0]).

-type openapi_oauth_access_token_request_client_credentials() ::
  [ {'grant_type', binary() }
  | {'scope', binary() }
  ].


openapi_oauth_access_token_request_client_credentials() ->
    openapi_oauth_access_token_request_client_credentials([]).

openapi_oauth_access_token_request_client_credentials(Fields) ->
  Default = [ {'grant_type', elements([<<"authorization_code">>, <<"refresh_token">>, <<"client_credentials">>]) }
            , {'scope', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

