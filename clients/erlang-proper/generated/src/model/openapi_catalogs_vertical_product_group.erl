-module(openapi_catalogs_vertical_product_group).

-include("openapi.hrl").

-export([openapi_catalogs_vertical_product_group/0]).

-export([openapi_catalogs_vertical_product_group/1]).

-export_type([openapi_catalogs_vertical_product_group/0]).

-type openapi_catalogs_vertical_product_group() ::
  [ {'catalog_id', binary() }
  | {'catalog_type', binary() }
  | {'country', binary() }
  | {'created_at', integer() }
  | {'description', binary() }
  | {'feed_id', binary() }
  | {'filters', openapi_catalogs_creative_assets_product_group_filters:openapi_catalogs_creative_assets_product_group_filters() }
  | {'id', binary() }
  | {'is_featured', boolean() }
  | {'locale', binary() }
  | {'name', binary() }
  | {'status', openapi_catalogs_product_group_status:openapi_catalogs_product_group_status() }
  | {'type', openapi_catalogs_hotel_product_group_type:openapi_catalogs_hotel_product_group_type() }
  | {'updated_at', integer() }
  ].


openapi_catalogs_vertical_product_group() ->
    openapi_catalogs_vertical_product_group([]).

openapi_catalogs_vertical_product_group(Fields) ->
  Default = [ {'catalog_id', binary() }
            , {'catalog_type', elements([<<"CREATIVE_ASSETS">>]) }
            , {'country', binary() }
            , {'created_at', integer() }
            , {'description', binary() }
            , {'feed_id', binary() }
            , {'filters', openapi_catalogs_creative_assets_product_group_filters:openapi_catalogs_creative_assets_product_group_filters() }
            , {'id', binary() }
            , {'is_featured', boolean() }
            , {'locale', binary() }
            , {'name', binary() }
            , {'status', openapi_catalogs_product_group_status:openapi_catalogs_product_group_status() }
            , {'type', openapi_catalogs_hotel_product_group_type:openapi_catalogs_hotel_product_group_type() }
            , {'updated_at', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

