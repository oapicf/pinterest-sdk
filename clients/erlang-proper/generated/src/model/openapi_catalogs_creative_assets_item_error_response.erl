-module(openapi_catalogs_creative_assets_item_error_response).

-include("openapi.hrl").

-export([openapi_catalogs_creative_assets_item_error_response/0]).

-export([openapi_catalogs_creative_assets_item_error_response/1]).

-export_type([openapi_catalogs_creative_assets_item_error_response/0]).

-type openapi_catalogs_creative_assets_item_error_response() ::
  [ {'catalog_type', binary() }
  | {'creative_assets_id', binary() }
  | {'errors', list(openapi_item_validation_event:openapi_item_validation_event()) }
  | {'item_response_kind', binary() }
  ].


openapi_catalogs_creative_assets_item_error_response() ->
    openapi_catalogs_creative_assets_item_error_response([]).

openapi_catalogs_creative_assets_item_error_response(Fields) ->
  Default = [ {'catalog_type', elements([<<"CREATIVE_ASSETS">>]) }
            , {'creative_assets_id', binary() }
            , {'errors', list(openapi_item_validation_event:openapi_item_validation_event()) }
            , {'item_response_kind', elements([<<"creative_assets_item_error">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

