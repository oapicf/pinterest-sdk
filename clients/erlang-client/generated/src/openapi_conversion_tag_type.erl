-module(openapi_conversion_tag_type).

-export([encode/1]).

-export_type([openapi_conversion_tag_type/0]).

-type openapi_conversion_tag_type() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
