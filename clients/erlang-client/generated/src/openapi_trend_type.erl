-module(openapi_trend_type).

-export([encode/1]).

-export_type([openapi_trend_type/0]).

-type openapi_trend_type() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
