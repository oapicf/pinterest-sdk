-module(openapi_multiple_product_groups_inner).

-include("openapi.hrl").

-export([openapi_multiple_product_groups_inner/0]).

-export([openapi_multiple_product_groups_inner/1]).

-export_type([openapi_multiple_product_groups_inner/0]).

-type openapi_multiple_product_groups_inner() ::
  [ {'name', binary() }
  | {'description', binary() }
  | {'is_featured', boolean() }
  | {'filters', openapi_catalogs_creative_assets_product_group_filters:openapi_catalogs_creative_assets_product_group_filters() }
  | {'feed_id', binary() }
  | {'catalog_type', binary() }
  | {'catalog_id', binary() }
  | {'country', openapi_country:openapi_country() }
  | {'locale', openapi_catalogs_locale:openapi_catalogs_locale() }
  ].


openapi_multiple_product_groups_inner() ->
    openapi_multiple_product_groups_inner([]).

openapi_multiple_product_groups_inner(Fields) ->
  Default = [ {'name', binary() }
            , {'description', binary() }
            , {'is_featured', boolean() }
            , {'filters', openapi_catalogs_creative_assets_product_group_filters:openapi_catalogs_creative_assets_product_group_filters() }
            , {'feed_id', binary() }
            , {'catalog_type', elements([<<"CREATIVE_ASSETS">>]) }
            , {'catalog_id', binary() }
            , {'country', openapi_country:openapi_country() }
            , {'locale', openapi_catalogs_locale:openapi_catalogs_locale() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

