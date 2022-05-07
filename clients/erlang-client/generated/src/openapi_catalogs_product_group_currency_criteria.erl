-module(openapi_catalogs_product_group_currency_criteria).

-export([encode/1]).

-export_type([openapi_catalogs_product_group_currency_criteria/0]).

-type openapi_catalogs_product_group_currency_criteria() ::
    #{ 'values' := openapi_non_nullable_catalogs_currency:openapi_non_nullable_catalogs_currency(),
       'negated' := boolean()
     }.

encode(#{ 'values' := Values,
          'negated' := Negated
        }) ->
    #{ 'values' => Values,
       'negated' => Negated
     }.
