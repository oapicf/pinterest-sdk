-module(openapi_conversion_api_response).

-export([encode/1]).

-export_type([openapi_conversion_api_response/0]).

-type openapi_conversion_api_response() ::
    #{ 'num_events_received' := integer(),
       'num_events_processed' := integer(),
       'events' := list()
     }.

encode(#{ 'num_events_received' := NumEventsReceived,
          'num_events_processed' := NumEventsProcessed,
          'events' := Events
        }) ->
    #{ 'num_events_received' => NumEventsReceived,
       'num_events_processed' => NumEventsProcessed,
       'events' => Events
     }.
