-module(openapi_create_asset_access_request_body_asset_requests_inner).

-include("openapi.hrl").

-export([openapi_create_asset_access_request_body_asset_requests_inner/0]).

-export([openapi_create_asset_access_request_body_asset_requests_inner/1]).

-export_type([openapi_create_asset_access_request_body_asset_requests_inner/0]).

-type openapi_create_asset_access_request_body_asset_requests_inner() ::
  [ {'partner_id', binary() }
  | {'asset_id_to_permissions', map() }
  ].


openapi_create_asset_access_request_body_asset_requests_inner() ->
    openapi_create_asset_access_request_body_asset_requests_inner([]).

openapi_create_asset_access_request_body_asset_requests_inner(Fields) ->
  Default = [ {'partner_id', binary() }
            , {'asset_id_to_permissions', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

