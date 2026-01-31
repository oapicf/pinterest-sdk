-module(openapi_catalogs_product_group_pricing_criteria).

-export([encode/1]).

-export_type([openapi_catalogs_product_group_pricing_criteria/0]).

-type openapi_catalogs_product_group_pricing_criteria() ::
    #{ 'inclusion' => boolean(),
       'negated' => boolean(),
       'values' := integer()
     }.

encode(#{ 'inclusion' := Inclusion,
          'negated' := Negated,
          'values' := Values
        }) ->
    #{ 'inclusion' => Inclusion,
       'negated' => Negated,
       'values' => Values
     }.
