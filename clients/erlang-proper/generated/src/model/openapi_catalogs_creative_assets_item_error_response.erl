-module(openapi_catalogs_creative_assets_item_error_response).

-include("openapi.hrl").

-export([openapi_catalogs_creative_assets_item_error_response/0]).

-export([openapi_catalogs_creative_assets_item_error_response/1]).

-export_type([openapi_catalogs_creative_assets_item_error_response/0]).

-type openapi_catalogs_creative_assets_item_error_response() ::
  [ {'catalog_type', openapi_catalogs_type:openapi_catalogs_type() }
  | {'creative_assets_id', binary() }
  | {'errors', list(openapi_item_validation_event:openapi_item_validation_event()) }
  ].


openapi_catalogs_creative_assets_item_error_response() ->
    openapi_catalogs_creative_assets_item_error_response([]).

openapi_catalogs_creative_assets_item_error_response(Fields) ->
  Default = [ {'catalog_type', openapi_catalogs_type:openapi_catalogs_type() }
            , {'creative_assets_id', binary() }
            , {'errors', list(openapi_item_validation_event:openapi_item_validation_event()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

