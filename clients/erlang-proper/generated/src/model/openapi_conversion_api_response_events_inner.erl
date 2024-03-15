-module(openapi_conversion_api_response_events_inner).

-include("openapi.hrl").

-export([openapi_conversion_api_response_events_inner/0]).

-export([openapi_conversion_api_response_events_inner/1]).

-export_type([openapi_conversion_api_response_events_inner/0]).

-type openapi_conversion_api_response_events_inner() ::
  [ {'status', binary() }
  | {'error_message', binary() }
  | {'warning_message', binary() }
  ].


openapi_conversion_api_response_events_inner() ->
    openapi_conversion_api_response_events_inner([]).

openapi_conversion_api_response_events_inner(Fields) ->
  Default = [ {'status', elements([<<"failed">>, <<"processed">>]) }
            , {'error_message', binary() }
            , {'warning_message', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

