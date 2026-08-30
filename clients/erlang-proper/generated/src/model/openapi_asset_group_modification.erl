-module(openapi_asset_group_modification).

-include("openapi.hrl").

-export([openapi_asset_group_modification/0]).

-export([openapi_asset_group_modification/1]).

-export_type([openapi_asset_group_modification/0]).

-type openapi_asset_group_modification() ::
  [ {'exceptions', list(openapi_asset_group_update_error:openapi_asset_group_update_error()) }
  | {'updated_asset_groups', list(openapi_asset_group_binding:openapi_asset_group_binding()) }
  ].


openapi_asset_group_modification() ->
    openapi_asset_group_modification([]).

openapi_asset_group_modification(Fields) ->
  Default = [ {'exceptions', list(openapi_asset_group_update_error:openapi_asset_group_update_error()) }
            , {'updated_asset_groups', list(openapi_asset_group_binding:openapi_asset_group_binding()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

