-module(openapi_catalogs_list_products_by_filter_request).

-include("openapi.hrl").

-export([openapi_catalogs_list_products_by_filter_request/0]).

-export([openapi_catalogs_list_products_by_filter_request/1]).

-export_type([openapi_catalogs_list_products_by_filter_request/0]).

-type openapi_catalogs_list_products_by_filter_request() ::
  [ {'feed_id', binary() }
  | {'filters', openapi_catalogs_product_group_filters:openapi_catalogs_product_group_filters() }
  ].


openapi_catalogs_list_products_by_filter_request() ->
    openapi_catalogs_list_products_by_filter_request([]).

openapi_catalogs_list_products_by_filter_request(Fields) ->
  Default = [ {'feed_id', binary() }
            , {'filters', openapi_catalogs_product_group_filters:openapi_catalogs_product_group_filters() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

