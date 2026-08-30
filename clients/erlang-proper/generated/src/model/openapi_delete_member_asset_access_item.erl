-module(openapi_delete_member_asset_access_item).

-include("openapi.hrl").

-export([openapi_delete_member_asset_access_item/0]).

-export([openapi_delete_member_asset_access_item/1]).

-export_type([openapi_delete_member_asset_access_item/0]).

-type openapi_delete_member_asset_access_item() ::
  [ {'asset_id', binary() }
  | {'member_id', binary() }
  ].


openapi_delete_member_asset_access_item() ->
    openapi_delete_member_asset_access_item([]).

openapi_delete_member_asset_access_item(Fields) ->
  Default = [ {'asset_id', binary() }
            , {'member_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

