-module(openapi_catalogs_product_group_filter_operator_type_criteria).

-export([encode/1]).

-export_type([openapi_catalogs_product_group_filter_operator_type_criteria/0]).

-type openapi_catalogs_product_group_filter_operator_type_criteria() ::
    #{ 'filter_operator_type' => binary(),
       'negated' => boolean(),
       'values' := list()
     }.

encode(#{ 'filter_operator_type' := FilterOperatorType,
          'negated' := Negated,
          'values' := Values
        }) ->
    #{ 'filter_operator_type' => FilterOperatorType,
       'negated' => Negated,
       'values' => Values
     }.
