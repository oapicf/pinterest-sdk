-module(openapi_catalogs_product_group_multiple_gender_criteria).

-export([encode/1]).

-export_type([openapi_catalogs_product_group_multiple_gender_criteria/0]).

-type openapi_catalogs_product_group_multiple_gender_criteria() ::
    #{ 'negated' => boolean(),
       'values' := list()
     }.

encode(#{ 'negated' := Negated,
          'values' := Values
        }) ->
    #{ 'negated' => Negated,
       'values' => Values
     }.
