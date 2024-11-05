-module(openapi_update_member_assets_results_response_array_items_inner).

-include("openapi.hrl").

-export([openapi_update_member_assets_results_response_array_items_inner/0]).

-export([openapi_update_member_assets_results_response_array_items_inner/1]).

-export_type([openapi_update_member_assets_results_response_array_items_inner/0]).

-type openapi_update_member_assets_results_response_array_items_inner() ::
  [ {'response', openapi_users_for_individual_asset_response:openapi_users_for_individual_asset_response() }
  ].


openapi_update_member_assets_results_response_array_items_inner() ->
    openapi_update_member_assets_results_response_array_items_inner([]).

openapi_update_member_assets_results_response_array_items_inner(Fields) ->
  Default = [ {'response', openapi_users_for_individual_asset_response:openapi_users_for_individual_asset_response() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

