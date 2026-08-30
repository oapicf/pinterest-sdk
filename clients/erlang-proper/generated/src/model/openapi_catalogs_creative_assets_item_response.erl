-module(openapi_catalogs_creative_assets_item_response).

-include("openapi.hrl").

-export([openapi_catalogs_creative_assets_item_response/0]).

-export([openapi_catalogs_creative_assets_item_response/1]).

-export_type([openapi_catalogs_creative_assets_item_response/0]).

-type openapi_catalogs_creative_assets_item_response() ::
  [ {'attributes', openapi_catalogs_creative_assets_attributes:openapi_catalogs_creative_assets_attributes() }
  | {'catalog_type', binary() }
  | {'creative_assets_id', binary() }
  | {'item_response_kind', binary() }
  | {'pins', list(openapi_pin:openapi_pin()) }
  ].


openapi_catalogs_creative_assets_item_response() ->
    openapi_catalogs_creative_assets_item_response([]).

openapi_catalogs_creative_assets_item_response(Fields) ->
  Default = [ {'attributes', openapi_catalogs_creative_assets_attributes:openapi_catalogs_creative_assets_attributes() }
            , {'catalog_type', elements([<<"CREATIVE_ASSETS">>]) }
            , {'creative_assets_id', binary() }
            , {'item_response_kind', elements([<<"creative_assets_item">>]) }
            , {'pins', list(openapi_pin:openapi_pin()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

