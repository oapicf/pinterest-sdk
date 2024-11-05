-module(openapi_catalogs_creative_assets_items_filter).

-include("openapi.hrl").

-export([openapi_catalogs_creative_assets_items_filter/0]).

-export([openapi_catalogs_creative_assets_items_filter/1]).

-export_type([openapi_catalogs_creative_assets_items_filter/0]).

-type openapi_catalogs_creative_assets_items_filter() ::
  [ {'catalog_type', binary() }
  | {'creative_assets_ids', list(binary()) }
  | {'catalog_id', binary() }
  ].


openapi_catalogs_creative_assets_items_filter() ->
    openapi_catalogs_creative_assets_items_filter([]).

openapi_catalogs_creative_assets_items_filter(Fields) ->
  Default = [ {'catalog_type', elements([<<"CREATIVE_ASSETS">>]) }
            , {'creative_assets_ids', list(binary(), 1, 100) }
            , {'catalog_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

