-module(openapi_catalogs_product_group_filters_request_any_of).

-include("openapi.hrl").

-export([openapi_catalogs_product_group_filters_request_any_of/0]).

-export([openapi_catalogs_product_group_filters_request_any_of/1]).

-export_type([openapi_catalogs_product_group_filters_request_any_of/0]).

-type openapi_catalogs_product_group_filters_request_any_of() ::
  [ {'any_of', list(openapi_catalogs_product_group_filter_keys:openapi_catalogs_product_group_filter_keys()) }
  ].


openapi_catalogs_product_group_filters_request_any_of() ->
    openapi_catalogs_product_group_filters_request_any_of([]).

openapi_catalogs_product_group_filters_request_any_of(Fields) ->
  Default = [ {'any_of', list(openapi_catalogs_product_group_filter_keys:openapi_catalogs_product_group_filter_keys(), 1) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

