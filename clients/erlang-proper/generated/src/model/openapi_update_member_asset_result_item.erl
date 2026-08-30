-module(openapi_update_member_asset_result_item).

-include("openapi.hrl").

-export([openapi_update_member_asset_result_item/0]).

-export([openapi_update_member_asset_result_item/1]).

-export_type([openapi_update_member_asset_result_item/0]).

-type openapi_update_member_asset_result_item() ::
  [ {'response', openapi_users_for_individual_asset_response:openapi_users_for_individual_asset_response() }
  ].


openapi_update_member_asset_result_item() ->
    openapi_update_member_asset_result_item([]).

openapi_update_member_asset_result_item(Fields) ->
  Default = [ {'response', openapi_users_for_individual_asset_response:openapi_users_for_individual_asset_response() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

