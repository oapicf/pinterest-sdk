-module(openapi_data_output_format).

-export([encode/1]).

-export_type([openapi_data_output_format/0]).

-type openapi_data_output_format() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
