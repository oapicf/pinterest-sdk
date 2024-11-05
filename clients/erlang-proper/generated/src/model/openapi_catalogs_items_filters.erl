-module(openapi_catalogs_items_filters).

-include("openapi.hrl").

-export([openapi_catalogs_items_filters/0]).

-export([openapi_catalogs_items_filters/1]).

-export_type([openapi_catalogs_items_filters/0]).

-type openapi_catalogs_items_filters() ::
  [ {'catalog_type', openapi_catalogs_type:openapi_catalogs_type() }
  | {'item_ids', list(binary()) }
  | {'catalog_id', binary() }
  | {'hotel_ids', list(binary()) }
  | {'creative_assets_ids', list(binary()) }
  ].


openapi_catalogs_items_filters() ->
    openapi_catalogs_items_filters([]).

openapi_catalogs_items_filters(Fields) ->
  Default = [ {'catalog_type', openapi_catalogs_type:openapi_catalogs_type() }
            , {'item_ids', list(binary(), 1, 100) }
            , {'catalog_id', binary() }
            , {'hotel_ids', list(binary(), 1, 100) }
            , {'creative_assets_ids', list(binary(), 1, 100) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

