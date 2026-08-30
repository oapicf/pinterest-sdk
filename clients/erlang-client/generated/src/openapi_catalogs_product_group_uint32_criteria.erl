-module(openapi_catalogs_product_group_uint32_criteria).

-export([encode/1]).

-export_type([openapi_catalogs_product_group_uint32_criteria/0]).

-type openapi_catalogs_product_group_uint32_criteria() ::
    #{ 'negated' => boolean(),
       'operator' := openapi_numeric_filter_operator_type:openapi_numeric_filter_operator_type(),
       'value' := integer()
     }.

encode(#{ 'negated' := Negated,
          'operator' := Operator,
          'value' := Value
        }) ->
    #{ 'negated' => Negated,
       'operator' => Operator,
       'value' => Value
     }.
