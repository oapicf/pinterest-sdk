-module(openapi_max_price_filter).

-export([encode/1]).

-export_type([openapi_max_price_filter/0]).

-type openapi_max_price_filter() ::
    #{ 'MAX_PRICE' := openapi_catalogs_product_group_pricing_criteria:openapi_catalogs_product_group_pricing_criteria()
     }.

encode(#{ 'MAX_PRICE' := MAXPRICE
        }) ->
    #{ 'MAX_PRICE' => MAXPRICE
     }.
