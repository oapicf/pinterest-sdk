-module(openapi_integrations_logs_post_400_response).

-include("openapi.hrl").

-export([openapi_integrations_logs_post_400_response/0]).

-export([openapi_integrations_logs_post_400_response/1]).

-export_type([openapi_integrations_logs_post_400_response/0]).

-type openapi_integrations_logs_post_400_response() ::
  [ {'code', integer() }
  | {'message', binary() }
  | {'details', map() }
  ].


openapi_integrations_logs_post_400_response() ->
    openapi_integrations_logs_post_400_response([]).

openapi_integrations_logs_post_400_response(Fields) ->
  Default = [ {'code', integer() }
            , {'message', binary() }
            , {'details', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

