-module(openapi_price_filter).

-include("openapi.hrl").

-export([openapi_price_filter/0]).

-export([openapi_price_filter/1]).

-export_type([openapi_price_filter/0]).

-type openapi_price_filter() ::
  [ {'PRICE', openapi_catalogs_product_group_pricing_currency_criteria:openapi_catalogs_product_group_pricing_currency_criteria() }
  ].


openapi_price_filter() ->
    openapi_price_filter([]).

openapi_price_filter(Fields) ->
  Default = [ {'PRICE', openapi_catalogs_product_group_pricing_currency_criteria:openapi_catalogs_product_group_pricing_currency_criteria() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

