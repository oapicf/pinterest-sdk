-module(openapi_update_member_assets_results_response_array_items_inner).

-export([encode/1]).

-export_type([openapi_update_member_assets_results_response_array_items_inner/0]).

-type openapi_update_member_assets_results_response_array_items_inner() ::
    #{ 'response' => openapi_users_for_individual_asset_response:openapi_users_for_individual_asset_response()
     }.

encode(#{ 'response' := Response
        }) ->
    #{ 'response' => Response
     }.
