-module(openapi_oauth_access_token_response).

-include("openapi.hrl").

-export([openapi_oauth_access_token_response/0]).

-export([openapi_oauth_access_token_response/1]).

-export_type([openapi_oauth_access_token_response/0]).

-type openapi_oauth_access_token_response() ::
  [ {'response_type', binary() }
  | {'access_token', binary() }
  | {'token_type', binary() }
  | {'expires_in', integer() }
  | {'scope', binary() }
  ].


openapi_oauth_access_token_response() ->
    openapi_oauth_access_token_response([]).

openapi_oauth_access_token_response(Fields) ->
  Default = [ {'response_type', elements([<<"authorization_code">>, <<"refresh_token">>, <<"client_credentials">>]) }
            , {'access_token', binary() }
            , {'token_type', binary() }
            , {'expires_in', integer() }
            , {'scope', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

