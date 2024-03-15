-module(openapi_audience_type).

-export([encode/1]).

-export_type([openapi_audience_type/0]).

-type openapi_audience_type() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
