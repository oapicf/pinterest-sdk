-module(openapi_create_asset_group_response).

-include("openapi.hrl").

-export([openapi_create_asset_group_response/0]).

-export([openapi_create_asset_group_response/1]).

-export_type([openapi_create_asset_group_response/0]).

-type openapi_create_asset_group_response() ::
  [ {'asset_group', openapi_asset_group_binding:openapi_asset_group_binding() }
  ].


openapi_create_asset_group_response() ->
    openapi_create_asset_group_response([]).

openapi_create_asset_group_response(Fields) ->
  Default = [ {'asset_group', openapi_asset_group_binding:openapi_asset_group_binding() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

