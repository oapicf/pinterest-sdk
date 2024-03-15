-module(openapi_conversion_events).

-export([encode/1]).

-export_type([openapi_conversion_events/0]).

-type openapi_conversion_events() ::
    #{ 'data' := list()
     }.

encode(#{ 'data' := Data
        }) ->
    #{ 'data' => Data
     }.
