-module(openapi_catalogs_product_group_pricing_criteria).

-include("openapi.hrl").

-export([openapi_catalogs_product_group_pricing_criteria/0]).

-export([openapi_catalogs_product_group_pricing_criteria/1]).

-export_type([openapi_catalogs_product_group_pricing_criteria/0]).

-type openapi_catalogs_product_group_pricing_criteria() ::
  [ {'inclusion', boolean() }
  | {'negated', boolean() }
  | {'values', integer() }
  ].


openapi_catalogs_product_group_pricing_criteria() ->
    openapi_catalogs_product_group_pricing_criteria([]).

openapi_catalogs_product_group_pricing_criteria(Fields) ->
  Default = [ {'inclusion', boolean() }
            , {'negated', boolean() }
            , {'values', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

