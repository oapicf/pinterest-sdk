-module(openapi_create_asset_group_body).

-include("openapi.hrl").

-export([openapi_create_asset_group_body/0]).

-export([openapi_create_asset_group_body/1]).

-export_type([openapi_create_asset_group_body/0]).

-type openapi_create_asset_group_body() ::
  [ {'asset_group_name', binary() }
  | {'asset_group_description', binary() }
  | {'asset_group_types', list(openapi_asset_group_type:openapi_asset_group_type()) }
  ].


openapi_create_asset_group_body() ->
    openapi_create_asset_group_body([]).

openapi_create_asset_group_body(Fields) ->
  Default = [ {'asset_group_name', binary() }
            , {'asset_group_description', binary() }
            , {'asset_group_types', list(openapi_asset_group_type:openapi_asset_group_type()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

