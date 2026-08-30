-module(openapi_schedule_type).

-export([encode/1]).

-export_type([openapi_schedule_type/0]).

-type openapi_schedule_type() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
