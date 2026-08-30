-module(openapi_audience_status).

-export([encode/1]).

-export_type([openapi_audience_status/0]).

-type openapi_audience_status() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
