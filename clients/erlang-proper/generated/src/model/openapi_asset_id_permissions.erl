-module(openapi_asset_id_permissions).

-include("openapi.hrl").

-export([openapi_asset_id_permissions/0]).

-export([openapi_asset_id_permissions/1]).

-export_type([openapi_asset_id_permissions/0]).

-type openapi_asset_id_permissions() ::
  [ {'asset_group_info', openapi_asset_group_binding:openapi_asset_group_binding() }
  | {'asset_id', binary() }
  | {'asset_type', binary() }
  | {'permissions', list(binary()) }
  ].


openapi_asset_id_permissions() ->
    openapi_asset_id_permissions([]).

openapi_asset_id_permissions(Fields) ->
  Default = [ {'asset_group_info', openapi_asset_group_binding:openapi_asset_group_binding() }
            , {'asset_id', binary(1, 20) }
            , {'asset_type', binary() }
            , {'permissions', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

