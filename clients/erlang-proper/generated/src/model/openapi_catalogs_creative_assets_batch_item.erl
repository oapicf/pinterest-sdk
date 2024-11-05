-module(openapi_catalogs_creative_assets_batch_item).

-include("openapi.hrl").

-export([openapi_catalogs_creative_assets_batch_item/0]).

-export([openapi_catalogs_creative_assets_batch_item/1]).

-export_type([openapi_catalogs_creative_assets_batch_item/0]).

-type openapi_catalogs_creative_assets_batch_item() ::
  [ {'creative_assets_id', binary() }
  | {'operation', binary() }
  | {'attributes', openapi_catalogs_updatable_creative_assets_attributes:openapi_catalogs_updatable_creative_assets_attributes() }
  ].


openapi_catalogs_creative_assets_batch_item() ->
    openapi_catalogs_creative_assets_batch_item([]).

openapi_catalogs_creative_assets_batch_item(Fields) ->
  Default = [ {'creative_assets_id', binary() }
            , {'operation', elements([<<"DELETE">>]) }
            , {'attributes', openapi_catalogs_updatable_creative_assets_attributes:openapi_catalogs_updatable_creative_assets_attributes() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

