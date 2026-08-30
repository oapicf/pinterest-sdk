-module(openapi_price_filter).

-export([encode/1]).

-export_type([openapi_price_filter/0]).

-type openapi_price_filter() ::
    #{ 'PRICE' := openapi_price_filter_price:openapi_price_filter_price()
     }.

encode(#{ 'PRICE' := PRICE
        }) ->
    #{ 'PRICE' => PRICE
     }.
