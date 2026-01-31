-module(openapi_catalogs_creative_assets_items_post_filter).

-include("openapi.hrl").

-export([openapi_catalogs_creative_assets_items_post_filter/0]).

-export([openapi_catalogs_creative_assets_items_post_filter/1]).

-export_type([openapi_catalogs_creative_assets_items_post_filter/0]).

-type openapi_catalogs_creative_assets_items_post_filter() ::
  [ {'catalog_id', binary() }
  | {'catalog_type', binary() }
  | {'creative_assets_ids', list(binary()) }
  ].


openapi_catalogs_creative_assets_items_post_filter() ->
    openapi_catalogs_creative_assets_items_post_filter([]).

openapi_catalogs_creative_assets_items_post_filter(Fields) ->
  Default = [ {'catalog_id', binary() }
            , {'catalog_type', elements([<<"CREATIVE_ASSETS">>]) }
            , {'creative_assets_ids', list(binary(), 1, 1000) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

