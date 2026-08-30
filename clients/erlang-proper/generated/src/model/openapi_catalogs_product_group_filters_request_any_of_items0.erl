-module(openapi_catalogs_product_group_filters_request_any_of_items0).

-include("openapi.hrl").

-export([openapi_catalogs_product_group_filters_request_any_of_items0/0]).

-export([openapi_catalogs_product_group_filters_request_any_of_items0/1]).

-export_type([openapi_catalogs_product_group_filters_request_any_of_items0/0]).

-type openapi_catalogs_product_group_filters_request_any_of_items0() ::
  [ {'any_of', list(openapi_catalogs_product_group_filter_keys:openapi_catalogs_product_group_filter_keys()) }
  ].


openapi_catalogs_product_group_filters_request_any_of_items0() ->
    openapi_catalogs_product_group_filters_request_any_of_items0([]).

openapi_catalogs_product_group_filters_request_any_of_items0(Fields) ->
  Default = [ {'any_of', list(openapi_catalogs_product_group_filter_keys:openapi_catalogs_product_group_filter_keys(), 1) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

