-module(openapi_conversion_api_response).

-include("openapi.hrl").

-export([openapi_conversion_api_response/0]).

-export([openapi_conversion_api_response/1]).

-export_type([openapi_conversion_api_response/0]).

-type openapi_conversion_api_response() ::
  [ {'num_events_received', integer() }
  | {'num_events_processed', integer() }
  | {'events', list(openapi_conversion_api_response_events_inner:openapi_conversion_api_response_events_inner()) }
  ].


openapi_conversion_api_response() ->
    openapi_conversion_api_response([]).

openapi_conversion_api_response(Fields) ->
  Default = [ {'num_events_received', integer() }
            , {'num_events_processed', integer() }
            , {'events', list(openapi_conversion_api_response_events_inner:openapi_conversion_api_response_events_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

