-module(openapi_create_asset_access_request_body).

-include("openapi.hrl").

-export([openapi_create_asset_access_request_body/0]).

-export([openapi_create_asset_access_request_body/1]).

-export_type([openapi_create_asset_access_request_body/0]).

-type openapi_create_asset_access_request_body() ::
  [ {'asset_requests', list(openapi_create_asset_access_request_item:openapi_create_asset_access_request_item()) }
  ].


openapi_create_asset_access_request_body() ->
    openapi_create_asset_access_request_body([]).

openapi_create_asset_access_request_body(Fields) ->
  Default = [ {'asset_requests', list(openapi_create_asset_access_request_item:openapi_create_asset_access_request_item(), 1, 100) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

