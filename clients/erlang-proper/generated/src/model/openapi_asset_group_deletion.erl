-module(openapi_asset_group_deletion).

-include("openapi.hrl").

-export([openapi_asset_group_deletion/0]).

-export([openapi_asset_group_deletion/1]).

-export_type([openapi_asset_group_deletion/0]).

-type openapi_asset_group_deletion() ::
  [ {'deleted_asset_groups', list(binary()) }
  | {'exceptions', list(openapi_asset_group_delete_error:openapi_asset_group_delete_error()) }
  ].


openapi_asset_group_deletion() ->
    openapi_asset_group_deletion([]).

openapi_asset_group_deletion(Fields) ->
  Default = [ {'deleted_asset_groups', list(binary()) }
            , {'exceptions', list(openapi_asset_group_delete_error:openapi_asset_group_delete_error()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

