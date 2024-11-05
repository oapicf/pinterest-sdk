-module(openapi_users_for_individual_asset_response).

-include("openapi.hrl").

-export([openapi_users_for_individual_asset_response/0]).

-export([openapi_users_for_individual_asset_response/1]).

-export_type([openapi_users_for_individual_asset_response/0]).

-type openapi_users_for_individual_asset_response() ::
  [ {'asset_id', binary() }
  | {'member_id', binary() }
  | {'permissions', list(binary()) }
  ].


openapi_users_for_individual_asset_response() ->
    openapi_users_for_individual_asset_response([]).

openapi_users_for_individual_asset_response(Fields) ->
  Default = [ {'asset_id', binary() }
            , {'member_id', binary() }
            , {'permissions', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

