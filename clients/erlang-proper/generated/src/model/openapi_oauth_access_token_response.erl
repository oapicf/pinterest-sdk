-module(openapi_oauth_access_token_response).

-include("openapi.hrl").

-export([openapi_oauth_access_token_response/0]).

-export([openapi_oauth_access_token_response/1]).

-export_type([openapi_oauth_access_token_response/0]).

-type openapi_oauth_access_token_response() ::
  [ {'access_token', binary() }
  | {'expires_in', integer() }
  | {'response_type', binary() }
  | {'scope', binary() }
  | {'token_type', binary() }
  ].


openapi_oauth_access_token_response() ->
    openapi_oauth_access_token_response([]).

openapi_oauth_access_token_response(Fields) ->
  Default = [ {'access_token', binary() }
            , {'expires_in', integer() }
            , {'response_type', elements([<<"authorization_code">>, <<"refresh_token">>, <<"client_credentials">>]) }
            , {'scope', binary() }
            , {'token_type', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

