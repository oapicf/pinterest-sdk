-module(openapi_predicted_time_series).

-export([encode/1]).

-export_type([openapi_predicted_time_series/0]).

-type openapi_predicted_time_series() ::
    #{ 'date' => calendar:date()
     }.

encode(#{ 'date' := Date
        }) ->
    #{ 'date' => Date
     }.
