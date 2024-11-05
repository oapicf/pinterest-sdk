-module(openapi_create_asset_access_request_response).

-include("openapi.hrl").

-export([openapi_create_asset_access_request_response/0]).

-export([openapi_create_asset_access_request_response/1]).

-export_type([openapi_create_asset_access_request_response/0]).

-type openapi_create_asset_access_request_response() ::
  [ {'exceptions', list(openapi_create_asset_access_request_error_message_inner:openapi_create_asset_access_request_error_message_inner()) }
  | {'invites', map() }
  ].


openapi_create_asset_access_request_response() ->
    openapi_create_asset_access_request_response([]).

openapi_create_asset_access_request_response(Fields) ->
  Default = [ {'exceptions', list(openapi_create_asset_access_request_error_message_inner:openapi_create_asset_access_request_error_message_inner()) }
            , {'invites', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

