-module(openapi_currency_filter).

-export([encode/1]).

-export_type([openapi_currency_filter/0]).

-type openapi_currency_filter() ::
    #{ 'CURRENCY' := openapi_catalogs_product_group_currency_criteria:openapi_catalogs_product_group_currency_criteria()
     }.

encode(#{ 'CURRENCY' := CURRENCY
        }) ->
    #{ 'CURRENCY' => CURRENCY
     }.
