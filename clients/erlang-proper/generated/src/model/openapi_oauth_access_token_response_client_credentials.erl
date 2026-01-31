-module(openapi_oauth_access_token_response_client_credentials).

-include("openapi.hrl").

-export([openapi_oauth_access_token_response_client_credentials/0]).

-export([openapi_oauth_access_token_response_client_credentials/1]).

-export_type([openapi_oauth_access_token_response_client_credentials/0]).

-type openapi_oauth_access_token_response_client_credentials() ::
  [ {'access_token', binary() }
  | {'expires_in', integer() }
  | {'response_type', binary() }
  | {'scope', binary() }
  | {'token_type', binary() }
  ].


openapi_oauth_access_token_response_client_credentials() ->
    openapi_oauth_access_token_response_client_credentials([]).

openapi_oauth_access_token_response_client_credentials(Fields) ->
  Default = [ {'access_token', binary() }
            , {'expires_in', integer() }
            , {'response_type', elements([<<"authorization_code">>, <<"refresh_token">>, <<"client_credentials">>]) }
            , {'scope', binary() }
            , {'token_type', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

