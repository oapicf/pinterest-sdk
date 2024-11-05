-module(openapi_create_asset_invites_request_item).

-include("openapi.hrl").

-export([openapi_create_asset_invites_request_item/0]).

-export([openapi_create_asset_invites_request_item/1]).

-export_type([openapi_create_asset_invites_request_item/0]).

-type openapi_create_asset_invites_request_item() ::
  [ {'invite_id', binary() }
  | {'invite_type', openapi_invite_type:openapi_invite_type() }
  | {'asset_id_to_permissions', map() }
  ].


openapi_create_asset_invites_request_item() ->
    openapi_create_asset_invites_request_item([]).

openapi_create_asset_invites_request_item(Fields) ->
  Default = [ {'invite_id', binary() }
            , {'invite_type', openapi_invite_type:openapi_invite_type() }
            , {'asset_id_to_permissions', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

