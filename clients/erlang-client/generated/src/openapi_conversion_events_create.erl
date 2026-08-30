-module(openapi_conversion_events_create).

-export([encode/1]).

-export_type([openapi_conversion_events_create/0]).

-type openapi_conversion_events_create() ::
    #{ 'data' := list()
     }.

encode(#{ 'data' := Data
        }) ->
    #{ 'data' => Data
     }.
