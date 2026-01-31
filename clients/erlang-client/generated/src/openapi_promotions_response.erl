-module(openapi_promotions_response).

-export([encode/1]).

-export_type([openapi_promotions_response/0]).

-type openapi_promotions_response() ::
    #{ 'promotions' => list()
     }.

encode(#{ 'promotions' := Promotions
        }) ->
    #{ 'promotions' => Promotions
     }.
