-module(openapi_catalogs_product_group_filters_request).

-include("openapi.hrl").

-export([openapi_catalogs_product_group_filters_request/0]).

-export([openapi_catalogs_product_group_filters_request/1]).

-export_type([openapi_catalogs_product_group_filters_request/0]).

-type openapi_catalogs_product_group_filters_request() ::
  [ {'any_of', list(openapi_catalogs_product_group_filter_keys:openapi_catalogs_product_group_filter_keys()) }
  | {'all_of', list(openapi_catalogs_product_group_filter_keys:openapi_catalogs_product_group_filter_keys()) }
  ].


openapi_catalogs_product_group_filters_request() ->
    openapi_catalogs_product_group_filters_request([]).

openapi_catalogs_product_group_filters_request(Fields) ->
  Default = [ {'any_of', list(openapi_catalogs_product_group_filter_keys:openapi_catalogs_product_group_filter_keys(), 1) }
            , {'all_of', list(openapi_catalogs_product_group_filter_keys:openapi_catalogs_product_group_filter_keys(), 1) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

