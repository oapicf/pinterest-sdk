-module(openapi_catalogs_list_products_by_feed_based_filter).

-include("openapi.hrl").

-export([openapi_catalogs_list_products_by_feed_based_filter/0]).

-export([openapi_catalogs_list_products_by_feed_based_filter/1]).

-export_type([openapi_catalogs_list_products_by_feed_based_filter/0]).

-type openapi_catalogs_list_products_by_feed_based_filter() ::
  [ {'feed_id', binary() }
  | {'filters', openapi_catalogs_product_group_filters:openapi_catalogs_product_group_filters() }
  ].


openapi_catalogs_list_products_by_feed_based_filter() ->
    openapi_catalogs_list_products_by_feed_based_filter([]).

openapi_catalogs_list_products_by_feed_based_filter(Fields) ->
  Default = [ {'feed_id', binary() }
            , {'filters', openapi_catalogs_product_group_filters:openapi_catalogs_product_group_filters() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

