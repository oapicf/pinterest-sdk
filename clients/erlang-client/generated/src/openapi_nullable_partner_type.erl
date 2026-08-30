-module(openapi_nullable_partner_type).

-export([encode/1]).

-export_type([openapi_nullable_partner_type/0]).

-type openapi_nullable_partner_type() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
