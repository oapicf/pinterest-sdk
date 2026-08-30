-module(openapi_asset_id_with_permissions).

-include("openapi.hrl").

-export([openapi_asset_id_with_permissions/0]).

-export([openapi_asset_id_with_permissions/1]).

-export_type([openapi_asset_id_with_permissions/0]).

-type openapi_asset_id_with_permissions() ::
  [ {'id', binary() }
  | {'permissions', list(binary()) }
  ].


openapi_asset_id_with_permissions() ->
    openapi_asset_id_with_permissions([]).

openapi_asset_id_with_permissions(Fields) ->
  Default = [ {'id', binary(1, 20) }
            , {'permissions', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

