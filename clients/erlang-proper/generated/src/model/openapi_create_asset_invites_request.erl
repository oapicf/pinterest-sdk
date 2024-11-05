-module(openapi_create_asset_invites_request).

-include("openapi.hrl").

-export([openapi_create_asset_invites_request/0]).

-export([openapi_create_asset_invites_request/1]).

-export_type([openapi_create_asset_invites_request/0]).

-type openapi_create_asset_invites_request() ::
  [ {'invites', list(openapi_create_asset_invites_request_item:openapi_create_asset_invites_request_item()) }
  ].


openapi_create_asset_invites_request() ->
    openapi_create_asset_invites_request([]).

openapi_create_asset_invites_request(Fields) ->
  Default = [ {'invites', list(openapi_create_asset_invites_request_item:openapi_create_asset_invites_request_item(), 1, 50) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

