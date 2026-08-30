-module(openapi_conversion_events).

-export([encode/1]).

-export_type([openapi_conversion_events/0]).

-type openapi_conversion_events() ::
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
