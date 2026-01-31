-module(openapi_conversion_api_response).

-export([encode/1]).

-export_type([openapi_conversion_api_response/0]).

-type openapi_conversion_api_response() ::
    #{ 'events' := list(),
       'num_events_processed' := integer(),
       'num_events_received' := integer()
     }.

encode(#{ 'events' := Events,
          'num_events_processed' := NumEventsProcessed,
          'num_events_received' := NumEventsReceived
        }) ->
    #{ 'events' => Events,
       'num_events_processed' => NumEventsProcessed,
       'num_events_received' => NumEventsReceived
     }.
