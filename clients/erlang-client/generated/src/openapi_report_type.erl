-module(openapi_report_type).

-export([encode/1]).

-export_type([openapi_report_type/0]).

-type openapi_report_type() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
