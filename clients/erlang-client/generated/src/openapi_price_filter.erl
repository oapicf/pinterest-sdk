-module(openapi_price_filter).

-export([encode/1]).

-export_type([openapi_price_filter/0]).

-type openapi_price_filter() ::
    #{ 'PRICE' := openapi_catalogs_product_group_pricing_currency_criteria:openapi_catalogs_product_group_pricing_currency_criteria()
     }.

encode(#{ 'PRICE' := PRICE
        }) ->
    #{ 'PRICE' => PRICE
     }.
