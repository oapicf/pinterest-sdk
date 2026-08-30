-module(openapi_create_asset_access_request_item).

-include("openapi.hrl").

-export([openapi_create_asset_access_request_item/0]).

-export([openapi_create_asset_access_request_item/1]).

-export_type([openapi_create_asset_access_request_item/0]).

-type openapi_create_asset_access_request_item() ::
  [ {'asset_id_to_permissions', map() }
  | {'partner_id', binary() }
  ].


openapi_create_asset_access_request_item() ->
    openapi_create_asset_access_request_item([]).

openapi_create_asset_access_request_item(Fields) ->
  Default = [ {'asset_id_to_permissions', map() }
            , {'partner_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

