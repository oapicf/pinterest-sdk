-module(openapi_asset_group_input_create).

-include("openapi.hrl").

-export([openapi_asset_group_input_create/0]).

-export([openapi_asset_group_input_create/1]).

-export_type([openapi_asset_group_input_create/0]).

-type openapi_asset_group_input_create() ::
  [ {'asset_group', openapi_asset_group_binding:openapi_asset_group_binding() }
  | {'asset_group_description', binary() }
  | {'asset_group_name', binary() }
  | {'asset_group_types', list(openapi_asset_group_type:openapi_asset_group_type()) }
  ].


openapi_asset_group_input_create() ->
    openapi_asset_group_input_create([]).

openapi_asset_group_input_create(Fields) ->
  Default = [ {'asset_group', openapi_asset_group_binding:openapi_asset_group_binding() }
            , {'asset_group_description', binary() }
            , {'asset_group_name', binary() }
            , {'asset_group_types', list(openapi_asset_group_type:openapi_asset_group_type()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

