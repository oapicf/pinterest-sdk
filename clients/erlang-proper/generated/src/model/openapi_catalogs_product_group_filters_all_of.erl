-module(openapi_catalogs_product_group_filters_all_of).

-include("openapi.hrl").

-export([openapi_catalogs_product_group_filters_all_of/0]).

-export([openapi_catalogs_product_group_filters_all_of/1]).

-export_type([openapi_catalogs_product_group_filters_all_of/0]).

-type openapi_catalogs_product_group_filters_all_of() ::
  [ {'all_of', list(openapi_catalogs_product_group_filter_keys:openapi_catalogs_product_group_filter_keys()) }
  ].


openapi_catalogs_product_group_filters_all_of() ->
    openapi_catalogs_product_group_filters_all_of([]).

openapi_catalogs_product_group_filters_all_of(Fields) ->
  Default = [ {'all_of', list(openapi_catalogs_product_group_filter_keys:openapi_catalogs_product_group_filter_keys()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

