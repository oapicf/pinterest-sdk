-module(openapi_catalogs_product_group_filters_request_any_of_1).

-include("openapi.hrl").

-export([openapi_catalogs_product_group_filters_request_any_of_1/0]).

-export([openapi_catalogs_product_group_filters_request_any_of_1/1]).

-export_type([openapi_catalogs_product_group_filters_request_any_of_1/0]).

-type openapi_catalogs_product_group_filters_request_any_of_1() ::
  [ {'all_of', list(openapi_catalogs_product_group_filter_keys:openapi_catalogs_product_group_filter_keys()) }
  ].


openapi_catalogs_product_group_filters_request_any_of_1() ->
    openapi_catalogs_product_group_filters_request_any_of_1([]).

openapi_catalogs_product_group_filters_request_any_of_1(Fields) ->
  Default = [ {'all_of', list(openapi_catalogs_product_group_filter_keys:openapi_catalogs_product_group_filter_keys(), 1) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

