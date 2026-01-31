-module(openapi_catalogs_product_group_pricing_currency_criteria).

-export([encode/1]).

-export_type([openapi_catalogs_product_group_pricing_currency_criteria/0]).

-type openapi_catalogs_product_group_pricing_currency_criteria() ::
    #{ 'currency' := openapi_non_nullable_catalogs_currency:openapi_non_nullable_catalogs_currency(),
       'negated' => boolean(),
       'operator' := binary(),
       'value' := integer()
     }.

encode(#{ 'currency' := Currency,
          'negated' := Negated,
          'operator' := Operator,
          'value' := Value
        }) ->
    #{ 'currency' => Currency,
       'negated' => Negated,
       'operator' => Operator,
       'value' => Value
     }.
