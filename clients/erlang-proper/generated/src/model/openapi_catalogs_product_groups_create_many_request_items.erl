-module(openapi_catalogs_product_groups_create_many_request_items).

-include("openapi.hrl").

-export([openapi_catalogs_product_groups_create_many_request_items/0]).

-export([openapi_catalogs_product_groups_create_many_request_items/1]).

-export_type([openapi_catalogs_product_groups_create_many_request_items/0]).

-type openapi_catalogs_product_groups_create_many_request_items() ::
  [ {'description', binary() }
  | {'feed_id', binary() }
  | {'filters', openapi_catalogs_creative_assets_product_group_filters:openapi_catalogs_creative_assets_product_group_filters() }
  | {'is_featured', boolean() }
  | {'name', binary() }
  | {'catalog_id', binary() }
  | {'catalog_type', binary() }
  | {'country', openapi_country:openapi_country() }
  | {'locale', openapi_catalogs_locale:openapi_catalogs_locale() }
  ].


openapi_catalogs_product_groups_create_many_request_items() ->
    openapi_catalogs_product_groups_create_many_request_items([]).

openapi_catalogs_product_groups_create_many_request_items(Fields) ->
  Default = [ {'description', binary() }
            , {'feed_id', binary() }
            , {'filters', openapi_catalogs_creative_assets_product_group_filters:openapi_catalogs_creative_assets_product_group_filters() }
            , {'is_featured', boolean() }
            , {'name', binary() }
            , {'catalog_id', binary() }
            , {'catalog_type', elements([<<"CREATIVE_ASSETS">>]) }
            , {'country', openapi_country:openapi_country() }
            , {'locale', openapi_catalogs_locale:openapi_catalogs_locale() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

