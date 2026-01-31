-module(openapi_conversion_api_response_events_inner).

-include("openapi.hrl").

-export([openapi_conversion_api_response_events_inner/0]).

-export([openapi_conversion_api_response_events_inner/1]).

-export_type([openapi_conversion_api_response_events_inner/0]).

-type openapi_conversion_api_response_events_inner() ::
  [ {'error_message', binary() }
  | {'status', binary() }
  | {'warning_message', binary() }
  ].


openapi_conversion_api_response_events_inner() ->
    openapi_conversion_api_response_events_inner([]).

openapi_conversion_api_response_events_inner(Fields) ->
  Default = [ {'error_message', binary() }
            , {'status', elements([<<"failed">>, <<"processed">>]) }
            , {'warning_message', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

