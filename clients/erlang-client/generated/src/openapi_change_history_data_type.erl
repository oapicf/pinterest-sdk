-module(openapi_change_history_data_type).

-export([encode/1]).

-export_type([openapi_change_history_data_type/0]).

-type openapi_change_history_data_type() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
