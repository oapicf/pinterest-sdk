-module(openapi_multiple_product_groups_inner).

-include("openapi.hrl").

-export([openapi_multiple_product_groups_inner/0]).

-export([openapi_multiple_product_groups_inner/1]).

-export_type([openapi_multiple_product_groups_inner/0]).

-type openapi_multiple_product_groups_inner() ::
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


openapi_multiple_product_groups_inner() ->
    openapi_multiple_product_groups_inner([]).

openapi_multiple_product_groups_inner(Fields) ->
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

