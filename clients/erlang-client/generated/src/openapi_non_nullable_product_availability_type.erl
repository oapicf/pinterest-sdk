-module(openapi_non_nullable_product_availability_type).

-export([encode/1]).

-export_type([openapi_non_nullable_product_availability_type/0]).

-type openapi_non_nullable_product_availability_type() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
