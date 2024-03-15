-module(openapi_max_price_filter).

-include("openapi.hrl").

-export([openapi_max_price_filter/0]).

-export([openapi_max_price_filter/1]).

-export_type([openapi_max_price_filter/0]).

-type openapi_max_price_filter() ::
  [ {'MAX_PRICE', openapi_catalogs_product_group_pricing_criteria:openapi_catalogs_product_group_pricing_criteria() }
  ].


openapi_max_price_filter() ->
    openapi_max_price_filter([]).

openapi_max_price_filter(Fields) ->
  Default = [ {'MAX_PRICE', openapi_catalogs_product_group_pricing_criteria:openapi_catalogs_product_group_pricing_criteria() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

