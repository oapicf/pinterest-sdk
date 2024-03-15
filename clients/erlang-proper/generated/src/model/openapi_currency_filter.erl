-module(openapi_currency_filter).

-include("openapi.hrl").

-export([openapi_currency_filter/0]).

-export([openapi_currency_filter/1]).

-export_type([openapi_currency_filter/0]).

-type openapi_currency_filter() ::
  [ {'CURRENCY', openapi_catalogs_product_group_currency_criteria:openapi_catalogs_product_group_currency_criteria() }
  ].


openapi_currency_filter() ->
    openapi_currency_filter([]).

openapi_currency_filter(Fields) ->
  Default = [ {'CURRENCY', openapi_catalogs_product_group_currency_criteria:openapi_catalogs_product_group_currency_criteria() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

