-module(openapi_data_status).

-export([encode/1]).

-export_type([openapi_data_status/0]).

-type openapi_data_status() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
