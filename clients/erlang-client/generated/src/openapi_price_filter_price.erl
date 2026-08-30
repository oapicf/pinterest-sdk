-module(openapi_price_filter_price).

-export([encode/1]).

-export_type([openapi_price_filter_price/0]).

-type openapi_price_filter_price() ::
    #{ 'currency' := openapi_non_nullable_catalogs_currency:openapi_non_nullable_catalogs_currency(),
       'negated' => boolean(),
       'operator' := openapi_numeric_filter_operator_type:openapi_numeric_filter_operator_type(),
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
