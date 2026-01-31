-module(openapi_catalogs_creative_assets_list_products_by_catalog_based_filter_request).

-include("openapi.hrl").

-export([openapi_catalogs_creative_assets_list_products_by_catalog_based_filter_request/0]).

-export([openapi_catalogs_creative_assets_list_products_by_catalog_based_filter_request/1]).

-export_type([openapi_catalogs_creative_assets_list_products_by_catalog_based_filter_request/0]).

-type openapi_catalogs_creative_assets_list_products_by_catalog_based_filter_request() ::
  [ {'catalog_id', binary() }
  | {'catalog_type', binary() }
  | {'filters', openapi_catalogs_creative_assets_product_group_filters:openapi_catalogs_creative_assets_product_group_filters() }
  ].


openapi_catalogs_creative_assets_list_products_by_catalog_based_filter_request() ->
    openapi_catalogs_creative_assets_list_products_by_catalog_based_filter_request([]).

openapi_catalogs_creative_assets_list_products_by_catalog_based_filter_request(Fields) ->
  Default = [ {'catalog_id', binary() }
            , {'catalog_type', elements([<<"CREATIVE_ASSETS">>]) }
            , {'filters', openapi_catalogs_creative_assets_product_group_filters:openapi_catalogs_creative_assets_product_group_filters() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

