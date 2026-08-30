-module(openapi_billing_type).

-export([encode/1]).

-export_type([openapi_billing_type/0]).

-type openapi_billing_type() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
