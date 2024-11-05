-module(openapi_catalogs_list_products_by_filter_request).

-include("openapi.hrl").

-export([openapi_catalogs_list_products_by_filter_request/0]).

-export([openapi_catalogs_list_products_by_filter_request/1]).

-export_type([openapi_catalogs_list_products_by_filter_request/0]).

-type openapi_catalogs_list_products_by_filter_request() ::
  [ {'feed_id', binary() }
  | {'filters', openapi_catalogs_creative_assets_product_group_filters:openapi_catalogs_creative_assets_product_group_filters() }
  | {'catalog_type', binary() }
  | {'catalog_id', binary() }
  | {'country', openapi_country:openapi_country() }
  | {'locale', openapi_catalogs_locale:openapi_catalogs_locale() }
  ].


openapi_catalogs_list_products_by_filter_request() ->
    openapi_catalogs_list_products_by_filter_request([]).

openapi_catalogs_list_products_by_filter_request(Fields) ->
  Default = [ {'feed_id', binary() }
            , {'filters', openapi_catalogs_creative_assets_product_group_filters:openapi_catalogs_creative_assets_product_group_filters() }
            , {'catalog_type', elements([<<"CREATIVE_ASSETS">>]) }
            , {'catalog_id', binary() }
            , {'country', openapi_country:openapi_country() }
            , {'locale', openapi_catalogs_locale:openapi_catalogs_locale() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

