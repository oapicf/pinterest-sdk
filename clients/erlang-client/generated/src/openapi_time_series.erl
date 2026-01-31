-module(openapi_time_series).

-export([encode/1]).

-export_type([openapi_time_series/0]).

-type openapi_time_series() ::
    #{ 'date' => calendar:date()
     }.

encode(#{ 'date' := Date
        }) ->
    #{ 'date' => Date
     }.
