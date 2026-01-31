-module(openapi_create_asset_access_request_body_asset_requests_inner).

-include("openapi.hrl").

-export([openapi_create_asset_access_request_body_asset_requests_inner/0]).

-export([openapi_create_asset_access_request_body_asset_requests_inner/1]).

-export_type([openapi_create_asset_access_request_body_asset_requests_inner/0]).

-type openapi_create_asset_access_request_body_asset_requests_inner() ::
  [ {'asset_id_to_permissions', map() }
  | {'partner_id', binary() }
  ].


openapi_create_asset_access_request_body_asset_requests_inner() ->
    openapi_create_asset_access_request_body_asset_requests_inner([]).

openapi_create_asset_access_request_body_asset_requests_inner(Fields) ->
  Default = [ {'asset_id_to_permissions', map() }
            , {'partner_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

