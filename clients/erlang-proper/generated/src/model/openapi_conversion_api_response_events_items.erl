-module(openapi_conversion_api_response_events_items).

-include("openapi.hrl").

-export([openapi_conversion_api_response_events_items/0]).

-export([openapi_conversion_api_response_events_items/1]).

-export_type([openapi_conversion_api_response_events_items/0]).

-type openapi_conversion_api_response_events_items() ::
  [ {'error_message', binary() }
  | {'status', openapi_event_processing_status:openapi_event_processing_status() }
  | {'warning_message', binary() }
  ].


openapi_conversion_api_response_events_items() ->
    openapi_conversion_api_response_events_items([]).

openapi_conversion_api_response_events_items(Fields) ->
  Default = [ {'error_message', binary() }
            , {'status', openapi_event_processing_status:openapi_event_processing_status() }
            , {'warning_message', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

