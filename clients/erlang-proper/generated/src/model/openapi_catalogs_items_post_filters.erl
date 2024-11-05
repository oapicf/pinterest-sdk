-module(openapi_catalogs_items_post_filters).

-include("openapi.hrl").

-export([openapi_catalogs_items_post_filters/0]).

-export([openapi_catalogs_items_post_filters/1]).

-export_type([openapi_catalogs_items_post_filters/0]).

-type openapi_catalogs_items_post_filters() ::
  [ {'catalog_type', openapi_catalogs_type:openapi_catalogs_type() }
  | {'item_ids', list(binary()) }
  | {'catalog_id', binary() }
  | {'hotel_ids', list(binary()) }
  | {'creative_assets_ids', list(binary()) }
  ].


openapi_catalogs_items_post_filters() ->
    openapi_catalogs_items_post_filters([]).

openapi_catalogs_items_post_filters(Fields) ->
  Default = [ {'catalog_type', openapi_catalogs_type:openapi_catalogs_type() }
            , {'item_ids', list(binary(), 1, 1000) }
            , {'catalog_id', binary() }
            , {'hotel_ids', list(binary(), 1, 1000) }
            , {'creative_assets_ids', list(binary(), 1, 1000) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

