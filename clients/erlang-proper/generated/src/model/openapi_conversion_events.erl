-module(openapi_conversion_events).

-include("openapi.hrl").

-export([openapi_conversion_events/0]).

-export([openapi_conversion_events/1]).

-export_type([openapi_conversion_events/0]).

-type openapi_conversion_events() ::
  [ {'events', list(openapi_conversion_api_response_events_items:openapi_conversion_api_response_events_items()) }
  | {'num_events_processed', integer() }
  | {'num_events_received', integer() }
  ].


openapi_conversion_events() ->
    openapi_conversion_events([]).

openapi_conversion_events(Fields) ->
  Default = [ {'events', list(openapi_conversion_api_response_events_items:openapi_conversion_api_response_events_items()) }
            , {'num_events_processed', integer() }
            , {'num_events_received', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

