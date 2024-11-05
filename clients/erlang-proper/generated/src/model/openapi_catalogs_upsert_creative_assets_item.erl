-module(openapi_catalogs_upsert_creative_assets_item).

-include("openapi.hrl").

-export([openapi_catalogs_upsert_creative_assets_item/0]).

-export([openapi_catalogs_upsert_creative_assets_item/1]).

-export_type([openapi_catalogs_upsert_creative_assets_item/0]).

-type openapi_catalogs_upsert_creative_assets_item() ::
  [ {'creative_assets_id', binary() }
  | {'operation', binary() }
  | {'attributes', openapi_catalogs_creative_assets_attributes:openapi_catalogs_creative_assets_attributes() }
  ].


openapi_catalogs_upsert_creative_assets_item() ->
    openapi_catalogs_upsert_creative_assets_item([]).

openapi_catalogs_upsert_creative_assets_item(Fields) ->
  Default = [ {'creative_assets_id', binary() }
            , {'operation', elements([<<"UPSERT">>]) }
            , {'attributes', openapi_catalogs_creative_assets_attributes:openapi_catalogs_creative_assets_attributes() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

