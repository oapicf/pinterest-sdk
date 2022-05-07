-module(openapi_catalogs_product_group_pricing_criteria).

-export([encode/1]).

-export_type([openapi_catalogs_product_group_pricing_criteria/0]).

-type openapi_catalogs_product_group_pricing_criteria() ::
    #{ 'inclusion' := boolean(),
       'values' := integer(),
       'negated' := boolean()
     }.

encode(#{ 'inclusion' := Inclusion,
          'values' := Values,
          'negated' := Negated
        }) ->
    #{ 'inclusion' => Inclusion,
       'values' => Values,
       'negated' => Negated
     }.
