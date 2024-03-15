-module(openapi_catalogs_list_products_by_filter_request_one_of).

-include("openapi.hrl").

-export([openapi_catalogs_list_products_by_filter_request_one_of/0]).

-export([openapi_catalogs_list_products_by_filter_request_one_of/1]).

-export_type([openapi_catalogs_list_products_by_filter_request_one_of/0]).

-type openapi_catalogs_list_products_by_filter_request_one_of() ::
  [ {'feed_id', binary() }
  | {'filters', openapi_catalogs_product_group_filters:openapi_catalogs_product_group_filters() }
  ].


openapi_catalogs_list_products_by_filter_request_one_of() ->
    openapi_catalogs_list_products_by_filter_request_one_of([]).

openapi_catalogs_list_products_by_filter_request_one_of(Fields) ->
  Default = [ {'feed_id', binary() }
            , {'filters', openapi_catalogs_product_group_filters:openapi_catalogs_product_group_filters() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

